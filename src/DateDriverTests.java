import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.NumberUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;

class DateDriverTests {
	//The Driver part.
	@Test
	void drivertest() {			//Driver A
		Date dd = new Date();
		dd.getchary("201X");
		dd.getcharm("12");
		dd.getchard("39");
		assert(!(dd.IsLegal(dd.y)&&dd.IsLegal(dd.m)&&dd.IsLegal(dd.d)));
		dd.getchary("20133");
		dd.getcharm("23");
		dd.getchard("  ");
		assert(!(dd.IsLegal(dd.y)&&dd.IsLegal(dd.m)&&dd.IsLegal(dd.d)));
	}
	@Test
	void drivertest2() {		//Driver B
		Date dd = new Date();
		dd.setyear(2012);
		assert(dd.IsLeapYear());
		dd.setyear(2014);
		assert(!dd.IsLeapYear());
		dd.setyear(2000);
		assert(dd.IsLeapYear());
		dd.setyear(1900);
		assert(dd.IsLeapYear());
	}
	@Test
	void drivertest3() {		//Driver C
		NumberUtils num = new NumberUtils();
		String s = "123";
		assert(num.isDigits(s));
		s = "1X";
		assert(!num.isDigits(s));
	}
	@Test						//Driver D  apache commons function isNumeric()
	void validdrivertest() {			//the driver of the isNumeric(),also is the isDigits()
		String str = "12345";			//as the factor
		StringUtils str0 = new StringUtils();
		assert(str0.isNumeric(str));
	}
}
