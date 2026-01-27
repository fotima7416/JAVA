package OOP.Foundtion.day4;

public abstract class Person {

    private String name;
    private int age;

    public void show() { System.out.println(name + ", " + age); }

    public abstract void workInfo();
    // getter setter metodlar.
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}

// Driver class
 class Driver extends Person {
    @Override
    public void workInfo() {
        System.out.println("I am a driver");
    }
}

// Teacher class
 class Teacher extends Person {
    @Override
    public void workInfo() {
        System.out.println("I am teaching");
    }
}


// Cook class (oshpaz)
 class Cook extends Person {
    @Override
    public void workInfo() {
        System.out.println("I am cooking");
    }
}
