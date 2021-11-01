FROM mcr.microsoft.com/mssql/server:2019-latest
 
# Elevate to root to install required packages
USER root
RUN apt-get update \
    && apt-get install -y unzip libunwind8 libicu66 

USER xtestsqlserver
RUN mkdir /tmp/db/
COPY /TestCrossTest/testdb.sql /tmp/db/testdb.sql


