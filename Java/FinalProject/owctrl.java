import java.util.*;

public class owctrl 
{
    // public static boolean isStringNull(String status[], int rak)
    // {
    //     if (status[rak - 1] == null)
    //     {
    //         return true;
    //     }

    //     else
    //     {
    //         return false;
    //     }
    // }

    public static void add(String books[], String status[])
    {
        macam.clear();
        library.list();
        int rak = macam.inputInt("Pilih rak : ");
        macam.lanjut();
        String nama = macam.inputString("Nama buku : ");
        macam.write("Adding book....");
        macam.timer(2);
        books[rak-1] = nama;
        status[rak-1] = "Available";
    }

    public static void see(String books[], String status[])
    {
        macam.clear();
        macam.write("Collection");
        macam.write("---------");
        library.list();
    }

    public static void edit(String books[], String status[])
    {
        macam.clear();
        library.list();
        int rak = macam.inputInt("Pilih rak");
        macam.lanjut();
        String nama = macam.inputString("Masukkan nama baru : ");
        macam.write("Editing book....");
        macam.timer(2);
        books[rak - 1] = nama;
        status[rak - 1] = "Available";
    }

    public static void delete(String books[], String status[])
    {
        macam.clear();
        library.list();
        int rak = macam.inputInt("Pilih buku yang mau di delete : ");
        macam.write("Deleting book....");
        macam.timer(2);
        books[rak - 1] = null;
        status[rak - 1] = "";
    }

    public static void borrow(String books[], String status[])
    {
        macam.clear();
        library.list();
        int rak = macam.inputInt("Buku yang akan dipinjam : ");
        macam.write("Checking availability....");
        macam.timer(2);
        if (status[rak - 1].equals("Available"))
        {
            status[rak - 1] = "Unavailable";
            macam.write("Buku berhasil dipinjam");
        }
        else
        {
            if (status[rak - 1].equals(""))
            {
                macam.write("Error\nBook does not exist");
                macam.timer(3);
            }

            else if (status[rak - 1].equals("Unavailable"))
            {
                macam.write("Buku sedang dipinjam!");
                macam.timer(3);
            }
        }
    }

    public static void kembali(String books[], String status[])
    {
        macam.clear();
        library.list();
        int rak = macam.inputInt("Buku yang akan dikembalikan");
        macam.write("Checking collection....");
        macam.timer(2);
        if (status[rak - 1].equals("Available"))
        {
            macam.write("Buku sudah ada!");
            macam.timer(3);
        }
        else
        {
            if (status[rak - 1].equals(""))
            {
                macam.write("Error\nBook does not exist");
                macam.timer(3);
            }

            else if (status[rak - 1].equals("Unavailable"))
            {
                status[rak - 1] = "Available";
                macam.write("Buku berhasil dikembalikan");
            }
        }
    }
}
