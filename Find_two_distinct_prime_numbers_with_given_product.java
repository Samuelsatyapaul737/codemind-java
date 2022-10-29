import java.util.*;
class Solution
{
     static boolean prime(int n)
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
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
       
       int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i*j==n)
                {
                    if(prime(i))
                    {
                        System.out.format("%d ",i);
                        c++;
                    }
                }
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
    }
}