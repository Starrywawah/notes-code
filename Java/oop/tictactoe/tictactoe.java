import java.util.*;
// && and
// || or
public class tictactoe {
    static String[] tic = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static void tic()
    {
        int b = 1;
        int c = 2;
        for (int a = 0; a<=6; a = a+3)
        {
            System.out.println("|" + tic[a]+"|" + "|" + tic[b] + "|" + tic[c] + "|");
            b = b + 3;
            c = c + 3;
        }
    }
    public static void main(String[] args) 
    {
        macam.clear();
        macam.write("Starting....");
        macam.timer(2);
        macam.clear();
        String sym = "x";
        while (true)
        {
            macam.clear();
            tic();   
            macam.write("---------");
            int urutan = macam.inputInt("Giliran " + sym + "\nInput angka : ");
            macam.write("Checking....");
            macam.timer(3);
            
            if(tic[urutan-1].equals("x")||tic[urutan-1].equals("o"))
            {
                macam.write("Slot is already filled!");
                macam.timer(1);
            }
            else
            {
                macam.write("Slot available");
                tic[urutan - 1] = sym;
                // horizontal
                for (int m = 0; m<=6; m = m + 3)
                {
                    if(tic[m].equals(tic[m+1])&&tic[m+1].equals(tic[m+2])&&tic[m+2].equals(tic[m]))
                    {
                        macam.write(sym + " menang" + "\n---------");
                        tic();
                        System.exit(0);
                    }
                }

                // vertical
                for (int m = 0; m<=2; m = m + 1)
                {
                    if(tic[m].equals(tic[m+3])&&tic[m+3].equals(tic[m+6])&&tic[m+6].equals(tic[m]))
                    {
                        macam.write(sym + " menang");
                        tic();
                        System.exit(0);
                    }
                }

                // diagonal
                if(tic[0].equals(tic[4])&&tic[4].equals(tic[8])&&tic[8].equals(tic[0]))
                {
                    macam.write(sym + " menang");
                    tic();
                    System.exit(0);
                }

                if(tic[2].equals(tic[4])&&tic[4].equals(tic[6])&&tic[6].equals(tic[2]))
                {
                    macam.write(sym + " menang");
                    tic();
                    System.exit(0);
                }
                

                if(sym.equals("x"))
                {
                    sym = "o";
                }
                else
                {
                    sym = "x";
                    
                }
                // int b = 1;
                // int c = 2;
                // for (int a = 0; a<=6; a = a+3)
                // {
                //     System.out.println("|" + tic[a]+"|" + "|" + tic[b] + "|" + tic[c] + "|");
                //     b = b + 3;
                //     c = c + 3;
                // }
            }
        }

    }
}

