package arithmetic.numbers;

import java.util.ArrayList;
import java.util.List;

import arithmetic.utils.AddUtils;
import arithmetic.utils.MultiplicationUtils;
import arithmetic.utils.SubtractUtils;

public final class DynamicNumber {

	private List<Character> number = new ArrayList<>();

	private int sizeRightOfPoint;
	private int sizeLeftOfPoint;
	private int origin;
	
	public DynamicNumber(DynamicNumber number) {
		this.number = new ArrayList<>(number.getNumber());
		this.sizeLeftOfPoint = number.sizeLeftOfPoint;
		this.sizeRightOfPoint = number.sizeRightOfPoint;
		calculateSizes();
	}

	public DynamicNumber(String value) {
		for (int i = 0; i < value.length(); i++) {
			number.add(value.charAt(i));
		}
		calculateSizes();
	}
	
	public DynamicNumber(List<Character> number) {
		this.number = number;
		calculateSizes();
	}

	private void calculateSizes() {
		sizeRightOfPoint = 0;
		sizeLeftOfPoint = 0;
		if (number.contains('.')) {
			origin = number.indexOf('.');
			for (int i = origin + 1; i < number.size(); i++) {
				sizeRightOfPoint++;
			}

			for (int i = origin; i > 0; i--) {
				sizeLeftOfPoint++;
			}
		} else {
			sizeRightOfPoint = 0;
			sizeLeftOfPoint = number.size();
			origin = number.size() - 1;
		}
		
		if (number.contains('.') && sizeRightOfPoint == 0) {
			number.remove(number.size() - 1);
		}
	}

	public DynamicNumber add(String value) {
		number = AddUtils.add(this, new DynamicNumber(value), '\0');
		calculateSizes();
		return this;
	}
	
	public DynamicNumber add(DynamicNumber value) {
		number = AddUtils.add(this, new DynamicNumber(value), '\0');
		calculateSizes();
		return this;
	}
	
	public DynamicNumber add(List<Character> value) {
		number = AddUtils.add(this, new DynamicNumber(value), '\0');
		calculateSizes();
		return this;
	}
	
	public DynamicNumber subtract(String value) {
		number = SubtractUtils.subtract(this, new DynamicNumber(value), '\0');
		calculateSizes();
		return this;
	}
	
	public DynamicNumber multiply(String value) {
		number = MultiplicationUtils.multiply(this, new DynamicNumber(value));
		calculateSizes();
		return this;
	}

	public List<Character> getNumber() {
		return number;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Character character : number) {
			sb.append(character);
		}
		return sb.toString();
	}
	
	public void println() {
		System.out.println("Value=" + toString());
	}

	public int getSizeLeftOfPoint() {
		return sizeLeftOfPoint;
	}

	public int getOrigin() {
		return origin;
	}

	public int getSizeRightOfPoint() {
		return sizeRightOfPoint;
	}
}
