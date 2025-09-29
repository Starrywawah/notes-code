import java.util.concurrent.TimeUnit;
import java.util.Scanner;
// Opsi
// 1. Easy
// 2. Medium
// 3. Hard
// 4. Extreme

public class random {
    public static void main(String[] args)
    {
        int score = 0;

        Scanner ask = new Scanner(System.in);

        while (true)
        {
            System.out.print ("\033[H\033[2J");
            System.out.flush();

            System.out.println("Pick which level do you want to play : ");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");

            int choice1 = ask.nextInt();

            if (choice1 == 1)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("Score = "+score);

                System.out.println("--------------");
                int rand = (int)(Math.random() * 3);
                int rand_2 = (int)(Math.random() * 3);

                System.out.println(rand);
                System.out.println(rand_2);

                // Pertanyaan
                System.out.println("--------------");
                System.out.print(rand + "+" + rand_2 + "=");

                int hasil = ask.nextInt();

                int total = rand + rand_2;

                if (hasil == total)
                {
                    System.out.println("Hasilnya benar");
                    score = score + 10;
                    System.out.println("--------------");
                    System.out.println("+" +score + " score");
                }

                else
                {
                    System.out.println("Salah");
                    score = score - 10;
                    System.out.println("--------------");
                    System.out.println(+score + " score");
                }

                try {
                Thread.sleep(10000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("--------------");
                System.out.println("What do you want to do now ?");
                System.out.println("1. Continue this level");
                System.out.println("2. Continue to the next level");
                System.out.println("3. Exit");

                int choice2 = ask.nextInt();

                if (choice2 == 1)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    while (true)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Score = "+score);

                        System.out.println("--------------");
                        int rand_10 = (int)(Math.random() * 101);
                        int rand_11 = (int)(Math.random() * 101);

                        System.out.println(rand_10);
                        System.out.println(rand_11);

                        // Pertanyaan
                        System.out.println("--------------");
                        System.out.print(rand_10 + "+" + rand_11 + "=");

                        int hasil7 = ask.nextInt();

                        int total7 = rand_10 + rand_11;

                        if (hasil7 == total7)
                        {
                            System.out.println("Hasilnya benar");
                            int score_1 = 0;
                            score_1 = score_1 + 10;
                            score = score + 10;
                            System.out.println("--------------");
                            System.out.println("+" +score_1 + " score");
                        }

                        else
                        {
                            System.out.println("Salah");
                            score = score - 10;
                            System.out.println("--------------");
                            System.out.println(+score + " score");
                        }

                        try {
                        Thread.sleep(10000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }

                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("--------------");
                        System.out.println("What do you want to do now ?");
                        System.out.println("1. Continue this level");
                        System.out.println("2. Continue to the next level");
                        System.out.println("3. Exit");

                        int choice3 = ask.nextInt();

                        if (choice3 == 1)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();

                            continue;
                        }
                        
                        else if (choice3 == 2)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("Score = "+score);
                            System.out.println("--------------");
            
                            int rand_3 = (int)(Math.random() * 101);
                            int rand_4 = (int)(Math.random() * 101);
            
                            System.out.println(rand_3);
                            System.out.println(rand_4);
            
                            // Pertanyaan
            
                            System.out.println("--------------");
                            System.out.print(rand_3 + "x" + rand_4 + "=");
            
                            int hasil2 = ask.nextInt();
            
                            int total2 = rand_3 * rand_4;
            
                            if (hasil2 == total2)
                            {
                                System.out.println("Hasilnya benar");
                                score = score + 20;
                                System.out.println("--------------");
                                System.out.println("+" +score + " score");
                                
                            }
            
                            else
                            {
                                System.out.println("Salah");
                                score = score - 20;
                                System.out.println("--------------");
                                System.out.println(+score + " core");
                            }
            
                            try {
                            Thread.sleep(5000);
                            } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
            
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
            
                            System.out.println("--------------");
                            System.out.println("What do you want to do now ?");
                            System.out.println("1. Continue this level");
                            System.out.println("2. Continue to the next level");
                            System.out.println("3. Exit");
            
                            int choice4 = ask.nextInt();
            
                            if (choice4 == 1)
                            {
                                System.out.print ("\033[H\033[2J");
                                System.out.flush();
            
                                while (true)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
            
                                    System.out.println("Score = "+score);
                                    System.out.println("--------------");
            
                                    int rand_5 = (int)(Math.random() * 101);
                                    int rand_6 = (int)(Math.random() * 101);
            
                                    System.out.println(rand_5);
                                    System.out.println(rand_6);
            
                                    // Pertanyaan
            
                                    System.out.println("--------------");
                                    System.out.print(rand_5 + "x" + rand_6 + "=");
            
                                    int hasil3 = ask.nextInt();
            
                                    int total3 = rand_5 * rand_6;
            
                                    if (hasil3 == total3)
                                    {
                                        System.out.println("Hasilnya benar");
                                        int score_1 = 0;
                                        score = score + 20;
                                        score_1 = score_1 + 20;
                                        System.out.println("--------------");
                                        System.out.println("+" +score_1 + " score");
                                        
                                    }
            
                                    else
                                    {
                                        System.out.println("Salah");
                                        int score_1 = 0;
                                        score = score + 20;
                                        score_1 = score_1 + 20;
                                        System.out.println("--------------");
                                        System.out.println(+score + " score");
                                    }
            
                                    try {
                                    Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
            
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
            
                                    System.out.println("--------------");
                                    System.out.println("What do you want to do now ?");
                                    System.out.println("1. Continue this level");
                                    System.out.println("2. Continue to the next level");
                                    System.out.println("3. Exit");
            
                                    int choice5= ask.nextInt();
            
                                    if (choice5 == 1)
                                    {
                                        System.out.print ("\033[H\033[2J");
                                        System.out.flush();
                                        continue;
                                    }
            
                                    else if (choice5 == 2)
                                    {
                                        System.out.print ("\033[H\033[2J");
                                        System.out.flush();
            
                                        while (true)
                                        {
                                            System.out.print ("\033[H\033[2J");
                                            System.out.flush();
                    
                                            System.out.println("Score = "+score);
                                            System.out.println("--------------");
                    
                                            int rand_7 = (int)(Math.random() * 101);
                                            int rand_8 = (int)(Math.random() * 101);
                                            int rand_9 = (int)(Math.random() * 101);
                    
                                            System.out.println(rand_7);
                                            System.out.println(rand_8);
                                            System.out.println(rand_9);
                    
                                            // Pertanyaan
                    
                                            System.out.println("--------------");
                                            System.out.print(rand_7 + "+" + rand_8 + "x" + rand_9 + "=");
                    
                                            int hasil4 = ask.nextInt();
                    
                                            int total4 = rand_7 + rand_8 * rand_9;
                    
                                            if (hasil4 == total4)
                                            {
                                                System.out.println("Hasilnya benar");
                                                int score_1 = 0;
                                                score_1 = score_1 + 30;
                                                score = score + 30;
                                                System.out.println("--------------");
                                                System.out.println("+" +score + " score");
                                                
                                            }
                    
                                            else
                                            {
                                                System.out.println("Salah");
                                                int score_1 = 0;
                                                score_1 = score_1 + 30;
                                                score = score - 30;
                                                System.out.println("--------------");
                                                System.out.println(+score + " score");
                                            }
                    
                                            try {
                                            Thread.sleep(5000);
                                            } catch (InterruptedException e) {
                                            e.printStackTrace();
                                            }
                    
                                            System.out.print ("\033[H\033[2J");
                                            System.out.flush();
                    
                                            System.out.println("--------------");
                                            System.out.println("What do you want to do now ?");
                                            System.out.println("1. Continue this level");
                                            System.out.println("2. Exit");
                    
                                            int choice6 = ask.nextInt();
                    
                                            if (choice6 == 1)
                                            {
                                                System.out.print ("\033[H\033[2J");
                                                System.out.flush();
                                                continue;
                                            }
                    
                                            else
                                            {
                                                System.out.print ("\033[H\033[2J");
                                                System.out.flush();
                    
                                                System.out.println("Your final score = " +score);
                                                System.exit(0);
                                            }
                                        
                                    }
                                }
                            }
                        }
                                
            
                            else if (choice2 == 2)
                            {
                                System.out.print ("\033[H\033[2J");
                                System.out.flush();
                                while (true)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
            
                                    System.out.println("Score = "+score);
                                    System.out.println("--------------");
            
                                    int rand_7 = (int)(Math.random() * 101);
                                    int rand_5 = (int)(Math.random() * 101);
                                    int rand_6 = (int)(Math.random() * 101);
            
                                    System.out.println(rand_7);
                                    System.out.println(rand_5);
                                    System.out.println(rand_6);
            
                                    // Pertanyaan
            
                                    System.out.println("--------------");
                                    System.out.print(rand_7 + "+" + rand_5 + "x" + rand_6 + "=");
            
                                    int hasil3 = ask.nextInt();
            
                                    int total3 = rand_7 + rand_5 * rand_6;
            
                                    if (hasil3 == total3)
                                    {
                                        System.out.println("Hasilnya benar");
                                        int score_1 = 0;
                                        score_1 = score_1 + 30;
                                        score = score + 30;
                                        System.out.println("--------------");
                                        System.out.println("+" +score + " score");
                                        
                                    }
            
                                    else
                                    {
                                        System.out.println("Salah");
                                        int score_1 = 0;
                                        score_1 = score_1 + 30;
                                        score = score - 30;
                                        System.out.println("--------------");
                                        System.out.println(+score + " score");
                                    }
            
                                    try {
                                    Thread.sleep(5000);
                                    } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    }
            
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
            
                                    System.out.println("--------------");
                                    System.out.println("What do you want to do now ?");
                                    System.out.println("1. Continue this level");
                                    System.out.println("2. Exit");
            
                                    int choice9 = ask.nextInt();
            
                                    if (choice9 == 1)
                                    {
                                        System.out.print ("\033[H\033[2J");
                                        System.out.flush();
                                        continue;
                                    }
            
                                    else
                                    {
                                        System.out.print ("\033[H\033[2J");
                                        System.out.flush();
            
                                        System.out.println("Your final score = " +score);
                                        System.exit(0);
                                    }
                                }
                            }
            
                            else if (choice2 == 3)
                            {
                                System.out.print ("\033[H\033[2J");
                                System.out.flush();
                                
                                System.out.println("Your final score = " +score);
                                System.exit(0);
                            }
                        }

                        else if (choice3 == 3)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("Your final score = "+score);
                            System.exit(0);
                        }
                    }
                }

                else if (choice2 == 2)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Score = "+score);
                    System.out.println("--------------");

                    int rand_3 = (int)(Math.random() * 101);
                    int rand_4 = (int)(Math.random() * 101);

                    System.out.println(rand_3);
                    System.out.println(rand_4);

                    // Pertanyaan

                    System.out.println("--------------");
                    System.out.print(rand_3+ "x" + rand_4 + "=");

                    int hasil_2 = ask.nextInt();

                    int total_2 = rand * rand_2;

                    if (hasil_2 == total_2)
                    {
                        System.out.println("Hasilnya benar");
                        score = score + 20;
                        System.out.println("--------------");
                        System.out.println("+" +score + " score");
                        
                    }

                    else
                    {
                        System.out.println("Salah");
                        score = score - 20;
                        System.out.println("--------------");
                        System.out.println(+score + " core");
                    }

                    try {
                    Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                    }

                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("--------------");
                    System.out.println("What do you want to do now ?");
                    System.out.println("1. Continue this level");
                    System.out.println("2. Continue to the next level");
                    System.out.println("3. Exit");

                    int choice3 = ask.nextInt();

                    if (choice3 == 1)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        continue;
                    }

                    else if (choice3 == 2)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
        
                        System.out.println("Score = "+score);
                        System.out.println("--------------");
        
                        int rand_5 = (int)(Math.random() * 101);
                        int rand_6 = (int)(Math.random() * 101);
        
                        System.out.println(rand_5);
                        System.out.println(rand_6);
        
                        // Pertanyaan
        
                        System.out.println("--------------");
                        System.out.print(rand_5 + "x" + rand_6 + "=");
        
                        int hasil2 = ask.nextInt();
        
                        int total2 = rand_5 * rand_6;
        
                        if (hasil2 == total2)
                        {
                            System.out.println("Hasilnya benar");
                            score = score + 20;
                            System.out.println("--------------");
                            System.out.println("+" +score + " score");
                            
                        }
        
                        else
                        {
                            System.out.println("Salah");
                            score = score - 20;
                            System.out.println("--------------");
                            System.out.println(+score + " core");
                        }
        
                        try {
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }
        
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
        
                        System.out.println("--------------");
                        System.out.println("What do you want to do now ?");
                        System.out.println("1. Continue this level");
                        System.out.println("2. Continue to the next level");
                        System.out.println("3. Exit");
        
                        int choice4 = ask.nextInt();
        
                        if (choice4 == 1)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }
        
                        else if (choice4 == 2)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            while (true)
                            {
                                System.out.print ("\033[H\033[2J");
                                System.out.flush();
        
                                System.out.println("Score = "+score);
                                System.out.println("--------------");
        
                                int rand_7 = (int)(Math.random() * 101);
                                int rand_8 = (int)(Math.random() * 101);
                                int rand_9 = (int)(Math.random() * 101);
        
                                System.out.println(rand_7);
                                System.out.println(rand_8);
                                System.out.println(rand_9);
        
                                // Pertanyaan
        
                                System.out.println("--------------");
                                System.out.print(rand_7 + "+" + rand_8 + "x" + rand_9 + "=");
        
                                int hasil3 = ask.nextInt();
        
                                int total3 = rand_7 + rand_8 * rand_9;
        
                                if (hasil3 == total3)
                                {
                                    System.out.println("Hasilnya benar");
                                    int score_1 = 0;
                                    score_1 = score_1 + 30;
                                    score = score + 30;
                                    System.out.println("--------------");
                                    System.out.println("+" +score + " score");
                                    
                                }
        
                                else
                                {
                                    System.out.println("Salah");
                                    int score_1 = 0;
                                    score_1 = score_1 + 30;
                                    score = score - 30;
                                    System.out.println("--------------");
                                    System.out.println(+score + " score");
                                }
        
                                try {
                                Thread.sleep(5000);
                                } catch (InterruptedException e) {
                                e.printStackTrace();
                                }
        
                                System.out.print ("\033[H\033[2J");
                                System.out.flush();
        
                                System.out.println("--------------");
                                System.out.println("What do you want to do now ?");
                                System.out.println("1. Continue this level");
                                System.out.println("2. Exit");
        
                                int choice5 = ask.nextInt();
        
                                if (choice5 == 1)
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
                                    continue;
                                }
        
                                else
                                {
                                    System.out.print ("\033[H\033[2J");
                                    System.out.flush();
        
                                    System.out.println("Your final score = " +score);
                                    System.exit(0);
                                }
                            }
                        }
        
                        else if (choice2 == 3)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            
                            System.out.println("Your final score = " +score);
                            System.exit(0);
                        }
                    }
                }

                else if (choice2 == 3)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Your final score = " +score);
                    System.exit(0);
                }
            }

            else if (choice1 == 2)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("Score = "+score);
                System.out.println("--------------");

                int rand = (int)(Math.random() * 101);
                int rand_2 = (int)(Math.random() * 101);

                System.out.println(rand);
                System.out.println(rand_2);

                // Pertanyaan

                System.out.println("--------------");
                System.out.print(rand + "x" + rand_2 + "=");

                int hasil = ask.nextInt();

                int total = rand * rand_2;

                if (hasil == total)
                {
                    System.out.println("Hasilnya benar");
                    score = score + 20;
                    System.out.println("--------------");
                    System.out.println("+" +score + " score");
                    
                }

                else
                {
                    System.out.println("Salah");
                    score = score - 20;
                    System.out.println("--------------");
                    System.out.println(+score + " core");
                }

                try {
                Thread.sleep(5000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("--------------");
                System.out.println("What do you want to do now ?");
                System.out.println("1. Continue this level");
                System.out.println("2. Continue to the next level");
                System.out.println("3. Exit");

                int choice2 = ask.nextInt();

                if (choice2 == 1)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    while (true)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Score = "+score);
                        System.out.println("--------------");

                        int rand_4 = (int)(Math.random() * 101);
                        int rand_5 = (int)(Math.random() * 101);

                        System.out.println(rand_4);
                        System.out.println(rand_5);

                        // Pertanyaan

                        System.out.println("--------------");
                        System.out.print(rand_4 + "x" + rand_5 + "=");

                        int hasil2 = ask.nextInt();

                        int total2 = rand_4 * rand_5;

                        if (hasil2 == total2)
                        {
                            System.out.println("Hasilnya benar");
                            int score_1 = 0;
                            score = score + 20;
                            score_1 = score_1 + 20;
                            System.out.println("--------------");
                            System.out.println("+" +score_1 + " score");
                            
                        }

                        else
                        {
                            System.out.println("Salah");
                            int score_1 = 0;
                            score = score + 20;
                            score_1 = score_1 + 20;
                            System.out.println("--------------");
                            System.out.println(+score + " score");
                        }

                        try {
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }

                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("--------------");
                        System.out.println("What do you want to do now ?");
                        System.out.println("1. Continue this level");
                        System.out.println("2. Continue to the next level");
                        System.out.println("3. Exit");

                        int choice3 = ask.nextInt();

                        if (choice3 == 1)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }

                        else if (choice3 == 2)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();

                            while (true)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Score = "+score);
                        System.out.println("--------------");

                        int rand_6 = (int)(Math.random() * 101);
                        int rand_7 = (int)(Math.random() * 101);
                        int rand_8 = (int)(Math.random() * 101);

                        System.out.println(rand_6);
                        System.out.println(rand_7);
                        System.out.println(rand_8);

                        // Pertanyaan

                        System.out.println("--------------");
                        System.out.print(rand_6 + "+" + rand_7 + "x" + rand_8 + "=");

                        int hasil3 = ask.nextInt();

                        int total3 = rand_6 + rand_7 * rand_8;

                        if (hasil3 == total3)
                        {
                            System.out.println("Hasilnya benar");
                            int score_1 = 0;
                            score_1 = score_1 + 30;
                            score = score + 30;
                            System.out.println("--------------");
                            System.out.println("+" +score + " score");
                            
                        }

                        else
                        {
                            System.out.println("Salah");
                            int score_1 = 0;
                            score_1 = score_1 + 30;
                            score = score - 30;
                            System.out.println("--------------");
                            System.out.println(+score + " score");
                        }

                        try {
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }

                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("--------------");
                        System.out.println("What do you want to do now ?");
                        System.out.println("1. Continue this level");
                        System.out.println("2. Exit");

                        int choice4 = ask.nextInt();

                        if (choice4 == 1)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }

                        else
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("Your final score = " +score);
                            System.exit(0);
                        }
                        }
                    }
                }
            }
                    

                else if (choice2 == 2)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    while (true)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Score = "+score);
                        System.out.println("--------------");

                        int rand_4 = (int)(Math.random() * 101);
                        int rand_5 = (int)(Math.random() * 101);
                        int rand_6 = (int)(Math.random() * 101);

                        System.out.println(rand_4);
                        System.out.println(rand_5);
                        System.out.println(rand_6);

                        // Pertanyaan

                        System.out.println("--------------");
                        System.out.print(rand_4 + "+" + rand_5 + "x" + rand_6 + "=");

                        int hasil2 = ask.nextInt();

                        int total2 = rand_4 + rand_5 * rand_6;

                        if (hasil2 == total2)
                        {
                            System.out.println("Hasilnya benar");
                            int score_1 = 0;
                            score_1 = score_1 + 30;
                            score = score + 30;
                            System.out.println("--------------");
                            System.out.println("+" +score + " score");
                            
                        }

                        else
                        {
                            System.out.println("Salah");
                            int score_1 = 0;
                            score_1 = score_1 + 30;
                            score = score - 30;
                            System.out.println("--------------");
                            System.out.println(+score + " score");
                        }

                        try {
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }

                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("--------------");
                        System.out.println("What do you want to do now ?");
                        System.out.println("1. Continue this level");
                        System.out.println("2. Exit");

                        int choice3 = ask.nextInt();

                        if (choice3 == 1)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }

                        else
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("Your final score = " +score);
                            System.exit(0);
                        }
                    }
                }

                else if (choice2 == 3)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    
                    System.out.println("Your final score = " +score);
                    System.exit(0);
                }
            }

            else if (choice1 == 3)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("Score = "+score);
                System.out.println("--------------");

                int rand = (int)(Math.random() * 101);
                int rand_2 = (int)(Math.random() * 101);
                int rand_3 = (int)(Math.random() * 101);

                System.out.println(rand);
                System.out.println(rand_2);
                System.out.println(rand_3);

                // Pertanyaan

                System.out.println("--------------");
                System.out.print(rand + "+" + rand_2 + "x" + rand_3 + "=");

                int hasil = ask.nextInt();

                int total = rand + rand_2 * rand_3;

                if (hasil == total)
                {
                    System.out.println("Hasilnya benar");
                    score = score + 30;
                    System.out.println("--------------");
                    System.out.println("+" +score + " score");
                    
                }

                else
                {
                    System.out.println("Salah");
                    score = score - 30;
                    System.out.println("--------------");
                    System.out.println(+score + " score");
                }

                try {
                Thread.sleep(5000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("--------------");
                System.out.println("What do you want to do now ?");
                System.out.println("1. Continue this level");
                System.out.println("2. Continue to the next level");
                System.out.println("3. Exit");

                int choice2 = ask.nextInt();

                if (choice2 == 1)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    while (true)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Score = "+score);
                        System.out.println("--------------");

                        int rand_4 = (int)(Math.random() * 101);
                        int rand_5 = (int)(Math.random() * 101);
                        int rand_6 = (int)(Math.random() * 101);

                        System.out.println(rand_4);
                        System.out.println(rand_5);
                        System.out.println(rand_6);

                        // Pertanyaan

                        System.out.println("--------------");
                        System.out.print(rand_4 + "+" + rand_5 + "x" + rand_6 + "=");

                        int hasil2 = ask.nextInt();

                        int total2 = rand_4 + rand_5 * rand_6;

                        if (hasil2 == total2)
                        {
                            System.out.println("Hasilnya benar");
                            int score_1 = 0;
                            score_1 = score_1 + 30;
                            score = score + 30;
                            System.out.println("--------------");
                            System.out.println("+" +score + " score");
                            
                        }

                        else
                        {
                            System.out.println("Salah");
                            int score_1 = 0;
                            score_1 = score_1 + 30;
                            score = score - 30;
                            System.out.println("--------------");
                            System.out.println(+score + " score");
                        }

                        try {
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }

                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("--------------");
                        System.out.println("What do you want to do now ?");
                        System.out.println("1. Continue this level");
                        System.out.println("2. Exit");

                        int choice3 = ask.nextInt();

                        if (choice3 == 1)
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();
                            continue;
                        }

                        else 
                        {
                            System.out.print ("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("Your final score = " +score);
                            System.exit(0);
                        }
                    }
                    
                }

                else if (choice2 == 2)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    
                    System.out.println("Your final score = " +score);
                    System.exit(0);
                }
            }
        }

    }
}
