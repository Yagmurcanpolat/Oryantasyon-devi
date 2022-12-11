import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("1.sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayi2=scan.nextInt();

        if(sayi1>sayi2){
            System.out.println("sayı1 sayı2'den büyüktür");
        }
        else if(sayi1<sayi2){
            System.out.println("sayı1 sayı2'den küçüktür");
        }
        else {
            System.out.println("girilen sayılar eşittir");
        }



    }
}