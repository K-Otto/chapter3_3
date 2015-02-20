package za.ac.cput.karl.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.karl.Impl.ListAppImpl;
import za.ac.cput.karl.ListApp;

/**
 * Created by student on 2015/02/20.
 */

    @Configuration
    public class AppConfig {

        @Bean(name="calc")
        public ListApp getModularCalculator(){
            return new ListAppImpl();
        }
    }



