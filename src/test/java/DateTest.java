import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @org.junit.jupiter.api.Test
    void test() { // test the IsLegal,also the isDigits.
        Date pp = new Date();
        String s = "201X";
        if (!pp.IsLegal(s))
            pp.gettips();
        s = "2018";
        assert (pp.IsLegal(s));
        if(pp.ConvertCharstoInteger(s) != 2018)
            assert(false);
    }

    @org.junit.jupiter.api.Test
    void test1() { // test the Convert
        Date pp = new Date();
        pp.getchary("2018");
        pp.getcharm("0");
        pp.getchard("30");
        pp.Convert();
        assert (pp.getyear() == 2018);
        assert (pp.getmonth() == 0);
        assert (pp.getdate() == 30);

        pp.getchary("20X");
        if (pp.Convert())
            assert(false);
        pp.getchary("2018");
        pp.getcharm("X");
        if (pp.Convert())
            assert(false);
        pp.getchary("2018");
        pp.getcharm("2");
        pp.getchard("3X");
        if (pp.Convert())
            assert(false);
        pp.gettips();
    }

    @org.junit.jupiter.api.Test
    void test2() { // test the IsLeapYear
        Date pp = new Date();
        pp.setyear(2018);
  //      if(pp.IsLeapYear())
  //          assert(false);
        assert(!pp.IsLeapYear());

        pp.setyear(1900);
    //    if(!pp.IsLeapYear()) // wrong test
    //        assert(false);
        assert(pp.IsLeapYear());

        pp.setyear(2012);
     //   if(!pp.IsLeapYear())
     //       assert(false);
        assert(pp.IsLeapYear());

        pp.setyear(2000);
   //     if(!pp.IsLeapYear())
   //         assert(false);
        assert(pp.IsLeapYear());
    }

    @org.junit.jupiter.api.Test
    void test3() { // test the IsLegalMonth
        Date pp = new Date();
        pp.setmonth(0);
        if(pp.IsLegalMonth())
            assert(false);

        pp.setmonth(12);
        if(!pp.IsLegalMonth())
            assert(false);

        pp.setmonth(13);
        if(pp.IsLegalMonth())
            assert(false);
    }

    @org.junit.jupiter.api.Test
    void test4() { // test the IsLegalDate
        Date pp = new Date();
        pp.setyear(2018);
        pp.setmonth(1);
        pp.setdate(32);
        if (!pp.IsLegalDate())
            pp.getfalse();
        else
            pp.gettrue();

        pp.setyear(2018);
        pp.setmonth(1);
        pp.setdate(25);
        if (!pp.IsLegalDate())
            pp.getfalse();
        else
            pp.gettrue();

        pp.setyear(2018);
        pp.setmonth(4);
        pp.setdate(31);
        if (!pp.IsLegalDate())
            pp.getfalse();
        else
            pp.gettrue();

        pp.setyear(2018);
        pp.setmonth(4);
        pp.setdate(20);
        if (!pp.IsLegalDate())
            pp.getfalse();
        else
            pp.gettrue();

        pp.setyear(2018);
        pp.setmonth(2);
        pp.setdate(29);
        if (!pp.IsLegalDate())
            pp.getfalse();
        else
            pp.gettrue();

        pp.setyear(2018);
        pp.setmonth(2);
        pp.setdate(28);
        if (!pp.IsLegalDate())
            pp.getfalse();
        else
            pp.gettrue();

        pp.setyear(2012);
        pp.setmonth(2);
        pp.setdate(29);
        if (!pp.IsLegalDate())
            pp.getfalse();
        else
            pp.gettrue();

        pp.setyear(2012);
        pp.setmonth(2);
        pp.setdate(30);
        if (!pp.IsLegalDate())
            pp.getfalse();
        else
            pp.gettrue();
    }
}