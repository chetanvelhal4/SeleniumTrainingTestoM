package arithmaticOperator;
import java.util.Scanner;


public class ConvertTempratureReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner newscano = new Scanner(System.in);
System.out.println("Enter current temprature ");
float temp = newscano.nextFloat();

float F = (float) (temp * 1.8) + 32;

System.out.println(+temp +"Celcious ="+F +" Fahrenheit");

Float K = temp +273;

System.out.println(+temp +"Celcious ="+ K +" Fahrenheit"); 
		
	}

}
