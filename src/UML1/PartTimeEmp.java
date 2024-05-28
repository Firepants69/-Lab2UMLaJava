package UML1;

class PartTimeEmp extends Employee {
    private int nbWorkHours;
    private int rate;

    public PartTimeEmp(String name, int id, int nbWorkHours, int rate) {
        super(name, id);
        this.nbWorkHours = nbWorkHours;
        this.rate = rate;
    }

    public PartTimeEmp(PartTimeEmp p) {
        super(p.getName(), p.getId());
        this.nbWorkHours = p.nbWorkHours;
        this.rate = p.rate;
    }

    public void display() {
        super.display();
        System.out.println("Work Hours: " + nbWorkHours + ", Rate: " + rate);
    }

    public double calculatePay() {
        return nbWorkHours * rate;
    }

    public int getRate() {
        return rate;
    }

    public int getNbWorkHours() {
        return nbWorkHours;
    }
}