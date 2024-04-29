console.log("Start");

setTimeout(() => console.log(5), 0);

console.log("Finish");

function giveFiveAfterSevenSecondes() {
  setTimeout(() => 5, 7000);
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
const postsList = document.getElementById("postsList");

// Рез-тат любого fetch запроса представляет собой Promise
fetch('https://jsonplaceholder.typicode.com/users')
    .then((response) => response.json())
    .then(users => {
        users.forEach(user => {
            const li = document.createElement('li');
            li.textContent = user.name;
            usersList.appendChild(li);
        })
    });

fetch('https://jsonplaceholder.typicode.com/posts')
    .then(res => res.json())
    .then(posts => {
      posts.forEach(post => {
        const li = document.createElement('li');
        li.innerHTML = `
          <h3>${post.title}</h3>
          <p>${post.body}</p>
        `;
        postsList.appendChild(li);
      })
    })