package homeworkKodlamaio;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() +" "+ student.getLastName() +" "+ "isimli" +" "+ student.getSchool()
				+" "+ "okulundaki ogrenci sisteme eklenmistir.");
	}

	public void changeTheDepertman(Student student) {
		System.out.println(student.getUserName() + "kullanici isimli ogrencinin bolumu" + student.getDepertman()
				+ "olarak degistirilmistir.");
	}
}
