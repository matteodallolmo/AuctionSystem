public class User{

    private String username;
    private String walletID;
    private Double balance;

    public User(String username, String walletID, Double balance){
    	this.username = username;
    	this.walletID = walletID;
    	this.balance = balance;
    }

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getWalletID() {
		return walletID;
	}

	public void setWalletID(String walletID) {
		this.walletID = walletID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void makeBid(Auction auction, Double amount) {
		auction.makeBid(amount, this);
	}


}