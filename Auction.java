import java.util.*;

public class Auction{

	private double buyNowPrice;
	private String description;
	private boolean bidMade;
	//private String picture;
	private Double closingTimer;
	private boolean isAlive;
	private User seller; //owner of the Auction
	private HashMap<User, Double> highestBid; //shuold always stay length 1 dictionary - string is the username of the highest Bid and Integer is the amount

	public Auction(){
		//closingTimer = 43200; //30 days worth of minutes

	}
	
	public void Timer(){
		
	}


	public void makeBid(Double amount, User person){

		bidMade = true;
		if(!isAlive) {
			System.out.println("bid now allowed");
		}
		else if(amount > highestBid.entrySet().iterator().next().getValue()) {
			System.out.println("bid now allowed");
		}
		else if(amount > person.getBalance()) {
			System.out.println("bid now allowed");
			
		}
		else {
			highestBid.put(person, amount);
		}
	}

	public void pullHighestBid (User person){

	}

	public void extendTime (Double addedTime){

	}

	public void finishAuction(){

	}

}