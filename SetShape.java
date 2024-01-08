//name: Sara Russert
//date: 1/7/24
//file: SetShape.java

// Import either Scanner or JOptionPane
import java.util.Scanner;

public class SetShape {
   public static void main(String[] args) {
      // Declare String constants for the four colors
      // blue div by 2 && 3
      // green div by 2 !3
      // yellow div by 3 !2
      // red !div by 2 or 3
      final String COLOR_1 = "blue", COLOR_2 = "green", COLOR_3 = "yellow", COLOR_4 = "red";
      
      // Declare int constants for the following:
      // Minimum number of edges: 3
      // Maximum number of edges: 10
      final int MIN_NUM_EDGES = 3, MAX_NUM_EDGES = 10;
      
      // Declare int variable for the number of edges of the shape
      int numEdges;
      
      // Declare string variables for the shapeCategory and the shapeColor
      String shapeCategory, shapeColor;
      
      // Collect user input for the number of edges in this shape
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Imagine a shape with at least 3, but not more than 10, edges.");
      System.out.print("Enter the number of edges your shape has: ");
      numEdges = keyboard.nextInt();
      
      // Implement an if statement to determine if the user input is outside the required range
      if (numEdges < 3 || numEdges > 10) {
         // If it is, inform the user and exit the program
         System.out.println("The number of edges of your shape is outside the required range.");
         System.out.println("Program will now terminate.");
         System.exit(0);
      }
      
      // Use a switch to determine what kind of shape this is
      switch (numEdges) {
         case 3:
            shapeCategory = "triangle";
            break;
         case 4:
            shapeCategory = "quadrilateral";
            break;
         case 5:
            shapeCategory = "pentagon";
            break; 
         case 6:
            shapeCategory = "hexagon";
            break;
         case 7:
            shapeCategory = "heptagon";
            break;  
         case 8:
            shapeCategory = "octagon";
            break;  
         case 9:
            shapeCategory = "nonagon";
            break;   
         default:
            shapeCategory = "decagon";
            break;             
      }
      // Use an if-else-if statement to determine what color to paint the shape
      if (numEdges % 2 == 0) {
         if (numEdges % 3 == 0) 
            shapeColor = COLOR_1;
         else
            shapeColor = COLOR_2;
      } else if (numEdges % 3 == 0) 
         shapeColor = COLOR_3;
      else 
         shapeColor = COLOR_4;
  
      
      // Display the results to the user
      System.out.println("Your shape has " + numEdges + " edges.");
      System.out.println("Therefore, it is classified as a " + shapeCategory);
      System.out.println("It will be painted " + shapeColor);
   
   }
}