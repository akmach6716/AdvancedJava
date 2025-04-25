package coreJavaAssignments.computerFactory;

public class MainTestProduct {
    public static void main(String[] args) {
ComputerCase theCase= new ComputerCase("2208", "Dell",
        "240");
Monitor monitor= new Monitor("27qe", "Asus",
        27,"3840X1440");
Motherboard motherboard= new Motherboard("bz200", "Asus",
        4,6,"V3.44");
PersonalComputer thePC= new PersonalComputer("2208", "Dell", theCase, monitor, motherboard);
thePC.getMonitor().drawPixelAt(10,10,"Blue");
thePC.getComputerCase().pressPowerButton();
thePC.getMotherboard().loadProgram("Windows");
        thePC.getComputerCase().pressPowerButton();

    }
}
