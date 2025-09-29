import java.util.Scanner;

public class test {
    
    public static void main(String [] args) {
        System.out.println("Hello World");

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner ask = new Scanner(System.in);

        System.out.print("Input angka : ");

        Integer angka = ask.nextInt();

        System.out.print ("\033[H\033[2J");
        System.out.flush();

        System.out.println("Hasilnya adalah " +(angka + angka));
        
    }
}