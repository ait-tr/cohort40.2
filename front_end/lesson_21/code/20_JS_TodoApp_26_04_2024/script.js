const todoApp = {
  tasks: [
    { name: "Task 1", isDone: false },
    { name: "Task 2", isDone: false },
    { name: "Task 3", isDone: false },
    { name: "Task 4", isDone: false },
    { name: "Task 5", isDone: false },
  ], // массив задач
  addTask(task) {
    // example of task: { name, isDone }
    const existingTask = this.tasks.find((e) => e.name === task.name);

    if (!existingTask) {
      this.tasks.push(task);
    }
  },
  // itemName - наименование товара, itemCount - кол-во удаляемого товара
  removeTask(taskName) {
    // TODO
    const index = this.tasks.findIndex((e) => e.name === taskName);

    if (index !== -1) {
      this.tasks.splice(index, 1);
    } else {
      alert("Данной задачи нет в Вашем списке дел");
    }
  }
};

// const add = document.getElementById('add');
add.onclick = addHandler;

function addHandler() {
  const name = taskName.value.trim();

  if (name) {
    todoApp.addTask({ name, isDone: false });
  }

  taskName.value = "";

  updateTotalList();
}

function updateTotalList() {
  
  tasksList.innerHTML = "";

  // 1. Перебор элементов массива
  todoApp.tasks.sort((a, b) => a.isDone - b.isDone).forEach((e, i) => {
    // 2. При каждой итерации создаем HTML Element
    const li = document.createElement("li");
    li.classList.add("list-group-item", "list-group-item-action");

    // HW - создаём кнопку для удаления
    const removeButton = document.createElement("button");
    removeButton.textContent = "X";
    removeButton.classList.add("btn", "btn-danger", 'ms-2');
    removeButton.onclick = () => {
      // 1. Удаляем задачу из списка
      todoApp.removeTask(e.name);
      // 2. Удаление элемента списка из документа
      // li.remove();
      updateTotalList();
    };

    const checkBox = document.createElement('input');
    checkBox.type = 'checkbox';
    checkBox.classList.add('form-check-input', 'mx-2');
    checkBox.checked = e.isDone;
    if (checkBox.checked) {
      li.classList.add('list-group-item-secondary');
      li.style.textDecoration = 'line-through';
    }

    checkBox.onclick = () => {
      e.isDone = !e.isDone;
      updateTotalList();
    }

    // 3. Наделяем его текстовым контентом
    li.textContent = `${i + 1}. Task name: ${e.name}`;

    // HW - добавляем кнопку в каждый элемент списка
    li.appendChild(checkBox);
    li.appendChild(removeButton);

    // 4. Добавляем его в productsList
    tasksList.appendChild(li);
  });
}