package UML2;

public class PrivateClient extends Client{

    private String card;

    public PrivateClient(String name,String card) {
        super(name);
        this.card = card;
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void pay(Order order) {
        // TODO Auto-generated method stub
        System.out.println("pagaste $$");

    }
    
}
