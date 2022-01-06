
#### 系统介绍

系统默认有两个个角色：管理员，普通用户

- 管理员（admin/admin123）：可以操作所有功能、增加用户
- 普通用户（test/test）：只可查看记录、无法修改

#### 主要技术
Springboot+MyBatis+MySQL+Layui-mini后台框架
使用Shiro进行基于角色权限控制，使用又拍云OSS存储图片

#### 使用说明

1. 使用Navicat或者其它工具，在mysql中创建对应名称的数据库，并导入项目的sql文件
2. 使用IDEA/Eclipse/MyEclipse导入项目
3. 将项目中resources/application-dev.yml配置文件中的数据库、又拍云oss配置改为自己的配置
4. 将前端项目ehr-admin目录配置nginx/或者导入vs code使用Live Server插件启动
4. 运行成功后，在浏览器中输入地址：http://localhost:8080/login.html  
   管理员账号: admin 密码: admin123  
   普通用户：test 密码：test  
