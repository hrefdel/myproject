package com.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.util.SocketUtils;

import java.net.Socket;

@SpringBootApplication
@EnableEurekaClient //开启eureka客户端
@EnableRedisHttpSession
public class SpringclouduserApplication {

	/*@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> containerCustomizer(){
		return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
			@Override
			public void customize(ConfigurableWebServerFactory factory) {
				// 得到一个随机的端口
				int port = SocketUtils.findAvailableTcpPort(8001,8999);
				factory.setPort(port);
				System.getProperties().put("server.port",port);
			}
		};
	}*/
	public static void main(String[] args) {
		SpringApplication.run(SpringclouduserApplication.class, args);
	}

}
