package com.java8_streams.opt;

import java.util.Optional;

public class MobileOpt {
    private long id;
    private String brand;
    private String name;
    private Optional<DisplayFeaturesOpt> displayFeatures;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<DisplayFeaturesOpt> getDisplayFeatures() {
        return displayFeatures;
    }

    public void setDisplayFeatures(Optional<DisplayFeaturesOpt> displayFeatures) {
        this.displayFeatures = displayFeatures;
    }

    public MobileOpt(long id, String brand, String name, Optional<DisplayFeaturesOpt> displayFeatures) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.displayFeatures = displayFeatures;
    }
}
