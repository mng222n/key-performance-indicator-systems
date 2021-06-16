+-----------------------------------------------------------------------------+
| 					DIRECTION for Install Project Capita KPI						  |
+-----------------------------------------------------------------------------+
[1] Install apache tomcat v8.0 Web server
From http://tomcat.apache.org/
[2] Install Eclipse IDE for Java EE Development
https://eclipse.org/downloads/
[3] Import maven project from Eclipse EE IDE
[4] Configuration for Hibernate (Option)
-> Move struts2-fullhibernatecore-plugin-2.2.2-GA.jar to C:\
-> Execute following command
mvn install:install-file -Dfile=c:\struts2-fullhibernatecore-plugin-2.2.2-GA.jar 
-DgroupId=com.google.code -DartifactId=struts2-fullhibernatecore-plugin 
-Dversion=2.2 -Dpackaging=jar
[5] Add apache tomcat web server to Eclipse EE IDE
[6]	Create Database capitakpi and execute employee.sql from database folder
[7]	Execute maven clean and install
[8] Add exist project to tomcat web server
[9]	Start tomcat web server
[10] Test in url http://localhost:8080/com.ibsv.capitakpi/listEmployeeAction
