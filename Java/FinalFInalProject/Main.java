public class Main extends catalog
{
    static catalog view = new catalog();
    public static void main(String[] args)
    {
        owner ow = new owner();
        customer cust = new customer();

        macam.clear();
        int user = macam.inputInt("1. Owner\n2. Customer");
        if (user == 1)
        {
            while (true)
            {
                macam.clear();
                int cat = macam.inputInt("Welcome\n1. IEM\n2. TWS\n3. Headphone\n4. Source\n5. DAP\n6. Log out");
                if (cat == 1)
                {
                    while (true)
                    {
                        macam.clear();
                        ow.IEM();
                        int act_2 = macam.inputInt("1. Continue\n2. Exit");
                        if (act_2 == 1)
                        {
                            continue;
                        }
                        else if (act_2 == 2)
                        {
                            break;
                        }
                    }
                }

                else if (cat == 2)
                {
                    while (true)
                    {
                        macam.clear();
                        ow.TWS();
                        int act_2 = macam.inputInt("1. Continue\n2. Exit");
                        if (act_2 == 1)
                        {
                            continue;
                        }
                        else if (act_2 == 2)
                        {
                            break;
                        }
                    }            
                }

                else if (cat == 3)
                {
                    while (true)
                    {
                        macam.clear();
                        ow.HP();
                        int act_2 = macam.inputInt("1. Continue\n2. Exit");
                        if (act_2 == 1)
                        {
                            continue;
                        }
                        else if (act_2 == 2)
                        {
                            break;
                        }
                    }
                }

                else if (cat == 4)
                {
                    while (true)
                    {
                        macam.clear();
                        ow.SRC();
                        int act_2 = macam.inputInt("1. Continue\n2. Exit");
                        if (act_2 == 1)
                        {
                            continue;
                        }
                        else if (act_2 == 2)
                        {
                            break;
                        }
                    }
                }

                else if (cat == 5)
                {
                    while (true)
                    {
                        macam.clear();
                        ow.DAP();
                        int act_2 = macam.inputInt("1. Continue\n2. Exit");
                        if (act_2 == 1)
                        {
                            continue;
                        }
                        else if (act_2 == 2)
                        {
                            break;
                        }
                    }
                }

                else if (cat == 6)
                {
                    break;
                }
            }
        }

        else if (user == 2)
        {
            while (true)
            {
                macam.clear();
                int total = 0;
                macam.write("Money = $" + atm);
                int act = macam.inputInt("1. Add money\n2. Buy\n3. Log out");
                if (act == 1)
                {
                    view.atm();
                }
                else if (act == 2)
                {
                    macam.clear();
                    int item = macam.inputInt("1. IEM\n2. TWS\n3. Headphones\n4. Source\n5. DAP");
                    if (item == 1)
                    {
                        macam.clear();
                        cust.buyIEM();
                    }
                    else if (item == 2)
                    {
                        macam.clear();
                        cust.buyTWS();
                    }
                    else if (item == 3)
                    {
                        macam.clear();
                        cust.buyHP();
                    }
                    else if (item == 4)
                    {
                        macam.clear();
                        cust.buySRC();
                    }
                    else if (item == 5)
                    {
                        macam.clear();
                        cust.buyDAP();
                    }
                    
                }
                else if (act == 3)
                {
                    break;
                }
            }
        }
    }
}
