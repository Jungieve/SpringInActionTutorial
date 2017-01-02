package SpringOnWeb.BuildingSpringWebApplication.Spittr.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by congzihan on 16/12/31.
 */
@Configuration
@ComponentScan(basePackages = {"SpringOnWeb.BuildingSpringWebApplication.Spittr"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
        })
public class RootConfig {
}
