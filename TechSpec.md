# AuctionSystem
## Tech Spec

###### Objects
- Auction
  - Variables: 
      - Double: buyNowPrice
      - Pair<String, Integer>: highestBid (the string is the username of the highest bid and the Integer is the amount)
      - String: description
      - String: picture
      - Double: closingTimer (the amt of time left in the auction)
      - Double: blockTiming (the time it takes for the chain to make a new block)
      - Boolean: isAlive (is the auction still going)
      - CUSTOM CLASS: User
        - Variables: 
          - String username
          - String walletID
          - String balance
      - User seller (the owner of the auction)
      
###### Methods

- Timer
  - Divide ClosingTimer by blockTiming to estimate the amount of blocks needed to reach that time
  - Get the current block (currentBlock) and stop at block currentBlock + (closingTimer/blockTiming)
  - Once you stop set isAlive = false
- makeBid(Double amount, User person)
  - Check if the auction is over (isAlive == false), if it is then don't allow a bid
  - Check if the amount is greater than highestBid
  - Check if user is not already the highest bidder
  - Set highestBid to <person.getUsername, amount>
- pullHighestBid (User person)
  - Check if person's username is equal to highestBid's username
  - add 5 minutes to closingTimer
  - recalculate the Timer method
- extendTime (Double addedTime)
  - add addedTime to closingTimer
  - recalculate the Timer method

