import java.util.*;
public class Calsi12
{
    public static void main(String args[])
    {
        int flag=0,ch;
        double num1,num2;
        
        System.out.println("Calculator System");
        do
        {
            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            
            if(ch==5)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                case 1:
                System.out.println("Addition");
                
                System.out.println(24+30);
                break;
                case 2:
                System.out.println("Subtraction");
                
                System.out.println(24-12);
                break;
                case 3:
                System.out.println("Multiplication");
                
                System.out.println(12*14);
                break;
                case 4:
                System.out.println("Division");
                
                System.out.println(24/12);
                break;
				case 5:
                System.out.println("percentge");
                
                System.out.println((24/12)*100);
                break;
                default: System.out.println("Exiting program due to invalid input");
                flag=1;
                }
            }
            System.out.println("\n");
            }while(flag==0);
    }
}