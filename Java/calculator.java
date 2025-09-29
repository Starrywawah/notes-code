//input
//conditional
//output


import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.print ("\033[H\033[2J");
            System.out.flush();
            
            Scanner ask = new Scanner(System.in);

            System.out.println("Welcome to Calculator");

            System.out.print("First number : ");

            Double angka1 = ask.nextDouble();

            System.out.print("Second number : ");

            Double angka2 = ask.nextDouble();

            System.out.print ("\033[H\033[2J");
            System.out.flush();

            //Tampilkan menu
            //Addition
            //Substraction
            //Multiply
            //Division

            System.out.print ("\033[H\033[2J");
            System.out.flush();

            System.out.println("What do you want to do ?");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            Integer operation = ask.nextInt();

            if (operation == 1)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("Calculating......");

                try {
                Thread.sleep(5000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                System.out.println("Total = " +(angka1 + angka2));

                System.out.println("");

                System.out.println("Do you want to continue ?");
                System.out.println("1. Yes");
                System.out.println("2. No");

                Integer choice = ask.nextInt();

                if (choice == 1)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Loading.....");

                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    continue;
                }

                else
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Thankyou for using my app");
                    break;
                }

            }

            else if (operation == 2)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("Calculating......");

                try {
                Thread.sleep(5000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }


                System.out.println("Total = " +(angka1 - angka2));

                System.out.println("");

                System.out.println("Do you want to continue ?");
                System.out.println("1. Yes");
                System.out.println("2. No");

                Integer choice = ask.nextInt();

                if (choice == 1)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Loading.....");

                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    continue;
                    
                }

                else
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Thankyou for using my app");
                    break;
                }
            }

            else if (operation == 3)
            {
                System.out.print ("\033[H\033[2J");
                System.out.flush();

                System.out.println("Calculating......");

                try {
                Thread.sleep(5000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                System.out.println("Total = " +(angka1 * angka2));

                System.out.println("");

                System.out.println("Do you want to continue ?");
                System.out.println("1. Yes");
                System.out.println("2. No");

                Integer choice = ask.nextInt();

                if (choice == 1)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Loading.....");

                    try {
                    Thread.sleep(3000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                    }

                    continue;
                    
                }

                else
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Thankyou for using my app");
                    break;
                }
            }

            else if (operation == 4)
            {
                if (angka2 == 0)
                {
                    System.out.print ("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Calculating......");

                    try {
                    Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                    }


                    System.out.println("Error");

                    System.out.println("");

                    System.out.println("Do you want to continue ?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");

                    Integer choice = ask.nextInt();

                    if (choice == 1)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Loading.....");

                        try {
                        Thread.sleep(5000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }
                        
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        continue;
                    }

                    else
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Thankyou for using my app");
                        break;
                    }
                }

                else
                {
                    System.out.println("Calculating......");

                    try {
                    Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                    }

                    System.out.println("Total = " +(angka1 / angka2));

                    System.out.println("");

                    System.out.println("Do you want to continue ?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");

                    Integer choice = ask.nextInt();

                    if (choice == 1)
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Loading.....");

                        try {
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }
                        

                        continue;
                    }

                    else
                    {
                        System.out.print ("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Thankyou for using my app");
                        break;
                    }
                }
            }
        }
    }
}