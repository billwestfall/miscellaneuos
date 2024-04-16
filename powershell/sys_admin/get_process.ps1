# Define function
function View-Procs {
    $currentProc= Get-Process | Get-Member -MemberType Properties
    Write-Host "$currentProc"
}
 
# Calling the function
View-Procs
