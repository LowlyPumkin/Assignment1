import java.util.Scanner;
public class Problem17
{
  public static float displacement(float materials,float length,float tempChange)
  {
	  float result = 0;
  
   result = materials*length*tempChange;   
    
    return result;
  }
  
  
	  public static void main(String[] args)
	  {
    
    System.out.println("Hit enter after each input.");
    System.out.println("The first input is the coefficient of linear expansion as a decimal.");
    System.out.println("The second input is the original length of the pipe.");
    System.out.println("The third input will be tempature change in Celsius.");
    System.out.println("The fourth and last input will be the name of the material.");
    
    
    
   Scanner keyboard = new Scanner(System.in);
   float materials= keyboard.nextFloat();
   float length= keyboard.nextFloat();
   float tempChange= keyboard.nextFloat();
  // keyboard.nextLine();
   String name = keyboard.next();
    keyboard.close();
    
    
    float displacement = displacement(materials, length, tempChange);
    
    System.out.println(name+"'s");
    System.out.println("Displacement is " +displacement);
    
  
  }
  
  }

