function Add-Numbers($Numbers) {
    $Numbers -join '+'
}

$NumbersArray = 1, 2, 3
Add-Numbers $NumbersArray
