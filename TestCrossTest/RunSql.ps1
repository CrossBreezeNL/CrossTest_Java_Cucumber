#wait for docker to be running 
#sleep 15 
#Create database TestDB
docker exec xtestsqlserver /opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P Test1234! -i /temp/db/testdb.sql