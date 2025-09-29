import java.util.ArrayList;

class books
{
    // String judul, genre, bahasa, jumlah_halaman;
    ArrayList<ArrayList<String>> comic = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> novel = new ArrayList<ArrayList<String>>();
    
    int rak;
    int a = 0;

    static String judul, genre, bahasa, jumlah_halaman;

    public void input()
    {
        judul = macam.inputString("Judul buku : ");
        genre = macam.inputString("Genre : ");
        bahasa = macam.inputString("Bahasa : ");
        jumlah_halaman = macam.inputString("Jumlah halaman : ");
    }
}