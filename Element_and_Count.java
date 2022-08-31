import java.util.Scanner;
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
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                    if(i!=j)
                    {
                        a[j]=0;
                    }
                }
            }
        if(a[i]!=0)
        {
            System.out.format("%d %d ",a[i],c);
        }
            
        }
    }
}