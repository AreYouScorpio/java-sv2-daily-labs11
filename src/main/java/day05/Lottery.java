package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int maxNumber;
    private int howManyNumber;


    public List<Integer> startLottery(int maxNumber, int howManyNumber){
        List<Integer> result= new ArrayList<>();
        for (int i=0 ; i<howManyNumber; i++){
           Random random = new Random();
           int randomNumber = random.nextInt(maxNumber + 1 - 1) + 1;
           while (result.contains(randomNumber)) {
               randomNumber = random.nextInt(maxNumber + 1 - 1) + 1;
           }
            result.add(randomNumber);
           }
     return result;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        System.out.println(lottery.startLottery(10,3));
    }

}
