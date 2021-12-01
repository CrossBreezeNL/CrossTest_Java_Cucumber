set TAGS=%1
SET TAGS=%TAGS:"=%
mvn exec:java -B -Dexec.classpathScope=test -Dexec.mainClass=io.cucumber.core.cli.Main -Dexec.args="./src/test/resources --threads 1 --glue com.xbreeze.xtest.steps --tags '(%TAGS%)' --plugin 'pretty' --plugin 'json:target/unit-test-results.json' --plugin 'de.monochromata.cucumber.report.PrettyReports:target' --plugin 'timeline:target/unit-test-timeline' "
REM For some reason the command below is not executed when REM is removed.
REM start chrome ./target/cucumber-html-reports/overview-features.html