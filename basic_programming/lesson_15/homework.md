#### Task #15

Переписать CurrencyConverter на ООП:

- сделать новый класс CurrencyConverter с полями double[] currencyRates, String[] availableCurrencies
- Не должно быть статических методов в CurrencyConverter
- Обращение к полям объекта должны быть через this.
- Должно быть 3 конструктора: один пустой (для задания значений по умолчанию), второй - double[] currencyRates, а третий должен принимать double[] currencyRates, String[] availableCurrencies
- В классе CurrencyConverter не должно быть ввода/ввывода и цикла while, то есть вам нужно вынести весь ввод вывод и интерактивность в другое место (например в отдельный класс CurrencyConverterCLI)

Все должно быть на гитхабе в репозитории CurrencyConverter






