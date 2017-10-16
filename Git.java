package se1_02;

public class Git {
	private String[][] str;

	public void Git_Project(String[][] strings) {
		this.str = strings;
	}

	public boolean isWellSorted(String[] sequence) {
		if (sequence.length == 0 || sequence.length == 1) {
			return false;
		}
		for (int i = 1; i < sequence.length; i++) {
			if (sequence[i].indexOf(sequence[0]) >= 0) {
				return false;
			}
		}
		return false;
	}
}