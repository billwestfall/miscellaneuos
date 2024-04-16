# Define function
function View-Part {
    $currentPart= Get-Process | Get-Member | Out-Host -Property Name
    Write-Host "$currentPart"
}
 
# Calling the function
View-Part
