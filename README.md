# Kafka-tutorial
This repository will help us how we set up Kafka server and how we communicate between two Spring boot services/applications.


## Steps:-
1. We need to run zookeeper and Kafka server So first download the Kafka by following link: https://kafka.apache.org/downloads
2. Unzip the downloaded file and open the cmd in the extracted folder.
3. **Start Zookeeper server**: Use the following command to start the server:-
 bin\windows\zookeeper-server-start.bat config\zookeeper.properties(on Windows)
 bin\zookeeper-server-start.sh config\zookeeper.properties(on linux)
4. **Start Kafka Server**: Use the following command to start the server:-
 bin\windows\kafka-server-start.bat config\server.properties (on Windows)
 bin\kafka-server-start.sh config\server.properties (on linux)
5. Now run the both project.
