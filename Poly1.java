public class Poly1 {
    public void add(int a, int b){
        double c=a+b;
        System.out.println(c);
        }
        public void add(double a, int b){
        double c=a+b;
            System.out.println(c);
    }
    public void add(int a, double b){
        double c=a+b;
        System.out.println(c);
    }
    public double add(int a, int b, int c){
        double d=a+b;
        return d;
        }

    public static void main(String[] args) {
        Poly1 p1 = new Poly1();
        p1.add(13,23,6);
        p1.add(13.5,55);
        p1.add(13,56);
        p1.add(13,55.7);
    }
    }

