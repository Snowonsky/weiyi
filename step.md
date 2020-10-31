1. 整合mybatis
    - 导入依赖(mysql-5.1.47,mybatis-2.1.3,druid-spring-boot-starter-1.1.10)
    - 配置文件配置数据源
        - driver-class-name,url,username,password
    - 如果需要动态拼接条件，并且方法有且只有一个参数，必须要使用@Param指定别名