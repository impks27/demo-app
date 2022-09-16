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
	
	// Added for testing - Start
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter Username"); 
	String user = sc.nextLine();

	String user_path = ".\\Data\\"+user;

	File file = new File(user_path);

	try {
	    String comm = "cmd.exe /c dir "+user_path;
	    Process process = Runtime.getRuntime().exec(comm);
	    BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));

	    String s = null;
	    while ((s = stdInput.readLine()) != null) {
		System.out.println(s);
	    }
	}
	catch (IOException e) {
	    System.out.println("Error executing command");
	}
	// Added for testing - End
  }
}
