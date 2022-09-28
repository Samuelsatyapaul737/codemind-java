import java.util.Scanner;
class grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hurl,spin,speed,grade;
        hurl=sc.nextInt();
        spin=sc.nextInt();
        speed=sc.nextInt();
        if(hurl>50 && spin>60 && speed>100)
        {
            grade=10;
        }
        else if(hurl>50 && spin>60)
        {
            grade=9;
        }
        else if(spin>60 && speed>100)
        {
            grade=8;
        }
        else if(hurl>50 && speed>100)
        {
            grade=7;
        }
        else if(hurl>50 || spin>60 || speed>100)
        {
            grade=6;
        }
        else
        {
            grade=5;
        }
        System.out.println(grade);
    }
}