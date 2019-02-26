
package cse360assign2;

/**
 * This program is used as second state to commit to git
 * 
 * @author Anthony Wasson
 *
 */

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
	}
	
	public void subtract (int value) {
		total = total - value;
	}
	
	public void multiply (int value) {
		total = total * value;
	}
	
	public void divide (int value) {
		total = total / value;
	}
	
	public String getHistory () {
		return "";
	}
}