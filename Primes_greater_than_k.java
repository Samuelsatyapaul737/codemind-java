import java.util.*;
class Solution 
{
    boolean prime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int s=0,c=0;
        Solution S=new Solution();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(S.prime(a[i]))
            {
                if(a[i]>=k)
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}