package converter;

import junit.framework.TestCase;
import org.junit.Test;

public class ConverterTest extends TestCase {
    @Test
    public void test(){

        Converter<MembershipDto,Membership> membershipConverter =
                new MembershipConverter();
        MembershipDto membershipDto =
                new MembershipDto(
                        "first Name",
                        "last Name",
                        true,
                        "username@email.com");

        System.out.println(membershipDto.toString());
        Membership membership =
                membershipConverter.convertFromDto(membershipDto);
        System.out.println(membership.toString());
    }
}
