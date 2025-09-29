import java.util.*;
public class macam {
    static Scanner a = new Scanner(System.in);

    static String inputString(String question)
    {
        System.out.println(question);
        String nama = a.nextLine();
        return nama;
    }

    static Integer inputInt(String question)
    {
        System.out.println(question);
        Integer angka = a.nextInt();
        return angka;
    }

    static Double inputDou(String question)
    {
        System.out.println(question);
        Double angka2 = a.nextDouble();
        return angka2;
    }

    static void write(String quest)
    {
        System.out.println(quest);
    }

    static void writenum(Integer text)
    {
        System.out.println(text);
    }

    static void clear()
    {
        System.out.print ("\033[H\033[2J");
        System.out.flush();
    }

    static void timer(int sec)
    {
        try {
        Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }

    static void list(String[] game, int[] price)
    {
        for (int a = 0; a<game.length; a = a+1)
        {
            if (game[a] == null)
            {
                System.out.println(((a+1)+". "+"Kosong"));
            }
            else
            {
                System.out.println(((a+1)+". "+game[a]+" - "+price[a]));
            }
        }
    }

    static Integer inputHarga(String question)
    {
        System.out.println(question);
        Integer harga = a.nextInt();
        return harga;
    }
}
