export JAVA_HOME=/usr/lib/jvm/default-java/
cd CucumberDataComparison
mvn clean install
mvn deploy -Prelease
cd ..
cd CrossTest
mvn clean install
mvn deploy -Prelease
cd ..
cd CrossTestSteps
mvn clean install
mvn deploy -Prelease
cd ..
cd TeradataCustomDataTypes
mvn clean install
mvn deploy -Prelease
cd ..
cd Execution/InformaticaPowerCenter
mvn clean install
mvn deploy -Prelease