public class front extends a
{
    static a run = new a();
    public static void main(String[] args)
    {
        while (true)
        {
            run.ui();
            for (int m = 0; m<=6; m = m + 3)
            {
                if(tic[m].equals(tic[m+1])&&tic[m+1].equals(tic[m+2])&&tic[m+2].equals(tic[m]))
                {
                    run.GameEnd();
                    macam.write(sym + " menang" + "\n---------");
                    run.tic();
                    macam.timer(3);
                    d = 2;
                }
            }

            if (d == 2)
            {
                break;
            }
        }
    }    
}
