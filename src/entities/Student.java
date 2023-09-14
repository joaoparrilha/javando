package entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;
    public double total;

    public void aprove(){
        total = n1 + n2 + n3;
        System.out.println("FINAL GRADE = " + String.format("%.2f",total));

        if (total >= 60.0){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            double missing = 60.0 - total;
            System.out.println("MISSING " + String.format("%.2f",missing) + " POINTS");
        }
    }

}
