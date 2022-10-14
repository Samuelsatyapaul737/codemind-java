
import java.util.*;
class Solution
{
    static int fun(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        return fun(n-1)+fun(n-2)+fun(n-3);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution s=new Solution();
        System.out.println(fun(n));
        
    }
}
