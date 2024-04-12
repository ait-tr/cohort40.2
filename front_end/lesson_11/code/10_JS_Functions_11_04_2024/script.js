console.log(multiply(2, 5));

function multiply(a, b) { // регулярная функция
    return a * b;
}

console.log(multiply(2, 5));


// multiplyArrow(3, 4); ReferenceError (слепая зона)

const multiplyArrow = (a, b) => a * b; // стрелочная функция

multiplyArrow(3, 4);

// const multiplyArrow = (a, b) => {
//     ...
//     return a * b
// };

let arr = ['one', 'two', 'Three', 'eight', 'tHree', 'thrEE', 'six'];

console.log('============ indexOf ============');
let res = arr.indexOf('Three', 3); // Возвращает индекс элемента или -1, если элемент не найден
console.log(res);

console.log('============ includes ============');
res = arr.includes('two'); // Возвращает true, если искомый элемент есть в массиве и false, если нет
console.log(res);

console.log('============ findIndex ============');
// predicate должен возвращать true, когда элемент подходит к искомому
res = arr.findIndex((element, index) => element.length === 3 && index > 2); // Возвращает индекс элемента или -1, если элемент не найден
console.log(res);

res = arr.findIndex(predicateLength3);

function predicateLength3(e, i) {
    return e.length === 3 && i > 2;
}

console.log(res);

// Object

const person = {
    firstName: 'Peter',
    lastName: 'Parker',
    age: 45,
    address: {
        country: 'USA',
        city: 'NY',
        house: {
            street: 'Roosevelt',
            number: 111,
            liter: 'a',
            apartment: 16
        }
    },
    // 
    fullName: () => console.log(person.firstName + ' ' + person.lastName),
    example: () => console.log(this) // Ключевое слово this в стрелочной функции ведёт на глобальный объект window!
};

person.example();
person.fullName();

res = Object.keys(person); // Массив ключей объекта person, всегда массив строк!
console.log(res);

res = Object.values(person); // Массив значений объекта person
console.log(res);

res = Object.entries(person); // Массив, где каждым элементом является массив из двух элементов: ключ, значение!
console.log(res);

// HOMEWORK

/* 
    Необходимо создать объект bankAccount (дебетовая карта),
    представляющий собой банковский счёт со следующими свойствами:

    1. accountNumber: '123456789';
    2. accountHolderName: 'Alice';
    3. balance: 0;
    4. deposit(sum) - для описания действия по добавлению суммы на баланс счёта;
    5. withdraw(sum) - для описания действия по списанию суммы с баланса счёта;
    6. checkBalance() - для проверки баланса.

    P.S. Обращать внимание не только на логику программирования, но и на бизнес-логику
*/

const bankAccount = {
    accountNumber: '123456789',
    accountHolderName: 'Alice',
    balance: 0,
    deposit: (sum) => {
        sum >= 5 && sum < 100000
            ? bankAccount.balance += sum
            : alert('Вводимая сумма для пополнения баланса некорректная')
        return bankAccount.balance
    },
    withdraw: (sum) => {
        sum <= bankAccount.balance && sum >= 5
            ? bankAccount.balance -= sum
            : alert('Вводимая сумма для снятия с баланса некорректная')
        return bankAccount.balance
    },
    checkBalance() {
        alert(this.balance + '€');
    }
}

let balance = bankAccount.deposit(1000); // 1000
alert(balance);
bankAccount.deposit(3); // 1000
bankAccount.deposit(333333); // 1000

bankAccount.withdraw(500); // 500
bankAccount.withdraw(-10); // 500
bankAccount.withdraw(600); // 500

bankAccount.checkBalance(); // 500