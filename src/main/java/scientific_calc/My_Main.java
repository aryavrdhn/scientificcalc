package scientific_calc;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class My_Main 
{
  private static final Logger logger = LogManager.getLogger(My_Main.class);
  public My_Main() {}

  public double root(double number1) 
  {
      logger.info("[ROOT] - " + number1); 
      double return_val = Math.sqrt(number1);
      logger.info("[OUTPUT - ROOT] - " + return_val);
      return return_val;
  }

  public double factorial(int number1) 
  {
      logger.info("[FACTORIAL] - " + number1);  

      if(number1<0)
        return Double.NaN;
      
      double fact=1;  
      for(int i=1;i<=number1;i++)    
        fact=fact*i;  

      logger.info("[OUTPUT - FACTORIAL] - " + fact);  
      return fact;
  }

  public double log(double number1) 
  {
      logger.info("[LOG] - " + number1);    
      double return_val = Math.log(number1);
      logger.info("[OUTPUT - LOG] - " + return_val); 
      return return_val;
  }

  public double power(double number1, double number2) 
  {
      logger.info("[POWER] - " + number1 + ", " + number2);     
      double return_val = Math.pow(number1 , number2);
      logger.info("[OUTPUT - POWER] - " + return_val);  
      return return_val;
  }

  public static void main(String[] args) 
  {
    try
    {
        My_Main calculator=new My_Main();
        Scanner scanner=new Scanner(System.in);
        while(1>0)
        {
            System.out.println("Initialized Scientific Calculator");
            System.out.println("Select your operation of choice from the given otpions below");
            System.out.println("1) for square root \n2) for factorial\n3) for natural logarithm\n4) for the power of the number\n5) Quit");
            int input=scanner.nextInt();

            if(input == 1)
            {
                System.out.println("Enter the number");
                System.out.println("Square root of the input is : " + calculator.root(scanner.nextDouble()));
                break;
            }

            else if(input == 2)
            {            
                System.out.println("Enter the number");
                System.out.println("Factorial result of the number is : " + calculator.factorial(scanner.nextInt()));
                
            }

            else if(input == 3)
            {
                System.out.println("Enter the number");
                System.out.println("Natural logarithm of the number is : " + calculator.log(scanner.nextDouble()));
                
            }

            else if(input == 4)
            {
                System.out.println("Enter the base and its exponent");
                System.out.println("Power of the base to its exponent is : " + calculator.power(scanner.nextDouble(),scanner.nextDouble()));
                
            }

            else if(input == 5)
            {
                System.out.println("Thank you");
                break;
            }

            else
            {
                System.out.println("No corresponding operation for the given input, please enter a valid operation");
            }
          }
      }

    catch(InputMismatchException error)
    {
        System.out.println("Invalid input, Entered input is not of the expected type");
        logger.error("Invalid input, Entered input is not of the expected type");
        return;
    }           
 }
}
