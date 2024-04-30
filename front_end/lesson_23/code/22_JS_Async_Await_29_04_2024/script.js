const BASE_URL = "https://jsonplaceholder.typicode.com";
const userDetails = document.getElementById('userDetails');
const search = document.getElementById('search');
const usersList = document.getElementById('usersList');

async function fetchUsers() {
  try {
    // ???
    const response = await fetch(`${BASE_URL}/users`);
    const users = await response.json();
    return users;
  } catch (error) {
    console.log(error.message);
  }
}

function displayUsers(users) {
  usersList.innerHTML = '';
  users.forEach((user) => {
    const li = document.createElement("li");

    // displayUserDetails     displayUserDetails(user)    () => displayUserDetails(user)
    li.onclick = (e) => {
      console.log(e);
      displayUserDetails(user)
    };

    li.textContent = user.name;
    usersList.appendChild(li);
  });
}

function displayUserDetails({
  name,
  email,
  phone,
  website,
  company: { name: brand },
  address: { city, street, suite }
}) {
  userDetails.innerHTML = `
    <h2>${name}</h2>
    <p><strong>Email: </strong>${email}</p>
    <p><strong>Phone: </strong>${phone.split(' ')[0]}</p>
    <p><strong>Website: </strong>${website}</p>
    <p><strong>Name of Company: </strong>${brand}</p>
    <p><strong>Address: </strong>${city}, ${street}, ${suite}</p>
  `;
}

const result = async () => {
  const users = await fetchUsers();
  
  // Добавили обработку события изменения значения input с помощью общего метода по
  // добавлению обработки событий addEventListener
  search.addEventListener('input', (e) => {
    console.log(e.target.value);
    const filter = e.target.value.toLowerCase();
    const filteredUsers = users.filter(user => user.name.toLowerCase().includes(filter));
    displayUsers(filteredUsers);
  })

  // Добавили обработку события изменения значения input с помощью атрибута oninput
  // search.oninput = (e) => {
  //   console.log(e.target.value);
  //   const filter = e.target.value.toLowerCase();
  //   const filteredUsers = users.filter(user => user.name.toLowerCase().includes(filter));
  //   displayUsers(filteredUsers);
  // }
  
  displayUsers(users);
};

result();
// console.log(fetchUsers());

/*
    Homework:

    1. name;
    2. email;
    3. phone (без кода города);
    4. website;
    5. companyName;
    6. address (street, suite, city)
*/ 