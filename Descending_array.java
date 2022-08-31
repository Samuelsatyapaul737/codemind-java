import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                c+=1;
            }
        }
        if(c==(n-1))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}