package Assignment1;

public class Stack_Example {
	private int stack1[],Maxsize, tos1, tos2;

	public void create_Stack1(int size) {
		tos1 = -1;
		stack1 = new int[size];
		Maxsize = size;
		tos2 = Maxsize;
	}
	
	void push1(int e) {
		tos1++;
		stack1[tos1] = e;
	}

	void push2(int e) {
		tos2--;
		stack1[tos2] = e;
	}

	boolean is_Full() {
		if (tos1 == Maxsize - 1)
			return true;
		else
			return false;
	}

	int pop1() {
		int temp = stack1[tos1];
		tos1--;
		return (temp);
	}

	int pop2() {
		int temp = stack1[tos1];
		tos2++;
		return (temp);
	}

	boolean is_Empty() {
		if (tos1 == -1)
			return true;
		else
			return false;
	}

	boolean is_Empty2() {
		if (tos2 == Maxsize - 1)
			return true;
		else
			return false;
	}

	int peek1() {

		return (stack1[tos1]);
	}

	int peek2() {

		return (stack1[tos2]);
	}

	void print_Stack1() {
		for (int i = tos1; i >= 0; i--) {
			System.out.println(stack1[i]);
		}
	}

	void print_Stack2() {
		for (int i = tos2; i >= 0; i--) {
			System.out.println(stack1[i]);
		}
	}

}
