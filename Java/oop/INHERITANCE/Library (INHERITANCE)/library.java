import java.util.ArrayList;

public class library 
{
    static comic display_1 = new comic();
    static novel display_2 = new novel();
    // ArrayList<String> comic = new ArrayList<String>();
 
    public static void main(String[] args) 
    {
        while (true)
        {
            macam.clear();
            int act_1 = macam.inputInt("1. Create\n2. Show\n3. Update\n4. Delete");
            if (act_1 == 1)
            {
                while (true)
                {
                    macam.clear();
                    int act_2 = macam.inputInt("1. Comic\n2. Novel\n3. Back");
                    if (act_2 == 1)
                    {
                        macam.clear();
                        macam.lanjut();
                        display_1.addComic();
                    }
                    else if (act_2 == 2)
                    {
                        macam.clear();
                        macam.lanjut();
                        display_2.addNovel();
                    }
                    else if (act_2 == 3)
                    {
                        break;
                    }
                }

            }

            else if (act_1 == 2)
            {
                while (true)
                {
                    macam.clear();
                    int act_2 = macam.inputInt("1. Comic\n2. Novel\n3. Back");
                    if (act_2 == 1)
                    {
                        macam.clear();
                        display_1.getComic();
                        int act_3 = macam.inputInt("Press 1 to exit");
                        if (act_3 == 1)
                        {
                            break;
                        }
                    }
                    else if (act_2 == 2)
                    {
                        macam.clear();
                        display_2.getNovel();
                        int act_3 = macam.inputInt("Press 1 to exit");
                        if (act_3 == 1)
                        {
                            break;
                        }
                    }
                    else if (act_2 == 3)
                    {
                        break;
                    }
                }

            }
            
            else if (act_1 == 3)
            {
                while (true)
                {
                    macam.clear();
                    int act_2 = macam.inputInt("1. Comic\n2. Novel\n3. Back");
                    if (act_2 == 1)
                    {
                        macam.clear();
                        macam.lanjut();
                        display_1.getComic();
                        display_1.updateComic();
                    }
                    else if (act_2 == 2)
                    {
                        macam.clear();
                        macam.lanjut();
                        display_2.getNovel();
                        display_2.updateNovel();
                    }
                    else if (act_2 == 3)
                    {
                        break;
                    }
                }
            }

            else if (act_1 == 4)
            {
                while (true)
                {
                    macam.clear();
                    int act_2 = macam.inputInt("1. Comic\n2. Novel\n3. Back");
                    if (act_2 == 1)
                    {
                        macam.clear();
                        display_1.getComic();
                        display_1.deleteComic();
                    }
                    else if (act_2 == 2)
                    {
                        display_2.getNovel();
                        display_2.deleteNovel();
                    }
                    else if (act_2 == 3)
                    {
                        break;
                    }
                }
            }
        }
    }
}