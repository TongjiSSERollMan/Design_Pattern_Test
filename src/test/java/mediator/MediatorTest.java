package mediator;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

public class MediatorTest extends TestCase {
    private final PrintStream originalSystemOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    /**
     * 测试单实例
     */
    @Test
    public void testOne() {
        System.setOut(new PrintStream(outputStream));

        TourGroup tourGroup = new TourGroupImpl();
        GroupMember son = new Son("SON");
        tourGroup.addMember(son);
        Pattern addMemberPattern = Pattern.compile("GroupMemberBase:getInstance:\\(.*\\): Son\\(SON\\) joins the tour group");
        assertTrue(addMemberPattern.matcher(outputStream.toString().trim()).matches());
        outputStream.reset();

        son.act(Action.TOILET);
        Pattern actPattern = Pattern.compile("GroupMemberBase:getInstance:\\(.*\\): Son\\(SON\\) wants to go to the toilet\\.");
        assertTrue(actPattern.matcher(outputStream.toString().trim()).matches());
        System.setOut(originalSystemOut);
    }

    /**
     * 测试多实例
     */
    public void testAll() {
        System.out.println("testAll");
        GroupMember father = new Father("FATHER");
        GroupMember mother = new Mother("MOTHER");
        GroupMember son = new Son("SON");
        GroupMember otherSon = new Son("SON");
        GroupMember tourGuide = new TourGuides("GUIDE");

        TourGroup tourGroup = new TourGroupImpl();

        tourGroup.addMember(father);
        tourGroup.addMember(mother);
        tourGroup.addMember(son);
        tourGroup.addMember(otherSon);
        tourGroup.addMember(tourGuide);

        tourGuide.act(Action.TOUR);
        mother.act(Action.WANDER);
    }


}
