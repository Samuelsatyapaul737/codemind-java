import java.util.Scanner;
class Solution
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int os=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                os+=1;
            }
        }
        if(os<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }   
}