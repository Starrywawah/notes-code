import java.util.*;
public class menu
{
    static Scanner ask = new Scanner(System.in);
    
    public static void menu()
    {
        System.out.print ("\033[H\033[2J");
        System.out.flush();
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        int choice = ask.nextInt();
        System.out.println("Masukkan sisi pertama : ");
        double s1 = ask.nextDouble();
        System.out.println("Masukkan sisi kedua : ");
        double s2 = ask.nextDouble();
        area.calc(s1, choice, s2);
    }
}
