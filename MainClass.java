public class MainClass {

    public static void main(String[] args) {
// * Создать массив из 5 сотрудников
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivan", "Engieer", "ivan@gmail.com", "+79880056231", 80000, 30);
        persArray[1] = new Person("Sergey", "Engieer", "sergey@gmail.com", "+79605971123", 86000, 35);
        persArray[2] = new Person("Petr", "Programmist", "petr@gmail.com", "+79285461212", 90000, 45);
        persArray[3] = new Person("Svetlana", "Developer", "svetlana@gmail.com", "+79118456545", 80000, 30);
        persArray[4] = new Person("Julia", "IT-Director", "julia@gmail.com", "+79887842156", 100000, 41);

        persArray[0].getPerson(); // вывод просто для проверки

// С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40)
                System.out.println(persArray[i].name);
        }

    }

}
