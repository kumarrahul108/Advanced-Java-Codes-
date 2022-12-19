
// Basics Pattern Using Java 


public class P1_Pattern_1
{
    public static void p1()
    {
        // Row
        for(int i=1;i<=4;i++)
        {
            // Column
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p2()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1 || j==1 || i==4 || j==5 )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p3()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p4()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p5()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p6()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void p7()
    {
      for(int i=5;i>=1;i--)
      {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j); 
        }
        System.out.println();
      }
    }

    public static void p8()
    {
        int numb = 1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(numb);
                numb++;
            }
            System.out.println();
        }
    }

    public static void p9()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print("1");
                }    
                else 
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("\nPattern 1 :  \n");
        p1();

        System.out.println("\nPattern 2 :  \n");
        p2();

        System.out.println("\nPattern 3 :  \n");
        p3();

        System.out.println("\nPattern 4 :  \n");
        p4();

        System.out.println("\nPattern 5 :  \n");
        p5();

        System.out.println("\nPattern 6:  \n");
        p6();

        System.out.println("\nPattern 7 :  \n");
        p7();

        System.out.println("\nPattern 8 :  \n");
        p8();

        System.out.println("\nPattern 9 :  \n");
        p9();
    }
}