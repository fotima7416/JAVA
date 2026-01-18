package OOP.variable.transport;

public class main_7 {
    public static void main(String[] args) {
        print(1);
        print(1, 3);
        print(1, 3.5);
        if (args.length > 0) {
            System.out.println("Kelgan argument: " + args[0]);
        }
    }

    // metod_1
    public static void print(int a) {
        System.out.println("a=" + a);
    }
    // metod_2
    public static void print(int a, int b) {
        System.out.println("a=" + a + "  b=" + b);
    }
    // metod_3
    public static void print(int a, double b) {
        System.out.println("a=" + a + "  b=" + b);
    }
}
