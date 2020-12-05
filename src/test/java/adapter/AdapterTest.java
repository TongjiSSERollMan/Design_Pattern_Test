package adapter;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Scanner;

public class AdapterTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test adapter:");
        Adult man=new Adult(2.5);
        Child boy=new Child(1.3);
        Child shortBoy=new Child(0.8);
        Adult shortAdult=new Adult(1.4);
        Adult veryShortAdult = new Adult(0.3);
        Chair chair=new Chair();
        System.out.println("A man sit:");
        chair.sit(man);
        ChildAdapter boyAdapter=new ChildAdapter(boy);
        ChildAdapter shortBoyAdapter=new ChildAdapter(shortBoy);
        System.out.println("A boy sit:");
        chair.sit(boyAdapter);
        System.out.println("A short boy sit:");
        chair.sit(shortBoyAdapter);
        System.out.println("A short adult sit:");
        chair.sit(shortAdult);
        System.out.println("A very short adult sit:");
        chair.sit(veryShortAdult);
    }

}