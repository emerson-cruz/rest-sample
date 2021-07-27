package com.example.demo.two.init;

import com.example.demo.two.domain.Employee;
import com.example.demo.two.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@Slf4j
public class DatabaseLoader {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("John Doe", "manager")));
            log.info("Preloading " + repository.save(new Employee("Jane Doe ", "chief of staff")));
        };
    }
}
