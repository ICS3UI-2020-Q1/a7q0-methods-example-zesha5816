import java.util.Scanner;
/**
 * method example file
 * @author Ahmad Zeshan
 */
public class Main {
	
	public static void sayhello(){
		System.out.println("Hello World!");
	} 
	public static void sayhello(String name){
		System.out.println("Hello " + name);
	}
	//a method to calculate the area of a rectangle
	public static double areaOfRectangle(double width, double length){
		double area = width * length;
		return area;
	}

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
		 Scanner input = new Scanner(System.in);
		 double answer = areaOfRectangle(2.0, 5.0);
		 System.out.println(answer);

		 //print hello World
		 sayhello();
		 sayhello("Ahmad");
  }
}
