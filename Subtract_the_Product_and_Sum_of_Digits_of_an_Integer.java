import java.util.Scanner;
class revpal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,temp,s=0,p=1;
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            r=temp%10;
            temp/=10;
            s+=r;
            p*=r;
        }
        System.out.print(p-s);
    }
}