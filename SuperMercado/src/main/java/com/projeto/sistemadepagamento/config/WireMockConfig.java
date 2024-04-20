package com.projeto.sistemadepagamento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.github.tomakehurst.wiremock.WireMockServer;

@Configuration
public class WireMockConfig {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public WireMockServer wireMockServer() {
        WireMockServer wireMockServer = new WireMockServer(8080); // Porta configurada para o WireMock
        wireMockServer.start();
        return wireMockServer;
    }
}
