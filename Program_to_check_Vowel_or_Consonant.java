import java.util.Scanner;
class character
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch,ch1;
        ch1=sc.nextLine().charAt(0);
        ch=Character.toLowerCase(ch1);
        if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}