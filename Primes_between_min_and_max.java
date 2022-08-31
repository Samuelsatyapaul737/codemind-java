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
        int min=a[0],max=a[0],mini=0,maxi=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
                mini=i;
            }
            if(max<a[i])
            {
                max=a[i];
                maxi=i;
            }
        }
        c=0;
        if(mini<maxi)
        {
            for(int i=mini;i<=maxi;i++)
            {
                if(S.prime(a[i]))
                {
                    c+=1;
                }
            }
        }
        else
        {
            for(int i=maxi;i<=mini;i++)
            {
                if(S.prime(a[i]))
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}