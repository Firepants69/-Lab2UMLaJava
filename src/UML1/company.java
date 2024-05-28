package UML1;
class Company {
    private String name;
    private Employee[] arrEmployee;
    private int nbEmployee;

    public Company(String name, int size) {
        this.name = name;
        this.arrEmployee = new Employee[size];
        this.nbEmployee = 0;
    }

    public void displayAll() {
        for (int i = 0; i < nbEmployee; i++) {
            arrEmployee[i].display();
        }
    }

    public void addEmployee(Employee e) {
        if (nbEmployee < arrEmployee.length) {
            arrEmployee[nbEmployee++] = e;
        } else {
            System.out.println("Cannot add more employees, array is full.");
        }
    }

    public int searchName(String name) {
        for (int i = 0; i < nbEmployee; i++) {
            if (arrEmployee[i].getName().equals(name)) {
                return i;
            }
        }
        return -1; // Not found
    }

    public void deleteEmployee(String name) {
        int index = searchName(name);
        if (index != -1) {
            for (int i = index; i < nbEmployee - 1; i++) {
                arrEmployee[i] = arrEmployee[i + 1];
            }
            arrEmployee[--nbEmployee] = null; // Nullify the last element
        } else {
            System.out.println("Employee not found.");
        }
    }

    public double getYearlyPay(String name) {
        int index = searchName(name);
        if (index != -1) {
            return arrEmployee[index].calculatePay() * 12; // Assuming monthly pay
        }
        return 0.0; // Not found
    }

    public double calAvgPayForPartTime() {
        int partTimeCount = 0;
        double totalPay = 0.0;
        for (int i = 0; i < nbEmployee; i++) {
            if (arrEmployee[i] instanceof PartTimeEmp) {
                totalPay += arrEmployee[i].calculatePay();
                partTimeCount++;
            }
        }
        return partTimeCount > 0 ? totalPay / partTimeCount : 0.0;
    }
}