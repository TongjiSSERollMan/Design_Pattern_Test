package valueobject;

import junit.framework.TestCase;
import org.junit.Test;

public class ValueObjectTest extends TestCase {
    @Test
    public void test(){
        System.out.println("Value Object Test BEGIN: ");
        HeroStat heroStatA1 = HeroStat.valueOf(9,8, 5);
        HeroStat heroStatA2 = HeroStat.valueOf(9, 8 ,5);
        HeroStat heroStatB = HeroStat.valueOf(2, 1, 1);
        System.out.println("[heroStatA1: strength=" + heroStatA1.getStrength() + ", intelligence=" +
                heroStatA1.getIntelligence() + ",luck=" + heroStatA1.getLuck() + "]");
        System.out.println("[heroStatA2: strength=" + heroStatA2.getStrength() + ", intelligence=" +
                heroStatA2.getIntelligence() + ",luck=" + heroStatA2.getLuck() + "]");
        System.out.println("[heroStatB: strength=" + heroStatB.getStrength() + ", intelligence=" +
                heroStatB.getIntelligence() + ",luck=" + heroStatB.getLuck() + "]");
        System.out.println("statA1 & statA2 Equality Test: " + heroStatA1.equals(heroStatA2));
        System.out.println("statA1 & statB Equality Test: " + heroStatA1.equals(heroStatB));
        System.out.println("Value Object Test END.");
    }
}
