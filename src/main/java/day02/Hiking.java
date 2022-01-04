package day02;

import java.util.List;

public class Hiking {

    List<Coordinate> coordinates;

    public double getPlusElevation(){
        double diff=0;
        for (int i=0 ; i<coordinates.size()-1; i++){
            double subdiff=coordinates.get(i+1).z-coordinates.get(i).z;
            if(subdiff>0) {
                diff+=subdiff;
            };
        }
        return diff;
    }

}
