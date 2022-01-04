package day02;

import java.util.List;

public class Hiking {

    List<Coordinate> coordinates;



    public List<Coordinate> getCoordinates() {
        return coordinates;
    }
/*
    public Hiking(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }
*/
    public Integer getPlusElevation(List<Integer> elevations){
        int diff=0;
        for (int i=0 ; i<elevations.size()-1; i++){
            //Integer subdiff=coordinates.get(i+1).z-coordinates.get(i).z;
            int subdiff = elevations.get(i+1)-elevations.get(i);
            if(subdiff>0) {
                diff+=subdiff;
            };
        }
        return diff;
    }



}
