

    $dl = "C"

{Write-Host "Copying the zipfile."}
# invoke-command -scriptblock {del C:\tmp\XXXXXXX_Restore\*.* /Q}
invoke-command -scriptblock {dir C:\tmp\XXXXXXX_Restore\}
Start-Sleep -s 10
invoke-command -scriptblock {xcopy /I /Y /Q \\sandbox\build_drop\XXXXXXX\dotNET\trunk\24\*.zip  C:\tmp\XXXXXXX_Restore\XXXXXXX.zip}
invoke-command -scriptblock {dir C:\tmp\XXXXXXX_Restore\}
Start-Sleep -s 10
{Write-Host "Stopping IIS Services..."}
invoke-command -scriptblock {iisreset /status}
invoke-command -scriptblock {iisreset /stop}
invoke-command -scriptblock {dir C:\}

Start-Sleep -s 10

    if (Test-Path "$($dl):\XXXXXXX_*Old") {
        $old_folders = @()
        $old_folders += Get-ChildItem "$($dl):\XXXXXXX_*Old" | select -ExpandProperty Name

        Remove-Item -Force -Recurse -ErrorAction SilentlyContinue -WarningAction SilentlyContinue "$($dl):\XXXXXXX_*Old"
        if (Test-Path "$($dl):\XXXXXXX_*Old") {
            Write-Host "FAILURE - failed to remove XXXXXXX Old Folder exiting"
            exit 0
        }
    }
    else {
        Write-Host "$ XXXXXXX Old folder doesn't exist nothing to delete"
   }

Start-Sleep -s 10

Invoke-Expression -Command "& 'c:\Program Files\7-Zip\7z.exe' x $($dl):\tmp\XXXXXXX_Restore\XXXXXXX.zip -o$($dl):\tmp\XXXXXXX_Restore -y"
Remove-Item -Force -Recurse -ErrorAction SilentlyContinue "$($dl):\tmp\XXXXXXX_Restore\XXXXXXX.zip"

invoke-command -scriptblock {xcopy C:\XXXXXXX C:\XXXXXXX_Old /I /S /Y}
Start-Sleep -s 10
invoke-command -scriptblock {xcopy C:\tmp\XXXXXXX_Restore C:\XXXXXXX /I /S /Y}
Start-Sleep -s 10

{Write-Host "Starting IIS Services..."}
invoke-command -scriptblock {dir C:\}
Start-Sleep -s 10
invoke-command -scriptblock {iisreset /status}
invoke-command -scriptblock {iisreset /start}

Write-Host "completed starting IIS services"

$patherror = "false"
$dllreggacerror = "false"
$foldererror = "false"
