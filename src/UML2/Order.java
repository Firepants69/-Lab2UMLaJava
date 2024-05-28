package UML2;

import java.util.Date;

public class Order {
    public Order(int price, Date date) {
        this.price = price;
        this.date = date;
    }

    private int price;
    private Date date;

    public int getPrice(){
        return this.price;
    }


}
