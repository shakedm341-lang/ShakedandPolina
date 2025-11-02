import java.util.ArrayList;

public class SharedData 
{
	/**
	 * SharedData class is used to store and share data between multiple threads.
	 * It contains a shared array of integers, a boolean array for results,
	 * a synchronization flag, and a constant integer 'b'.
	 */
	
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	 /**
     * Constructor initializes the shared integer array and constant 'b'.
     * 
     * @param array The shared list of integers
     * @param b The constant value (possibly a target number or parameter)
     */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
	 /**
     * Gets the winArray.
     * 
     * @return The boolean array representing results or thread states
     */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	 /**
     * Sets the winArray.
     * 
     * @param winArray A boolean array that may store thread results
     */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	 /**
     * Gets the shared integer array.
     * 
     * @return The ArrayList of integers shared among threads
     */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
	 /**
     * Gets the constant integer 'b'.
     * 
     * @return The integer constant 'b'
     */
	public int getB() 
	{
		return b;
	}
	 /**
     * Gets the synchronization flag.
     * 
     * @return The current state of the flag (true/false)
     */

	public boolean getFlag() 
	{
		return flag;
	}
	 /**
     * Sets the synchronization flag.
     * 
     * @param flag The new state of the flag (true/false)
     */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
