package com.laptop.impl.sony;

import com.laptop.interfaces.Display;
import org.springframework.stereotype.Component;

@Component("sonyDisplay")
public class SonyDisplay implements Display {

    @Override
    public String getManufacturer() {
        return "Sony";
    }

    @Override
    public double getScreenSizeInches() {
        return 16.0;
    }

    @Override
    public String getResolution() {
        return "3840x2400";
    }

    @Override
    public String getPanelType() {
        return "OLED";
    }

    @Override
    public int getRefreshRateHz() {
        return 120;
    }

    @Override
    public String describeImageQuality() {
        return String.format(
            "[Дисплей Sony] %.1f\" %s %s, %d Гц — " +
            "кінематографічна якість зображення з технологією TRILUMINOS",
            getScreenSizeInches(), getPanelType(), getResolution(), getRefreshRateHz()
        );
    }
}
