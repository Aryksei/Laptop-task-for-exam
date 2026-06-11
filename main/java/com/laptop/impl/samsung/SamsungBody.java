package com.laptop.impl.samsung;

import com.laptop.interfaces.Body;
import org.springframework.stereotype.Component;

@Component("samsungBody")
public class SamsungBody implements Body {

    @Override
    public String getManufacturer() {
        return "Samsung";
    }

    @Override
    public String getMaterial() {
        return "Магнієвий сплав";
    }

    @Override
    public double getWeightKg() {
        return 1.5;
    }

    @Override
    public double getThicknessMm() {
        return 14.9;
    }

    @Override
    public String getColor() {
        return "Графітовий";
    }

    @Override
    public String describeCompactness() {
        return String.format(
            "[Корпус Samsung] %s, %.1f кг, %.1f мм — " +
            "ультратонкий та легкий, ідеальний для мобільного використання",
            getMaterial(), getWeightKg(), getThicknessMm()
        );
    }
}
