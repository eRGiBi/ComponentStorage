package Controllers;

import FileReading.Loader;
import Modell.Item;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainController {
    private static final String FileName = "C:\\Files\\Programming\\JavaProjects\\ComponenStorage\\ComponentStorage\\src\\Data\\Data.csv";

    public void Start() throws FileNotFoundException {

        ArrayList<Item> MainStorage = Loader.Load(FileName);

        PrintStorage(MainStorage);




    }
    private void PrintStorage(ArrayList<Item> C){
        for (Object item: C) {
            System.out.println(item.toString());
        }
    }
}
