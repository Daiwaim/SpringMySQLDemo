# SpringMySQLDemo

## Database & User creation

```
mysql> create database spring_mysql_demo;
mysql> create user 'spring_mysql_demo_user' identified by 'thisRandomPassword';
mysql> grant all on spring_mysql_demo.* to 'spring_mysql_demo_user';
```

In `src/main/resources/application.yml` edit database settings ( name / username / password )
