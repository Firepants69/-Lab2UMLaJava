package UML2;

public class Client {
    private String name;

    public Client(String name){
        this.name = name;
    }

    protected void pay(Order order){
        /**
         * rewrite on subclass
         */
    }
}
