package com.laptop.impl.sony;

import com.laptop.interfaces.Electronics;
import org.springframework.stereotype.Component;

@Component("sonyElectronics")
public class SonyElectronics implements Electronics {

    @Override
    public String getManufacturer() {
        return "Sony";
    }

    @Override
    public String getProcessorModel() {
        return "Sony CXD9001 Custom";
    }

    @Override
    public double getClockSpeedGHz() {
        return 4.5;
    }

    @Override
    public int getCoreCount() {
        return 12;
    }

    @Override
    public int getRamGB() {
        return 24;
    }

    @Override
    public String describePerformance() {
        return String.format(
            "[Електроніка Sony] Процесор %s, %d ядер, %.1f ГГц, %d ГБ ОЗП — " +
            "потужна мультимедійна продуктивність для творчих професіоналів",
            getProcessorModel(), getCoreCount(), getClockSpeedGHz(), getRamGB()
        );
    }
}
