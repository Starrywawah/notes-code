import java.util.Scanner

public class score {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);

        int skor = 0;
        
        while(true)
        {
            System.out.println("skor = " +skor);
            System.out.println("???");

            String out = ask.nextLine();

            if (out.equals("brian"))
            {
                skor = skor + 10;
            }

            else if (out.equals("qibar"))
            {
                skor = skor + 15;
            }
        }
    }
}
