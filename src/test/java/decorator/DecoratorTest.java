package decorator;

import junit.framework.TestCase;
import org.junit.Test;

public class DecoratorTest extends TestCase {
    @Test
    public void testDecorator() {
        VisitPackage visitPackage = new Ticket();

        VisitPackage baseDecorator = new BaseDecorator(visitPackage);
        System.out.println("BaseDecorator: " + baseDecorator.getPrice() + baseDecorator.getContent());

        VisitPackage bumperCarDecorator = new BumperCarDecorator(baseDecorator);
        System.out.println("BumperCarDecorator: " + bumperCarDecorator.getPrice() + bumperCarDecorator.getContent());

        VisitPackage iceSculptureExhibitionDecorator = new IceSculptureExhibitionDecorator(bumperCarDecorator);
        System.out.println("IceSculptureExhibitionDecorator: " + iceSculptureExhibitionDecorator.getPrice() + iceSculptureExhibitionDecorator.getContent());

        VisitPackage rollerCoasterDecorator = new RollerCoasterDecorator(iceSculptureExhibitionDecorator);
        System.out.println("RollerCoasterDecorator: " + rollerCoasterDecorator.getPrice() + rollerCoasterDecorator.getContent());
    }
}
