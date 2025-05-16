package ksp;

import java.util.Comparator;

public class FKPComparator implements Comparator<Item> {
    
    @Override
    public int compare(Item i1, Item i2) {
        
        double cpr1 = i1.getProfits() / i1.getWeight();
        double cpr2 = i2.getProfits() / i2.getWeight();
        
        if(cpr1<cpr2) return 1;
        else return -1;
  
        
    }
}
