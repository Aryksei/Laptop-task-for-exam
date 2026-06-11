package com.laptop.impl.toshiba;

import com.laptop.interfaces.Body;
import org.springframework.stereotype.Component;

@Component("toshibaBody")
public class ToshibaBody implements Body {

    @Override
    public String getManufacturer() {
        return "Toshiba";
    }

    @Override
    public String getMaterial() {
        return "Пластик з покриттям soft-touch";
    }

    @Override
    public double getWeightKg() {
        return 2.1;
    }

    @Override
    public double getThicknessMm() {
        return 22.0;
    }

    @Override
    public String getColor() {
        return "Чорний";
    }

    @Override
    public String describeCompactness() {
        return String.format(
            "[Корпус Toshiba] %s, %.1f кг, %.1f мм — " +
            "класичний дизайн з практичними розмірами",
            getMaterial(), getWeightKg(), getThicknessMm()
        );
    }
}
