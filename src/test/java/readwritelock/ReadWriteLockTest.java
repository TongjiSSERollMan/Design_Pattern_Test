package readwritelock;

import junit.framework.TestCase;
import org.junit.Test;

public class ReadWriteLockTest extends TestCase{

    @Test
    public void test() {
        Film film = new Film("film1");
        AudienceThread audience1= new AudienceThread(film,"audience1");
        AudienceThread audience2= new AudienceThread(film,"audience2");
        RepairManThread repairMan= new RepairManThread(film);
        audience1.start();
        audience2.start();
        repairMan.start();
        try {
            audience1.join();
            audience2.join();
            repairMan.join();
        }
        catch ( InterruptedException e){
            e.printStackTrace();
        }
    }

}
