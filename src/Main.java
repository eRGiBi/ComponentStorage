import Controllers.MainController;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {


            new MainController().Start();


        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }

    }
}