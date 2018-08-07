import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sahil
 */
public class MaxDiffArray {
    
    public static void main(String[] args) throws IOException {
        
        int n;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of Array");
        
        n=Integer.parseInt(br.readLine());
        
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        int diff=0;
        for(int i=0;i<a.length-1;i++)
        {
            if((a[i+1]-a[i])>diff)
            {
                diff=a[i+1]-a[i];
            }
        }
         System.out.println("Max Consecutive difference= "+diff);
        
         int maxd=a[1]-a[0];int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if((a[i]-min)>maxd)
            {
                maxd=a[i]-min;
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        
        
        
        System.out.println("Max  difference= "+maxd);
        
        
        
    }
    
}
