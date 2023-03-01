package Features;

import java.io.FileNotFoundException;

import javax.script.ScriptException;

public class App {
    public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException{
        System.out.println("LAMBDA: ");
        Lambda obj1 = new Lambda();
        obj1.run();

        System.out.println("INTERFACE: ");
        InterfaceDemo obj2 = new InterfaceDemo();
        obj2.run();

        System.out.println("FOR EACH: ");
        ForEach obj3 = new ForEach();
        obj3.run();

        System.out.println("METHOD REFERENCES: ");
        MethodReference obj4 = new MethodReference();
        obj4.run();

        System.out.println("OPTIONAL CLASSES: ");
        OptionalClassDemo obj5 = new OptionalClassDemo(0);
        obj5.run();

        System.out.println("LOCAL DATE AND TIME: ");
        DateAndTimeDemo obj6 = new DateAndTimeDemo();
        obj6.run();

        System.out.println("NASHORN: ");
        NashornDemo obj7 = new NashornDemo();
        obj7.run();

        System.out.println("STREAMS: ");
        StreamsDemo obj8 = new StreamsDemo();
        obj8.run();
    }
}