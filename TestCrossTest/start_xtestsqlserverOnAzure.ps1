#installing SQL Server 2019 docker
#https://docs.microsoft.com/en-us/sql/linux/quickstart-install-connect-docker?view=sql-server-ver15&pivots=cs1-bash
# sudo docker pull mcr.microsoft.com/mssql/server:2019-latest

#Run the container
docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=Test1234!" -p 1533:1433 --name xtestsqlserver -h xtestsqlserver -v ${PWD}:/scripts -d mcr.microsoft.com/mssql/server:2019-latest