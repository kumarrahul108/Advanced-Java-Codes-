

// Sortings in Java 


public class P5_Sortings 
{
    public static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + "   ");
        }
    }

    public static void bubble(int a[])
    {
        int ln = a.length;

        // No of Passes 
        for(int i=0;i<(ln-1);i++)
        {
            // No of Comparisons
            for(int j=0;j<(ln-i-1);j++)
            {
                // compare two consecutive elements of array 
                if(a[j] > a[j+1])
                {
                    // swap values at each comaprison 
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }


    public static void selection(int a[])
    {
        int ln = a.length;

        // No of Passes
        for(int i=0;i<ln-1;i++)
        {
            int min = i;

            // Comparison 
            for(int j=i+1;j<ln;j++)
            {
                if(a[min] > a[j])
                {
                    min = j;
                }
            }

            // swap the elements
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }


    public static void insertation(int a[])
    {
        int ln = a.length; 

        for(int i=1;i<ln;i++)
        {
            int curr = a[i];
            int j = (i-1);  
            
            while(j>=0 && a[j] > curr) 
            {
                a[j+1] = curr; 
                j--;
            }
            a[j+1] = curr;    
        }
    }


    public static int maximum(int a[])
    {
        int max = a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i] > max)  
            {
                max = a[i];
            }
        }

        return max;

    }


   public static void count(int a[])
   {
        int n = a.length;
        int m = maximum(a);

        int count[] = new int[m+1];

        for(int i=0;i<count.length;i++)
        {
            count[i] = 0;
        }

        for(int i=0;i<n;i++)
        {
            count[a[i]] = count[a[i]] + 1;
        }

        int i = 0;
        int j = 0; 

        while(i <= m)  
        {
            if(count[i]>0)
            {
                a[j] = i;
                count[i] = count[i] - 1;
                j++;
            }
            else 
            {
                i++;
            }
        }
   }


   public static int partition(int a[],int low ,int high)
   {
        int pivot = a[low];

        int i = low + 1;
        int j = high;
        int temp;

        do 
        {
            if(a[i] <= pivot)
            {
                i++;
            }

            if(a[j] > pivot)
            {
                j--;
            }

            if(i < j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        while(i < j);

        temp = a[low];
        a[low] = a[j];
        a[j] = temp;  

        return j;

   }

   public static void quick(int a[],int low,int high)
   {
        if(low < high)
        {
            int pidx = partition(a,low,high);

            quick(a, low, pidx);

            quick(a, pidx +1, high);

        }
   }

   public static void conquer(int a[],int si,int mid,int ei)
   {
       int merged[] = new int [ei-si+1];
       int idx1= si;
       int idx2 = mid + 1;
       int x = 0;

       while(idx1<=mid && idx2<=ei)
       {
           if(a[idx1] <= a[idx2])
           {
               merged[x++] = a[idx1++];
           }
           else 
           {
               merged[x++] = a[idx2++];
           }
       }

       while(idx1 <= mid) 
       {
           merged[x++] = a[idx1++];
       }

       while(idx2 <= ei) 
       {
           merged[x++] = a[idx2++];
       }

       for(int i =0,j=si;i<merged.length;i++,j++)
       {
           a[j] = merged[i];
       }
   }


   public static void divide(int a[],int si,int ei)
   {
       if(si >= ei)
       {
           return;
       }

       int mid = si + (ei-si)/2;
       divide(a, si, mid);
       divide(a, mid+1, ei);
       conquer(a,si,mid,ei);
   }




    public static void main(String[] args) 
    {
        int arr[] = {23,9,11,45,12,7};
        System.out.print("\nDisplay Array Elements :     ");
        display(arr);

        bubble(arr);
        System.out.print("\n\nDisplay Array Elements after Bubbler Sort :    ");
        display(arr);

        selection(arr);
        System.out.print("\n\nDisplay Array Elements after Selection Sort :  ");
        display(arr);

        insertation(arr);
        System.out.print("\n\nDisplay Array Elements after Insertation Sort :  ");
        display(arr);

        count(arr);
        System.out.print("\n\nDisplay Array Elements after Count Sort  :   ");
        display(arr);

        quick(arr, 0, arr.length-1);
        System.out.print("\n\nDisplay Array Elements after Quick Sort  :   ");
        display(arr); 


        divide(arr, 0, arr.length-1);
        System.out.print("\n\nDisplay Array Elements after Merge Sort :   ");
        display(arr);  
        



    }    
}
