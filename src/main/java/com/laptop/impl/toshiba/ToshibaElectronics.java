package com.laptop.impl.toshiba;

import com.laptop.interfaces.Electronics;
import org.springframework.stereotype.Component;

@Component("toshibaElectronics")
public class ToshibaElectronics implements Electronics {

    @Override
    public String getManufacturer() {
        return "Toshiba";
    }

    @Override
    public String getProcessorModel() {
        return "Toshiba SpursEngine SE2000";
    }

    @Override
    public double getClockSpeedGHz() {
        return 3.6;
    }

    @Override
    public int getCoreCount() {
        return 8;
    }

    @Override
    public int getRamGB() {
        return 16;
    }

    @Override
    public String describePerformance() {
        return String.format(
            "[Електроніка Toshiba] Процесор %s, %d ядер, %.1f ГГц, %d ГБ ОЗП — " +
            "надійна продуктивність для повсякденних та бізнес-задач",
            getProcessorModel(), getCoreCount(), getClockSpeedGHz(), getRamGB()
        );
    }
}
