package com.laptop.impl.intel;

import com.laptop.interfaces.Electronics;
import org.springframework.stereotype.Component;

@Component("intelElectronics")
public class IntelElectronics implements Electronics {

    @Override
    public String getManufacturer() {
        return "Intel";
    }

    @Override
    public String getProcessorModel() {
        return "Intel Core i9-13900K";
    }

    @Override
    public double getClockSpeedGHz() {
        return 5.8;
    }

    @Override
    public int getCoreCount() {
        return 24;
    }

    @Override
    public int getRamGB() {
        return 32;
    }

    @Override
    public String describePerformance() {
        return String.format(
            "[Електроніка Intel] Процесор %s, %d ядер, %.1f ГГц, %d ГБ ОЗП — " +
            "забезпечує надвисоку швидкість розрахунків для професійних задач",
            getProcessorModel(), getCoreCount(), getClockSpeedGHz(), getRamGB()
        );
    }
}
