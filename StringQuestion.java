import java.util.Scanner;

/**
 *
 * @author Sahil
 */
public class StringQuestion {
    
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter here your string");

        String a;

        a = input.nextLine();
    
        char ch;
        //int b[257]={0,0};
        int b[]= new int[257];
        
        for(int i=0;i<257;i++)
        {
            b[i]=0;
        }

        for (int i = 0;i < a.length(); i++ ) {
         
            ch=a.charAt(i);
            b[ch]++;  
        }
        
        for (int i = 0;i < a.length(); i++ )
        {
            if(b[a.charAt(i)]>0)
            {
                System.out.print(a.charAt(i));
                System.out.print(b[a.charAt(i)]);
                b[a.charAt(i)]=0;
            }
            
        }
        
        
        
    }
    
    
}