# point2Point_dubbo
dubbo简易实现_分别利用自定义的注册中心和zookeeper

参考链接：[dubbo简易实现_分别利用自定义的注册中心和zookeeper - 开源小菜鸟2333](https://my.oschina.net/u/3136014/blog/1036912)

* 自定义的注册中心，即点对点式 (pointToPoint)
    * 生产者配置文件： demo_dubbo\dubbo-provider\src\main\resources\p2p_provider.xml 
    * 消费者配置文件： \demo_dubbo\dubbo-consumer\src\main\resources\p2p_consumer.xml  
* zookeeper注册中心
    * 生产者配置文件： demo_dubbo\dubbo-provider\src\main\resources\zk_provider.xml 
    * 消费者配置文件： \demo_dubbo\dubbo-consumer\src\main\resources\zk_consumer.xml  
