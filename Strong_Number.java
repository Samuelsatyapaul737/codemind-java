import java.util.Scanner;
class factorial
{
    static int fact(int m)
    {
        if(m==0)
        {
            return 1;
        }
        if(m==1)
        {
            return 1;
        }
        return m*fact(m-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,temp,s=0,f;
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            r=temp%10;
            temp/=10;
            f=fact(r);
            s+=f;
        }
        if(s==n)
        {
            System.out.print("The number "+n+" is a strong number");
        }
        else
        {
           System.out.print("The number "+n+" is not a strong number");
        }
    }
}