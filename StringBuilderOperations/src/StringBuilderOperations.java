
public class StringBuilderOperations {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("apple");
		System.out.println("Original: " + str);
		str.setCharAt(0, 'b');
		System.out.println("After replacement: " + str);
		System.out.println("Length: " + str.length());
		str.setLength(3);
		System.out.println("New length: " + str.length());
		System.out.println("After length change: " +  str);
		System.out.println("Capacity: " + str.capacity());
		str.insert(3, "abc");
		System.out.println("After insert: " + str);
		str.replace(0, 3, "def");
		System.out.println("After replacement: " + str);
		char[] charArray = new char[10];
		str.getChars(3, 5, charArray, 0);
		System.out.print
		("Character array: ");
		System.out.print(charArray);
	}

}