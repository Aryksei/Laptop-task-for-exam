package com.laptop.impl.samsung;

import com.laptop.interfaces.Display;
import org.springframework.stereotype.Component;

@Component("samsungDisplay")
public class SamsungDisplay implements Display {

    @Override
    public String getManufacturer() {
        return "Samsung";
    }

    @Override
    public double getScreenSizeInches() {
        return 15.6;
    }

    @Override
    public String getResolution() {
        return "3840x2160";
    }

    @Override
    public String getPanelType() {
        return "AMOLED";
    }

    @Override
    public int getRefreshRateHz() {
        return 120;
    }

    @Override
    public String describeImageQuality() {
        return String.format(
            "[Дисплей Samsung] %.1f\" %s %s, %d Гц — " +
            "неперевершена якість зображення з глибоким чорним та яскравими кольорами",
            getScreenSizeInches(), getPanelType(), getResolution(), getRefreshRateHz()
        );
    }
}
