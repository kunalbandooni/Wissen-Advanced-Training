package Features;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornDemo {
    public void run() throws FileNotFoundException, ScriptException, NoSuchMethodException{
        func1();
    }

    void func1() throws FileNotFoundException, ScriptException, NoSuchMethodException{
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("Nashorn");

        engine.eval(new FileReader("C:\\Users\\hp\\Downloads\\Wissen Technology Intern\\JAVA ADVANCED\\JAVA 8\\Features\\NashornDemoFile.js"));

        Invocable inv = (Invocable) engine;

        inv.invokeFunction("test");
        System.out.println(inv.invokeFunction("sum", 120, 200));
    }
}