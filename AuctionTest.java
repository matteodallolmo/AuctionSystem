public class AuctionTest{
	
	public static void main (String[]args) {
		User rhea = new User("Rhea", "walletID", 420.0);
		User rheasEnemy = new User("enemy", "walletIDd", 0.0);
		User bestie = new User("bestie", "walletID", 5.0);
		
		Auction newAuc = new Auction();
		
					rhea.makeBid(newAuc, 20.0);
		rheasEnemy.makeBid(newAuc, 15.0);
		rheasEnemy.setBalance(50.0);
		rheasEnemy.makeBid(newAuc, 40.0);
		
		newAuc.finishAuction();
		
	}

	
	
	
}