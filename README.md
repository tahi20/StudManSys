***Student Management System***

 Что умеет программа
* Добавлять студентов
* Показывать список студентов
* Искать студента по ID
* Находить студента с самым высоким GPA
* Сохранять данные в файл

Основные принципы ООП которые я использовала :
1 Inheritance
Класс Student наследуется от класса Person.
```java
class Student extends Person
```
Person основной класс в котором есть Id , Name

2 Polymorphism
Метод displayInfo() был переопределён через @Override для того чобы рассширить список дисплея для gratueter 
```java
@Override
```
3 Collections
Для хранения студентов я использовала ArrayList.

4 File Handling
Для сохранения данных я использовала  FileWriter.

5 Exception Handling
Для обработки ошибок try-catch.

```java
try {
} catch(Exception e) {
}
```

***Все основные классы***
! Main.java
Главное меню программы.

+ Person.java
Родительский класс с основными полями:
* id
* name

+ Student.java
Класс студента.
Содержит:
* course
* GPA

+ StudMan.java
Основная логика программы:
* добавление студентов
* поиск
* вывод списка
* поиск лучшего GPA
