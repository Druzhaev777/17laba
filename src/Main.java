import java.util.ArrayList;
import java.util.List;

abstract class Machine {
    String Transport;
    List<String> accessories=new ArrayList();
    public String toString(){
        return "Type of transportation:" + "Transport /N"+ accessories;

    }
}
abstract class MachineFactory{
    public abstract Machine createMachine();
}
class RoadLogisticFactory extends MachineFactory {
    public Machine createMachine(){
        return new RoadLogistic();
    }
}
class AirLogisticFactory extends MachineFactory{
    public Machine createMachine(){
        return new AirLogistic();
    }
}
class SeaLogisticFactory extends MachineFactory{
    public Machine createMachine(){
        return new SeaLogistic();
    }
}

class RoadLogistic extends Machine{
    public RoadLogistic(){
        Transport="RoadLogistic";
        accessories.add("Capacity in tons");//Вместимость в тоннах
        accessories.add("Fuel consumption");//Расход топлива
        accessories.add("Travel time");//Время в пути
        accessories.add("Navigation system");//Система навигации
    }
}
class AirLogistic extends Machine{
    public AirLogistic(){
        Transport="AirLogistic";
        accessories.add("Capacity in tons");//Вместимость в тоннах
        accessories.add("Fuel consumption");//Расход топлива
        accessories.add("Travel time");//Время в пути
        accessories.add("Navigation system");//Система навигации a
    }
}
class SeaLogistic extends Machine{
    public SeaLogistic(){
        Transport="SeaLogistic";
        accessories.add("Capacity in tons");//Вместимость в тоннах
        accessories.add("Fuel consumption");//Расход топлива
        accessories.add("Travel time");//Время в пути
        accessories.add("Navigation system");//Система навигации
    }
}

public class Main{
    public static void main(String args[]){
        MachineFactory RoadFactory=new RoadLogisticFactory();
        MachineFactory AirFactory=new AirLogisticFactory();
        MachineFactory SeaFactory=new SeaLogisticFactory();
        Machine RoadLogistic=RoadFactory.createMachine();
        Machine AirLogistic=AirFactory.createMachine();
        Machine SeaLogistic=SeaFactory.createMachine();
        System.out.println(RoadLogistic);
        System.out.println(AirLogistic);
        System.out.println(SeaLogistic);
    }
}