package org.example.config;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * cors跨越配置类
 */
@Configuration
@NoArgsConstructor
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        /* 允许跨域 */
        config.addAllowedOrigin("*");

        /* 设置是否携带cookie信息 */
        config.setAllowCredentials(true);
        /* 允许的header */
        config.addAllowedHeader("*");
        /* 允许的请求类型 */
        config.addAllowedMethod("*");

        /* 为url添加映射路径 */
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", config);

        return new CorsFilter(corsSource);
    }
}
