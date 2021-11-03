# AuctionSystem
## Tech Spec

## User Class
###### Variables
- String username
- String walletID
- String balance
###### Methods

## Auction Class
###### Variables
- Double: buyNowPrice
- String: description
- String: picture
- Double: closingTimer (the amt of time left in the auction)
- Double: blockTiming (the time it takes for the chain to make a new block)
- Boolean: isAlive (is the auction still going)
- User seller (the owner of the auction)
- Pair<User, Integer>: highestBid (the string is the username of the highest bid and the Integer is the amount)
###### Methods

- Timer
  - Divide ClosingTimer by blockTiming to estimate the amount of blocks needed to reach that time
  - Get the current block (currentBlock) and stop at block currentBlock + (closingTimer/blockTiming)
  - Once you stop call the method finishAuction
- makeBid(Double amount, User person)
  - Check if the auction is over (isAlive == false), if it is then don't allow a bid
  - Check if the amount is greater than highestBid, if it isn't then don't allow the bid
  - Check if amount > person.balance, if it is then don't allow the bid
  - Set highestBid to <person, amount>
- pullHighestBid (User person)
  - Check if person's username is equal to highestBid's username
  - add 5 minutes to closingTimer
  - recalculate the Timer method
- extendTime (Double addedTime)
  - add addedTime to closingTimer
  - recalculate the Timer method
- finishAuction
  - set isAlive = false
  - take the highestBid, charge the User's wallet ID the amount in highestBid and subtract it from their balance
  - send the item to the User
