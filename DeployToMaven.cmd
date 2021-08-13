cd CucumberDatacomparison
call mvn clean install
call mvn deploy -Prelease
cd ..
cd Crosstest
call mvn clean install
call mvn deploy -Prelease
cd ..
cd CrosstestSteps
call mvn clean install
call mvn deploy -Prelease

cd ..
cd TeradataCustomDataTypes
call mvn clean install
call mvn deploy -Prelease
cd ..

cd Execution\InformaticapowerCenter
call mvn clean install
call mvn deploy -Prelease
cd ..\..
pause done
