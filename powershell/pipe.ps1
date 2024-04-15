function Greet-User {
    param (
        [Parameter(ValueFromPipeline)]
        [string]$Name
    )
 
    process {
        "Hello, $Name"
    }
}
"John" | GreetUser
