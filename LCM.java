import java.util.Scanner;
class lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,x,y,i;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        {
            x=a;
            y=b;
        }
        else
        {
            x=b;
            y=a;
        }
        i=y;
        while(i<=x*y)
        {
            if(i%x==0)
            {
                System.out.print(i);
                break;
            }
            i+=y;
        }
    }
}