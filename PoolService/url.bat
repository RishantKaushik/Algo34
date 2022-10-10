@echo off
:a
cls:
wget -S --method POST --header="Accept-Encoding: gzip, deflate" --header="Accept-Charset: UTF-8" --header "Content-Type: application/x-www-form-urlencoded" -O response.json --body-data "dmt=sendmoneypool" https://api.royalpe.co.in/multidmt.aspx
echo complete
timeout /t 3 >nul
goto a
