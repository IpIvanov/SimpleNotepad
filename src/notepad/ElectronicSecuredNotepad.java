package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {

	public ElectronicSecuredNotepad(String name, int pages) {
		super(name, pages);
	}

	private boolean notepadStage;

	@Override
	public void startNotepad() {
		notepadStage = true;
	}

	@Override
	public void stopNotepad() {
		notepadStage = false;
	}

	@Override
	public boolean isStarted() {
		return notepadStage;
	}

}
