package com.laptop.impl.intel;

import com.laptop.interfaces.Body;
import org.springframework.stereotype.Component;

@Component("intelBody")
public class IntelBody implements Body {

    @Override
    public String getManufacturer() {
        return "Intel";
    }

    @Override
    public String getMaterial() {
        return "Алюміній";
    }

    @Override
    public double getWeightKg() {
        return 1.8;
    }

    @Override
    public double getThicknessMm() {
        return 17.5;
    }

    @Override
    public String getColor() {
        return "Сріблястий";
    }

    @Override
    public String describeCompactness() {
        return String.format(
            "[Корпус Intel] %s, %.1f кг, %.1f мм — " +
            "збалансований між міцністю та портативністю",
            getMaterial(), getWeightKg(), getThicknessMm()
        );
    }
}
