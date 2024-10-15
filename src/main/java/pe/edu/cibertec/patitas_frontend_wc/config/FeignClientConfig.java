package pe.edu.cibertec.patitas_frontend_wc.config;

import feign.Request;

import org.springframework.context.annotation.Bean;



public class FeignClientConfig {

    @Bean
    public Request.Options requestOptions() {
        return new Request.Options(3000, 3000);
    }


}


