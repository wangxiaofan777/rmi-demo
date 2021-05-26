package com.wxf.server.config;

import com.wxf.common.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.stereotype.Component;

/**
 * RMI服务
 */
@Configuration
public class RmiServer {

    @Autowired
    private IUserService userService;

    @Bean
    public RmiServiceExporter rmiServiceExporter() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("userService");
        rmiServiceExporter.setRegistryPort(2002);
        rmiServiceExporter.setServiceInterface(IUserService.class);
        rmiServiceExporter.setService(userService);
        return rmiServiceExporter;
    }
}
