Установка сервера и Beekeeper Studio

Обсудили что такое БД и СУБД

Разборали, что такое таблица, строки, столбцы, primary key, нормализация в общих словах: 
[ссылка на таблицу](https://docs.google.com/spreadsheets/d/1mn1_AQoMEw9CAwJrS5kxwCJSXG5YbZRdVx-21i8r-24/edit?hl=de#gid=0)


```sql
CREATE USER
  igor
WITH
  PASSWORD 'qwerty007';
```


```sql
CREATE DATABASE
  students_db OWNER igor;
```

```sql
CREATE TABLE students (
  id serial PRIMARY KEY, name varchar(80), age integer, hobby varchar(80)
  );
```

```sql
INSERT INTO
  students (name, age, hobby)
VALUES
  ('Alex', 30, 'sport'),
  ('Boris', 42, 'music'),
  ('David',	27,	'music'),
  ('Elena',	27,	'sport');
```