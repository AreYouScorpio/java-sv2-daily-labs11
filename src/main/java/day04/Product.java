package day04;

import java.time.LocalDate;

public class Product extends Item{


    @Override
    public void setExpiryDate(LocalDate sellDate) {
        sellDate==(sellDate.getMonth()+3);
    }
}
