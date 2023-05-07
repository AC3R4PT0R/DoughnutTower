public class TestMyArrayList
{	
   public static void main(String argscheckUniform[])
    {
		String top = null;
		StackAsMyArrayList<String> myStack = new StackAsMyArrayList<String>();
		System.out.println("The Tower : []");
		System.out.println("Size :" + myStack.getStackSize());
		if(myStack.getStackSize() != 5){
		System.out.println("Tower is not full");
		}else{
			System.out.println("Tower is full");
		}
		myStack.push(new String("r"));
		myStack.push(new String("r"));
		myStack.push(new String("r"));
		myStack.push(new String("b"));
		myStack.push(new String("b"));
		System.out.println("\n");
		System.out.println("The Tower : " + myStack );
		System.out.println("Size :" + myStack.getStackSize());
		if(myStack.getStackSize() != 5){
		System.out.println("Tower is not full");
		}else if(myStack.checkStackUniform() == true){
			System.out.println("Tower is full and correct");
		}else {
			System.out.println("Tower is full and wrong");
		}
		for (int i = 0 ; i <= myStack.getStackSize()+4;i++){
			top = (String) myStack.pop();
		}
		myStack.push(new String("r"));
		myStack.push(new String("r"));
		myStack.push(new String("r"));
		System.out.println("\n");
		System.out.println("The Tower : " + myStack );
		System.out.println("Size :" + myStack.getStackSize());
		if(myStack.getStackSize() != 5){
		System.out.println("Tower is not full");
		}else if(myStack.checkStackUniform() == true){
			System.out.println("Tower is full and correct");
		}else {
			System.out.println("Tower is full and wrong");
		}
		for (int i = 0 ; i <= myStack.getStackSize()+4;i++){
			top = (String) myStack.pop();
		}
		myStack.push(new String("r"));
		myStack.push(new String("r"));
		myStack.push(new String("r"));
		myStack.push(new String("r"));
		myStack.push(new String("r"));
		System.out.println("\n");
		System.out.println("The Tower : " + myStack );
		System.out.println("Size :" + myStack.getStackSize());
		if(myStack.getStackSize() != 5){
		System.out.println("Tower is not full");
		}else if(myStack.checkStackUniform() == true){
			System.out.println("Tower is full and correct");
		}else {
			System.out.println("Tower is full and wrong");
		}
		
	}

}