
// Basics To Advanced Recurssion in Java 


import java.util.*;

public class P6_Recursion
{

    // Basics Recurssion : 

    public static void numb(int n)
    {
        // Base Condition 
        if(n == 0)
        {
            return;
        }

        System.out.print(n + "  ");

        numb(n-1);
    }

    public static void sum(int i,int n,int s)
    {
        // Base 
        if(i == n+1) 
        {
            System.out.print("   Sum :  " + s);    
            return;
        }

        System.out.print(i + "  ");
        s = s + i;
        

        sum(i+1, n,s);

    }


    public static int fact(int n)
    {
        // Base 
        if(n ==1 || n==0)
        {
            return 1;
        }

        int f1 = fact(n-1);
        int f = n * f1;

        return f;
    }

    public static void febbo(int a,int b,int n)
    {
        // Base 
        if(n == 0)
        {
            return;
        }

        int c = a + b;
        System.out.print(c + "  "); 
        a = b;
        b = c;

        febbo(a, b, n-1); 
    }

    public static int xpow(int x,int n)  // Tn --> O(n)
    {
        // Base 
        if(n ==0)
        {
            return 1;
        }

        if(x==0)
        {
            return 0;
        }

        int pow1 = xpow(x, n-1);
        int pow = x * pow1;

        return pow;
    }

    public static int pow(int x,int n)  // Tn -> O(log h)
    {
        // Base 
        if(x==0)
        {
            return 0;
        }

        if(n == 0)
        {
            return 1;
        }

        // even 
        if(n%2 == 0)
        {
           return pow(x, n/2) * pow(x, n/2);
        }

        // odd
        else 
        {
           return pow(x, n/2) * pow(x, n/2) * x; 
        }
    }


    // Advanced Recurssion : 
    public static void towerHanoi(int n,String S,String H,String D)
    {
        // Base 
        if(n == 1)
        {
            System.out.println("Transferred Disc from Sorce " + S + " to Destination  " + D);
            return;
        }

        towerHanoi(n-1, S, D, H);
        System.out.println("Transferred Disc  " + n + "  from Source " + S + " to Helper Using Destination " + H);

        towerHanoi(n-1, H, S, D);
        System.out.println("Transferred Disc  "  + n + "  from Helper to Destination Using Souce  " + D);
    }


    public static void reverseString(int idx,String n)
    {
        // Base
        if(idx == 0)
        {
            System.out.print(n.charAt(idx));
            return;
        }

        System.out.print(n.charAt(idx));
        reverseString(idx-1, n);
    }

    public static int first = -1;
    public static int last = -1;

    public static void occurance(int idx,String n,char c)
    {
        // Base
        if(idx == n.length())
        {
            System.out.println("1st Ocuurance at index : " + first);
            System.out.println("Last Ocuurance at index : " + last);
            return;
        }

        char curr = n.charAt(idx);
        if(curr == c)
        {
            if(first == -1)
            {
                first = idx;
            }
            else 
            {
                last = idx;
            }
        }

        occurance(idx+1, n, c);
    }



    public static boolean isSorted(int idx,int a[])
    {
        // Base 
        if(idx == a.length-1)
        {
            return true;
        }

        if(a[idx] < a[idx+1]) 
        {
            isSorted(idx+1, a);
        }
        else 
        {
            return false;
        }

        return false;

    }


    public static void shiftToLast(int idx,String s,char key,String nst,int count)
    {  
        // Base Condition 
        if(idx == s.length())  
        {
            for(int i=0;i<count;i++)
            {
                nst += key; 
            }

            System.out.print(nst);
            return;
        }

        char curr = s.charAt(idx);
        if(curr == key)
        {
            count++;
            shiftToLast(idx+1, s, key, nst,count);
        }  
        else 
        {
            nst = nst + curr;   
            shiftToLast(idx+1, s, key, nst,count);
        }
    }


    public static boolean map[] = new boolean[26]; 

    public static void removeDup(String s,String nst,int idx)
    {
        // Base 
        if(idx == s.length())
        {
            System.out.print(nst);
            return;
        }

        char curr = s.charAt(idx);
        if(map[curr - 'a'] == true)
        {
            removeDup(s, nst, idx+1);
        }
        else 
        {
            nst += curr;
            map[curr - 'a'] = true;
            removeDup(s, nst, idx+1);
        }

    }


    public static void subsequence(int idx,String s,String nst)
    {
        // Base 
        if(idx == s.length())
        {
            System.out.println(nst); 
            return ;
        }

        char curr = s.charAt(idx);  

        // to be included
        subsequence(idx+1, s, nst + curr);

        // not o be included
        subsequence(idx+1, s, nst); 

    }


    public static void uniqueSubse(int idx,String s,String nst,HashSet<String> set)  
    {
        // Base 
        if(idx == s.length())
        {
            if(set.contains(nst))
            {
                return;
            }
            else 
            {
                System.out.println(nst); 
                set.add(nst);
                return;
            }
        }


        char curr = s.charAt(idx);

        // to be included
        uniqueSubse(idx+1, s, nst + curr,set);

        // not o be included
        uniqueSubse(idx+1, s, nst,set); 

    }


    public static String pad[]= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void keypad(int idx,String s,String nst)
    {
        // Base     
        if(idx == s.length())
        {
            System.out.println(nst);
            return;
        }

        char curr = s.charAt(idx);

        String map = pad[curr - '0'];

        for(int i=0;i<map.length();i++)
        {
            keypad(idx+1, s, nst + map.charAt(i));
        }

    }


    public static void permutation(String s,String nst)
    {
        // Base 
        if(s.length() == 0)
        {
            System.out.println(nst);
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            String str = s.substring(0, i) + s.substring(i+1);

            permutation(str, nst + curr); 
        }

    }


    public static int countPath(int i,int j,int row,int col)
    {
        // Base 
        if(i == row || j == col)  
        {
            return 0;
        }

        if(i == row-1 || j == col-1)   
        {   
            return 1;     
        }

        // move right
        int right = countPath(i, j+1, row, col);

        // move down
        int down = countPath(i+1, j, row, col); 

        return (right + down);

    }
    
    
    public static int tilePlace(int l,int b)
    {
        // Base
        if(l == b)
        {
            return 2;
        }

        if(l < b)  
        {
            return 1;
        }

        // vertical
        int v = tilePlace(l-b, b);

        // horizontal 
        int h = tilePlace(l-1, b);

        return (v + h);

    } 


    public static int callGuest(int n)
    {
        // Base
        if(n <= 1)
        {
            return 1;
        }

        // single
        int way1 = callGuest(n-1);

        // pair 
        int way2 = (n-1) * callGuest(n-2);

        return (way1 + way2);

    }


    public static void printSubset(ArrayList<Integer> set)
    {
        for(int i=0;i<set.size();i++)
        {
            System.out.print(set.get(i) + "  ");
        }
        System.out.println();
    }

    public static void subSet(int n,ArrayList<Integer> set)
    {
        // Base  
        if(n == 0)
        {
            printSubset(set);
            return;
        }

        // add hoga
        set.add(n);
        subSet(n-1, set);

        // add nahi hoga
        set.remove(set.size()-1);
        subSet(n-1, set);

    }


    public static void permutt(String s,String nst,int idx)
    {
        // Base 
        if(s.length() == 0)
        {
            System.out.println(nst);
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            String str = s.substring(0, i) + s.substring(i+1);

            permutt(str, nst + curr, idx+1); 
        }
    }


    
    public static void main(String[] args) 
    {
        System.out.println("Basics Recurssion :   \n\n");
        System.out.print("\nRecurssion 1  :     ");
        numb(5);

        System.out.print("\n\nRecurssion 2  :     ");
        sum(1, 10, 0);

        System.out.print("\n\nRecursion  3 :    ");
        System.out.print(fact(5));

        System.out.print("\n\nRecursion 4  : ");
        int a = 0;
        int  b = 1;
        System.out.print(a + "  " + b + "   ");
        int n = 7;
        febbo(a,b,n-2);   

        System.out.print("\n\nRecursion 5  :   " + xpow(2, 5));

        System.out.print("\n\nRecursion 6  :  " + pow(2, 5));

        System.out.print("\n\nAdvanced Recurssion :   \n\n");

        System.out.print("\n\nRecursion 7  :  ");  
        towerHanoi(3, "A", "B", "C");

        System.out.print("\n\nRecursion 8  :  "); 
        String str = "tanisha";
        int ln = str.length();
        reverseString(ln-1, str);

        System.out.print("\n\nRecursion 9 :  \n");
        occurance(0, str, 'a');

        System.out.print("\nRecurssion 10  :   ");
        int arr[] = {3,6,8,11,34,78,66};
        if(isSorted(0,arr))
        {
            System.out.print("\nIt is Stricly Increasing ! ");
        }
        else 
        {
            System.out.print("\nIt is Stricly not Increasing ! ");
        }

        
        System.out.print("\n\nRecursion 11 :   ");
        shiftToLast(0, "abxbdrxxytexxgf", 'x', "",0); 
        
        
        System.out.print("\n\nRecursion 12  :  ");
        removeDup("aabcddbatuej", "", 0); 


        System.out.print("\n\nRecursion 13  :  Subsequences \n");
        subsequence(0, "abc", "");

        HashSet<String> set = new HashSet<>();
        System.out.print("\n\nRecursion 14  : Unique Subsequences \n");
        uniqueSubse(0, "aaa", "", set);


        System.out.print("\n\nRecursion 15  :  Keypad  \n");
        keypad(0, "23", "");


        System.out.print("\n\nRecursion 16 :  Permutation   \n");
        permutation("abc", "");   

        System.out.print("\n\nRecursion 17 :  Total no of Path Possible  :  ");
        System.out.println(countPath(0, 0, 3, 4));  

        System.out.print("\n\nRecursion 18 :   No of ways in which tile can be Placed   :    ");
        System.out.print(tilePlace(4, 3));

        System.out.print("\n\nRecursion  19 :  No of ways to invite Guest :  " + callGuest(5));

        System.out.print("\n\nRecursion 20  : Subset    \n");
        ArrayList<Integer> set1 = new ArrayList<>();
        subSet(3, set1); 


        System.out.print("\n\nRecursion 21 :  BackTracking -->  Permutation :  \n");
        permutt("ABC", "", 0);  

    
    }    
}
