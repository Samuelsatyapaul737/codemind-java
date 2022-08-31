import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int temp=a[i];
            int rev=0;
            while(temp>0)
            {
                rev=rev*10+temp%10;
                temp=temp/10;
            }
            if(rev==a[i])
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}
