package com.laptop.interfaces;

// Інтерфейс дисплея — відповідає за якість зображення
public interface Display {

    String getManufacturer();

    double getScreenSizeInches();

    String getResolution();

    String getPanelType();

    int getRefreshRateHz();

    String describeImageQuality();
}
