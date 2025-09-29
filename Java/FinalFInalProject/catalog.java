import java.util.ArrayList;

import javax.swing.*;

class catalog 
{
    ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>>();
    ArrayList<String> cart = new ArrayList<String>();
    static String gift[] = {"JCally JM6 Pro", "Tanchjim Zero Ultima", "Verus Magni 4 (3.5mm)"};

    static String nama;
    static int harga, jumlah_barang, rak, amt, byr, available, b, pay;
    static int atm = 0;
    static int total;
    static int change = 0; 

    public void input()
    {
        macam.lanjut();
        nama = macam.inputString("Nama : ");
        harga = macam.inputInt("Harga : ");
        jumlah_barang = macam.inputInt("Jumlah barang : ");
    }

    public void cart()
    {
        macam.write("Cart\n-------------------");
        if (cart.size() == 0)
        {
            macam.write("Kosong");
        }
        else
        {
            int i = 1;
            for (int a = 0; a < cart.size(); a = a+3)
            {
                macam.write((i) + ". " + cart.get(a) + " - $" + cart.get(a+1) + " | Amount : " + cart.get(a+2));
                i++;
            }
            macam.write("Total : $" + total);
            b = b + total;
        }
    }

    public void atm()
    {
        while (true)
        {
            macam.clear();
            macam.write("Money : $" + atm);
            macam.write("Pick an amount you want to add\n1. $10\n2. $20\n3. $50\n4. $100\n5. $1000\n6. Back");
            int addm = macam.inputInt("");
            if (addm == 1)
            {
                atm = atm + 10;
            }
            else if (addm == 2)
            {
                atm = atm + 20;
            }
            else if (addm == 3)
            {
                atm = atm + 50;
            }
            else if (addm == 4)
            {
                atm = atm + 100;
            }
            else if (addm == 5)
            {
                atm = atm + 1000;
            }
            else if (addm == 6)
            {
                break;
            }
        }
    }

    public void receipt()
    {
        int rand = (int)(Math.random()*3);
        JFrame UI = new JFrame();

        JLabel Line1 = new JLabel("Thankyou for buying at our shop");
        JLabel Line2 = new JLabel("--------------------------------");
        JLabel Line3 = new JLabel("Gift : " + gift[rand]);

        Line1.setBounds(100, 0, 200, 40);
        Line2.setBounds(100, 50, 200, 40);
        Line3.setBounds(100, 100, 200, 40);

        UI.add(Line1);
        UI.add(Line2);
        UI.add(Line3);

        UI.setSize(500, 500);
        UI.setLayout(null);
        UI.setVisible(true);
    }

    public void receipt_2()
    {
        JFrame UI_2 = new JFrame();

        JLabel Line_1 = new JLabel("Thankyou for buying at our shop");

        Line_1.setBounds(100,0,200,40);

        UI_2.add(Line_1);

        UI_2.setSize(500, 500);
        UI_2.setLayout(null);
        UI_2.setVisible(true);
    }
}
