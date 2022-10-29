import java.util.Scanner;
class megaprime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,t=0;
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                System.out.print("YES");
                t=1;
                break;
            }
        }
        if(t==0)
        {
            System.out.print("NO");
        }
    }
}