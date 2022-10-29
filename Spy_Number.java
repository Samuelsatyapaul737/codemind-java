import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,temp,s=0,f,p=1;
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            r=temp%10;
            temp/=10;
            p*=r;
            s+=r;
        }
        if(s==p)
        {
            System.out.print("Spy Number");
        }
        else
        {
           System.out.print("Not Spy Number");
        }
    }
}