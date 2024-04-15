# Define the Advanced function with parameters
function Greet-Person {
    param(
        [Parameter(Position=0)]
        [string]$FirstName,
 
        [Parameter(Position=1)]
        [string]$LastName
    )
     
    Write-Output "Hello, $FirstName $LastName"
}
 
# Call the function
Greet-Person "John" "Doe"
