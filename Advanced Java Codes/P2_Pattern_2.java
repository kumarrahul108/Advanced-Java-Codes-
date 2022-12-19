
// Advanced Pattern Using Java 


public class P2_Pattern_2 
{

    public static void p1()
    {
        // Upper Half  --> Row 
        for(int i=1;i<=5;i++)
        {
            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            // spaces
            for(int k=1;k<=(2*(5-i));k++) 
            {
                System.out.print(" ");
            }
            
            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(); 
        }

        // Lower Half  --> Row 
        for(int i=5;i>=1;i--) 
        {
            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            // spaces
            for(int k=1;k<=(2*(5-i));k++) 
            {
                System.out.print(" ");
            }
            
            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(); 
        }
    } 


    public static void p2()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p3()
    {
        for(int i=1;i<=5;i++)
        {
            // spaces 
            for(int j=1;j<=(5-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void p4()
    {
        // Row 
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }  

            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void p5()
    {
        // Upper Half --> Row 
        for(int i=1;i<=5;i++)
        {
            // spaces 
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            } 

            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }  

        // Lower Half --> Row 
        for(int i=5;i>=1;i--)
        {
            // spaces 
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            } 

            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
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

        System.out.println("\nPattern 3 :  ");
        p3();

        System.out.println("\nPattern 4 :  ");
        p4();

        System.out.println("\nPattern 5 : ");
        p5();
    } 
}   

