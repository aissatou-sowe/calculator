package calculator;

import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {

        calculator  calculator;
        @Before
        public void setUip() throws Exception{
        calculator=new calculator();
    }

        @Test
        public void testsub() {
        int resultat=calculator.sub(2,2);
        if(resultat !=4){
                Assert.fail();
            }



    }

        @Test
        public void minus() {

        Assert.assertEquals(0, calculator.minus(2,2));
    }

        @Test
        public void multiply() {
        Assert.assertEquals(4, calculator.multiply(2,2));
    }

      /*  @Test
        public void divide() {
        int result= (int) calculator.divide(6,3);
        Assert.assertEquals(2,result);
    }
        @Test(expected = ArithmeticException.class)
        public void divideWiththrowExeption() {
        calculator.divide(6,2);
    }*/
    @Test
    public void testdivide(){
     int   result=calculator.divide(8,2);
        if(result !=4){
            Assert.fail();
        }
    }

        @Test
        public void min() {
        int min=calculator.min(10,20);
        if (min !=10) Assert.fail();
    }

        @Test
        public void max() {
        int max=calculator.max(2000,-2000);
        Assert.assertEquals(2000,max);

    }

        @Test
        public void minElement() {
        int tab[]={
                2,4,6,7
        };
        int a=calculator.minElement(tab);
        Assert.assertEquals(2,a);

    }
        @Test
        public void maxElement(){
        int tab[]={
                2,4,7,8
        };
        int a =calculator.maxElement(tab);
        Assert.assertEquals(8,a);

    }

}