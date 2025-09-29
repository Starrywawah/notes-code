public class library
{
    static String[] books = new String[10];
    static String[] status =  {"","","","","","","","","",""};

    public static void list()
    {
        for (int a = 0; a<books.length; a = a+1)
        {
            if (books[a] == null)
            {
                macam.write((a+1) + ". Kosong");
            }
            else
            {
                macam.write((a+1) + ". " + books[a] + " - " +  status[a]);
            }
        }
    }

    public static void main(String[] args)
    {
        while (true)
        {
            macam.clear();
            macam.write("Welcome to the library");
            macam.write("1. Customer\n2. Owner");
            int user = macam.inputInt("Log in");
            macam.clear();
            macam.write("Logging in.....");
            macam.timer(3);

            if (user == 1)
            {
                while (true)
                {
                    macam.clear();
                    macam.write("1. Borrow book\n2. See collection\n3. Return book\n4. Log out");
                    int c1 = macam.inputInt("What do you want to do ?");

                    if (c1 == 1)
                    {
                        while(true)
                        {
                            owctrl.borrow(books, status);
                            macam.write("1. Continue\n2. Exit");
                            int c2 = macam.inputInt("");
                            if (c2 == 1)
                            {
                                macam.clear();
                                continue;
                            }
                            else if (c2 == 2)
                            {
                                macam.clear();
                                break;
                            }
                        }
                    }

                    else if (c1 == 2)
                    {
                        while(true)
                        {
                            owctrl.see(books, status);
                            macam.write("1. Exit");
                            int c2 = macam.inputInt("");
                            if (c2 == 1)
                            {
                                macam.clear();
                                break;
                            }
                        }
                    }

                    else if (c1 == 3)
                    {
                        while (true)
                        {
                            owctrl.kembali(books, status);
                            macam.write("1. Continue\n2. Exit");
                            int c2 = macam.inputInt("");
                            if (c2 == 1)
                            {
                                macam.clear();
                                continue;
                            }
                            else if (c2 == 2)
                            {
                                macam.clear();
                                break;
                            }
                        }
                    }

                    else if (c1 == 4)
                    {
                        macam.write("Logging out....");
                        macam.timer(2);
                        macam.write("-------------------------\nThankyou for using this library service!\n-------------------------");
                        macam.timer(1);
                        break;
                    }
                }
            }

            else if (user == 2)
            {
                while (true)
                {
                    macam.clear();
                    macam.write("1. Add book\n2. See collection\n3. Edit collection\n4. Remove book\n5. Log out");
                    int c1 = macam.inputInt("What do you want to do ?");
                        
                    if (c1 == 1)
                    {
                        while(true)
                        {
                            owctrl.add(books, status);
                            macam.write("1. Continue\n2. Exit");
                            int c2 = macam.inputInt("");
                            if (c2 == 1)
                            {
                                macam.clear();
                                continue;
                            }
                            else if (c2 == 2)
                            {
                                macam.clear();
                                break;
                            }
                        }
                        
                    }

                    else if (c1 == 2)
                    {
                        while(true)
                        {
                            owctrl.see(books, status);
                            macam.write("1. Exit");
                            int c2 = macam.inputInt("");
                            if (c2 == 1)
                            {
                                macam.clear();
                                break;
                            }
                        }
                        
                        
                    }

                    else if (c1 == 3)
                    {
                        while(true)
                        {
                            owctrl.edit(books, status);
                            macam.write("1. Continue\n2. Exit");
                            int c2 = macam.inputInt("");
                            if (c2 == 1)
                            {
                                macam.clear();
                                continue;
                            }
                            else if (c2 == 2)
                            {
                                macam.clear();
                                break;
                            }
                        }
                        
                    }

                    else if(c1 == 4)
                    {
                        while (true)
                        {
                            owctrl.delete(books, status);
                            macam.write("1. Continue\n2. Exit");
                            int c2 = macam.inputInt("");
                            if (c2 == 1)
                            {
                                macam.clear();
                                continue;
                            }
                            else if (c2 == 2)
                            {
                                macam.clear();
                                break;
                            }
                        }
                    }

                    else if(c1 == 5)
                    {
                        macam.write("Logging out....");
                        macam.timer(2);
                        macam.write("-------------------------\nThankyou for using this library service!\n-------------------------");
                        macam.timer(1);
                        break;
                    }
                }
            }
        }
    }
}