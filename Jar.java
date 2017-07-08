import java.util.Scanner;
import java.util.Random;
	
public class Jar {
	  private String itemName;
	  public int maxItems;
	  private int minItems = 0;
	  
	  
	public Jar() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("What type of item?");
	  this.itemName = scanner.nextLine();
	  System.out.println("What is the maximum amount of " + itemName + " ?");
	  this.maxItems = Integer.parseInt(scanner.nextLine());
	 
	  System.out.println("\nPLAYER\n********************\nHow many " + itemName + " are in the jar?\nPick a number between 1 and " + maxItems);

	}
	  public void fillJar() {
	    Scanner scanner1 = new Scanner(System.in);
	    Random randomNumber = new Random();
	    int rand = randomNumber.nextInt((this.maxItems - minItems)+1);
	    if(rand==0){ // I added this to catch when the random number equals 0, and make it equal 1 instead
	      rand = rand +1;
	    }
	    int guess;
	    int count = 0;
	    do {
	     
	      System.out.println("\nHow many " + itemName + " are in the jar?  Pick a number between 1 and " + maxItems);
	       guess = Integer.parseInt(scanner1.nextLine());
	       count++;
	       if(guess==rand){
	         System.out.println("You got it in " + count + " attempt(s)");
	      }
	      
	      } while(guess != rand);  
	   
	    } 
	}
