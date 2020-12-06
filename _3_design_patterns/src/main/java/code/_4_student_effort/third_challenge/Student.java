package _4_student_effort.third_challenge;

public class Student {

    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
