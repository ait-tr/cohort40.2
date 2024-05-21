use("school_db");

// создали новую collection
// она называется users

// Добавили пользователя с именем igor (sql: INSERT INTO users (name) VALUES ('igor'))
// db.users.insertOne({ name: "igor"});

// Добавили пользователя с именем alex и возрастом 35 лет
// db.users.insertOne({ name: 'alex', age: 35 });

// Пример вложенности: поле адрес - это объект
// db.users.insertOne({
//     name: 'David',
//     age: 34,
//     address: { city: 'Berlin' }
// });

// Добавили пользователей с именами Andrew и Anna
// (sql: INSERT INTO users (name, age) VALUES ('Andrew', 25), ('Anna', 30))
// db.users.insertMany([
//     { name: 'Andrew', age: 25 },
//     { name: 'Anna', age: 30 }
// ]);

// db.users.insertOne({ name: 'John', age: 20, hobby: ["rock'n'roll", "snowboard", "surfing"] });

// CRUD - (Create Read Update Delete)

// Получение информации о всех пользователях
// (sql: SELECT * FROM users)
// db.users.find();

// Получение информации о первых трёх пользователях
// db.users.find().limit(3);

// Сортировка по имени в алфавитном порядке (a...z)
// SELECT * FROM users ORDER BY name ASC
// db.users.find().sort({name: 1});

// Сортировка по имени в обратном порядке (z...a)
// SELECT * FROM users ORDER BY name DESC
// db.users.find().sort({name: -1});

// Сортировка по имени в обратном порядке (z...a),
// а в случае совпадения имён идёт сортировка по возрасту
// SELECT * FROM users ORDER BY name DESC, age ASC
// db.users.find().sort({name: -1, age: 1});

// Пропуск первых двух элементов и получение всех остальных данных
// SELECT * FROM users OFFSET 2
// db.users.find().skip(2);

// SELECT * FROM users WHERE age = 30
// db.users.find({ age: 30 });

// SELECT * FROM users WHERE age = 30 LIMIT 1
// db.users.findOne({ age: 30 });


// Operators:

// Больше $gt - greater then
// Все старше 25 (у кого возраст не указан не попали в диапазон)
// db.users.find({ age: {$gt: 25} });

// Меньше $lt - less then
// Все младше 25 (у кого возраст не указан не попали в диапазон)
// db.users.find({ age: {$lt: 25} });

// Больше или равно $gte - greater or equal then
// Все в возрасте 25 и старше (у кого возраст не указан не попали в диапазон)
// db.users.find({ age: {$gte: 25} });

// Меньше или равно $lte - less or equal then
// Все в возрасте 25 и младше (у кого возраст не указан не попали в диапазон)
// db.users.find({ age: {$lte: 25} });

// Все пользователи в возрасте 25 лет
// db.users.find({ age: 25 });
// db.users.find({ age: {$eq: 25} });

// Все пользователи возраст которых не равен 25
// db.users.find({ age: {$ne: 25} });

// Выводим только необходимые параметры каждого подходящего документа
// вторым параметром передаём в метод find
// db.users.find({ age: {$ne: 25} }, { name: 1 });

// Тоже самое, но без _id
// db.users.find({ age: {$ne: 25} }, { name: 1, _id: 0 });

// SELECT name, age FROM users WHERE age = 30
// db.users.find({ age: 30 }, { _id: 0 });


// Оператор $in - входит в
// выведем всех с именами джон или анна
// db.users.find({name: {$in: ["John", "Anna"]}});

// Оператор $nin - not in - не входит в "черный лист"
// все у кого имя не джон и не анна
// db.users.find({name: {$nin: ["John", "Anna"]}});

// Логическое и - $and
// найдем человека с возрастом 34 и именем != анна
// db.users.find({$and: [{age: 34}, {name:{$ne: "Anna"}}]});

// Чаще всего можем обойтись без and
// db.users.find({age: 34, name: {$ne: "Anna"}});

// Логическое или
// db.user.find({$or: [{age: 76}, {name: "Ded Igor"}]});

// Отрицание
// все у кого возраст не больше семидесяти
// db.users.find({age: {$not: {$gt: 70}}});

// Exist - проверка наличия поля - $exist
// все у кого есть поле age
// db.users.find({age: {$exists: true}});
//  все у кого есть поле age - только их имена
// db.users.find({age: {$exists: true}}, {name: 1, _id:0 });

// db.users.insertMany([
//   {name: "Fred", salary: 2000, costs: 1500},
//   {name: "Kristina", salary: 1300, costs: 2500}
// ]);

// Вывести всех, кто живет по средствам: salary > costs
// $expr
// db.users.find({$expr: {$gt: ["$salary", "$costs"]}});

// Вывести тех, кто не живет по средствам: salary < costs
// db.users.find({$expr: {$lt: ["$salary", "$costs"]}});

//
// db.users.insertMany([
//   {name: "John Snow", hobbys: ["swords", "bows", "wolfs", "red-head"], age: 20},
//   {name: "Han Solo", hobbys: ["space", "blasters"], age: 36}
// ]);

// выбрать людей с хотя одним из указанных хобби: "space", "snowboard"
// db.users.find({hobbys: {$in: ["space", "snowboard"]}});

// Все  кто не интересуется "space", "snowboard"
db.users.find({ hobbys: { $nin: ["space", "snowboard"] } });
