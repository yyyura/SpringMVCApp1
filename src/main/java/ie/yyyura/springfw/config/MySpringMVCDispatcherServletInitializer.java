package ie.yyyura.springfw.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // we not using this method
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // as in web.xml path to context xml
        // теперь класс знает где находится конфигурация
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // any (/) URL request will go to My Dispatcher Servlet
        return new String[]{"/"};
    }
}
