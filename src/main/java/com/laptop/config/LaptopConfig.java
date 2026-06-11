package com.laptop.config;

import com.laptop.interfaces.Body;
import com.laptop.interfaces.Display;
import com.laptop.interfaces.Electronics;
import com.laptop.model.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// IoC-конфігурація: заміна деталей — через зміну @Qualifier, без перепису логіки
@Configuration
public class LaptopConfig {

    @Bean
    public Laptop gamingLaptop(
            @Qualifier("intelElectronics") Electronics electronics,
            @Qualifier("samsungDisplay") Display display,
            @Qualifier("intelBody") Body body
    ) {
        return new Laptop(electronics, display, body);
    }

    @Bean
    public Laptop businessLaptop(
            @Qualifier("toshibaElectronics") Electronics electronics,
            @Qualifier("toshibaDisplay") Display display,
            @Qualifier("samsungBody") Body body
    ) {
        return new Laptop(electronics, display, body);
    }

    @Bean
    public Laptop multimediaLaptop(
            @Qualifier("sonyElectronics") Electronics electronics,
            @Qualifier("sonyDisplay") Display display,
            @Qualifier("sonyBody") Body body
    ) {
        return new Laptop(electronics, display, body);
    }

    @Bean
    public Laptop hybridLaptop(
            @Qualifier("samsungElectronics") Electronics electronics,
            @Qualifier("intelDisplay") Display display,
            @Qualifier("toshibaBody") Body body
    ) {
        return new Laptop(electronics, display, body);
    }
}
