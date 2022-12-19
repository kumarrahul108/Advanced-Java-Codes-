
// String Builder In Java 


public class P4_String_Builder   
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Tonny");
        System.out.println("\n" + sb); 

        System.out.println(sb.charAt(2));
        sb.setCharAt(1, 'R');
        System.out.println(sb);
        sb.insert(2,'n');
        sb.delete(2, 3);
        sb.insert(2, 'r');  
        System.out.println("Final Value of String : " + sb); 
        sb.append('e');
        sb.append('r');
        sb.append('t');
        sb.append('a');
        System.out.println("New Value after Appending :  " + sb);

        System.out.println("\nReversing a String Using String Buildr Functions :  \n");  
        StringBuilder sb1 = new StringBuilder("Tanisha");
        System.out.println("\nMain String :   " + sb1);

        int ln = sb1.length();

        for(int i=0;i<ln/2;i++)
        {
            int f_idx = i;
            int b_idx = ln-i-1;

            char f_char = sb1.charAt(f_idx);
            char b_char = sb1.charAt(b_idx);   

            // setting characters 
            sb1.setCharAt(f_idx, b_char);
            sb1.setCharAt(b_idx, f_char);
        }

        System.out.println("Reverse String :  " + sb1);

        
    }    
}
