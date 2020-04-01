package thisisapackage;

public class thisisaclass {

	public thisisaclass() {
		System.out.println("Yes, I am a class");
		System.out.println("And you just made the laziest object ever...");
	}
	
	public void ThisDoesNothing() {
	}
	
	public void ThisOneCallsTheMethodThatDoesNothing() {
		//but still it does nothing
		ThisDoesNothing();
	}
	
	public void ItWritesNothingAnEmptyString() {
		System.out.println("");
	}
	
	public void WasteResourcesAsMuchAsICan()
	{
		System.out.println("Yeah, we do nuffin");
	}

}
