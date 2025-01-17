package model;

import java.util.ArrayList;

/**
 * 
 * @author davidspiegel
 * 
 *         Description: A character class that will hold needed information
 *         about the character.
 *
 */
public class Character extends Block {

	private int row;
	private int col;
	private String name;
	private ArrayList<Block> inventory;
    private int life;
    private boolean hit;
    private boolean hasStick;
    private boolean isJumping;
    private boolean isSwimming;
	// Another constructor for block form
	public Character(int row, int col, String name) {
		// Must call this so block can also use this
		super("C");
  
		// Now, our row and column and name
		this.row = row;
		this.col = col;
		this.name = name;
        this.hit = false;
        this.hasStick = false;
        this.isSwimming = false;
		inventory = new ArrayList<Block>();
	}
    
    public Character(){
        super("C");
        this.setDescription("The main character");
        this.row = 0;
        this.col = 0;
        this.life = 10;
        this.name = "Ivan";
        this.inventory = new ArrayList<Block>();
        
        
    }
    
    // We are going to try and make a state of being in water
    public void setSwimming(boolean swiming){
        
        this.isSwimming=swiming;
    }
    
    public boolean isSwimming(){
        
        return this.isSwimming;
    }
    public void setJumping(boolean jump){
        this.isJumping=jump;
    }
    public boolean isJumping(){
        return this.isJumping;
    }
    
    public boolean hasStick(){
        return hasStick;
    }
    
    
    
    public void setStick(boolean st){
        hasStick =st;
        
    }
    
    // A way to decrease life
    public void decrementLife(){
        if (this.life-1 >= 0){
            this.life--;
        }

    }
    public void incrementLife(){
        if (this.life+1 <= 10 ){
        this.life++;
        }
    }
    public int getLife(){
        return this.life;
    }

	// A way to get the characters name
	public String getName() {
		return this.name;
	}

	// Need get row and get column
	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	// Must use the set row to put our character back
	public void setRow(int row) {
		this.row = row;
	}
	// Must use the set column to put the character back

	public void setCol(int col) {
		this.col = col;
	}

	// When our character moves right
	public void moveRight() {
		row++;
	}

	// When our character moves left
	public void moveLeft() {
		row--;
	}

	// When our character moves up
	public void moveUp() {
		col--;
	}

	// When removing from inventory
	public void removeInventory(int val) {
		this.inventory.remove(val);
	}

	// When our character moves down
	public void moveDown() {
		col++;
	}

	// Adding an element to our inventory
	public void addToInventory(Block b) {
		inventory.add(b);
	}
	
	

	// Getting inventory
	public ArrayList<Block> getInventory() {
		return inventory;
	}
    
    // Setting inventory
    public void setInventory(ArrayList<Block>bl){
        this.inventory= bl;
    }
    
    public void setGettingHit(boolean val){
        this.hit = val;
    }
    public boolean getGettingHit(){
        return this.hit;
    }

	@Override
	public String getKey() {
		return "C";
	}

	@Override
	public String getDescription() {
		return name;
	}
    


	
}
