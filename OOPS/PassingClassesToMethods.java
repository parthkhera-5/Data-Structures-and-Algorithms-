public class PassingClassesToMethods{
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats+" "+name+" "+length+" "+type+" "+torque);
        }
    }
    public static void main(String[] args){
        Car c = new Car();
        c.seats = 4;
        c.name = "Nano";
        c.length = 5.0;
        c.type = "Tata";
        c.torque = 100;

        change(c);

        System.out.println(c.seats);
        
        c.print();
    }

    private static void change(Car x){
        x.seats = 2;
    }
}

// Pass by reference