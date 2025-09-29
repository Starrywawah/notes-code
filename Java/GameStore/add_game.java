public class add_game {
    public static void add(String[] game, int[] price, int rak, int angka, String nama, int harga)
    {
        macam.clear();
        macam.list(game, price);
        macam.inputInt("Pilih rak : ");
        macam.clear();
        macam.inputString("Nama game : ");
        macam.inputHarga("Berapa harga game");
        macam.clear();

        game[angka - 1] = nama;
        price[angka - 1] = harga;
    }
}
