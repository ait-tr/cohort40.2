const bank = [];

const bankAccount = {
  accountNumber: "123456789",
  accountHolderName: "Alice",
  balance: 0,
  deposit: (sum) => {
    sum >= 5 && sum < 100000
      ? (bankAccount.balance += sum)
      : alert("Вводимая сумма для пополнения баланса некорректная");
    return bankAccount.balance;
  },
  withdraw: (sum) => {
    sum <= bankAccount.balance && sum >= 5
      ? (bankAccount.balance -= sum)
      : alert("Вводимая сумма для снятия с баланса некорректная");
    return bankAccount.balance;
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

// 1713175494805 / 1000 / 60 / 60 / 24 / 365.25

function createAccount() {
  if (nameInput.value.trim()) {
    const date = new Date();
    bank.push({
      ...bankAccount,
      accountNumber: date.getTime() + "",
      accountHolderName: nameInput.value.trim(),
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
    // TODO
}

depositBtn.onclick = function () {
    // TODO
}