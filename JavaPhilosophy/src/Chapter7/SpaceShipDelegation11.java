public class SpaceShipDelegation11 {
private String name;
private SpaseShipControls controls = new SpaseShipControls();

public SpaceShipDelegation11(String name){
this.name = name;
}
	
	public void up(int velocity){
	controls.up(velocity);
	System.out.println("Vertical take-off of a rocket Proton-M: " + velocity + " m / s");
	}

    public static void main(String[] args) {
        SpaceShipDelegation11 protector = new SpaceShipDelegation11("Proton-M");
		protector.up(7182);
    }

}

class SpaseShipControls{
    void up(int velocity){
        
    }

}