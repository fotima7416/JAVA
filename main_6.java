import transport.main_7;

public class main_6 {
    public static void main(String[] args){
    salomPrint();
    long son=multiply(10,20);
    System.out.println(son);
    sonlar(20);
        modelniAyt();
        main2();
    }
//    void hc qanddy narsani return qilmaydi
    public static  void salomPrint() {
        System.out.println("Salom Dunyo");
    }

//    int return qiladi
    public static int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

//    hech nima return qilmaydi
    public static void sonlar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    public static String model = "Chevrolet";
    static void signalChaling() {
        // XATOLIK! static metod ichida 'this' ishlatib bo'lmaydi.
        // Chunki metod klassga tegishli, 'this' esa ob'ektga.
        // System.out.println(this.model);
    }

    public static void modelniAyt() {
        // TO'G'RI! Bu oddiy metod (static emas).
        // Bu yerda 'this' ishlatsa bo'ladi, chunki bu metod ob'ekt orqali chaqiriladi.
        System.out.println("Kod: " + 11111 + ", Model: "+model);}

//--------------------------- 2 QISM ---------------------------
public static  void main2(){
    String[] yuboriladiganMalumot = {"salom"};
    main_7.main(yuboriladiganMalumot);
}
};