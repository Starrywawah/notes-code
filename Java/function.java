import java.util.*;
// add semua

public class function {
    static Scanner ask = new Scanner(System.in);

    static void menu()
    {
        System.out.print ("\033[H\033[2J");
        System.out.flush();
        System.out.println("Masukkan angka dan simbol");
        System.out.println("Angka pertama : ");
        Double a1 = ask.nextDouble();
        System.out.println("Angka kedua : ");
        Double a2 = ask.nextDouble();
        System.out.println("Simbol : ");
        String sym = ask.next();
        hitung.calc(a1, sym, a2);
    }

    public static void main(String[] args)
    {
        menu();
    }
}
