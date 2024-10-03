import java.util.Scanner;
public class Main2{

public static void main(String [] args){

System.out.println("Please type your name");
Scanner scanner = new Scanner(System.in);
String name =  scanner.nextLine();
System.out.println("Hello" +" "+  name + "! Please type your age"+"." );
int age = Integer.parseInt(scanner.nextLine());
System.out.println("your age is" + " " + age);
int retireAge;

retireAge = 67-age;
System.out.println("You have "+retireAge + " " + "years" + " " + "until retirment");	









}



}