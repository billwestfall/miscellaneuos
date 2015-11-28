import random

x = 1
while x < 11:
    print random.choice([2, 3, 4, 5, 6, 7, 8, 9, 10, "Page", "Knight", "Queen", "King", "Ace"]), random.choice(["Swords", "Cups", "Coins", "Wands"]), random.choice(["Natural", "Reversed"])
    x += 1
