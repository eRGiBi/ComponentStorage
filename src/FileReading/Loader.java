package FileReading;

import Modell.Item;

import java.io.*;
import java.util.ArrayList;

public class Loader {
    public static ArrayList<Item> Load(String FileName) throws FileNotFoundException {

        ArrayList<Item> Container = new ArrayList<Item>();

        try {

            BufferedReader bfr = new BufferedReader(new FileReader(FileName));

            if(bfr != null){
                while(bfr.readLine() != null){

                    Item ObjectToAdd = Parser.Parse(bfr.readLine());

                    Container.add(ObjectToAdd);

                }
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
