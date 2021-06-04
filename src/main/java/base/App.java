package base;

import java.util.Scanner;

/*
Create a program that prompts for your name and prints a greeting using your name.

Example Output

What is your name? Brian
Hello, Brian, nice to meet you!

Constraint

Keep the input, string concatenation, and output separate.

Challenges

Write a new version of the program without using any variables.
Write a version of the program that displays different greetings for different people.
Write a version of the program that displays the greeting in a GUI window.
 */
public class App {
    public static void main(String[] args) {
        App myApp = new App();
        System.out.print("What is your name? ");
        String name = myApp.ReadString();
        String output = myApp.Concat(name);
        myApp.PrintString(output);
    }
    // input
    String ReadString()
    {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    // concatenation
    String Concat(String name)
    {
        return "Hello, " + name + ", nice to meet you!";
    }
    // output
    void PrintString(String output)
    {
        System.out.print(output);
    }
}
