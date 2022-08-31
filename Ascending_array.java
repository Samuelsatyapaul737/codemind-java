import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int  c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                c+=1;
            }
        }
        if(c==(n-1))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}