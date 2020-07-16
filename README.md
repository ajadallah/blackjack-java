This is a simple command line blackjack game. The plan is to practice building from scratch, practice TDD, and get familiar with the rules of blackjack before I attempt to make a ReactJs version.

# Blackjack

## The Pack
- Standard 52 card deck is used
- Can use more than one deck, six-deck (312 card) game is popular in casinos

## Object of the Game
- Beat the dealer by getting as close to 21 as possible, without going over 21

## Card Values/Scoring
- Individual player decides whether ace is worth 1 or 11
- Face cards are 10
- All other cards are pip value

## Betting
- Before the deal begins, player places a bet
- In this game players start with $100 and can bet in $1, $5, $10, $25, $50, and $100 incremements until they go broke

## Dealing
- After the bets have been placed, dealer gives one card face up to player, then one to themselves face up
- Another round of cards is dealt to player face up, but dealer takes one face down

**Naturals**
 - If after the first two cards have been dealt to the player, they have blackjack, and the dealer does not, the player immediately receives 1.5x
    - In this game 1.5 will be rounded up to the nearest dollar
- If the dealer has a natural, and the player does not, they win the hand
- If both the player and dealer have a natural, the player takes back their chips

## The Play
- After receiving their first two cards, the player can **stand** (not receive anymore cards), or **hit** (request another card)
- The player can hit until they either decide to stand or go bust - exceed 21
    - When a player busts, they lose their chips

## The Dealer's Play
- When the player ends their turn, the dealer's face-down card is turned up
- If the total is greater to or equal than 17, the dealer must stand
- If the total is 16 or under, the dealer must hit
    - The dealer must continue to hit until they have a 17 or higher
    -  If the dealer has an ace, and counting it as 11 would bring the total to 17 or more (but not over 21), the dealer must count the ace as 11 and stand

## Splitting Pairs
- If a player's first two cards are of the same denomination, such as two jacks or two sixes, they may choose to treat them as two separate hands
    - The amount of the original bet then goes on one of the cards, and an equal amount must be placed as a bet on the other card
- These hands are played and settled separately 
- With a pair of aces, the player is given one card for each ace and may not draw again
    - If a 10 is dealt to one of these aces, the payoff is equal to the bet, not 1.5x the bet as in the case of a regular blackjack
    
## Doubling Down
- When the first two cards dealt to the player total 9, 10, or 11 they have the option to place a bet equal to the original bet
    - The dealer gives the player one more card and plays their hand
- If the first two cards are 5s, the player can split the pair, double down, or play the hand as usual

## Insurance
- When the dealer's face-up card is an ace, any of the player may make a side bet of up to half the original bet that the dealer's face-down card is a ten-card, and thus a blackjack for the house
- If it is a 10 card and the player took the insurance bet, the player receives double the amount of their half-bet.
- When blackjack occurs, the hand is over, and the player's main bet is collected - unless the player also has blackjack, in which case it is a tie and the player keeps their money and receives their insurance bet

