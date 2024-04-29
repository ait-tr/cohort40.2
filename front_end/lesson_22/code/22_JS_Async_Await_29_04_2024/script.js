const BASE_URL = "https://jsonplaceholder.typicode.com";

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
  users.forEach((user) => {
    const li = document.createElement("li");
    li.textContent = user.name;
    usersList.appendChild(li);
  });
}

const result = async () => {
  const users = await fetchUsers();
  if(users) {
    displayUsers(users);
  }
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