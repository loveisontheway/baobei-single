# baobei-single
关于本项目相关介绍说明，可以直接参考[baobei](https://github.com/loveisontheway/baobei)，唯一不同之处就是：`baobei`是Maven聚合项目，而`baobei-single`是各个项目独立开。
`baobei`这种项目构建方式，利于开发管理；`baobei-single`这种构建模式，方便代码提交记录查看，日志追踪，各个项目独立开，不混乱；以上主要是针对开发情况而言，部署的话都一样。

| name | description |
| :------ | :------ |
| baobei | 父项目，只有一个pom.xml文件，所有子项目都会引用父项目 |
| baobei-article | 活动服务模块 |
| baobei-base | 基础服务模块 |
| baobei-cache | 缓存服务模块(Elasticsearch) |
| baobei-child | 儿童服务模块(服务之间调用,调用baobei-cache接口，加入熔断器) |
| baobei-order | 订单服务模块 |
| baobei-register | 注册中心 |
