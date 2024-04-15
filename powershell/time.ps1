# Define function
function Show-CurrentTime {
    $currentTime = Get-Date
    Write-Host "The current time is: $currentTime"
}
 
# Calling the function
Show-CurrentTime
