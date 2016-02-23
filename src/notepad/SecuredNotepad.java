package notepad;

public class SecuredNotepad extends ElectronicSecuredNotepad {

	private String password;
	public boolean isNotepadSecured = false;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean checkPassword(String password) {
		if (password.equals(this.password)) {
			return true;
		} else
			return false;
	}

//	public void secureNotepadEnabled() {
//		isNotepadSecured = true;
//	}

	public void togglePasswordMode() {
		if (isNotepadSecured) {
			isNotepadSecured = false;
		} else {
			isNotepadSecured = true;
		}
	}
}
