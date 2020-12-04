package command;

import junit.framework.TestCase;
import org.junit.Test;

public class CommandTest extends TestCase {

    @Test
    public void test() {

        Command command = new Command();
        Operator operator = new Operator();

        PutUp up = new PutUp(command);
        PutUp up2 = new PutUp(command);
        PutDown down = new PutDown(command);

        operator.takeCommand(down);
        operator.takeCommand(up2);
        operator.takeCommand(up);
        operator.takeCommand(down);
        operator.takeCommand(down);
    }
}
