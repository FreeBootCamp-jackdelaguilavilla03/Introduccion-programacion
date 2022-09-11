public class practicas {
    public static void main(String[] args) {
        Student alumno1 = new Student();
        alumno1.setName("Juan");
        alumno1.setAge(21);
        alumno1.description();
        Teacher profesor1 = new Teacher("Luis");
        profesor1.profile();
        profesor1.description();

    }
}
class Teacher implements Worker, Subject{
    private final String name;
    Teacher(String name){
        this.name = name;
    }
    public void description() {
        System.out.println("I am "+ name+" your new teacher");
    }

    @Override
    public void profile() {
        System.out.println("teach profile");
    }
}

class Student extends Person {

    public void description() {
        System.out.println(this.getName() + " is a student");
    }

    @Override
    public void profile() {
        System.out.println("Student profile");
    }
}

interface Worker {
}

interface Subject {
    void profile();
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

}