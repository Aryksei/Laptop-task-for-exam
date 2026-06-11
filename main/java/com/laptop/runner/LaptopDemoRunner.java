package com.laptop.runner;

import com.laptop.model.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LaptopDemoRunner implements CommandLineRunner {

    private final Laptop gamingLaptop;
    private final Laptop businessLaptop;
    private final Laptop multimediaLaptop;
    private final Laptop hybridLaptop;

    public LaptopDemoRunner(
            @Qualifier("gamingLaptop") Laptop gamingLaptop,
            @Qualifier("businessLaptop") Laptop businessLaptop,
            @Qualifier("multimediaLaptop") Laptop multimediaLaptop,
            @Qualifier("hybridLaptop") Laptop hybridLaptop
    ) {
        this.gamingLaptop = gamingLaptop;
        this.businessLaptop = businessLaptop;
        this.multimediaLaptop = multimediaLaptop;
        this.hybridLaptop = hybridLaptop;
    }

    @Override
    public void run(String... args) {
        System.out.println();
        System.out.println("=".repeat(64));
        System.out.println("   ПРОГРАМА ЗБОРКИ НОУТБУКІВ (IoC / Spring DI)");
        System.out.println("=".repeat(64));

        printLaptopInfo("ІГРОВИЙ НОУТБУК", gamingLaptop);
        printLaptopInfo("БІЗНЕС НОУТБУК", businessLaptop);
        printLaptopInfo("МУЛЬТИМЕДІЙНИЙ НОУТБУК", multimediaLaptop);
        printLaptopInfo("ГІБРИДНИЙ НОУТБУК", hybridLaptop);

        System.out.println("=".repeat(64));
        System.out.println("   ХАРАКТЕРИСТИКИ КОМПЛЕКТУЮЧИХ");
        System.out.println("=".repeat(64));

        System.out.println();
        System.out.println("▸ " + gamingLaptop);
        System.out.println("  • " + gamingLaptop.describeComputationSpeed());
        System.out.println("  • " + gamingLaptop.describeImageQuality());
        System.out.println("  • " + gamingLaptop.describeCompactness());

        System.out.println();
        System.out.println("▸ " + businessLaptop);
        System.out.println("  • " + businessLaptop.describeComputationSpeed());
        System.out.println("  • " + businessLaptop.describeImageQuality());
        System.out.println("  • " + businessLaptop.describeCompactness());

        System.out.println();
        System.out.println("▸ " + multimediaLaptop);
        System.out.println("  • " + multimediaLaptop.describeComputationSpeed());
        System.out.println("  • " + multimediaLaptop.describeImageQuality());
        System.out.println("  • " + multimediaLaptop.describeCompactness());

        System.out.println();
        System.out.println("▸ " + hybridLaptop);
        System.out.println("  • " + hybridLaptop.describeComputationSpeed());
        System.out.println("  • " + hybridLaptop.describeImageQuality());
        System.out.println("  • " + hybridLaptop.describeCompactness());

        System.out.println();
    }

    private void printLaptopInfo(String title, Laptop laptop) {
        System.out.println();
        System.out.println(">>> " + title + " <<<");
        System.out.println(laptop.getFullDescription());
    }
}
