public class Constructors {
    public static class Car {
        int seats;
        String name;
        double length;
        Car(){  // default constructor

        }
        Car(int x, String s, double d){
            seats = x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }     
    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia",3.99);
        System.out.println(c1.name);
        Car c2 = new Car(10, "Limo", 10);
        c2.print();
        Car c3 = new Car();
        c3.name = "Dzire";
    }
}

// StringBuilder sb = new StringBuilder(sc.nextLine());
// System.out.println(sb);


// order matter inside the constructor