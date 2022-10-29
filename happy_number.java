import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        int sum=0,i;
        while(sum!=1 && sum!=4)
        {
            sum=0;
            while(n>0)
            {
                i=n%10;
                sum+=(i*i);
                n=n/10;
            }
            n=sum;
        }
        if(sum==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}