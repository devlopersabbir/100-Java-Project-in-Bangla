
public class LSSClass {
    public static void main(String[] args) {
        Out o = new Out();
        System.out.println(o.get());
    }
}

class Details {
    String name = "Sabbir Hossain";
}

class Out extends Details {
    String get() {
        return this.name;
    }
}
