import java.util.Scanner;
class kth
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,j,c,t=0,min=0,max=0,k;
        float avg;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i>j)
                {
                    break;
                }
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==k)
            {
                System.out.print(arr[i]+" ");
                t++;
            }
        }
        if(t==0)
        {
            System.out.println("-1");
        }
    }
}