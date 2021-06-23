public class ArrayStackChar{
	private char[] stck = new char[26];
	private int lst; // the last element in a stack
		
		
	public ArrayStackChar()
	{
		lst=0; // intialising the last elelment in a stack with zero, indicating that the stack is empty
	}
	
	// an integer type method that returns the number of elements stored on the stack
	public int getHeight(){
		return lst;
	}
	
	// a boolean type method that returns true if stack is empty, else false is returned
	public boolean isEmpty()
	{
		return lst==0;
	}
	
	// this method does not return anything, but places the integer element on the stack
	public void push(char item)
	{
		if (lst == stck.length)
		{
			System.out.println("OVERFLOW - STACK is full.");
		}
		else
		{
			stck[lst] = item;
			lst +=1;
		}
	}
	
	// an integer type method that removes the top element from the stack
	public char pop()
	{
		char itm='-';
		if (lst==0)
		{
			System.out.println("UNDERFLOW - STACK is empty.");
		}
		else
		{
			lst = lst - 1;
			itm = stck[lst];

		}
		return itm;
	}
	
	//a method that displays the contents of the stack from the top element to the first element placed on the stack
	public void display()
	{
		if (!isEmpty())
		{
			for (int i=(lst-1); i>=0; i--)
			{
				System.out.println("item"+i+" >> "+stck[i]);
				
			}
		System.out.println("END OF STACK");
		}
		else{
			System.out.println("Stack is empty - nothing to display");
		}
	}
	
	// an integer type method that reveals the top element on the stack without removing it from the stack
	public char head()
	{
		char itm='-';
		if (lst==0)
		{
			System.out.println("UNDERFLOW - STACK is empty.");
		}
		else
		{
			itm = stck[lst-1];
		}
		return itm;
	}

		public static void main(String[] args)
	{
		ArrayStackChar  object = new ArrayStackChar();
		for(char k='a'; k<'f';k++)
		{
			object.push(k);
		}
		System.out.println("before poping");
		object.display();
		for (int b =1; b>=0 ; b--)
		{
			object.pop();
		}
		System.out.println("after poping");
		object.display();
		System.out.println("head"+object.head());
		System.out.println("after"+object.getHeight());
		//System.out.print("is an array empty?" + object.isEmpty());
		
	}

	
	

	
}
