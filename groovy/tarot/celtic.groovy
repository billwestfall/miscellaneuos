/*
MacBook-Air:groovy billw$ groovy celtic.groovy
card[7] == 9
suit[2] == Coins
face[0] == Reversed
card[2] == 4
suit[3] == Wands
face[0] == Reversed
card[1] == 3
suit[0] == Swords
face[0] == Reversed
card[1] == 3
suit[2] == Coins
face[1] == Natural
card[6] == 8
suit[1] == Cups
face[0] == Reversed
card[4] == 6
suit[1] == Cups
face[1] == Natural
card[0] == 2
suit[1] == Cups
face[0] == Reversed
card[2] == 4
suit[2] == Coins
face[0] == Reversed
card[9] == Page
suit[2] == Coins
face[1] == Natural
card[4] == 6
suit[0] == Swords
face[0] == Reversed
card[8] == 10
suit[3] == Wands
face[1] == Natural
card[4] == 6
suit[0] == Swords
face[0] == Reversed
MacBook-Air:groovy billw$
*/

def list = [2, 3, 4, 5, 6, 7, 8, 9, 10, "Page", "Knight", "Queen", "King", "Ace"]
def suit = ["Swords", "Cups", "Coins", "Wands"]
def rev = ["Reversed", "Natural"]
def random = new Random();

(0..11).each {
    def i = random.nextInt(list.size())
    def j = random.nextInt(suit.size())
    def k = random.nextInt(rev.size())
    println "card[${i}] == ${list[i]}"
    println "suit[${j}] == ${suit[j]}"
    println "face[${k}] == ${rev[k]}"
}
