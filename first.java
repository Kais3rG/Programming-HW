import java.util.*;
public class first{
    public static void main(String[]args){

        Scanner hama = new Scanner(System.in);
        Scanner hama1 = new Scanner(System.in);
        System.out.print("number of letters in your name: ");
        int lnum = hama.nextInt();
        
        char [] pit = new char [lnum];
        
        for ( int x = 0; x<lnum ; x++) 
        {
        
        System.out.print("What are the letters in your name: ");
        char name = hama1.next().charAt(0);
        pit [x] = name;
        
        }

        for(int a =0; a<lnum; a++)
        {
            System.out.print(pit[a]);
        }
    }
}