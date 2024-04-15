console.log(document.body);

// ссылка на элемент с #div1

const div1 = document.getElementById('div1'); // ссылка на элемент
div1.style.border = '1px solid black'; // настройка значения свойства border у элемента div1

console.log(div1.style.border); // значение свойства border у элемента div1

const div1Query = document.querySelector('#div1');
console.log(div1Query); // ссылка на элемент

const pDiv1 = document.querySelectorAll('#div1 > p');
console.log(pDiv1); // массив ссылок на элемент(-ы)

/*
    "x = x"   'x = x'    `x = ${x}`
*/

for (let i = 0; i < pDiv1.length; i++) {
    pDiv1[i].innerHTML = `<span>new text ${i+1}</span>`; // "<span>new text " + (i + 1) + "</span>"
}

const newP = document.createElement('p'); // создали параграф
newP.textContent = 'Данный элемент был создан с помощью метода createElement()'; // наделили параграф контентом
div1.appendChild(newP); // добавили элемент в тот, который уже есть на странице


// HOMEWORK

const t = setInterval(move, 20); // 1000ms = 1s

const box = document.getElementById('box');
let pos = 0;
let flag = true;

let step = 1;

// Дополнительный вариант с челночным бегом элемента (с помощью number)
function move() {
    pos += step;
    if (pos === 0 || pos === 150)  {
        // step = -step
        step *= -1; // step = step * -1
    }
    box.style.top = `${pos}px`; // pos + "px"
    box.style.left = `${pos}px`; // pos + "px"
}

// Дополнительный вариант с челночным бегом элемента (с помощью boolean)
// function move() {
//     // if (pos === 150) {
//     //     flag = false;
//     // }
//     // if (pos === 0) {
//     //     flag = true;
//     // }
    
//     // if (flag) {
//     //     pos++;
//     // } else {
//     //     pos--;
//     // }

//     flag ? pos++ : pos--;

//     if (pos === 0 || pos === 150) {
//         flag = !flag;
//     }

//     box.style.top = `${pos}px`; // pos + "px"
//     box.style.left = `${pos}px`; // pos + "px"
// }

// Основной вариант с остановкой в правом нижнем углу

// function move() {
//     // TODO
//     pos += 1;
//     box.style.top = `${pos}px`; // pos + "px"
//     box.style.left = `${pos}px`; // pos + "px"
//     if (pos === 150) {
//         clearInterval(t);
//     }
// }

// clearInterval(t) - для остановки автозапуска функции