// * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;

public class Person {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

// * Конструктор класса должен заполнять эти поля при создании объекта;
    public Person(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

// * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public void getPerson() {
        System.out.println(name + " " + position + " " +  email + " " +  phoneNumber + " " +  salary + " " +  age);
    }
}
