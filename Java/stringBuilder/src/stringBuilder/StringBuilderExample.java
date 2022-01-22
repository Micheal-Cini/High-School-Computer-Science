package stringBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		// Lesson StringBuilder Class

		String firstName=new String("Micheal");
		StringBuilder lastName=new StringBuilder("Cini");
		lastName.append(" loves Comp Sci");
		System.out.println(lastName);
		lastName.insert(2,"HERE");
		System.out.println(lastName);
		System.out.println(lastName.capacity());
		System.out.println(lastName.length());
	}

}
