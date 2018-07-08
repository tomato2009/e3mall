#### 项目说明

##### 开发工具、环境

- eclipse Version: Neon.3 Release (4.6.3)
- maven 3.3.9
- jdk 1.8
- git github



##### 项目架构

**该项目为简单的ssm结构，垂直结构，下一个阶段step2 会在此基础上改成soa结构项目**

- spring、spring mvc、mybatis

- e3-common 为基础包，放置一些工具的pom目录

- e3-parent 为父pom包，放置所有jar的以来管理

- e3-manager 为实际代码项目包，包括module

  - e3-manager-dao：mybatis逆向工程代码，*mapper.xml   *mapper.java 存放处

    ​	pom需要依赖 mybatis相关环境，jar项目

  - e3-manager-interface：为e3-manager-service 提供接口定义，jar项目

  - e3-manager-pojo：mybatis逆向工程生成的 pojo，和 mysql表对应，jar项目

  - e3-manager-service：服务实现类，封装所有业务、服务，pom需要依赖spring环境和e3-manager-interface、e3-manager-dao，jar项目

  - e3-manager-web：表现层，所有controller， pom需要依赖jsp或其他表现层环境报、依赖e3-manager-service ，war项目

    

  e3-manager 的pom配置

  ~~~xml
  <build>
  		<plugins>
  			<!-- 配置Tomcat插件 -->
  			<plugin>
  				<groupId>org.apache.tomcat.maven</groupId>
  				<artifactId>tomcat7-maven-plugin</artifactId>
  				<configuration>
  					<path>/</path>
  					<port>8080</port>
  				</configuration>
  			</plugin>
  		</plugins>
  	</build>
  ~~~

  

后maven build 运行即可

~~~xml
clean tomcat7:run
~~~

