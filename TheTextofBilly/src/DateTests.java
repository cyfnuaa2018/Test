import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTests {
	@org.junit.jupiter.api.Test
	void test() {						//test the IsLegal,also the isDigits.
		Date pp = new Date();
		String s = "201X";
		assert(!pp.IsLegal(s));
		s = "2018";
		assert(pp.IsLegal(s));
	}
	@org.junit.jupiter.api.Test
	void test1() {						//test the Convert
		Date pp = new Date();
		pp.getchary("2018");
		pp.getcharm("0");
		pp.getchard("30");
		assert(pp.Convert());
		assert(pp.getyear() == 2018);
		assert(pp.getmonth() == 0);
		assert(pp.getdate() == 30);
	}
	@org.junit.jupiter.api.Test
	void test2() {						//test the IsLeapYear
		Date pp = new Date();
		pp.setyear(2018);
		assert(!pp.IsLeapYear());
		
		pp.setyear(1900);
		assert(!pp.IsLeapYear());
		
		pp.setyear(2012);
		assert(pp.IsLeapYear());
	}
	@org.junit.jupiter.api.Test
	void test3() {						//test the IsLegalMonth
		Date pp = new Date();
		pp.setmonth(0);
		assert(!pp.IsLegalMonth());
		
		pp.setmonth(12);
		assert(pp.IsLegalMonth());
	}
	@org.junit.jupiter.api.Test
	void test4() {						//test the IsLegalDate
		Date pp = new Date();
		pp.setyear(2018);
		pp.setmonth(1);
		pp.setdate(32);
		assert(!pp.IsLegalDate());
		
		pp.setyear(2018);
		pp.setmonth(4);
		pp.setmonth(31);
		assert(!pp.IsLegalDate());
		
		pp.setyear(2018);
		pp.setmonth(2);
		pp.setdate(29);
		assert(!pp.IsLegalDate());
		
		pp.setyear(2012);
		pp.setmonth(2);
		pp.setdate(29);
		assert(pp.IsLegalDate());	
	}
	
}
