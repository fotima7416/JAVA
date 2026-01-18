package OOP.day2;

public class Student {
    private String name;
    private int age;
    public Student(){
        this("Afandi ",25);
        System.out.println("Inside default konstructor");
    }

    public  Student(String name,int age ) {
        this.name = name;
        this.age=age;
        System.out.print(this.name+this.age);
    }

    public static void main(String[] args) {
        Student student = new Student();
    }
}
