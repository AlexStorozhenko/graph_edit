package com.ptoop.graph;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Alexey Storozhenko
 * @since: 09.03.2018
 */
@SpringBootApplication
public class GraphEditorApp implements CommandLineRunner {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(GraphEditorApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("  -----  Graphical editor  -----  ");
        System.out.println("");

        System.out.println("");
        System.out.println("  -------  END  -------  ");
    }
}
