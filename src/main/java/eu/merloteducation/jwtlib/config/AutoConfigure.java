package eu.merloteducation.jwtlib.config;

import eu.merloteducation.jwtlib.security.JwtAuthConverter;
import eu.merloteducation.jwtlib.security.JwtAuthConverterProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan
public class AutoConfigure {
    @Bean
    @ConditionalOnMissingBean
    public JwtAuthConverter jwtAuthConverter() {
        return new JwtAuthConverter(new JwtAuthConverterProperties());
    }
}
