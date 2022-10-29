import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,t,temp,r,c,co;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            temp=i;
            c=0;
            co=0;
            while(temp!=0)
            {
                r=temp%10;
                temp/=10;
                if(r!=0 && i%r==0)
                {
                    c++;
                }
                co++;
            }
            if(c==co)
            {
                System.out.print(i+" ");
            }
        }
    }
}