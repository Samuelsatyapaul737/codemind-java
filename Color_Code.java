import java.util.Scanner;
class color
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch,ch1;
        ch=sc.nextLine().charAt(0);
        ch1=Character.toLowerCase(ch);
        if(ch1=='v')
        {
            System.out.print("Violet");
        }
        else if(ch1=='i')
        {
            System.out.print("Indigo");
        }
        else if(ch1=='b')
        {
            System.out.print("Blue");
        }
        else if(ch1=='g')
        {
            System.out.print("Green");
        }
        else if(ch1=='y')
        {
            System.out.print("Yellow");
        }
        else if(ch1=='o')
        {
            System.out.print("Orange");
        }
        else if(ch1=='r')
        {
            System.out.print("Red");
        }
        else
        {
            System.out.print("-1");
        }
    }
}