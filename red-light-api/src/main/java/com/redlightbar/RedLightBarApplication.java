package com.redlightbar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

//@SDGenerator(
//        entityPackage = "com.redlightbar.model",
//        repositoryPackage = "com.redlightbar.repository",
//        managerPackage = "com.redlightbar.service",
//        repositoryPostfix = "Repository",
//        managerPostfix = "Service",
//        onlyAnnotations = false,
//        debug = false,
//        overwrite = false,
//        additionalExtends = {
//                QuerydslPredicateExecutor.class
//        }
//)
@SpringBootApplication
public class RedLightBarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedLightBarApplication.class, args);
    }

}
