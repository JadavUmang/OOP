public class Prac_14 {
    int roll;
    double cgpa;
    String name;

    Prac_14(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void display(Prac_14 A) {
        if (A.cgpa > 5) {
            System.out.println("Student " + A.name + " Having Roll no " + A.roll + " Is Pass.");
        } else {
            System.out.println("Student " + A.name + " Having Roll no " + A.roll + " Is Fail.");
        }
    }

    public static void main(String[] args) {
        Prac_14 s1 = new Prac_14(1, "Umang", 9.5);
        Prac_14 s2 = new Prac_14(2, "Jenish", 4.99);
        s1.display(s1);
        s2.display(s2);
    }
}