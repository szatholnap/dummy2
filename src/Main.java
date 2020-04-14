import thisisapackage.thisisaclass;

/**
 * 
 */

/**
 * @author user
 *
 */
public class Main {

	public static thisisaclass ReturnMyClass() {
		return new thisisaclass();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		thisisaclass thisisanobject = ReturnMyClass();
		thisisanobject.ThisDoesNothing();
		thisisanobject.ThisOneCallsTheMethodThatDoesNothing();
		thisisanobject.WasteResourcesAsMuchAsICan();
		thisisanobject.WasteResourcesAsMuchAsICan();
		thisisanobject.ItWritesNothingAnEmptyString();

	}

}
