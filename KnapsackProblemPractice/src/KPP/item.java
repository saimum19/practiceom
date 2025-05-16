package KPP;

public class item {
 private double objects;
 private double profits;
 private double weights;
public double getObjects() {
	return objects;
}
public void setObjects(double objects) {
	this.objects = objects;
}
public double getProfits() {
	return profits;
}
public void setProfits(double profits) {
	this.profits = profits;
}
public double getWeights() {
	return weights;
}
public void setWeights(double weights) {
	this.weights = weights;
}
@Override
public String toString() {
	return "item [objects=" + objects + ", profits=" + profits + ", weights=" + weights + "]";
}

}
