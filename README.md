# SalesManager v1.0

## Кратное описание

Программа предназначена для автоматизации анализа статистики продаж.   
SM v1.0 находит наибольшую сумму продажи из предложенного массива данных.

## Порядок работы

Из класса Main в класс SalesManager передается массив данных о продажах.  
В методе public int max создан цикл, перебирающий значения данных массива и возвращающих наибольшее значение.  
Для вывода на экран наибольшего значения в классе Main, обращаемся к методу max через объект класса SalesManager. 

## Порядок пользования

Пользователь работает только с файлом **Main**.  
Массив данных о продажах за интересующий период необходимо передать вручную строке  
**SalesManager manager = new SalesManager(new int[] { -, -, -});**  
где фигурные скобки **{ }** нужно заполнить информацией о цене каждой продажи через запятую.

