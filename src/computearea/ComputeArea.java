
package computearea;

import java.util.Scanner;


public class ComputeArea {

    public static void main(String[] args) {
        
        System.out.print("Enter the radius of your circle: ");
        //Tell the user to input the radius and wait for the input from user
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        if (radius>0){
        double area;
        area = radius*radius*3.14159;
        System.out.println("The circle area is " + area);
        }
        else {
            System.out.println("Radius have to be a positive number.");
        }
    }
}
