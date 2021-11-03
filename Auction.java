import java.util.*;

public class Auction{

	private double buyNowPrice;
	private String description;
	private boolean bidMade;
	//private String picture;
	private Double closingTimer;
	private boolean isAlive;
	private User seller; //owner of the Auction
	private HashMap<User, Double> highestBid; //should always stay length 1 dictionary - string is the username of the highest Bid and Integer is the amount

	public Auction(){
		//closingTimer = 43200; //30 days worth of minutes
		isAlive = true;//not really adding timer functionality rn

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
		if(person == highestBid.entrySet().iterator().next().getKey()) {
			highestBid.remove(person);
		}
		this.extendTime(5.0);//adds 5 min

	}

	public void extendTime (Double addedTime){
		closingTimer += addedTime;
	}

	public void finishAuction(){
		isAlive = false;
		User winner = highestBid.entrySet().iterator().next().getKey();
		Double winningAmnt = highestBid.entrySet().iterator().next().getValue();

		winner.setBalance(winner.getBalance() - winningAmnt);
		
		System.out.println(winner.getUsername() + " has won this auction with a bid of " + winningAmnt + "");

	}

}