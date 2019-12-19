package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 总的应用配置
 */
@Configuration
@ComponentScan({"dao","service","controller"})
public class AppConfig {
}
