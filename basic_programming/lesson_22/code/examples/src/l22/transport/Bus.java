package homeworks.l22.transport;

public class Bus extends Transport {
    int passengerNumber;

   public Bus(String mark, int productionYear, int passengerNumber) {
       super(mark, productionYear);
       this.passengerNumber = passengerNumber;
   }

    public String toString(){
        return "Bus | " + mark + " | " + productionYear + " | " + passengerNumber;
    }
}
