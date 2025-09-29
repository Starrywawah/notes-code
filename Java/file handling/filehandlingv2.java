import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class filehandlingv2 {
    static ArrayList<String> toko = new ArrayList<String>();
    public static void main(String[] args) 
    {
        while (true)
        {
            macam.clear();
            String item = macam.inputString("Masukkan nama barang : ");
            toko.add(item);
            break;
        }
        macam.write(toko.get(0));
        
        
    }
}