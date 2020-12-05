package memento;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MementoTest extends TestCase {
    private final Pattern linePattern = Pattern.compile("([012]\\s)");
    /**
     * 测试输出
     */
    @Test
    public void testShow() {
        GamePlayer gamePlayer = new GamePlayer();
        String board = gamePlayer.showBoard();
        String[] words = board.split("\\s+");
        assertEquals("1", words[4 * 12 + 4 + 1]);
        assertEquals("0", words[5 * 12 + 5 + 1]);
        System.out.println("testShow");
        System.out.println(gamePlayer.showBoard());
    }

    /**
     * 测试落子
     */
    @Test
    public void testPlay() {
        GamePlayer gamePlayer = new GamePlayer();
        gamePlayer.play();
        String board = gamePlayer.showBoard();
        String[] words = board.split("\\s+");
        assertEquals("0", words[4 * 12 + 4 + 1]);
        assertEquals("1", words[5 * 12 + 5 + 1]);
        System.out.println("testPlay");
        System.out.println(gamePlayer.showBoard());
    }

    @Test
    public void testRestart() {
        GamePlayer gamePlayer = new GamePlayer();
        gamePlayer.play();
        gamePlayer.restart();
        String board = gamePlayer.showBoard();
        String[] words = board.split("\\s+");
        assertEquals("1", words[4 * 12 + 4 + 1]);
        assertEquals("0", words[5 * 12 + 5 + 1]);
        System.out.println("testRestart");
        System.out.println(gamePlayer.showBoard());
    }
}
