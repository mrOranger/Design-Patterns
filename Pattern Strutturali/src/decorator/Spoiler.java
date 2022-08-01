package decorator;

/*
 * La classe componente che definisce un elemento decorativo.
 */
public class Spoiler extends Component{

	public Spoiler(Vehicle vehicle) {
		super(vehicle);
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("With a spoiler");
	}
}
