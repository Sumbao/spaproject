package com.main.myprojectspa.domain.projectspa.util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;
/**
 * Created by zazabi37 on 31/03/2016.
 */
public class ApplicationConstant {
    public static Logger LOGGER = LoggerFactory.getLogger(ApplicationConstant.class);
    public static  Properties connectProperties = null;

    public static  String PATH_FILE = "PathFileSpa=C:/picPro/";

    static {
        Resource resource = new ClassPathResource("/config.properties");
        try{
            connectProperties = PropertiesLoaderUtils.loadProperties(resource);
            PATH_FILE =  ((connectProperties == null) ? PATH_FILE : (String)connectProperties.get("PathFileSpa"));
        }catch(IOException e){
            LOGGER.error("Error : {}", e);
        }
    }
}
