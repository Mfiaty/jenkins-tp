   @echo off
   set /a r=%RANDOM% %% 2
   if %r%==0 (
       echo Deploiement echoue
       exit /b 1
   )
   echo Deploiement reussi
