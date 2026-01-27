package OOP.Foundtion.day4;

 class Vehicle {

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}


 class Buss extends Vehicle {

    public void start() {
        System.out.println("Bus is starting...");
    }
}

public  class Main {
    public static void main(String[] args){
        Vehicle avtbus=new Buss();
        avtbus.start();
    }
}
