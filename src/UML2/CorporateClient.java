package UML2;

public class CorporateClient extends Client{

    private String account;
    
    public CorporateClient(String name,String account) {
        super(name);
        this.account = account;
        //TODO Auto-generated constructor stub
    }

    @Override
    protected void pay(Order order) {
        /**
         * pay
         */
        System.out.println("pagaste $$$$");
    }

    
    
}
