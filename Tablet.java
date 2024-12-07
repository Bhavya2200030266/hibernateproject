package com.klef.jfsd.exam.InheritanceMapping;



	import javax.persistence.Entity;
	import javax.persistence.Table;

	@Entity
	@Table(name = "Tablet")
	public class Tablet extends Device {
	    private double screenSize;
	    private int batteryLife;

	    // Getters and Setters
	    public double getScreenSize() {
	        return screenSize;
	    }

	    public void setScreenSize(double screenSize) {
	        this.screenSize = screenSize;
	    }

	    public int getBatteryLife() {
	        return batteryLife;
	    }

	    public void setBatteryLife(int batteryLife) {
	        this.batteryLife = batteryLife;
	    }
	}

}


}
