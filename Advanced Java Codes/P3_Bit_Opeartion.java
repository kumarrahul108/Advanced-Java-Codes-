
// Bit Oprations In Java


import java.util.Scanner;

public class P3_Bit_Opeartion 
{
    public static void getbit(int n,int pos)
    {
        int bitmask = n << pos;

        if((bitmask & n) == 0)
        {
            System.out.println("The number is Zero -> 0 ");
        }
        else   
        {
            System.out.println("The number is One -> 1 ");
        }
    }

    public static void setbit(int n,int pos)
    {
        int bitmask = n << pos;
        int new_No = (bitmask) | (n);

        System.out.println(new_No);
    }

    public static void clearbit(int n,int pos)
    {
        int mask = n << pos;
        int new_No = (mask & n);  


        System.out.println(new_No);
    }

    public static void updatebit(int n,int pos,int up)
    {
        int mask = n << pos; 
        if(up == 1)
        {
            int new_No = (mask | n);
            System.out.println(new_No);
        }
        else 
        {
            int new_No = (mask & n);
            System.out.println(new_No); 
        }
    }




    public static void main(String[] args) 
    {
        int n = 5;
        int pos = 2;

        getbit(n, pos);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter update bit :   ");
        int up = sc.nextInt();  

        setbit(n, pos);

        clearbit(n, pos);

        updatebit(n, pos, up); 
    }
}
