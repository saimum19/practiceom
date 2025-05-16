package algorithms.with.oop.huffmancoding;

import java.util.*;

public class MyComparator implements Comparator<HuffmanNode> {
    
	
	public int compare(HuffmanNode x, HuffmanNode y) {
		
		return x.data-y.data;
	}
}
