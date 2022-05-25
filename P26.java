//26	Create a Date class which consists of fields days, month, years. Include appropriate constructors and a method nextDay() which increments the day by 1 and then display the date in proper format ( day/ month/ year). Check the validity of date entered.	
class Date{
int dd, mm, yyyy;
int[] daysMonths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
Date nextDay(){
//23 march 2004
int rdd = dd, rmm = mm, ryyyy = yyyy;
if (dd + 1 > daysMonths[mm]){
	if (mm + 1 > 11){
		// yyyy++;
		ryyyy = yyyy + 1;
		// mm = 0;
		rmm = 0;
	}
	else {
		// mm++;
		rmm = mm + 1;
	}
	// dd = 1;
	rdd = 1;
} else {
	// dd++;
	rdd = dd + 1;
}
return new Date(rdd, rmm + 1, ryyyy);
}
boolean isLeapYear(int _yyyy){
boolean ret = false;
if (_yyyy % 400 == 0){
	ret = true;
} else if (_yyyy % 100 == 0){
	ret = false;
} else if (_yyyy % 4 == 0){
	ret = true;
} else {
	ret = false;
}
return ret;
}
boolean isValidDate(int _dd, int _mm, int _yyyy) throws Exception{
boolean ret = false;
if (isLeapYear(_yyyy)){
	daysMonths[1] = 29;
}

if (_dd > daysMonths[_mm]){
	throw new Exception("Too many days!");
}

return ret;
}
Date(){
dd = mm = yyyy = -1;
}
Date(int _dd, int _mm, int _yyyy){
dd = _dd;
mm = _mm - 1;
yyyy = _yyyy;


try{
	isValidDate(dd, mm, yyyy);
} catch (Exception e){
	System.out.println(e);
	System.exit(1);
}

}
public String toString(){
return dd + "/" + (int)(mm + 1) + "/" + yyyy;
}
}
class P26{

public static void main(String args[]){
Date d = new Date(30,12,1904);
System.out.println(d);
Date n = d.nextDay();
while(true){
	try{
		Thread.sleep(500);
		System.out.println("Next day:: " + n);
		n = n.nextDay().nextDay();
	} catch (Exception e){}
}
}
}