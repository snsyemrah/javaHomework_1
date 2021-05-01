package homeworkKodlamaio;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "isimli kullanici eklendi.");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "isimli kullanici sistemden silindi.");
	}

	public void update(User user) {
		System.out.println(user.getUserName() + "isimli kullanicinin bilgileri guncellendi");
	}

}
