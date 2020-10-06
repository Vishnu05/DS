//package Java.Junit.Junit5;
//
//import Java.Junit.Class.DependencyInjection.CalculatorImplements;
//import org.junit.Test;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class TestCases {
//
//    CalculatorImplements cal = new CalculatorImplements();
//  //  cals=new CalculatorImplements();
//
//    @BeforeEach
//    void init() {
//
//    }
//
//    @AfterEach()
//    void cleaningInstance() {
//        System.out.println(" Instance has been cleaned after each and every method execution");
//    }
//
//    @Test
//     void mulTest() {
//        assertEquals(4, cal.mul(2, 2), "Error not handled : ");
//    }
//
//    @Test
//    void subTest() {
//        assertEquals(5, cal.sub(10, 5), "Check the params");
//    }
//}
