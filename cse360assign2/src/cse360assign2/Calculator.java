
package cse360assign2;

/**
 * This program is used as the third state to commit to git
 * 
 * @author Anthony Wasson
 *
 */

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0 ";
	}
	
	/**
	 * get method
	 * @return total (return value of total)
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * adds a given value to total
	 * @param value (value being added to)
	 */
	
	public void add (int value) {
		history = history + "+ " + value + " ";
		total = total + value;
	}
	
	/**
	 * subtracts a given value from total
	 * @param value (value being subtracted from)
	 */
	
	public void subtract (int value) {
		history = history + "- " + value + " ";
		total = total - value;
	}
	
	/**
	 * multiplies total by a given value
	 * @param value (value being multiplied)
	 */
	
	public void multiply (int value) {
		history = history + "* " + value + " ";
		total = total * value;
	}
	
	/**
	 * divides total by a given value
	 * @param value (value being divided by)
	 */
	
	public void divide (int value) {
		history = history + "/ " + value + " ";
		total = total / value;
	}
	
	/**
	 * get method
	 * @return history (returns operation history)
	 */
	
	public String getHistory () {
		return history;
	}
}