package Adapter;
import Adaptee.*;
public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine=weightMachine;
    }
    @Override 
    public double getWeightInKg() {
        double weightInPound=weightMachine.getWeightInPound();
        //Convert it to KGs
        double weightInkg=weightInPound * 0.45;
        return weightInkg;
    }
}
