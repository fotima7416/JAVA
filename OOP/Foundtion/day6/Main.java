package OOP.Foundtion.day6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ismingizni kiriting: ");
        String name = scanner.next();

        System.out.print("Yoshingizni kiriting: ");
        int age = scanner.nextInt();

        System.out.print("Kasbingiz: ");
        String job = scanner.next();
        System.out.println("Salom " + name + ". Sizning yoshingiz: " + age + " da." + "Siz " + job + " siz.");
    }
}
