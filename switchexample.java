package day8;

import java.util.Scanner;

public class switchexample {
void add() {
	System.out.println("add employee");}
void display() {
	System.out.println("display employee");
}
void update() {
	System.out.println("update employee");
}
void exit() {
	
}
	public static void main(String[] args) {
		System.out.println("1 add employee");
		System.out.println("2 display employee");
		System.out.println("3 update employee");
		System.out.println("4 exit");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		switchexample e=new switchexample();
		switch(choice)
		{
		case 1: e.add();
		break;
		case 2: e.display();
		break;
		case 3: e.update();
		break;
		default: System.out.println("wrong choice");
		break;
		}
				

	}

}
