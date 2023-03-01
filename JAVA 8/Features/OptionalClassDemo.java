package Features;

import java.util.Optional;

public class OptionalClassDemo {
    int data = 0;
    
    OptionalClassDemo(int data){this.data = data;}

    public void run(){
        func1();
        func2();
    }

    public static void addData(Optional<OptionalClassDemo> arg1, Optional<OptionalClassDemo> arg2){
        OptionalClassDemo obj1 = (OptionalClassDemo) arg1.orElse(new OptionalClassDemo(0));
        OptionalClassDemo obj2 = (OptionalClassDemo) arg2.orElse(new OptionalClassDemo(0));

        System.out.println("SUM: " + (obj1.data + obj2.data));
    }

    void func1(){
        OptionalClassDemo obj1 = new OptionalClassDemo(20);
        OptionalClassDemo obj2 = new OptionalClassDemo(30);

        Optional<OptionalClassDemo> op1 = Optional.ofNullable(obj1);
        Optional<OptionalClassDemo> op2 = Optional.ofNullable(obj2);

        addData(op1, op2);
    }

    void func2(){
        ProductTest testObj = new ProductTest(1, "HP", 60000);

        Optional<ProductTest> opTest = Optional.ofNullable(testObj);
        System.out.println("Object is " + opTest.isPresent());

        if(opTest.isPresent()){
            ProductTest prodTestObj = opTest.get();
            System.out.println("Product Name is " + prodTestObj.name);

            System.out.println("Hashcode of this object " + opTest.hashCode());

            Optional<ProductTest> opTest2 = opTest;
            if(opTest.equals(opTest2))
                System.out.println("Both objects are same");
            else
                System.out.println("Objects are different");
        }
        else
            System.out.println("It is a null object");
    }

    public static void main(String[] args) {
        OptionalClassDemo o1 = new OptionalClassDemo(0);
        o1.run();
    }
}

class ProductTest{
    int id, cost;
    String name;

    public ProductTest(int id, String name, int cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public ProductTest(){}
}

