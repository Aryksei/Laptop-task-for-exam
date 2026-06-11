package com.laptop.impl.sony;

import com.laptop.interfaces.Body;
import org.springframework.stereotype.Component;

@Component("sonyBody")
public class SonyBody implements Body {

    @Override
    public String getManufacturer() {
        return "Sony";
    }

    @Override
    public String getMaterial() {
        return "Вуглецеве волокно";
    }

    @Override
    public double getWeightKg() {
        return 1.3;
    }

    @Override
    public double getThicknessMm() {
        return 13.2;
    }

    @Override
    public String getColor() {
        return "Темно-синій";
    }

    @Override
    public String describeCompactness() {
        return String.format(
            "[Корпус Sony] %s, %.1f кг, %.1f мм — " +
            "преміальний ультракомпактний дизайн для максимальної мобільності",
            getMaterial(), getWeightKg(), getThicknessMm()
        );
    }
}
