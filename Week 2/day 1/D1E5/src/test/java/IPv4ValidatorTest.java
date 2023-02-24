import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validator.IPv4Validator;


class IPv4ValidatorTest {
    private IPv4Validator ipValidator = new IPv4Validator();

    @Test
    void test1(){
        assertTrue(ipValidator.validateIpv4Address("1.1.1.1"));
    }
    @Test
    public void test2() {
        assertFalse(ipValidator.validateIpv4Address("10.0.1"));
    }

    @Test
    public void test3() {

        assertFalse(ipValidator.validateIpv4Address("192.168.1.1.1"));
    }

    @Test
    public void test4() {

        Assertions.assertFalse(ipValidator.validateIpv4Address("192.168.1.256"));
    }

    @Test
    public void test5() {
        assertFalse(ipValidator.validateIpv4Address("192.168.1.-1"));
    }

    @Test
    public void test6() {
        assertFalse(ipValidator.validateIpv4Address("0.0.0.0"));
    }

    @Test
    public void test7() {
        assertFalse(ipValidator.validateIpv4Address("255.255.255.255"));
    }

}