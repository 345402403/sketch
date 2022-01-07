
#### 系统介绍

1.捐赠需求管理；
（1）捐赠需求列表，支持按需求编码、名称、状态筛选；
（2）新增需求；
（3）删除需求；
（4）发布需求；
（5）更新需求，支持更新需求名称、需求发布人信息
2.捐赠信息管理；
（1）捐赠信息列表，支持需求编码、捐赠人、电话、捐赠物品筛选
（2）新增捐赠信息
（3）删除捐赠信息
（4）修改捐赠信息
3.捐赠人管理；
（1）捐赠人列表，支持按姓名筛选；
（2）捐赠人积分增减；
（3）更新捐赠人；
（4）删除捐赠人；
（5）新增捐赠人。
4.系统管理员管理；
（1）新增系统管理员
（2）删除管理员
（3）管理员列表
5.系统基础框架
（1）用户登录鉴权
（2）用户登出
（3）缓存管理
（4）MySQL数据库


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
