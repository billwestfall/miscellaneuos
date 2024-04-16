# Define the directory path
$directoryPath = "."

# Check if the directory exists
if (Test-Path $directoryPath -PathType Container) {
    # Get the list of items (files and directories) in the specified directory
    $directoryContents = Get-ChildItem -Path $directoryPath

    # Loop through each item in the directory
    foreach ($item in $directoryContents) {
        # Check if the item is a directory
        if ($item.PSIsContainer) {
            Write-Host "Directory: $($item.FullName)"
        } else {
            Write-Host "File: $($item.FullName)"
        }
    }
} else {
    Write-Host "Directory '$directoryPath' does not exist."
}
