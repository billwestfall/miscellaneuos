# Define function
function View-Objects {
    $currentObj= Get-Process | Get-Member | Out-Host
    Write-Host "$currentObj"
}
 
# Calling the function
View_Objects
