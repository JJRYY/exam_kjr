package exam_kjr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSource.class, ContextSqlSession.class, MvcConfig.class})
@ComponentScan(basePackages = {
		"exam_kjr.mapper", "exam_kjr.controller", 
		"exam_kjr.service" })
public class ContextRoot {

}
