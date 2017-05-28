package innerclasses;
import controller.*;

public class GreenhouseControlsNeo extends GreenhouseControls{

    private boolean humidificationSupport = false;
    public class HumidificationSupportOn extends Event {
        public HumidificationSupportOn(long delayTime){
            super(delayTime);
        }

        public void action(){
            humidificationSupport = true;
        }

        public String toString(){
            return "Humidification support on !";
        }
    }

    public class HumidificationSupportOff extends Event{
        public HumidificationSupportOff(long delayTime){
            super(delayTime);
        }

        public void action(){
            humidificationSupport = false;
        }

        public String toString(){
            return "Humidification support off !";
        }
    }

}