package test;

import org.junit.Test;
import questions.SingleNumbeIII;

import static org.junit.Assert.*;

public class SingleNumbeIIITest {



    @Test
    public void singleNumber() throws Exception {
        SingleNumbeIII runner = new SingleNumbeIII();
        int[] input ={1,2,1,3,2,5};
        int[] singleNumbers = runner.singleNumberHard(input);
        for (int singleNumber : singleNumbers) {
            System.out.println(singleNumber);
        }
        int[] expected = {5, 3};
        assertArrayEquals(expected, singleNumbers);
    }

}