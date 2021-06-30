package hw5;

public class Person {
    private String name;
    private String position;
    private String mail;
    private String phoneNum;
    private double salary;
    private int age;

    public Person(String name, String position, String mail, String phoneNum, double salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.printf("%-25s %-25s %-25s %-20s %10s %10s \n", name, position, mail, phoneNum, salary, age);
    }

    public int getAge() {
        return age;
    }
}
