package com.redlightbar;

import com.cmeza.sdgenerator.annotation.SDGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

@SDGenerator(
        entityPackage = "red-light-api.src.main.java.com.redlightbar.model",
        repositoryPackage = "red-light-api.src.main.java.com.redlightbar.repository",
        managerPackage = "red-light-api.src.main.java.com.redlightbar.service",
        repositoryPostfix = "Repository",
        managerPostfix = "Service",
        onlyAnnotations = false,
        debug = false,
        overwrite = false,
        additionalExtends = {
                QuerydslPredicateExecutor.class
        }
)
@SpringBootApplication
public class RedLightBarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedLightBarApplication.class, args);
    }

}
