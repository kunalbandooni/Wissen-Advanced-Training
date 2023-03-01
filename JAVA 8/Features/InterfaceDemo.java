package Features;

interface Math1{
    default int sum(int x, int y){ 
        return x + y; 
    }
}
interface Math2{
    default int sum(int x, int y){
        return x + y + 5;
    }
}
interface StaticOne{
    static void display(){      // Needs not be implemented, if using static method
        System.out.println("Good Boi");
    }
}

public class InterfaceDemo implements Math1, Math2{
    public void run(){
        func1();
        func2();
        StaticOne.display();
    }

    void func1(){
        InterfaceDemo ob = new InterfaceDemo();
        System.out.println("Sum of two numbers: " + ob.sum(100, 50));
    }

    void func2(){
        InterfaceDemo ob = new InterfaceDemo();
        System.out.println("Sum of two numbers + 5: " + ob.sum(100, 50));
    }

    public int sum(int a, int b){
        return Math1.super.sum(a,b);
    }
}