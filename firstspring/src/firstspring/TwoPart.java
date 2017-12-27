package firstspring;

public class TwoPart {
				
			   public static void main(String[] args) {
			      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			      helloWorld obj = (helloWorld) context.getBean("helloWorld");
			      obj.getMessage();
			   }
		}

	
