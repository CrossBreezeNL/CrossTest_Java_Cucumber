
FROM mcr.microsoft.com/mssql/server:2019-latest
 
# Elevate to root to install required packages
USER root
RUN apt-get update \
    && apt-get install -y unzip libunwind8 libicu66 
 
# Install SQLPackage for Linux and make it executable
RUN wget -progress=bar:force -q -O sqlpackage.zip https://go.microsoft.com/fwlink/?linkid=2165213 \
    && unzip -qq sqlpackage.zip -d /opt/sqlpackage \
    && chmod +x /opt/sqlpackage/sqlpackage \
    && chown -R mssql /opt/sqlpackage \
    && mkdir /tmp/db \
    && chown -R mssql /tmp/db
 
# Lower the privilege
USER mssql
 
 
# Add the sql to the image
COPY /TestCrossTest/testdb.sql /tmp/db/testdb.sql
 
# Configure external build arguments to allow configurability.
ARG DBNAME=Example-source-target
ARG PASSWORD
 
# Configure the required environmental variables
ENV ACCEPT_EULA=Y
ENV SA_PASSWORD=Test1234_
 
# Launch SQL Server, confirm startup is complete, deploy the DACPAC, then terminate SQL Server.
# See https://stackoverflow.com/a/51589787/488695

#RUN ( /opt/mssql/bin/sqlservr & ) | grep -q "Service Broker manager has started" && ( echo "SQLServer started" && sleep 10s ) || ( echo "SQLSERVER failed to start" && exit ) \
#    && /opt/sqlpackage/sqlpackage /a:Publish /tsn:. /tdn:${DBNAME} /tu:sa /tp:$SA_PASSWORD /sf:/tmp/db/Example_source_target.dacpac 

RUN ( /opt/mssql/bin/sqlservr --accept-eula & ) | grep -q "Service Broker manager has started" \
    && /opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P $SA_PASSWORD -i /tmp/db.sql 
    && pkill sqlservr 


FROM mcr.microsoft.com/mssql/server:2019-latest
 
# Elevate to root to install required packages
USER root
RUN apt-get update \
    && apt-get install -y unzip libunwind8 libicu66 



