package decorator;

/*
 * La classe componente che definisce un elemento decorativo.
 */
public class Tire extends Component{

	public Tire(Vehicle vehicle) {
		super(vehicle);
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("With a new tire");
	}
}
