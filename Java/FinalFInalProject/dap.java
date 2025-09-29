import java.util.ArrayList;

class dap extends catalog
{
    String chip;
    static catalog view = new catalog();
    static int total = 0;

    public void add()
    {
        input();
        macam.lanjut();
        chip = macam.inputString("Chip : ");
        macam.addStr("barangDAP", nama);
        macam.addInt("hargaDAP", harga);
        macam.addInt("stokDAP", jumlah_barang);
        macam.addStr("chipDAP", chip);
    }

    public void show()
    {
        macam.showBarang(x, "barangDAP", "hargaDAP", "stokDAP", "chipDAP", "Chip");
    }

    public void update()
    {
        macam.showBarang(x, "barangDAP", "hargaDAP", "stokDAP", "chipDAP", "Chip");
        rak = macam.inputInt("Pilih rak : ");
        macam.lanjut();
        input();
        macam.lanjut();
        chip = macam.inputString("Chip : ");
        macam.editItem("barangDAP", rak, nama);
        macam.editNum("hargaDAP", rak, harga);
        macam.editNum("stokDAP", rak, jumlah_barang);
        macam.editItem("chipDAP", rak, chip);
    }

    public void remove()
    {
        macam.showBarang(x, "barangDAP", "hargaDAP", "stokDAP", "chipDAP", "Chip");
        rak = macam.inputInt("Pilih rak : ");
        macam.itemRemove("barangDAP", "hargaDAP", "stokDAP", "chipDAP", rak, chip);
    }

    
    public void buy()
    {
        while (true)
        {
            macam.showBarang(x, "barangDAP", "hargaDAP", "stokDAP", "chipDAP", "Chip");
            rak = macam.inputInt("Pilih rak : ");
            amt = macam.inputInt("Masukkan jumlah barang : ");
            byr = Integer.parseInt(x.get(rak-1).get(1));

            available = Integer.parseInt(x.get(rak-1).get(2));
            if (available == 0)
            {
                macam.write("Maaf barang ini kosong");
                macam.timer(4);
                break;
            }
            else if (available < amt)
            {
                macam.write("Maaf stok tidak cukup");
                macam.timer(4);
                break;
            }
            macam.updateStock("stokDAP", rak, amt);
            macam.writenum(byr);
            total = total + byr*amt;
            cart.add(x.get(rak-1).get(0));
            cart.add(x.get(rak-1).get(1));
            cart.add(Integer.toString(amt));
            cart();
            int act = macam.inputInt("1. Continue\n2. Checkout");
            if (act == 1)
            {
                macam.clear();
                continue;
            }
            else if (act == 2)
            {
                macam.clear();
                macam.write("Money = $"+atm);
                if (atm < total)
                {
                    macam.write("Maaf, uang anda tidak cukup");
                    macam.timer(3);
                    break;
                }
                else 
                {
                    if (total > 200)
                    {
                        macam.clear();
                        atm = atm - total;
                        macam.write("Thankyou");
                        cart();
                        macam.write("--------------");
                        macam.write("Total = $"+total);
                        receipt();
                        total = 0;
                        cart.clear();
                        macam.timer(8);
                        break;
                    }
                    else
                    {
                        macam.clear();
                        atm = atm - total;
                        macam.write("Thankyou");
                        cart();
                        macam.write("--------------");
                        macam.write("Total = $"+total);
                        receipt_2();
                        total = 0;
                        cart.clear();
                        macam.timer(8);
                        break;
                    }
                }
            }
        }
    }
}