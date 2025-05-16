package ksp;

public class Item {
	private double object;
	private double profits;
	private double weight;
	public double getObject() {
		return object;
	}
	public void setObject(double object) {
		this.object = object;
	}
	public double getProfits() {
		return profits;
	}
	public void setProfits(double profits) {
		this.profits = profits;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Item [object=" + object + ", profits=" + profits + ", weight=" + weight + "]";
	  }
	}
	
	
	