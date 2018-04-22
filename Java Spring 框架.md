# Java Spring 框架
***
Spring框架是一个 控制反转(Inverse of Control，IoC) 和 面向切面编程 (Aspect Oriented Programming, AOP)的容器框架  
* 轻量级
* 通过IoC实现松耦合
* 分离 应用的业务逻辑 与 系统级服务
* 包含并管理应用对象的配置和生命周期 - 容器
* 将简单的组件配置，组合 - 框架
***
## Spring Overview
![Spring Overview](/img/spring_overview.png "Spring Overview")
***
### 适用范围  
* 构建企业应用(SSH)
* Bean管理
* AOP 
* 互联网应用
* ...
***
## IOC 面向接口编程
* 分清层次及调用关系，每层只向外提供一组功能接口，各层直接由接口进行关联   
* 接口实现变动不影响各层的调用
* 接口 用于隐藏具体实现 和 实现多态性

