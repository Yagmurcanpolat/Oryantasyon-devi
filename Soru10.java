import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int kenar1,kenar2;

        System.out.println("1.kenarı giriniz:");
        kenar1=scan.nextInt();
        System.out.println("2.kenarı giriniz:");
        kenar2=scan.nextInt();

        System.out.println("Dikdörtgenin Alanı:" +(kenar1*kenar2));
        
    }
}