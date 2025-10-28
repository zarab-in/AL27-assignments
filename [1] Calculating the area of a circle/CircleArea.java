import java.util.Scanner;  // allows input from user

class CircleArea 
{
    public static void main(String[] args)
        {
            Scanner myObj = new Scanner(System.in); // input
            System.out.print("Enter the radius: ");
            double r = myObj.nextDouble();
            double pi = 3.1416;
            double A = pi * r * r;
            System.out.println("The area of the circle is:" + A);
            myObj.close();
        }
}

// i lowkey give on learning python AND java simulatneously
// i will return here #trust

// update: i think im getting it omg

// IT WORKED !!