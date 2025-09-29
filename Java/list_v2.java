import java.util.*;

public class list_v2
{
    // Earphone store
    static ArrayList<String> toko = new ArrayList<String>();
    static ArrayList<Integer> price = new ArrayList<Integer>();

    public static void main(String[] args) 
    {
        
        macam.clear();
        String item = macam.inputString("Mau earphone apa ?");
        toko.add(item);
        String item2 = macam.inputString("Mau earphone apa ?");
        toko.add(item2);
        String item3 = macam.inputString("Mau earphone apa ?");
        toko.add(item3);


        int harga = macam.inputInt("Masukkan angka");
        price.add(harga);

        // print
        macam.write(toko.get(0));

        // for (int a = 0; a <= toko.size(); a++)
        // {
        //     macam.write(toko.get(a));
        // }
        
        // change
        String edit1 = macam.inputString("Mau ganti ke apa ?");
        toko.set(0, edit1);
        // remove
        toko.remove(1);
        // looping
        int a = 1;
        for (String i : toko)
        {
            macam.write(a+ ". " + i);
            a++;
        }

        macam.write("Total items : " + toko.size());
    }
}
