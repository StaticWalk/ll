### 使用步骤  

1. 使用mvn install将[rpc](https://github.com/StaticWalk/rpc)安装到本地maven仓库。 
2. 启动zookeeper。  
3. 配置好client-config.properties和server-config.properties两个配置文件中的参数。  
4. 在客户端CalcService接口中定义方法名，服务端的CalcServiceImpl实现方法代码。   
5. 运行Server程序。  
6. 运行Client程序，就能看见远程调用的正确输出。   
