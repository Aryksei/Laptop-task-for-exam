package com.laptop.interfaces;

// Інтерфейс електроніки — відповідає за швидкість розрахунків
public interface Electronics {

    String getManufacturer();

    String getProcessorModel();

    double getClockSpeedGHz();

    int getCoreCount();

    int getRamGB();

    String describePerformance();
}
