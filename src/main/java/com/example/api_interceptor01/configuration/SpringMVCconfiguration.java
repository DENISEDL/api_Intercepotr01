package com.example.api_interceptor01.configuration;
import com.example.api_interceptor01.interceptors.APILoggingInterceptor;
import com.example.api_interceptor01.interceptors.LegacyIntercepotr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCconfiguration implements WebMvcConfigurer {
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;
    @Autowired
    private LegacyIntercepotr legacyIntercepotr;
        @Override
        public void addInterceptors(InterceptorRegistry registry){
            registry.addInterceptor(apiLoggingInterceptor);
            registry.addInterceptor(legacyIntercepotr);
        }
    }

