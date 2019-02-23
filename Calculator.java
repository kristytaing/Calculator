package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * Returns the current total
	 * 
	 * @return the current total 
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * Adds the parameter to the total
	 * 
	 * @param value amount to be added to the total
	 */
	public void add (int value) {
		total += value;
	}
	
	/*
	 * Subtracts a value from the total
	 * 
	 * @param value amount to be added to the total
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/*
	 * Multiplies the total by the parameter
	 * 
	 * @param value amount to be added to the total
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/*
	 * Divides the total by the parameter
	 * 
	 * @param value amount to be added to the total
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		total /= value;
	}
	
	/*
	 * Returns a history of all actions as a string
	 * 
	 * @return a history of all actions 
	 */
	public String getHistory () {
		return "";
	}
}