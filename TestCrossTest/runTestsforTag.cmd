set TAGS=%1
mvn exec:java -B -Dexec.classpathScope=test -Dexec.mainClass=io.cucumber.core.cli.Main -Dexec.args="./src/test/resources --glue com.xbreeze.xtest.steps --tags '(%TAGS%)' --plugin 'pretty' --plugin 'json:target/cucumber-unit.json' --plugin 'de.monochromata.cucumber.report.PrettyReports:target' "
REM For some reason the command below is not executed when REM is removed.
REM start chrome ./target/cucumber-html-reports/overview-features.html