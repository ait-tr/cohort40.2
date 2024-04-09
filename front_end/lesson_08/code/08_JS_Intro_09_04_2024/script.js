console.log('Hello world');
console.log(5 + 4);

// однострочный комментарий
/*
    многострочный комментарий
*/

// const (константа)
// let (переменная)

// var (переменная, deprecated - устаревший вариант)

let a = 10;
console.log(a);

a = '15';
console.log(a);

const b = 5;
console.log(b);

// b = 6; (запрещёно для констант переопределять значение)

let x; // undefined (переменная создана, но не определена)
console.log(x);

x = 7.5; // number
console.log(typeof x);

x = 'bye'; // string
console.log(typeof x);

// Конкатенация
let res = 'true' + 5; // 'true5'
console.log(res);

// Работа с разными типами данных и неявным приведением к другому типу
res = true + 5; // true -> 1; false -> 0
console.log(res);

// false = 0, NaN, undefined, null, false, ''
x = 10;
x = !!x;
console.log(x);
console.log(!!'');

// number -> string

res = 5;
console.log(res);
console.log(typeof res);

res += ''; // String(res)
console.log(res);
console.log(typeof res);

// string -> number

res = Number('5a'); // NaN
console.log(res);
console.log(typeof res);

res = +'666';
console.log(res);
console.log(typeof res);

console.log(parseInt('545asd55454')); // 545
console.log(eval('10*10+5')); // 105

/*
    =       ->     присвоение значения
    ==      ->     нестрогое сравнение (сравниваются значения без учёта их типов)
    ===      ->    строгое сравнение (сравниваются значения с учётом их типов)
*/

console.log('2' == 2); // true
console.log('2' === 2); // false

x = 10;
console.log(x++); // 10 (вначале используем значение, затем прибавляем единицу)
console.log(++x); // 12 (вначале прибавляем единицу, затем используем значение)

x = 15;
res = x++ + ++x; // 15 + 17 = 32
console.log(res);

function sum(a, b) {
    return a + b
}

console.log(sum(2, 3));

function sumDigits(x) {
    let sum = 0;
    // x !== 0
    while (x) {
        // 1. Прибавляем последнюю цифру
        sum += x % 10; // 54 / 10 = 5.4   1234 / 10 = 123.4
        x = (x - (x % 10)) / 10; // (1234 - 4) / 10 = 123
    }
    return sum;
}

console.log(sumDigits(12345)); // 1 + 2 + 3 + 4 = 10

function luckyNumber(x) {
    // TODO
}

console.log(luckyNumber(123871)); // false (1 + 2 + 3 == 8 + 7 + 1)

function fourOrSeven(x) {
    // if (x === 4) {
    //     return 7;
    // } else {
    //     return 4;
    // }

    // return x === 4 ? 7 : 4

    // switch (x) {
    //     case 4:
    //         return 7;    
    //     default:
    //         return 4;
    // }

    // TODO return ...
}

function banana() {
    let a = 'a';
    let b = 'b';
    // TODO ('b', 'a' -> 'banana')
}