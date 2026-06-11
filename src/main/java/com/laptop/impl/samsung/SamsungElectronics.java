package com.laptop.impl.samsung;

import com.laptop.interfaces.Electronics;
import org.springframework.stereotype.Component;

@Component("samsungElectronics")
public class SamsungElectronics implements Electronics {

    @Override
    public String getManufacturer() {
        return "Samsung";
    }

    @Override
    public String getProcessorModel() {
        return "Samsung Exynos 2400";
    }

    @Override
    public double getClockSpeedGHz() {
        return 4.2;
    }

    @Override
    public int getCoreCount() {
        return 10;
    }

    @Override
    public int getRamGB() {
        return 16;
    }

    @Override
    public String describePerformance() {
        return String.format(
            "[Електроніка Samsung] Процесор %s, %d ядер, %.1f ГГц, %d ГБ ОЗП — " +
            "енергоефективна продуктивність з оптимальним балансом потужності",
            getProcessorModel(), getCoreCount(), getClockSpeedGHz(), getRamGB()
        );
    }
}
