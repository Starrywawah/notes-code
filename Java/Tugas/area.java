public class area {
    public static void calc(double s1, Integer choice, double s2)
    {
        if (choice == 1)
        {
            System.out.println(s1 + "*" + s2 + "=" + (s1*s2));
        }

        if (choice == 2)
        {
            System.out.println(s1 + "*" + s2 + "*" + 0.5 + "=" + (s1 * s2 * 0.5));       
        }
    }
}
