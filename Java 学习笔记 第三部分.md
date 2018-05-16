# **Java 学习笔记 第三部分**	
***
* [第27节 数据流](#第27节-数据流)
* [第28节 JDBC](#第28节-jdbc)
***
### 第27节 数据流
[数据流代码示例](/Java_examples/StreamDemo.java)  
### 第28节 JDBC  
[JDBC实例](/Java_examples/JDBC-Demo/)  
#### 连接JDBC  
* 添加驱动  
* 创建连接  
* 操作Mysql  
    * 创建要执行的sql语句
    * Statement接口, 用来执行静态SQL语句对象
    * 发送SQL语句到数据库中执行，返回执行结果  
	DQL: 返回查询的结果集  
	DML: 返回受影响的行数  
	DDL: 返回0  
    * 释放资源  
* 异常处理  
* ResultSet 查询结果的集合  
    * next()判断是否有下一行数据  
    * getInt(), getString() 获取数据  
