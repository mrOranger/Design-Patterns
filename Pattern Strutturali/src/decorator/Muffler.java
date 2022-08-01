package decorator;

/*
 * La classe componente che definisce un elemento decorativo.
 */
public class Muffler extends Component{

	public Muffler(Vehicle vehicle) {
		super(vehicle);
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("With a new muffler");
	}
}
