//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
       public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String str = sc.nextLine();
            Solution ob = new Solution();
            if(ob.sentencePalindrome(str))
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    } 
} 
// } Driver Code Ends


class Solution { 

    static boolean sentencePalindrome(String s) { 
        // code here
        s=s.toLowerCase();
        
        int a=0;
        int b=s.length()-1;
        
        while(a<=b)
        {
            if(!((s.charAt(a)>=90 && s.charAt(a)<=122) || (s.charAt(a)>=48 && s.charAt(a)<=57)))
            {
                a++;
                continue;
            }
            else if(!((s.charAt(b)>=90 && s.charAt(b)<=122) || (s.charAt(b)>=48 && s.charAt(b)<=57)))
            {
                b--;
                continue;
            }
            else
            {
                if(s.charAt(a)!=s.charAt(b))
                return false;
            }
            a++;
            b--;
        }
        return true;
        
    }
}