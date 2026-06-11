package com.laptop.impl.toshiba;

import com.laptop.interfaces.Display;
import org.springframework.stereotype.Component;

@Component("toshibaDisplay")
public class ToshibaDisplay implements Display {

    @Override
    public String getManufacturer() {
        return "Toshiba";
    }

    @Override
    public double getScreenSizeInches() {
        return 14.0;
    }

    @Override
    public String getResolution() {
        return "1920x1080";
    }

    @Override
    public String getPanelType() {
        return "IPS";
    }

    @Override
    public int getRefreshRateHz() {
        return 60;
    }

    @Override
    public String describeImageQuality() {
        return String.format(
            "[Дисплей Toshiba] %.1f\" %s %s, %d Гц — " +
            "якісне зображення для офісної роботи та мультимедіа",
            getScreenSizeInches(), getPanelType(), getResolution(), getRefreshRateHz()
        );
    }
}
