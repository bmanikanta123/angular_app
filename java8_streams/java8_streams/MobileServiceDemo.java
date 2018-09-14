package com.java8_streams;

public class MobileServiceDemo {
    public int getMobileScreenWidth(Mobile mobile){

        if(mobile != null){
            DisplayFeatures dfeatures = mobile.getDisplayFeatures();
            if(dfeatures != null){
                ScreenResolution resolution = dfeatures.getResolution();
                if(resolution != null){
                    return resolution.getWidth();
                }
            }
        }
        return 0;

    }

    public int getMobileScreenWidthWithOptional(Mobile mobile){


        return 0;

    }
    public static void main(String[] args) {
        ScreenResolution resolution = new ScreenResolution(750,1334);
        DisplayFeatures dfeatures = new DisplayFeatures("4.7", resolution);
        Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", dfeatures);

        MobileServiceDemo mService = new MobileServiceDemo();

        int mobileWidth1 = mService.getMobileScreenWidth(mobile);
        System.out.println("Apple iPhone 6s Screen Width = " + mobileWidth1);
    }
}
