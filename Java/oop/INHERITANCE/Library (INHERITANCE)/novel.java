import java.util.ArrayList;

class novel extends books
{
    String volume;
    static books view = new books();

    public void addNovel()
    {
        view.input();
        volume = macam.inputString("Volume : ");
        pushNovel();
    }

    public void pushNovel()
    {
        novel.add(new ArrayList<String>());
        novel.get(a).add(judul);
        novel.get(a).add(genre);
        novel.get(a).add(bahasa);
        novel.get(a).add(jumlah_halaman);
        novel.get(a).add(volume);
    }

    public void pushUpdateNovel()
    {
        novel.get(rak-1).set(0,judul);
        novel.get(rak-1).set(1, genre);
        novel.get(rak-1).set(2, bahasa);
        novel.get(rak-1).set(3, jumlah_halaman);
        novel.get(rak-1).set(4, volume);

    }

    public void getNovel()
    {
        int i = 1;
        for (int b = 0; b < novel.size(); b++)
        {
            macam.write(i + ". " + novel.get(b).get(0) + " | " + novel.get(b).get(1) + " | " + novel.get(b).get(2) + " | " + novel.get(b).get(3) + " | " + novel.get(b).get(4));
            i++;
        }
    }

    public void updateNovel()
    {
        rak = macam.inputInt("Pilih rak : ");
        macam.lanjut();
        view.input();
        volume = macam.inputString("volume : ");
        pushUpdateNovel();
    }

    public void removeNovel()
    {
        novel.get(rak-1).clear();
    }

    public void deleteNovel()
    {
        rak = macam.inputInt("Pilih rak : ");
        removeNovel();
    }
}
