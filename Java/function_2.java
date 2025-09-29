public class function_2 
{
    static void test_1()
    {
        System.out.println("ini tanpa return");
    }

    static String test_2(String nama) //parameter
    {
        return "hello" + nama;
        // return 24
        // return nilai
    }

    static int angka_2 = 24;

    public static void main(String[] args)
    {
        System.out.print ("\033[H\033[2J");
        System.out.flush();
        test_2("Brian");
        System.out.println(test_2(" Brian"));

        macam.write(macam.inputString("Nama siapa ?"));
    }
}
