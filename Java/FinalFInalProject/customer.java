public class customer 
{

    static iem i = new iem();
    static tws t = new tws();
    static dap d = new dap();
    static headphone h = new headphone();
    static source s = new source();

    public void buyIEM()
    {
        i.buy();
    }

    public void buyTWS()
    {
        t.buy();
    }

    public void buyHP()
    {
        h.buy();
    }

    public void buySRC()
    {
        s.buy();
    }

    public void buyDAP()
    {
        d.buy();
    }
}
