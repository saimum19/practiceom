package KPP;

import java.util.Comparator;

public class KPPPcompartor implements Comparator<item> {
	
	public int compare(item i1,item i2){
		double cpr1 = i1.getProfits()/i1.getWeights();
		double cpr2 = i2.getProfits()/i2.getWeights();
		
		if(cpr1<cpr2) return 1;
		else return -1;
	}
	

}
