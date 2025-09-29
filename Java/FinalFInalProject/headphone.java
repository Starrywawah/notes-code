import java.util.ArrayList;

class headphone extends catalog
{
    String driver;
    static catalog view = new catalog();
    static int total = 0;

    public void add()
    {
        input();
        macam.lanjut();
        driver = macam.inputString("Driver : ");
        macam.addStr("barangHP", nama);
        macam.addInt("hargaHP", harga);
        macam.addInt("stokHP", jumlah_barang);
        macam.addStr("driverHP", driver);
    }

    public void show()
    {
        macam.showBarang(x, "barangHP", "hargaHP", "stokHP", "driverHP", "Driver");
    }

    public void update()
    {
        macam.showBarang(x, "barangHP", "hargaHP", "stokHP", "driverHP", "Driver");
        rak = macam.inputInt("Pilih rak : ");
        macam.lanjut();
        input();
        macam.lanjut();
        driver = macam.inputString("Driver : ");
        macam.editItem("barangHP", rak, nama);
        macam.editNum("hargaHP", rak, harga);
        macam.editNum("stokHP", rak, jumlah_barang);
        macam.editItem("driverHP", rak, driver);
    }

    public void remove()
    {
        macam.showBarang(x, "barangHP", "hargaHP", "stokHP", "driverHP", "Driver");
        rak = macam.inputInt("Pilih rak : ");
        macam.itemRemove("barangHP", "hargaHP", "stokHP", "driverHP", rak, driver);
    }

    
    public void buy()
    {
        while (true)
        {
            macam.showBarang(x, "barangHP", "hargaHP", "stokHP", "driverHP", "Driver");
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
            macam.updateStock("stokHP", rak, amt);
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

    public void liscart()
    {
        while (true)
        {
            cart();
            int act = macam.inputInt("1. Checkout\n2. Back");
            if (act == 1)
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
                        total = 0;
                        cart.clear();
                        receipt();
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
                        total = 0;
                        cart.clear();
                        receipt_2();
                        macam.timer(8);
                        break;
                    }

                }
            }
            else if (act == 2)
            {
                break;
            }
        }
    }
}