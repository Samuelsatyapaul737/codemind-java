import java.util.Scanner;
class megaprime
{
    public static int is_prime(int n)
    {
        int i;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
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
        int n,temp,r,t=0;
        n=sc.nextInt();
        if(is_prime(n)==1)
        {
            temp=n;
            while(temp!=0)
            {
                r=temp%10;
                temp/=10;
                if(is_prime(r)==0)
                {
                    t=1;
                    break;
                }
            }
            if(t==0)
            {
                System.out.print("Mega Prime");
            }
            else
            {
                System.out.print("Not Mega Prime");
            }
        }
        else
        {
            System.out.print("Not Mega Prime");
        }
    }
}