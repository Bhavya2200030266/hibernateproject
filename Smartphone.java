package com.klef.jfsd.exam.InheritanceMapping;


import javax.persistence.*;

@Entity
@Table(name = "smartphone")
@PrimaryKeyJoinColumn(name = "smartphone_id")
public class Smartphone extends Device {
    @Column(name = "operating_system")
    private String operatingSystem;

    @Column(name = "camera_resolution")
    private int cameraResolution;

    public Smartphone() {}

    public Smartphone(String brand, String model, double price, 
                      String operatingSystem, int cameraResolution) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    // Getters and Setters
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + ", Smartphone{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}
