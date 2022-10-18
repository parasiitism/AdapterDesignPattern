package Client;
import Adaptee.*;
import Adapter.*;

public class Main {
    public static void main(String args[]) {
        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
        System.out.println("Adapter Design pattern is done now! ");
    }    
}
