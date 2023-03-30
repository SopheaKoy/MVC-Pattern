package co.istad.mvcapp.view;

import java.util.Scanner;
import java.util.UUID;

public class InputView {
    public static int getInput(Scanner scanner){
        try {
            return Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Allow number only..!");
        }
        return 0;
    }
    public static String getInputData(Scanner scanner){
        return  scanner.nextLine();
    }
}
