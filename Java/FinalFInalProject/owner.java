public class owner
{
    
    static iem i = new iem();
    static tws t = new tws();
    static dap d = new dap();
    static headphone h = new headphone();
    static source s = new source();

    public void IEM()
    {
        int act = macam.inputInt("1. Add\n2. Show\n3. Edit\n4. Delete");
        if (act == 1)
        {
            i.add();
        }
        else if (act == 2)
        {
            i.show();
        }
        else if (act == 3)
        {
            i.update();
        }
        else if (act == 4)
        {
            i.remove();
        }
    } 
    
    public void TWS()
    {
        int act = macam.inputInt("1. Add\n2. Show\n3. Edit\n4. Delete");
        if (act == 1)
        {
            t.add();
        }
        else if (act == 2)
        {
            t.show();
        }
        else if (act == 3)
        {
            t.update();
        }
        else if (act == 4)
        {
            t.remove();
        }        
    }

    public void HP()
    {
        
        int act = macam.inputInt("1. Add\n2. Show\n3. Edit\n4. Delete");
        if (act == 1)
        {
            h.add();
        }
        else if (act == 2)
        {
            h.show();
        }
        else if (act == 3)
        {
            h.update();
        }
        else if (act == 4)
        {
            h.remove();
        }
    }

    public void SRC()
    {
        int act = macam.inputInt("1. Add\n2. Show\n3. Edit\n4. Delete");
        if (act == 1)
        {
            s.add();
        }
        else if (act == 2)
        {
            s.show();
        }
        else if (act == 3)
        {
            s.update();
        }
        else if (act == 4)
        {
            s.remove();
        }
    }

    public void DAP()
    {
        int act = macam.inputInt("1. Add\n2. Show\n3. Edit\n4. Delete");
        if (act == 1)
        {
            d.add();
        }
        else if (act == 2)
        {
            d.show();
        }
        else if (act == 3)
        {
            d.update();
        }
        else if (act == 4)
        {
            d.remove();
        }
    }
}
