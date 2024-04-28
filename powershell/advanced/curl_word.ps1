# Define the URL of the website you want to fetch
$url = "https://random-word-api.herokuapp.com/word?lang=en"

# Make the request to the website
$response = Invoke-WebRequest -Uri $url

# Check if the request was successful
if ($response.StatusCode -eq 200) {
    # Print the content of the website
    Write-Output $response.Content
} else {
    Write-Host "Failed to fetch the website. Status code: $($response.StatusCode)"
}
