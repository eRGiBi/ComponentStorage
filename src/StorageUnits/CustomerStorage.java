package StorageUnits;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerStorage {

    private ArrayList<String> Customers;

    public CustomerStorage() {
        Customers = new ArrayList<>();
    }

    public void add(String customer){
        Customers.add(customer);
    }

    public void Print() {
        for (String customer : Customers) {
            System.out.println(customer);
        }
    }
    public void SortByName(){
        for (int i = 0; i < Customers.size() - 1; i++) {
            for (int j = i + 1; j < Customers.size(); j++) {
                String temp = Customers.get(i);
                String temp2 = Customers.get(j);

                if (temp.charAt(0) > temp2.charAt(0)) {
                    Customers.set(i, temp2);
                    Customers.set(j, temp);
                }
            }
        }
    }
}
