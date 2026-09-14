class Arraylist{ //user defined data structure
    int[] arr = new int[10];
    int idx = 0;
    int capacity = 10;
    int size = 0;
    Arraylist(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length){  //array is full
            int arr2[] = new int[arr.length*2];
            for(int i=0; i<arr.length; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx++] = ele;
        size++;
    }
    int get(int index){
        return arr[index];
    }
    int capacity(){
        return arr.length;
    }
    void set(int index, int val){
        arr[index] = val;
    }
    void display(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist arr = new Arraylist(3);
        arr.add(10); arr.add(20); arr.add(30);
        arr.display();
        System.out.println(arr.get(1)+" ");
        arr.add(40);
        arr.display();
    }
}