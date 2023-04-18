package Controllers;

import FileReading.Loader;
import Modell.Item;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainController {
    private static final String FileName = "C:\\Files\\Programming\\JavaProjects\\ComponenStorage\\ComponentStorage\\src\\Data\\Data.csv";

    public void Start() throws FileNotFoundException {

        ArrayList<Item> MainStorage = Loader.Load(FileName);

        for (Object item: MainStorage) {
            System.out.println(item.toString());
        }


    }
}
