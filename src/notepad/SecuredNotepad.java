package notepad;

public class SecuredNotepad extends SimpleNotepad {

	public SecuredNotepad(String name, int pages) {
		super(name, pages);
	}

	private String password;
	private boolean isNotepadSecured = true;

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean checkPassword(String password) {
		if (password.equals(this.password)) {
			return true;
		} else {
			return false;
		}
	}

	public void togglePasswordMode() {
		isNotepadSecured = !isNotepadSecured;
	}

	public boolean getNotepadSecureState() {
		return isNotepadSecured;
	}

	public static boolean checkIfStrongPass(String password) {
		char ch;
		int lowerCaseLetters = 0;
		int upperCaseLettesrs = 0;
		int digits = 0;
		for (int i = 0; i < password.length(); i++) {
			ch = password.charAt(i);
			if (Character.isLowerCase(ch)) {
				lowerCaseLetters++;
			} else if (Character.isUpperCase(ch)) {
				upperCaseLettesrs++;
			} else if (Character.isDigit(ch)) {
				digits++;
			}
		}
		if (password.length() >= 5 && lowerCaseLetters >= 1 && upperCaseLettesrs >= 1 && digits >= 1) {
			return true;
		} else {
			return false;
		}
	}
}
