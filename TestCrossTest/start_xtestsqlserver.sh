#installing SQL Server 2019 docker
#https://docs.microsoft.com/en-us/sql/linux/quickstart-install-connect-docker?view=sql-server-ver15&pivots=cs1-bash
# sudo docker pull mcr.microsoft.com/mssql/server:2019-latest

#add mssql tools to path
PATH=$PATH:/opt/mssql-tools/bin:/opt/microsoft/msodbcsql17/lib64:
export PATH
#Run the container
docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=Test1234!" \
   -p 1533:1433 --name xtestsqlserver -h xtestsqlserver \
   -d mcr.microsoft.com/mssql/server:2019-latest

#wait for docker to be running
sleep 5

#Create database TestDB
sqlcmd -S localhost,1533 -U SA -P Test1234! -i ./testdb.sql
