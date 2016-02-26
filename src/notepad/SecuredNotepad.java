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
}
