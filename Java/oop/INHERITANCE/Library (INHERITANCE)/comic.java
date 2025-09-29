import java.util.ArrayList;

class comic extends books
{
    String publisher;
    static books view = new books();

    public void addComic()
    {
        view.input();
        publisher = macam.inputString("Publisher : ");
        pushComic();
        a++;
    }

    public void pushComic()
    {
        comic.add(new ArrayList<String>());
        comic.get(a).add(judul);
        comic.get(a).add(genre);
        comic.get(a).add(bahasa);
        comic.get(a).add(jumlah_halaman);
        comic.get(a).add(publisher);
    }

    public void pushUpdateComic()
    {
        comic.get(rak-1).set(0,judul);
        comic.get(rak-1).set(1, genre);
        comic.get(rak-1).set(2, bahasa);
        comic.get(rak-1).set(3, jumlah_halaman);
        comic.get(rak-1).set(4, publisher);

    }

    public void getComic()
    {
        int i = 1;
        for (int b = 0; b < comic.size(); b++)
        {
            macam.write(i + ". " + comic.get(b).get(0) + " | " + comic.get(b).get(1) + " | " + comic.get(b).get(2) + " | " + comic.get(b).get(3) + " | " + comic.get(b).get(4));
            i++;
        }
    }

    public void updateComic()
    {
        rak = macam.inputInt("Pilih rak : ");
        macam.lanjut();
        view.input();
        publisher = macam.inputString("Publisher : ");
        pushUpdateComic();
    }

    public void removeComic()
    {
        comic.get(rak-1).clear();
    }

    public void deleteComic()
    {
        rak = macam.inputInt("Pilih rak : ");
        removeComic();
    }
}
