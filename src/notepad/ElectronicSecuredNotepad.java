package notepad;

public class ElectronicSecuredNotepad implements I�lectronicDevice {

	public boolean notepadStage;

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
		if (notepadStage) {
			return true;
		} else
			return false;
	}

}
