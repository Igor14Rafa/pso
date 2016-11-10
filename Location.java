// bean class to represent location

public class Location {
	// store the Location in an array to accommodate multi-dimensional problem space
	private double[] loc;
	private double sum;

	public Location(double[] loc) {
		super();
		this.loc = loc;
	}

	public double[] getLoc() {
		return loc;
	}

	public void setLoc(double[] loc) {
		this.loc = loc;
	}
	
	public double getSum(){ 
		for(int i=0; i < loc.length; i++)
			this.sum += loc[i];
		
		return this.sum;
	}

}
