package com.laptop.impl.intel;

import com.laptop.interfaces.Display;
import org.springframework.stereotype.Component;

@Component("intelDisplay")
public class IntelDisplay implements Display {

    @Override
    public String getManufacturer() {
        return "Intel";
    }

    @Override
    public double getScreenSizeInches() {
        return 15.6;
    }

    @Override
    public String getResolution() {
        return "2560x1440";
    }

    @Override
    public String getPanelType() {
        return "IPS";
    }

    @Override
    public int getRefreshRateHz() {
        return 165;
    }

    @Override
    public String describeImageQuality() {
        return String.format(
            "[Дисплей Intel] %.1f\" %s %s, %d Гц — " +
            "високоякісне зображення з точною кольоропередачею",
            getScreenSizeInches(), getPanelType(), getResolution(), getRefreshRateHz()
        );
    }
}
