package com.java8_streams.opt;

import java.util.Optional;

public class DisplayFeaturesOpt {
    private String size; // In inches
    private Optional<ScreenResolutionOpt> resolution;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Optional<ScreenResolutionOpt> getResolution() {
        return resolution;
    }

    public void setResolution(Optional<ScreenResolutionOpt> resolution) {
        this.resolution = resolution;
    }

    public DisplayFeaturesOpt(String size, Optional<ScreenResolutionOpt> resolution) {
        this.size = size;
        this.resolution = resolution;
    }
}
