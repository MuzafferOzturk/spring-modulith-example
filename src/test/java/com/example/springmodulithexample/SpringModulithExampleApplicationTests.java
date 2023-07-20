package com.example.springmodulithexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class SpringModulithExampleApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void writeDocumentationSnippets() {

        var modules = ApplicationModules.of(SpringModulithExampleApplication.class).verify();

        new Documenter(modules, "modules")
                .writeDocumentation();
    }

    @Test
    void writeModuleNames() {

        var modules = ApplicationModules.of(SpringModulithExampleApplication.class);

        modules.forEach(System.out::println);
    }

}
