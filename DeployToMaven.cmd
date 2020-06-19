cd Crosstest
call mvn clean deploy -Prelease
cd ..
cd CucumberDatacomparison
call mvn clean deploy -Prelease
cd ..
cd Execution\InformaticapowerCenter
call mvn clean deploy -Prelease
cd ..\..
cd CrossTestSteps
call mvn clean deploy -Prelease
cd ..
pause done
