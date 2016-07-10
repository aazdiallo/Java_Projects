package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        //launch(args);
        //Program that asks a user to enter His/Her first name and then print a greeting message and repeat it until the user decides to stop the process
        char rep = 'Y'; //boolean variable determining whether the program will be repeated or not
        while (rep == 'Y' || rep != 'N') {
            System.out.print("Please enter your first name: \n");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.print("Hello " + name + " How are you? \n");
            System.out.print("Do you want to try again, Y or N ? \n");
            rep = sc.nextLine().charAt(0);
            if (rep == 'N')
                System.out.print("Then thanks and bye !!!!\n");
        }
        // Using the do while loop
    System.out.print("\t ******Program that converts degrees between 'Celsius' and 'Fahrenheit' ******* \n");
        do {
            System.out.print("Please make your choice of conversion using the numeric numbers\n");
            System.out.print("1_____Celsius to Fahrenheit \n");
            System.out.print("2_____Fahrenheit to Celsius \n");
            System.out.print("0_____Exit the program \n");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            /*while (choice != 1 || (choice != 2) || (choice != 0)){
                System.out.print("Please make sure your choice is either '1' or '2' to continue or press '0' to stop the program \n");
                choice = sc.nextInt();
            }
            This is the code I couldn't find a solution for the while condition that's why I put as a comment so you can see it.*/

            switch (choice){
                    case 1: {
                        System.out.println("Thanks for choosing to convert your temperature to Fahrenheit !!!");
                        System.out.println("Please enter the Celsius temperature that you want to convert");
                        double temp = sc.nextDouble();
                        System.out.println(temp + " ºC equal to: "+ (9/5.0 *temp+32) +" ºF");
                        break;
                    }
                    case 2: {
                        System.out.println("Thanks for choosing to convert your temperature to Celsius !!!");
                        System.out.println("Please enter the Fahrenheit temperature that you want to convert");
                        double temp = sc.nextDouble();
                        System.out.println(temp + " ºF equal to: "+ (5*(temp-32)/9.0) +" ºC");
                        break;
                    }
                    case 0: {
                        System.out.println("You successfully exited the program");
                        break;
                    }
                }
            sc.nextLine();
            System.out.print("Do you want to try another conversion? type 'Y' or 'N' \n");
            rep = sc.nextLine().charAt(0);
            if (rep == 'N')
                System.out.println("You successfully exited the program");
        }while (rep == 'Y' || rep != 'N');
    }

}
