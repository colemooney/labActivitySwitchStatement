import java.util.Scanner;
import javax.swing.JOptionPane; 
public class LabActivitySwitchStatement
{
   public static void main(String[] arg)
   {
        //CONSTANTS
        final String CONTROL_LANGUAGE = "G-Code";
        
        //VARIABLES
        String roboticOperation;
        
        //ARRAYS
        
        //SOLUTION
        CS170.information("Cole Mooney", "Lab Activity", "Switch Statement");
      
        
        //OBJECTS
        Scanner keyboardInput = new Scanner(System.in);
        
        //KEYBOARD INPUT
        System.out.println("The Control Language: " + CONTROL_LANGUAGE);
        System.out.print("Enter Robotic Operation: ");
        roboticOperation = keyboardInput.nextLine();
        
        
        //SCREEN OUTPUT
        switch (roboticOperation)
        {
            case "G00":
            System.out.println("Move in straight line at rapid speed");
            break;
            case "G01":
            System.out.println("Move in straight line a specified speed");
            break;
            case "G02":
            System.out.println("Move in a clockwise arc");
            break;
            case "G03":
            System.out.println("Move in a counterclockwise arc");
            break;
            case "G20":
            System.out.println("Units are inches");
            break;
            case "G21":
            System.out.println("Units are millimeters");
            break;
            case "G90":
            System.out.println("Coordinates are absolute");
            break;
            case "G91":
            System.out.println("Coordinates are incremental");
            break;
            case "M00":
            System.out.println("Stop");
            break;
            default:
            System.out.println("Invalid Command");
        }
                
        keyboardInput.close();
       
    }
}