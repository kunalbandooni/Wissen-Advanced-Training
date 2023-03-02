package Features;

interface Drawable1{
    public void draw();
}

interface Math{
    public int sum(int x, int y);

    public static int sqrt(Integer n) {
        return 0;
    }
}

public class Lambda {
    public void run(){
        func1();
        func2();
    }

    void func1(){
        int w = 10;
        
        Drawable1 d1 = new Drawable1() {
            public void draw(){
                System.out.println("Drawing circle of width: " + w);
            }
        };
        d1.draw();

        Drawable1 d2 = () -> System.out.println("Drawing circle of width: " + w);
        d2.draw();
    }

    void func2(){
        Math m1 = (x, y) -> x + y;
        System.out.println("Sum of two numbers: " + m1.sum(100, 20));
    }
}