public class User{

    private String username;
    private String walletID;
    private Double balance;

    public User(){

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



}