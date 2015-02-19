package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.karl.CalculatorInterface;
import za.ac.cput.karl.CalculatorServiceImpl;

/**
 * Created by student on 2015/02/18.
 */

    @Configuration
    public class Config {
        @Bean(name="calc")
        public CalculatorInterface getService(){
            return new CalculatorServiceImpl();
        }

}
