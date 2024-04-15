# Define the function
function Greet-Person {
    param(
        [Parameter(Position=0)]
        [string]$FirstName,
 
        [Parameter(Position=1)]
        [string]$LastName
    )
     
    Write-Output "Hello, $FirstName $LastName"
}
 
# Call the function using named parameters
Greet-Person -FirstName "John" -LastName "Doe"
