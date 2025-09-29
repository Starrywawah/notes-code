import java.util.*;
import java.io.*;

public class macam {
    static Scanner a = new Scanner(System.in);
    // static Scanner a_file = new Scanner(Object);

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

    static void lanjut()
    {
        a.nextLine();
    }

    static Double inputDou(Double question)
    {
        System.out.println(question);
        Double angka2 = a.nextDouble();
        return angka2;
    }

    static void write(String quest)
    {
        System.out.println(quest);
    }

    static void writenum(Integer quest)
    {
        System.out.println(quest);
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

    static String fileCreate(String nama, String item)
    {
        try{
            // buat + nulis
            FileWriter fill = new FileWriter(nama + ".txt");
            fill.write(item + nama + "\n");
            fill.write(item + nama);
            fill.close();

            // buat file
            File cari = new File(nama + ".txt");
            Scanner a_file = new Scanner(cari);
            int a = 1;
            while (a_file.hasNextLine())
            {
                String data = a_file.nextLine();
                macam.write(a + ". " + data);
                a++;
            }
            a_file.close();
        }
        catch(IOException e)
        {
            macam.write("Error");
            e.printStackTrace();
        }
        return "File " + nama + "  telah dibuat";
    }
    
    // static String strukCreate(String nama, int change, int pay, int total, ArrayList<String> cart)
    // {
    //     try{
    //         FileWriter fill = new FileWriter(nama+".txt");
    //         fill.write("Earphone Store\n");
    //         fill.write("==============\n");
    //         fill.write(toko_earphone.cart(total));
    //         fill.close();
    //     }
    //     catch(IOException e)
    //     {
    //         macam.write("Error");
    //         e.printStackTrace();
    //     }
    //     return "File " + nama + "  telah dibuat";
    // }


}
