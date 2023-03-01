package Features;

interface IStaticMethodReference{
    public void say();
}
interface IInstanceMethodReference{
    public void say();
}

public class MethodReference {
    
    void run(){
        func1();
    }
    
    MethodReference(){
        System.out.println("COSTRUCTOR CALLING...");
    }

    public static void staticMethod(){
        System.out.println("Static Method for Reference...");
    }

    public void instanceMethod(){
        System.out.println("Instance Method for Reference");
    }

    void func1(){
        IStaticMethodReference iStaticMethodRef = MethodReference::staticMethod;
        iStaticMethodRef.say();

        MethodReference methodRefObj = new MethodReference();
        IInstanceMethodReference iInstanceMethodRef = methodRefObj::instanceMethod;
        iInstanceMethodRef.say();

        IInstanceMethodReference iMethodReferenceConstructor = MethodReference::new;
        iMethodReferenceConstructor.say();
    }
}
