# dubbo_demo
dubbo+zookeeper的尝试

消费者
	order-services-consumer

服务提供者
	user-services-provider

### 注册中心

```
	zookeeper
	zookeeper的安装：
	http://zookeeper.apache.org/
		1.下载zookeeper安装包，解压
		2.将conf/zoo_sample.cfg修改为zoo.cfg
		3.运行bin/zkServer.cmd
```



### RPC:dubbo 

```
	dubbo管理平台
	https://github.com/apache/incubator-dubbo-admin/tree/master
		1.进入dubbo-admin工程
		2.进入cmd控制台，输入mvn  clean package,完成jar包打包
		3.进入target目录，会看到一个dubbo-admin-0.0.1-SNAPSHOT.jar，然后在cmd中运行java -jar 	dubbo-admin-0.0.1-SNAPSHOT.jar(确保zookeeper开启)
		4.输入localhost:7001
```

​	

```
	dubbo监控平台
		1.进入dubbo-monitor-simple工程
		2.进入cmd控制台，输入mvn  package,完成jar包打包
		3.进入target目录，会看到一个dubbo-monitor-simple-2.0.0.jar，然后在cmd中运行java -jar 		dubbo-monitor-simple-2.0.0.jar(确保zookeeper开启)
		4.输入localhost:8080
```


