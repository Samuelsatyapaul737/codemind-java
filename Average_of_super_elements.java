import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        double avg,s=0,f=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==a[i])
            {
                s=s+a[i];
                f++;
                a[i]=0;
            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
        else
        {
        avg=s/f;
        System.out.format("%.2f",avg);
        }
            
        }
}