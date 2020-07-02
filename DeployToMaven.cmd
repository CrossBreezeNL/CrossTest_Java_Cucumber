cd Crosstest
call mvn clean install
call mvn deploy -Prelease
cd ..
cd CucumberDatacomparison
call mvn clean install
call mvn deploy -Prelease
cd ..
cd Execution\InformaticapowerCenter
call mvn clean install
call mvn deploy -Prelease
cd ..\..
cd CrossTestSteps
call mvn clean install
call mvn deploy -Prelease
cd ..
pause done
