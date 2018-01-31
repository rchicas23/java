/* Rules for tower of Hanoi:
 * 
 * a) only move one disk at a time
 * b)cannot place a larger disk on top of a smaller disk
 * c)all disk must be on some peg except for the disk that is moving from one peg to the other.
 * 
 * For a tower of hanoi we want 3 things to occur
 * 
 * 1) We want to move the top disk (n-1) from the original to the extra peg 
 * 2) We want to move the largest disk to the destination peg
 * 3) Move all the disk from the extra peg to the original peg
 */

public class TowersOfHanoi {
	
	private int totalD;
	
	public TowersOfHanoi(int d)
	{
		totalD = d;
	}
	
	
	public void solve()
	{
		moveTower(totalD, 1, 3, 2); //moves disks from tower 1 to 3 using tower 2
	}
	
	
	//moves n-1 disk out the way, moving one disk, then moving the sub-tower back. the base base if 1 disk.
	public void moveTower (int numD, int start, int end, int temp)
	{
		if(numD == 1) //base case
			moveOneD (start, end);
		else
		{
			moveTower (numD - 1, start, temp, end); //moves all the n-1 disk from start peg to destination peg using the extra peg
			moveOneD (start, end); //moves the biggest disk from the start peg to the destination peg
			moveTower (numD - 1, temp, end, start); //moves the remainder of the n-1 disk from the extra peg to the destination pegs using the start peg
			
		}
	}
	
	//Prints out what disk moved from what tower to the next tower. 
	private void moveOneD (int start, int end)
	{
		System.out.println("mover on disk from " + start + " to " + end);
	}
	

}
