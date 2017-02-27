
public class Developer extends Employee {
    String comment;

    public Developer(String comment, double salary, String holiday, int years, String lastName, String birthDate, String firstName) {
        super(salary, holiday, years, lastName, birthDate, firstName);
        this.comment = comment;
    }
    void Print(){
        System.out.println(super.lastName+" "+super.firstName+" "+this.comment+" "+super.salary);
    }
    
}
