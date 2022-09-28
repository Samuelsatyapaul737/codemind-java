import java.util.Scanner;
class revpal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,rev,i,t,j;
        n=sc.nextInt();
        i=n+1;
        while(1==1)
        {
            t=0;
            if(i==1 || i==0)
            {
                t=1;
            }
            else
            {
                for(j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        t=1;
                        break;
                    }
                }
            }
            if(t==0)
            {
                rev=0;
                temp=i;
                while(temp!=0)
                {
                    rev=rev*10+temp%10;
                    temp/=10;
                }
            
                if(i==rev)
                {
                    System.out.print(i);
                    break;
                }
            }
            i++;
        }
    }
}