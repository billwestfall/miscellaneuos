function GetFullPath {
    Param(
        [string] $Path
    )
    return $Path.Replace('TestDrive:', (Get-PSDrive TestDrive).Root)
}

GetFullPath
