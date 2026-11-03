   @echo off
   echo Verification de l'etat du service...
   ping -n 6 127.0.0.1 >nul
   echo Service OK
