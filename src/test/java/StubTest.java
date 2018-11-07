import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StubTest {
    //The Stub test.
    @Test
    void stubtest() {			//Stub A
        Date dd = new Date();
        dd.getchary("2018");
        dd.getcharm("0");
        dd.getchard("2018");
        if(true) {
            dd.setyear(dd.ConvertCharstoInteger(dd.y));
            dd.setmonth(dd.ConvertCharstoInteger(dd.m));
            dd.setdate(dd.ConvertCharstoInteger(dd.d));
            assertEquals(dd.getyear(),2018);
            assertEquals(dd.getmonth(),0);
            assertEquals(dd.getdate(),2018);
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
    @Test
    void stubtest2() {				//Stub B
        Date dd = new Date();
        dd.setyear(2018);
        dd.setmonth(2);
        dd.setdate(29);
        Integer [] big = new Integer[] {1, 3, 5, 7, 8, 10, 12};
        Integer [] small = new Integer [] {4, 6, 9, 11};
        Integer [] special = new Integer [] {2};
        List<Integer> list = Arrays.asList(big);
        if(list.contains(dd.getmonth())) {
            if(dd.getdate() >=0 && dd.getdate() <= 31)
                System.out.println("true");
            else
                System.out.println("false");
        }
        list = Arrays.asList(small);
        if(list.contains(dd.getmonth())) {
            if(dd.getdate() >=0 && dd.getdate() <= 30)
                System.out.println("true");
            else
                System.out.println("false");
        }
        list = Arrays.asList(special);
        if(list.contains(dd.getmonth())) {
            if(dd.IsLeapYear()) {
                if(dd.getdate() >= 0 && dd.getdate() <= 29)
                    System.out.println("true");
                else
                    System.out.println("false");
            }
            else {
                if(dd.getdate() >= 0 && dd.getdate() <= 28)
                    System.out.println("true");
                else
                    System.out.println("false");
            }
        }
    }
    @Test						//Stub C
    void max_stubtest3() {			//public static int max(final int... array)
        //validateArray(array)		//Set the return value true. It means that the array is always valid.
        int [] array = {3,7,2,8,9,2,0,0};
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        assertEquals(max,9);
    }
}