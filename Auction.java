import java.util.*;

public class Auction{

	private double buyNowPrice;
	private String description;
	private boolean bidMade;
	//private String picture;
	private Double closingTimer;
	private Double blockTiming;
	private boolean isAlive;
	private User seller; //owner of the Auction
	private HashMap<User, Double> highestBid; //should always stay length 1 dictionary - string is the username of the highest Bid and Integer is the amount

	public Auction(){
		//closingTimer = 43200; //30 days worth of minutes
		isAlive = true;//not really adding timer functionality rn
		User defaultUser = new User( "default", "default", 0.0);
		highestBid = new HashMap<User, Double>();
		highestBid.put(defaultUser, 0.0);
	}
	
	public void Timer(){
		
	}


	public void makeBid(Double amount, User person){
		bidMade = true;
		if(!isAlive) {
			System.out.println("bid not allowed");
		}
		else if(amount < getHighestBidAmount()) {
			System.out.println("bid not allowed");
		}
		else if(amount > person.getBalance()) {
			System.out.println("bid not allowed");
			
		}
		else {
			highestBid.put(person, amount);
			highestBid.remove(getHighestBidder());

		}

	}

	public void pullHighestBid (User person){ // does not go to the second highest bidder, clears the auction and extends time instead
		if(person == getHighestBidder()) {
			highestBid.remove(person);
		}
		this.extendTime(5.0);//adds 5 min

	}

	public void extendTime (Double addedTime){
		closingTimer += addedTime;
	}

	public void finishAuction(){
		isAlive = false;
		User winner = getHighestBidder();
		Double winningAmnt = getHighestBidAmount();

		winner.setBalance(winner.getBalance() - winningAmnt);
		
		System.out.println(winner.getUsername() + " has won this auction with a bid of " + winningAmnt + "");

	}
	
	public User getHighestBidder() {
		return highestBid.entrySet().iterator().next().getKey();
	}
	
	public Double getHighestBidAmount() {
		return highestBid.entrySet().iterator().next().getValue();
	}

}