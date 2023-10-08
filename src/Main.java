import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // initial prints
        System.out.println("Welcome to AP Java getter and setter method generator!");
        System.out.print("Please enter the name of your instance variable: ");
        String name = scan.nextLine();
        System.out.print("Please enter the data type of this variable: ");
        String type = scan.nextLine();

        // prints getter method
        System.out.println("// getter for " + name + " \\\\");
        System.out.println("public " + type + " get" + name + "()\n{\n   return " + name + ";\n}");
        // prints setter method
        System.out.println("// setter for " + name + " \\\\");
        System.out.println("public void set" + name + "(" + type + " new" + name + ")\n{\n   " + name + " = new" + name + ";\n}");
    }
}
