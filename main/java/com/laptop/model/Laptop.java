package com.laptop.model;

import com.laptop.interfaces.Body;
import com.laptop.interfaces.Display;
import com.laptop.interfaces.Electronics;

// Головний клас — залежності інжектуються через конструктор (IoC)
public class Laptop {

    private final Electronics electronics;
    private final Display display;
    private final Body body;

    public Laptop(Electronics electronics, Display display, Body body) {
        this.electronics = electronics;
        this.display = display;
        this.body = body;
    }

    // ── Геттери ──

    public Electronics getElectronics() {
        return electronics;
    }

    public Display getDisplay() {
        return display;
    }

    public Body getBody() {
        return body;
    }

    // ── Методи опису характеристик ──

    public String describeComputationSpeed() {
        return electronics.describePerformance();
    }

    public String describeImageQuality() {
        return display.describeImageQuality();
    }

    public String describeCompactness() {
        return body.describeCompactness();
    }

    public String getFullDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("╔══════════════════════════════════════════════════════════════╗\n");
        sb.append("║                    ЗІБРАНИЙ НОУТБУК                        ║\n");
        sb.append("╠══════════════════════════════════════════════════════════════╣\n");

        sb.append("║ ЕЛЕКТРОНІКА (швидкість розрахунків):                        ║\n");
        sb.append("║  Виробник:   ").append(padRight(electronics.getManufacturer(), 46)).append("║\n");
        sb.append("║  Процесор:   ").append(padRight(electronics.getProcessorModel(), 46)).append("║\n");
        sb.append("║  Частота:    ").append(padRight(electronics.getClockSpeedGHz() + " ГГц", 46)).append("║\n");
        sb.append("║  Ядра:       ").append(padRight(String.valueOf(electronics.getCoreCount()), 46)).append("║\n");
        sb.append("║  ОЗП:        ").append(padRight(electronics.getRamGB() + " ГБ", 46)).append("║\n");

        sb.append("╠──────────────────────────────────────────────────────────────╣\n");

        sb.append("║ ДИСПЛЕЙ (якість зображення):                                ║\n");
        sb.append("║  Виробник:   ").append(padRight(display.getManufacturer(), 46)).append("║\n");
        sb.append("║  Діагональ:  ").append(padRight(display.getScreenSizeInches() + "\"", 46)).append("║\n");
        sb.append("║  Роздільна:  ").append(padRight(display.getResolution(), 46)).append("║\n");
        sb.append("║  Матриця:    ").append(padRight(display.getPanelType(), 46)).append("║\n");
        sb.append("║  Частота:    ").append(padRight(display.getRefreshRateHz() + " Гц", 46)).append("║\n");

        sb.append("╠──────────────────────────────────────────────────────────────╣\n");

        sb.append("║ КОРПУС (компактність):                                      ║\n");
        sb.append("║  Виробник:   ").append(padRight(body.getManufacturer(), 46)).append("║\n");
        sb.append("║  Матеріал:   ").append(padRight(body.getMaterial(), 46)).append("║\n");
        sb.append("║  Вага:       ").append(padRight(body.getWeightKg() + " кг", 46)).append("║\n");
        sb.append("║  Товщина:    ").append(padRight(body.getThicknessMm() + " мм", 46)).append("║\n");
        sb.append("║  Колір:      ").append(padRight(body.getColor(), 46)).append("║\n");

        sb.append("╚══════════════════════════════════════════════════════════════╝");

        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format(
            "Ноутбук [Електроніка: %s, Дисплей: %s, Корпус: %s]",
            electronics.getManufacturer(),
            display.getManufacturer(),
            body.getManufacturer()
        );
    }

    private String padRight(String text, int length) {
        if (text.length() >= length) {
            return text.substring(0, length);
        }
        return text + " ".repeat(length - text.length());
    }
}
