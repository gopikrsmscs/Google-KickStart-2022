import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  public class Solution{
    public static void main(String[] args){
      Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
       Integer t = sc.nextInt();
       for(int i=1;i<=t;i++){
           String n = sc.next();
           Long sum=0L;
           for(int j=0;j<n.length();j++){
               sum+=(n.charAt(j)-'0');
           }
           if(sum%9 == 0){
               if(n.length()==1){
                  System.out.println("Case #"+i+": "+n+"0");
               }else{
                   String newnumber = n.substring(0,1)+"0"+n.substring(1);
               
                    System.out.println("Case #"+i+": "+newnumber); 
               }
               
               
           }else{
               for(int k=1;k<=9;k++){
                    if(((Long)(sum+k))%9==0){
                        String result = "";
	                    int ii = 0;
                        	while ((ii < n.length()) && (k >= ((int)n.charAt(ii) - (int)'0'))) {
                                result+= (n.charAt(ii));
		                        ++ii;
	                        }
                            result += ((char)(k + (int)'0'));
                            while (ii < n.length()) {

                                // Add current digit to result
                                result+= (n.charAt(ii));
                                ++ii;
                            }
                            System.out.println("Case #"+i+": "+result);
                            break; 
                    }
                }
           }
           
       }
    }
  }