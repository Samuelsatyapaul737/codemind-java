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
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            {
                System.out.format("%d ",a[i]);
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                System.out.format("%d ",a[i]);
            }
            System.out.println('0');
        }
    }
}