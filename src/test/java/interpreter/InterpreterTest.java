package interpreter;

import junit.framework.TestCase;
import org.junit.Test;

public class InterpreterTest extends TestCase {
    @Test
    public void test(){
        System.out.println("(" + this.toString() + ") : " + "Testing Interpreter");
        String[] str = {"KCKL", "1", "NMC", "1", "KQS", "1"};
        Context context = new Context(str);
        Node Interpreter = new ExpressionNode();
        Interpreter.interpret(context);
        Interpreter.execute();
    }
}
