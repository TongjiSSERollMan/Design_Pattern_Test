package dto;

import junit.framework.TestCase;
import org.junit.Test;

public class DtoTest extends TestCase {
    @Test
    /**
     * Get new tools.
     */
    public void test() {
        Tools sled = new Tools();
        sled.name = "Sled"; //雪橇
        sled.price = "1000";
        Tools skates = new Tools();
        skates.name = "Skates"; //溜冰鞋
        skates.price = "2000";
        Preprocessing preprocessingLine = new Preprocessing();
        Skier Skier = new Skier();
        preprocessingLine.establishPipe(Skier);
        preprocessingLine.preprocess("skierA", sled, skates);
    }
}
