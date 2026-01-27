package OOP.Foundtion.day2;
import java.io.InputStream;
import java.util.Scanner;

class Student3 {
    public InputStream show(InputStream input) {
        return input;
    }
}

public class ShowStudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ismingizni kiriitng: ");
        String name=sc.nextLine();
        System.out.print("Salom "+name+" !");
    }
}