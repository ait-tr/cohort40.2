const bank = [];

const bankAccount = {
  accountNumber: "123456789",
  accountHolderName: "Alice",
  balance: 1000,
  deposit(sum) {
    sum >= 5 && sum < 100000
      ? (this.balance += sum)
      : alert("Вводимая сумма для пополнения баланса некорректная");
  },
  withdraw(sum) {
    sum <= this.balance && sum >= 5
      ? (this.balance -= sum)
      : alert("Вводимая сумма для снятия с баланса некорректная");
  },
  checkBalance() {
    alert(this.balance + "€");
  },
};

const nameInput = document.getElementById("name");
const accountIdInput = document.getElementById("accountId");
const amountInput = document.getElementById("amount");

const accountsListOl = document.getElementById("accountsList");

const withdrawBtn = document.getElementById("withdraw");
const depositBtn = document.getElementById("deposit");

const date = new Date();
console.log(date.getTime()); // кол-во миллисекунд, которое прошло с 1 января 1970 года

const d1 = new Date('09.01.2024');
const res1 = new Date(d1 - date);
const res = d1 - date;
console.log(res);
console.log(res / 1000 / 60 / 60 / 24 / 30);
// console.log(res1); Дата от 1 января 1970 года плюс разница
console.log(res1.getMonth());
console.log(res1.getDate());
console.log(res1.getHours());
console.log(res1.getMinutes());
console.log(res1.getSeconds());

1713175494805 / 1000 / 60 / 60 / 24 / 365.25

function createAccount() {
  if (nameInput.value.trim()) {
    const date = new Date();
    bank.push({
      ...bankAccount,
      accountNumber: date.getTime() + "",
      accountHolderName: nameInput.value.trim()
    });
    nameInput.value = '';
    console.log(bank);
  }
}

function showAccounts() {
    accountsListOl.innerHTML = '';
    bank.forEach(account => {
        const li = document.createElement('li');
        li.innerHTML = `
            <p>Username: ${account.accountHolderName}</p>
            <p>Account Number: ${account.accountNumber}</p>
            <p>Balance: ${account.balance}</p>
        `;
        accountsListOl.appendChild(li);
    });
}

// HOMEWORK

withdrawBtn.onclick = function () {
    // 1. Получаем значения необходимых input (id, amount) 
    const id = accountIdInput.value.trim(); // Значение input в формате строки
    const amount = +amountInput.value.trim(); // Значение input в формате строки

    // 2. Проверка наличия аккаунта в банке
    const index = bank.findIndex(account => account.accountNumber === id);

    // 3. Если сумма операции корректна, то выполняем операцию
    if (index === -1) {
      console.log('Проверьте правильность ввода номера аккаунта');
    } else {
      if (!isNaN(amount)) { // Проверяет число на равенство NaN
        bank[index].withdraw(amount);
      }
    }

    // 4. Очистка значения input
    accountIdInput.value = amountInput.value = '';
}

depositBtn.onclick = function () {
    // 1. Получаем значения необходимых input (id, amount) 
    const id = accountIdInput.value.trim(); // Значение input в формате строки
    const amount = +amountInput.value.trim(); // Значение input в формате строки

    // 2. Проверка наличия аккаунта в банке
    const index = bank.findIndex(account => account.accountNumber === id);

    // 3. Если сумма операции корректна, то выполняем операцию
    if (index === -1) {
      console.log('Проверьте правильность ввода номера аккаунта');
    } else {
      if (!isNaN(amount)) {
        bank[index].deposit(amount);
      }
    }

    // 4. Очистка значения input
    accountIdInput.value = amountInput.value = '';
}

// if (confirm('Вы уверены, что хотите покинуть наш сайт ?')) {
//   window.close(); // закрытие страницы
// }