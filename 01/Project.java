package se_01;

public class Project {

	private String[][] str;

	public Project(String[][] strings) {
		this.str = strings;
	}

	public boolean isWellSorted(String[] sequence) {
		String[] str2 = sequence;

		if (sequence.length == 0 || sequence.length == 1) {
			return false;
		}

		for (int i = 1; i < str2.length; i++) {
			if (sequence[i].indexOf(sequence[0]) >= 0) {
				return false;
			}
		}

		for (int i = 0; i < str2.length; i++) {
			for (int j = i; j < str2.length; j++) {
				for (int k = 0; k < this.str.length; k++) {
					if (this.str[k][0].equals(sequence[j]) && this.str[k][1].equals(sequence[i])) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
