package defaultpackage;

public class Application {

	public static void main(String[] args) {
		User user = new User
							.UserBuilder("Amar")
							.setMidName("kumar").
							setLastName("dixit").
							build();
		System.out.println(user.toString());
	}
}
