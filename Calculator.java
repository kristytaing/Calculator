package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0; 
		history = "0";
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
	 * Adds the parameter to the total. Also adds the calculation to the history.
	 * 
	 * @param value amount to be added to the total
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/*
	 * Subtracts a value from the total. Also adds the calculation to the history.
	 * 
	 * @param value amount to be added to the total
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/*
	 * Multiplies the total by the parameter. Also adds the calculation to the history.
	 * 
	 * @param value amount to be added to the total
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/*
	 * Divides the total by the parameter. Also adds the calculation to the history.
	 * 
	 * @param value amount to be added to the total
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		total /= value;
		history += " / " + value;
	}
	
	/*
	 * Returns a history as a string of operations separated by a space.
	 * 
	 * @return a history of all actions 
	 */
	public String getHistory () {
		return history;
	}
}