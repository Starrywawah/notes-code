import java.util.Scanner;

public class kantin {
    public static void main(String[] args)
    {

        System.out.print ("\033[H\033[2J");
        System.out.flush();

        Scanner ask = new Scanner(System.in);

        int uang = 0;

        while(true)
        {
            System.out.println("-------------------------------------");
            System.out.println("Balance = "+uang);
            System.out.println("Pilih jumlah uang yang akan dimasukkan : ");
            System.out.println("1. 100.000");
            System.out.println("2. 50.000");
            System.out.println("3. 20.000");
            System.out.println("4. 10.000");
            System.out.println("5. 5.000");
            System.out.println("6. Lanjut ke pemesanan");

            int choiceu = ask.nextInt();

            if (choiceu == 1)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();
                uang = uang + 100000;
                continue;
            }

            else if (choiceu == 2)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();
                uang = uang + 50000;
                continue;
            }

            else if (choiceu == 3)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();
                uang = uang + 20000;
                continue;
            }

            else if (choiceu == 4)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();
                uang = uang + 10000;
                continue;
            }

            else if (choiceu == 5)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();
                uang = uang + 5000;
                continue;
            }

            else if (choiceu == 6)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();
                
                while (true)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Balance = "+uang);
                    System.out.println("Menu :");
                    System.out.println("1. Mie Ayam (15.000)");
                    System.out.println("2. Nasi Goreng (25.000)");
                    System.out.println("3. Nasi Uduk (20.000)");
                    System.out.println("4. Soto Sapi (30.000)");
                    System.out.println("5. Bihun Bakso (20.000)");
                    System.out.println("6. Lanjut ke pemesanan minuman");
                    System.out.println("7. Selesaikan pemesanan");

                    int choicem = ask.nextInt();

                    if (uang < 0)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Mohon tambahkan uang");
                        break;
                    }

                    if (choicem == 1)
                    {
                        uang = uang - 15000;

                        if (uang >= 15000)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }

                        else if (uang < 0)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Error");
                            try {
                            Thread.sleep(2000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Mohon tambahkan uang");
                            try {
                            Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            break;
                        }
                    }

                    else if (choicem == 2)
                    {
                        uang = uang - 25000;

                        if (uang >= 25000)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }

                        else if (uang < 0)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Error");
                            try {
                            Thread.sleep(2000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Mohon tambahkan uang");
                            try {
                            Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            break;
                        }
                    }

                    else if (choicem == 3)
                    {
                        uang = uang - 20000;

                        if (uang >= 20000)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }

                        else if (uang < 0)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Error");
                            try {
                            Thread.sleep(2000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Mohon tambahkan uang");
                            try {
                            Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            break;
                        }
                    }

                    else if (choicem == 4)
                    {
                        uang = uang - 30000;

                        if (uang >= 30000)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }

                        else if (uang < 0)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Error");
                            try {
                            Thread.sleep(2000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Mohon tambahkan uang");
                            try {
                            Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            break;
                        }
                    }

                    else if (choicem == 5)
                    {
                        uang = uang - 20000;

                        if (uang >= 20000)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }

                        else if (uang < 0)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Error");
                            try {
                            Thread.sleep(2000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("Mohon tambahkan uang");
                            try {
                            Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            break;
                        }
                    }

                    else if (choicem == 6)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        while(true)
                        {
                            System.out.println("Balance = "+uang);
                            System.out.println("Menu :");
                            System.out.println("1. Air Mineral (4000)");
                            System.out.println("2. Es Teh Tawar (5000)");
                            System.out.println("3. Es Teh Manis (5500)");
                            System.out.println("4. Teh Panas Tawar (6000)");
                            System.out.println("5. Teh Panas Manis (6500)");
                            System.out.println("6. Kopi (10000)");
                            System.out.println("7. Selesaikan pemesanan");

                            int choicemn = ask.nextInt();

                            if (choicemn == 1)
                            {
                                uang = uang - 4000;

                                if (uang >= 4000)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    continue;
                                }

                                else if (uang < 0)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Error");
                                    try {
                                    Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Mohon tambahkan uang");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    break;
                                }
                            }

                            else if (choicemn == 2)
                            {
                                uang = uang - 5000;

                                if (uang >= 5000)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    continue;
                                }

                                else if (uang < 0)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Error");
                                    try {
                                    Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Mohon tambahkan uang");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    break;
                                }
                            }

                            else if (choicemn == 3)
                            {
                                uang = uang - 5500;

                                if (uang >= 5500)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    continue;
                                }

                                else if (uang < 0)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Error");
                                    try {
                                    Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Mohon tambahkan uang");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    break;
                                }
                            }

                            else if (choicemn == 4)
                            {
                                uang = uang - 6000;

                                if (uang >= 6000)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    continue;
                                }

                                else if (uang < 0)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Error");
                                    try {
                                    Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Mohon tambahkan uang");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    break;
                                }
                            }

                            else if (choicemn == 5)
                            {
                                uang = uang - 6500;

                                if (uang >= 6500)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    continue;
                                }

                                else if (uang < 0)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Error");
                                    try {
                                    Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Mohon tambahkan uang");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    break;
                                }
                            }

                            else if (choicemn == 6)
                            {
                                uang = uang - 10000;

                                if (uang >= 10000)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    continue;
                                }

                                else if (uang < 0)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Error");
                                    try {
                                    Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    System.out.println("Mohon tambahkan uang");
                                    try {
                                    Thread.sleep(3000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    break;
                                }
                            }

                            else if (choicemn == 7)
                            {
                                System.out.print ("\033[H\033[2J");
                                System.out.flush();
                                System.out.println("Balance = "+uang);
                                System.out.println("Terima kasih");
                                System.exit(0);
                            }
                        }
                    }

                    else if (choicem == 7)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Balance = "+uang);
                        System.out.println("Terima kasih");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
