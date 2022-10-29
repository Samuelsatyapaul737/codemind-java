import java.util.Scanner;
class valid
{
    public static int is_prime(int n)
    {
        int i;
        if(n==0 || n==1)
        {
            return 0;
        }
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,t=0;
        n=sc.nextInt();
        if(n==1)
        {
            System.out.println("Ugly Number");
        }
        else if(n>0)
        {
            for(i=2;i<=n;i++)
            {
                if(n%i==0 && is_prime(i)==1)
                {
                    if(i!=2 && i!=3 && i!=4)
                    {
                        t=1;
                        System.out.print("Not Ugly Number");
                        break;
                    }
                }
            }
            if(t==0)
            {
                System.out.print("Ugly Number");
            }
        }
        else
        {
            System.out.print("Not Ugly Number");
        }
    }
}