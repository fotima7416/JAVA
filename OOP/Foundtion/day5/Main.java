package OOP.Foundtion.day5;

public class Main {
    static final double PI;
    static {
        PI = 3.14;
//        System.out.print(PI+"\n");

    }
    static void Salom(){
        System.out.print("Salom2 \n");
    }

    public static void main(String[] args){
//        final String soz="Salom";
//        System.out.printf("Salom %s \n",soz);
//
//        String ism1 = "Ali";
//        String ism2 = "Valijon";
//
//        System.out.printf("|%-10s|%n", ism1);
//        System.out.printf("|%-10s|%n", ism2);
//        Salom();
//        Salary salary=new Salary();
        Vehicle vehicle=new Vehicle();
        vehicle.Vehicle("Komol",25);
    }

    public void Salom2(){
    System.out.print("Komol");
    }
}

 interface Worker {
    void work();

    default  void Salom(){}
    default void detail() {
        System.out.println("some detail");
    }

    static String info() {
        return "Some info";
    }
}
