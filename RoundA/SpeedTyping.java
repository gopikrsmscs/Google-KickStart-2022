import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  public class Solution{
    public static void main(String[] args){
      Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
       Integer t = sc.nextInt();
       for(int i=1;i<=t;i++){
           String I = sc.next();
           String P = sc.next();
           if(I.length()==P.length()){
               if(I.equals(P)){
                   System.out.println("Case #"+i+": "+0);
               }else{
                  System.out.println("Case #"+i+": "+"IMPOSSIBLE"); 
               }
           }else if(I.length()>P.length()){
               System.out.println("Case #"+i+": "+"IMPOSSIBLE"); 
           }else{
              int a=0,b=0;
              int diff = P.length()-I.length();
              int cnt=0;
              int flag=0;
              while(a<I.length() && b<P.length()){
                  if(I.charAt(a) == P.charAt(b)){
                      a++;
                      b++;
                  }else{
                      cnt++;
                      b++;
                      if(cnt>diff){
                          System.out.println("Case #"+i+": "+"IMPOSSIBLE"); 
                          flag =1;
                          break;
                      }
                  }
              }
              if(flag==0){
                System.out.println("Case #"+i+": "+diff);
              }
              
           }
            
       }
    }
  }