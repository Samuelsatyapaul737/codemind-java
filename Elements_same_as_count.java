import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int[] a=new int[n];
        int[] b=new int[100];
        int max=0,min=9999,f=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
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
                System.out.format("%d ",a[i]);
                a[i]=0;
                f++;
            }
        }
        if(f==0)
        {
            System.out.println("-1");
        }
      
    }
}