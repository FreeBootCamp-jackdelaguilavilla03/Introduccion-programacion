public class practicas {
}
class Teacher implements Worker, Subject{
    private final String name;
    Teacher(String name){
        this.name = name;
    }
    @Override
    public void description() {
        System.out.println("I am "+ name+" your new teacher");
    }

    @Override
    public void profile() {
        System.out.println("teach profile");
    }
}

class Student extends Person {

    @Override
    public void description() {
        System.out.println(this.getName() + " is a student");
    }

    @Override
    public void profile() {
        System.out.println("Student profile");
    }
}

interface Worker {
    public void description();
}

interface Subject {
    public void profile();
}

class School {
    public String name;
    public String address;

    School(String name, String address) {
        this.name = name;
        this.address = address;
    }
    School(){};

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

}

abstract class Person implements Subject {
    private int age;
    private String name;

    public Person() {
        this.age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    abstract public void description();
}