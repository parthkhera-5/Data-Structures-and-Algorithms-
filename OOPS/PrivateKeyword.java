class Students{
    String name; //null(string)
    private int rno;  //0(int)
    double cgpa;  //0.0(double)
    public void print(){    // getter
        System.out.println(name+" "+rno+" "+cgpa);
    }
    int getRno(){ //getter
        return rno;
    }
    void setRno(int x){ //setter
        rno = x;
    }


    // public void p(){
    //     print();            
    // }


}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students(); 
        // s1.print(); 
        s1.name = "Anant";
        s1.cgpa = 8.0; 
        // s1.rno = 12;     //ERROR
        s1.setRno(10);
        System.out.println(s1.getRno());
        s1.print();
    }    
}


// Rno is set like this in case of private keyword
// StringBuilder sb = new StringBuilder(sc.nextLine());
// System.out.println(sb);