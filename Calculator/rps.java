import java.util.scanner;
class rps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int choice=sc.nextInt();
        int comp=(int)(Math.random()*3)+1;
        if(choice==1)
        {
            if(comp==1)
            {
                System.out.println("Draw");
            }
            else if(comp==2)
            {
                System.out.println("Computer wins");
            }
            else
            {
                System.out.println("You win");
            }
        }
        else if(choice==2)
        {
            if(comp==1)
            {
                System.out.println("You win");
            }
            else if(comp==2)
            {
                System.out.println("Draw");
            }
            else
            {
                System.out.println("Computer wins");
            }
        }
        else
        {
            if(comp==1)
            {
                System.out.println("Computer wins");
            }
            else if(comp==2)
            {
                System.out.println("You win");
            }
            else
            {
                System.out.println("Draw");
            }
        }
    }
}