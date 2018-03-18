package exceptions.transporter;

public class Starship {

	private String name;
	private Transporter transporter = new Transporter();
	
	public Starship(String name) {
		this.name = name;
	}
	
	public void beamUp(String person, String from) {
		try {
			transporter.beam(person, from, name, true);
		} catch (TransporterMalfunctionException e) {
			
			//e.printStackTrace();
			System.err.println(e.getMessage());
			
		} finally {
			//with code in the finally block we guarantee
			//the execution of shutdown whether or not an Exception
			//is thrown in the try block
			transporter.shutdown();
		}
		
	}
	
}
