package electricEquipment.computers;

import electricEquipment.ElectricEquipment;

public abstract class Computers extends ElectricEquipment {
    private int ram;
    private String procesor;


    Computers(String model, String name, double costPrice, int ram, String procesor){
        super(model, name, costPrice);
        setRam(ram);
        this.procesor = procesor;

    }


    public void setRam(int ram) {
        if (ram > 0) {
            this.ram = ram;

        }else System.exit(1);
    }

    public int getRam() {
        return ram;
    }
}
