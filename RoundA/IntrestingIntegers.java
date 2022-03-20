import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  public class Solution{
    public static void main(String[] args){
      Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
       Integer t = sc.nextInt();
       for(int i=1;i<=t;i++){
           Long a = sc.nextLong();
           Long b = sc.nextLong();
          // System.out.println(a);
           //System.out.println(b);
           Long cnt=0L;
           for(Long j=a;j<=b;j++){
               if(isIntresting(j)){
                   cnt++;
               }
           }
           System.out.println("Case #"+i+": "+cnt); 
       }
    }
    
    public static boolean isIntresting(Long x){
        Long z=x;
        Long sum=0L;
        Long pr = 1L;
        while(x>0){
            Long re = x%10;
            sum+=re;
            pr=pr*re;
            //System.out.println(re);
            x=x/10;
        }
        // System.out.println(sum);
        // System.out.println(pr);
        if(pr%sum==0){
            return true;
        }
        return false;
    }
  }