# Define function
function View-Part {
    $currentPart= Get-CimInstance -Class Win32_LogicalDisk | Select-Object -Property Name, FreeSpace
    Write-Host "$currentPart"
}
 
# Calling the function
View-Part
