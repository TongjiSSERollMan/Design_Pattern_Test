package adapter;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Scanner;

public class AdapterTest extends TestCase {
    @Test
    public void test() {
        Adult man=new Adult(2.5);
        Child boy=new Child(1.3);
        Child shortBoy=new Child(0.8);
        Adult shortAdult=new Adult(1.4);
        Adult veryShortAdult = new Adult(0.3);
        Chair chair=new Chair();
        chair.sit(man);
        ChildAdapter boyAdapter=new ChildAdapter(boy);
        ChildAdapter shortBoyAdapter=new ChildAdapter(shortBoy);
        chair.sit(boyAdapter);
        chair.sit(shortBoyAdapter);
        chair.sit(shortAdult);;
        chair.sit(veryShortAdult);
    }

}