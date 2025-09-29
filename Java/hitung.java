public class hitung {
    public static void calc(double a1, String sym, double a2)
    {
        if (sym.equals("+"))
        {
            System.out.println(a1 + "+" + a2 + "=" + (a1+a2));
        }
        else if (sym.equals("-"))
        {
            System.out.println(a1 + "-" + a2 + "=" + (a1-a2));
        }
        else if (sym.equals("*"))
        {
            System.out.println(a1 + "*" + a2 + "=" + (a1*a2));
        }
        else if (sym.equals("/"))
        {
            if (a2 == 0)
            {
                System.out.println("Error");
            }
            else 
            {
                System.out.println(a1 + "/" + a2 + "=" + (a1/a2));
            }
        }
    }
}
