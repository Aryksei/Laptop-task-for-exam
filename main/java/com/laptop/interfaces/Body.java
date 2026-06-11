package com.laptop.interfaces;

// Інтерфейс корпусу — відповідає за компактність
public interface Body {

    String getManufacturer();

    String getMaterial();

    double getWeightKg();

    double getThicknessMm();

    String getColor();

    String describeCompactness();
}
