package Controllers;

import FileReading.Loader;
import Modell.Equipments.Glove;
import Modell.Equipments.Mask;
import Modell.Item;
import Modell.Products.Notebook;
import Modell.Products.Pencil;
import StorageUnits.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainController {

    public MainController() {
        Customers = new CustomerStorage();
    }
    public static CustomerStorage Customers;
    private static final String FileName = "src/Data/Data.csv";



    public void Start() throws FileNotFoundException {

        ArrayList<Item> MainStorage = Loader.Load(FileName);

        GloveStorage gloveStorage = new GloveStorage();
        MaskStorage maskStorage = new MaskStorage();
        NotebookStorage notebookStorage = new NotebookStorage();
        PencilStorage pencilStorage = new PencilStorage();

        for (Item item : MainStorage){

            if (item instanceof Glove){
                gloveStorage.add((Glove)item);
            } else if (item instanceof Mask) {
                maskStorage.add((Mask)item);
            } else if (item instanceof Pencil) {
                pencilStorage.add((Pencil)item);
            } else if (item instanceof Notebook) {
                notebookStorage.add((Notebook)item);
            }
        }

        PrintStorage(MainStorage);
        System.out.println();

        pencilStorage.Print();
        System.out.println();

        pencilStorage.SortByPrice();

        pencilStorage.Print();

        Customers.Print();

        Customers.SortByName();
        System.out.println();

        Customers.Print();
    }

    private void PrintStorage(ArrayList<Item> C){
        for (Item item: C) {
            System.out.println(item.toString());
        }
    }
}
