package ru.gb.bagautdinov.hw5;

//        4. Создать массив из 5 сотрудников.
//              Пример:
//              Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//              persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
//              30000, 30); // потом для каждой ячейки массива задаем объект
//              persArray[1] = new Person(...);
//              ...
//              persArray[4] = new Person(...);

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Иванов", "Иван", "Иванович", "гл. инжинер",
                "engineer@com", "898732568425", 76500, 48);
        arr[1] = new Employee("Петров", "Петр", "Петрович", "зам. гл. инжинера",
                "Petrengineer@com", "89175864577", 70000, 39);
        arr[2] = new Employee("Сидоров", "Сидр", "Сидорович", "энергетик",
                "energy@com", "89278653596", 66600, 45);
        arr[3] = new Employee("Давыдов", "Давид", "Давидович", "электрик",
                "david@com", "89175352332", 55000, 27);
        arr[4] = new Employee("Сергеев", "Сургей", "Сергеевич", "водитель",
                "serg@com", "89225469587", 50000, 52);

//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40){
                arr[i].print();
            }
        }
    }
}
