# springcloud
springcloud搭建HA集群微服

# 新建日期 2018-01-05  by yinhaiquan @email:1083775683@qq.com
目录结构:
spring_cloud[root]                                                                                                                       
------------spring_cloud_config[配置管理基于git]                                                                                         
-------------------------------spring_cloud_config_client[配置客户端]                                                                     
-------------------------------spring_cloud_config_server[配置服务端]                                                                    
-------------------------------spring_cloud_config_client_eureka[配置客户端基于eureka]                                                   
-------------------------------spring_cloud_config_server_eureka[配置服务端基于eureka]                                                   
-------------------------------spring_cloud_config_server2_eureka[配置服务端基于eureka模拟config server HA集群]                           
------------spring_cloud_consumer[模拟服务消费者]                                                                                         
------------spring_cloud_hystrix[hystrix熔断器]                                                                                         
------------spring_cloud_hystrix_turbine[hystrix看板集群监控模块]                                                                         
------------spring_cloud_provider[模拟服务提供者]                                                                                         
------------spring_cloud_provider2[服务提供者，模拟服务分布式HA集群]                                                                       
------------spring_cloud_server[eureka注册中心]                                                                                         
------------spring_cloud_server2[eureka注册中心，模拟HA集群]                                                                             
------------spring_cloud_zuul[zuul网关配置管理模块]                                                                                       
------------spring_cloud_zuul_eureka[zuul网关配置管理模块基于eureka注册中心]                                                               

demo中包含的内容【具体事例参考我的有道笔记】
1. springcloud hystrix熔断器实现
2. springcloud config分布式配置管理（基本使用）
3. springcloud实现分布式部署以及负载均衡
4. eureka注册中心安全访问设置
5. springcloud eureka实现HA高可用demo(注册中心高可用集群)

附加：其中spring_cloud_consumer包含自定义bean校验实现demo


# 修改点 yyyy-mm-dd by author
------------------------修改点 --------------------------                                                                                   
1.

# 修改点 2018-01-08 by yinhaiquan
------------------------修改点 --------------------------                                                                                   
1. spring_cloud_config 新增spring cloud bus总线支持                                                                                        

# 修改点 2018-01-09 by yinhaiquan
------------------------修改点 --------------------------                                                                                   
1. spring_cloud_hystrix_turbine 新增hystrix看板集群监控模块                                                                               
2. spring_cloud_zuul 新增zuul网关配置管理模块(简版)                                                                                       
3. spring_cloud_zuul_eureka 新增zuul网关配置管理模块基于eureka注册中心                                                                     

# 修改点 2018-01-10 by yinhaiquan
------------------------修改点 --------------------------                                                                                   
1. spring_cloud_config 新增 spring_cloud_config_server_eureka模块，基于eureka注册中心配置管理HA集群 

