function Set-Mode([string]$name, [switch]$list) {
   if ($list) { 
     "List Mode for $name"
   }
   else {
    "Normal mode $name" 
   }
}
 
Set-Mode -name Sam -list # passing switch
