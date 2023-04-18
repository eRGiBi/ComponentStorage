package FileReading;

import Modell.*;
import Modell.Equipments.Glove;
import Modell.Equipments.Mask;
import Modell.Products.Notebook;
import Modell.Products.Pencil;

public class Parser {

    public static Item Parse(String line){

        String[] data = line.split(";");

        switch (data[0]) {
            case "Glove" -> {
                return new Glove(Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]);
            }
            case "Mask" -> {
                return new Mask(Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]);
            }
            case "Pencil" -> {
                return new Pencil(Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]);
            }
            case "Notebook" -> {
                return new Notebook(Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]));
            }
            default -> {return null;}
        }
    }
}
