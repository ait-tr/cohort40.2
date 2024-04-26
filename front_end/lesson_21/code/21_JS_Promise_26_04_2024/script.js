console.log("Start");

setTimeout(() => console.log(5), 0);

console.log("Finish");

function giveFiveAfterSevenSecondes() {
  setTimeout(() => 5, 0);
}

let res = giveFiveAfterSevenSecondes();
console.log(res);


const promise = new Promise((resolve, reject) => {
  setTimeout(() => reject('Error'), 7000);
})

promise
    .then((value) => console.log(value))
    .catch((err) => console.log(err))
    .finally(console.log('Спасибо за использование!'));

const usersList = document.getElementById("usersList");

fetch('https://jsonplaceholder.typicode.com/users')
    .then((response) => response.json())
    .then(users => {
        users.forEach(user => {
            const li = document.createElement('li');
            li.textContent = user.name;
            usersList.appendChild(li);

            // if (usersList) {
            //     li.textContent = user.name;
            //     usersList.appendChild(li);
            // } else {
            //     li.textContent = 'Проверьте ID элемента';
            //     document.body.appendChild(li);
            // }

            
        })
    })