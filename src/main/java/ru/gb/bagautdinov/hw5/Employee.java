package ru.gb.bagautdinov.hw5;

public class Employee {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    //        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
    //        консоль.
    public void print(){
        System.out.println("Сотрудник - " + lastName + " " + firstName + " " + patronymic);
        System.out.println("должность " + position);
        System.out.println("email - " + email);
        System.out.println("телефон : " + phone);
        System.out.println("зарплата : " + salary);
        System.out.println("возраст : " + age);
    }

    //        2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee(String lastName, String firstName, String patronymic, String position,
                    String email, String phone, int salary, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        setAge(age);

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 250) {
            this.age = age;
        }
    }


}
