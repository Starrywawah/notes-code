public class a 
{
    String tic[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String sym = "x";

    public void tic()
    {
        int b = 1;
        int c = 2;
        for (int a = 0; a<=6; a+=3)
        {
            macam.write("|" + tic[a] + "|" + tic[b] + "|" + tic[c] + "|");
            b+=3;
            c+=3;
        }
    }

    public void ui()
    {
        macam.clear();
        macam.write("----------\n"+sym+"'s turn");
        tic();
        macam.write("----------");
        int fill = macam.inputInt("Pick a number : ");
        checkSlot(tic, fill);
    }

    public void checkSlot(String tic[], int fill)
    {
        if (tic[fill-1].equals("x") || tic[fill-1].equals("o"))
        {
            macam.write("This slot is already filled");
            macam.timer(1);
        }
        else
        {
            tic[fill-1] = sym;
            checkHorizontal(tic);
            checkVertical(tic);
            checkDiagonal(tic);
            changeSym();
        }
    }

    public void checkHorizontal(String tic[])
    {
        for (int m = 0; m<=6; m = m + 3)
        {
            if(tic[m].equals(tic[m+1])&&tic[m+1].equals(tic[m+2])&&tic[m+2].equals(tic[m]))
            {
                macam.write(sym + " menang" + "\n---------");
                tic();
                System.exit(0);
            }
        }
    }

    public void checkVertical(String tic[])
    {
        for (int m = 0; m<=2; m++)
        {
            if(tic[m].equals(tic[m+3])&&tic[m+3].equals(tic[m+6])&&tic[m+6].equals(tic[m]))
            {
                macam.write(sym + " menang");
                tic();
                System.exit(0);
            }
        }
    }

    public void checkDiagonal(String tic[])
    {
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
    }

    public void changeSym()
    {
        if (sym.equals("x"))
        {
            sym = "o";
        }
        else 
        {
            sym = "x";
        }
    }
}
