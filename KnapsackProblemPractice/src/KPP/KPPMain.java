package KPP;

import java.util.ArrayList;
import java.util.Collections;

//import KPP.KPPPcomparator;

public class KPPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<item> items = new ArrayList<item>();
		
		item item1 = new item();
		item1.setObjects(2);
		item1.setProfits(5);
		item1.setWeights(1);
		
		item item2 = new item();
		item2.setObjects(1);
		item2.setProfits(12);
		item2.setWeights(3);

		item item3 = new item();
		item3.setObjects(3);
		item3.setProfits(16);
		item3.setWeights(4);
		
		item item4 = new item();
		item4.setObjects(4);
		item4.setProfits(7);
		item4.setWeights(2);
		
		item item5 = new item();
		item5.setObjects(6);
		item5.setProfits(11);
		item5.setWeights(4);
		
		item item6 = new item();
		item6.setObjects(7);
		item6.setProfits(6);
		item6.setWeights(3);
		
		item item7 = new item();
		item7.setObjects(5);
		item7.setProfits(9);
		item7.setWeights(9);
		
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		
		Collections.sort(items,new KPPPcompartor());
		
		double capacity = 15.0;
		double totalProfit= 0.0;
		
		for(item Item: items)
		{
			if(capacity>=Item.getWeights())
			{
				capacity-=Item.getWeights();
				totalProfit += Item.getProfits();
			}
			else 
			{
				totalProfit += Item.getProfits()*(capacity/Item.getWeights());
				break;
			}
		}
		System.out.println(totalProfit);
		
	}

}
