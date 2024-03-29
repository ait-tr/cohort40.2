## 01. Исключения
* Ошибки выполнения в программе - это такие ошибки, которые происходят во время выполнения программы и останавливают ее.
* Ошибки выполнения делятся на ошибки и исключения.
* Ошибки (error) обычно мало зависят от кода, больше зависят от настроек и архитектуры системы.
* Исключение (Исключительная ситуация, exception) - такая (тупиковая) ситуация в программе, которая приводит к фатальной
  ошибке и остановке выполнения программы (но на самом деле только потока в котором происходит ситуация).
* Исключения отличаются от ошибок тем, что их можно контролировать.
* Т.е. можно производить "обработку" исключений чтобы избежать прекращения выполнения программы при появлении исключения.
* Контроль исключений состоит в том, чтобы ловить их когда они появляются.
* Для того чтобы ловить исключения используется блоки try-catch
* В блок try обычно записывают код, который потенциально выкидывает исключения.
* В блок catch записывают в круглые скобки какое исключение нужно ловить, а в фигурные - какое действие нужно сделать
  если словлено это исключение.
```
try {
    // код который может выкинуть исключение
} catch (Exception ex) {
    // обработка выброшенного исключения
}
```
* Исключения также можно выкидывать самостоятельно. Для этого используется ключевое слово `throw`.
* При выкидывании исключения, метод всегда будет возвращать значение по умолчанию для указанного типа.
* У исключений есть иерархия. Они все наследуются от класса Throwable. Вот полная диаграмма:

![image](https://raw.githubusercontent.com/ait-tr/cohort36/main/basic_programming/lesson_49/img/1.png)

image source: https://rollbar.com/blog/java-exceptions-hierarchy-explained/

* При выкидывании исключений нужно всегда подбирать самое подходящее к ситуации.

## 02. Проверяемые и непроверяемые исключения
* Исключения делятся на проверяемые (checked) и непроверяемые (unchecked).
* Непроверяемые исключения это такие, которые не будут проверяться во время компиляции, т.е. их можно
  просто так выкидывать где угодно.
* Другими словами, это такие исключения, для которых не обязательно писать try-catch.
* Обычно непроверяемые исключения сигнализируют об ошибке в логике программы.
* Проверяемые исключения - это такие, возможность выкидывания которых проверяется во время компиляции.
* Это значит, что на каждое такое исключение должен быть try-catch.
* Такие исключения сигнализируют об исключительных ситуациях, не зависящих от логики програмы.

* Обратите внимание - в Java есть одно особенное исключение Null pointer exception (NPE)
* NPE никогда нельзя ловить. Вместо этого, нужно делать все, чтобы он не возник
* Под "все" имеется ввиду null-check (Проверка на значение null перед использованием ссылки)

## 03. Exception chaining
* Обычно, когда в блоке catch вы выкидываете другое исключение, принято использовать Exception chaining.
* Это такое действие, при котором вы привязываете предыдущее исключение, которое вы словили, к выбрасываемому.
* Тогда, при следующей ловле исключения, в его сообщении будет сохранено не только последнее исключение, а и все остальные,
  которые были до него.
* Дополнительно, таким образом можно "превращать" проверяемые исключения в непроверяемые без слова throws
