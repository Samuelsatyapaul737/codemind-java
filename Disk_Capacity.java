import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(2*512*t*s*b);
    }
}