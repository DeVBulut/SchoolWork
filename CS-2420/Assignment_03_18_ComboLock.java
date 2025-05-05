import java.util.Random;

public class Assignment_03_18_ComboLock {

	private int[] combinationArray = new int[3]; 
	public Assignment_03_18_ComboLock() {
		//TODO - the code should be set to 0,0,0
		for (int i : combinationArray) {
			combinationArray[i] = 0;
		}
	}

	public Assignment_03_18_ComboLock(int num1, int num2, int num3) {
		//TODO the three numbers provided should be the combo
		for (int i : combinationArray) {
			switch (i) {
				case 1:
					combinationArray[i] = num1;
					break;
				case 2:
					combinationArray[i] = num2;
					break;
				case 3:
					combinationArray[i] = num3;
					break;
			}
		}
	}

	public boolean open(int num1, int num2, int num3) {
		//TODO This method should return true if the three number above match the current combo - false otherwise
		for (int i : combinationArray) {
			switch (i) {
				case 1:
					if(combinationArray[i] != num1){return false;};
					break;
				case 2:
					if(combinationArray[i] != num2){return false;};
					break;
				case 3:
					if(combinationArray[i] != num3){return false;};
					break;
			}
		}
		return true;
	}

	public boolean changeCombo(int num1, int num2, int num3, int newNum1, int newNum2, int newNum3) {
		//TODO This method should return true AND change the combo to the new 3 numbers if the first 3 numbers match the current combo - false otherwise
		if(open(num1, num2, num3)){

			for (int i : combinationArray) {
				switch (i) {
					case 1:
						combinationArray[i] = newNum1;
						break;
					case 2:
						combinationArray[i] = newNum2;
						break;
					case 3:
						combinationArray[i] = newNum3;
						break;
					}
			}
			return true;
		}
		return false;
	}

}
