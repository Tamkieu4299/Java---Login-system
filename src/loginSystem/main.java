package loginSystem;

public class main {

	public static void main(String[] args) {
		IDandPasswords idandPasswords = new IDandPasswords();
		
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

	}

}
