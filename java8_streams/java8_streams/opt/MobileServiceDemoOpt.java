package com.java8_streams.opt;

import java.util.Optional;

public class MobileServiceDemoOpt {
    public Integer getMobileScreenWidth(Optional<MobileOpt> mobile){
        return mobile.flatMap(MobileOpt::getDisplayFeatures)
                .flatMap(DisplayFeaturesOpt::getResolution)
                .map(ScreenResolutionOpt::getWidth)
                .orElse(0);

    }
    public static void main(String[] args) {
        ScreenResolutionOpt resolution = new ScreenResolutionOpt(750,1334);
        DisplayFeaturesOpt dfeatures = new DisplayFeaturesOpt("4.7", Optional.of(resolution));
        MobileOpt mobile = new MobileOpt(2015001, "Apple", "iPhone 6s", Optional.of(dfeatures));

        MobileServiceDemoOpt mService = new MobileServiceDemoOpt();

        int width = mService.getMobileScreenWidth(Optional.of(mobile));
        System.out.println("Apple iPhone 6s Screen Width = " + width);
    }
}
