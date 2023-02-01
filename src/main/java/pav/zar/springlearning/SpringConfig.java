package pav.zar.springlearning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("pav.zar.springlearning")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
