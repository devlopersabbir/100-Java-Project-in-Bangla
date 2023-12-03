package Pack;

public class PackageExample {
    int roll;
    String name;
    float mark;
    public void GetData() {
        this.roll = 1234;
        this.name = "Sabbir";
        this.mark = 55.5f;
    }
    public void Display() {
        System.out.println("Role is: "+ this.roll);
        System.out.println("name is: "+ this.name);
        System.out.println("mark is: "+ this.mark);
    }
}