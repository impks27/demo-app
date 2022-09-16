package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
	String abc,def,ghi;
	int a, b;
	LocalTime currentTime = new LocalTime();
	System.out.println("The current local time is: " + currentTime);

	Greeter greeter = new Greeter();
	System.out.println(greeter.sayHello());
	  
	short bytesRec = 0;
	char buf[123456];

	while(bytesRec < 123456789) {
	  bytesRec += getFromInput();
	}
  }
	
  def getFromInput(buf,bytesRec) {
	  return buf + bytesRec
  }
}
