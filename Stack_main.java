package Assignment1;

import java.util.Scanner;

public class Stack_main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Stack_Example obj = new Stack_Example();
		System.out.println("Enter size");
		int size = in.nextInt();
		obj.create_Stack1(size);
		int ch, e;
		do {
			System.out.println("Stack Menu");
			System.out.println("-----------");
			System.out.println("1.Push 1");
			System.out.println("2.Pop 1");
			System.out.println("3.Peek 1");
			System.out.println("4.Stack 1 is empty");
			System.out.println("5.Push 2");
			System.out.println("6.Pop 2");
			System.out.println("7.Peek 2");
			System.out.println("8.Stack 2 is empty");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice:");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				if (obj.is_Full() != true) {
					System.out.println("Enter a number:");
					e = in.nextInt();
					obj.push1(e);
				} else {
					System.out.println("Stack Full");
				}
				break;
			case 2:
				if (obj.is_Empty() != true) {
					System.out.println("Element poped is " + obj.pop1());
				} else {
					System.out.println("Stack Empty");
				}
				break;
			case 3:
				if (obj.is_Empty() != true) {
					System.out.println("Element @peek is " + obj.peek1());
				} else {
					System.out.println("Stack Empty");
				}
				break;
			case 4:
				System.out.println("stack is empty :" + obj.is_Empty());
				break;
			case 5:
				if (obj.is_Full() != true) {
					System.out.println("Enter a number:");
					e = in.nextInt();
					obj.push2(e);
				} else {
					System.out.println("Stack Full");
				}
				break;

			case 6:
				if (obj.is_Empty2() != true) {
					System.out.println("Element poped is " + obj.pop1());
				} else {
					System.out.println("Stack Empty");
				}
				break;

			case 7:
				if (obj.is_Empty2() != true) {
					System.out.println("Element @peek is " + obj.peek2());
				} else {
					System.out.println("Stack Empty");
				}
				break;

			case 8:
				System.out.println("Stacj is empty : " + obj.is_Empty());

				break;
			case 0:
				System.out.println("Thanks for using code ");
				break;
			default:
				System.out.println("Wrong option selsected:");
				break;
			}
		} while (ch != 0);

	}
}
