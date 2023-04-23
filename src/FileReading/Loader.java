package FileReading;

import Modell.Item;

import java.io.*;
import java.util.ArrayList;


public class Loader {

    public static ArrayList<Item> Load(String FileName) throws FileNotFoundException {

        ArrayList<Item> Container = new ArrayList<>();
        String line;

        try {

            BufferedReader bfr = new BufferedReader(new FileReader(FileName));

            while((line = bfr.readLine()) != null){

                Item ObjectToAdd = Parser.Parse(line);

                Container.add(ObjectToAdd);
            }

            bfr.close();

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Container;
    }

}
