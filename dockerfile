mvn package -DskipTests


java -jar user-center-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod


## 后台运行
nohup java -jar user-center-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod &
