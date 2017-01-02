package SpringOnWeb.BuildingSpringWebApplication.Spittr.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by congzihan on 16/12/31.
 */
// 继承AbstractAnnotationConfigDispatcherServletInitializer的任意类都会自动配置Dispatcher-Servlet和Spring Application-context
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    // 指定配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    // 将DispatcherServlet映射到"/",会将一个或者多个路径映射到DispatcherServlet上
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
