import innerclasses.*;
import innerclasses.controller.*;

public class GreenhouseController23{
   public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
		   gc.new ThermostatNight(0),
		   gc.new LightOn(200),
		   gc.new LightOff(400),
		   gc.new HumidificationSupportOn(600),
		   gc.new HumidificationSupportOff(800),
		   gc.new AerationOn(1000),
		   gc.new AerationOff(1200),
		   gc.new ThermostatDay(1400),
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1){
		   gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
		}
		gc.run();
    }
}