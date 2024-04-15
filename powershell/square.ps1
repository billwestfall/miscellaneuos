function Get-Square {
    param (
        $number
    )
    return $number * $number
}
 
function Get-SumOfSquares {
    param (
        $number1,
        $number2
    )
    $square1 = Get-Square -number $number1
    $square2 = Get-Square -number $number2
 
    return $square1 + $square2
}
 
# Calling the nested function
$sumOfSquares = Get-SumOfSquares -number1 3 -number2 4
Write-Host "The sum of squares is: $sumOfSquares"
