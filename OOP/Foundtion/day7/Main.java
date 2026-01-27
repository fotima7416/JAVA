package OOP.Foundtion.day7;

 class Student {
    private String name;

    public int compare(Student s) {
        return this.name.compareTo(s.name);
    }
}


public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        try {
            student.compare(null);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}