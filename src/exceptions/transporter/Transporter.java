package exceptions.transporter;

public class Transporter {
	
	public void beam(String person, String from,
							String to, boolean urgent)
						throws TransporterMalfunctionException {
		
		if(urgent && Math.random() < 0.5) {
			throw new TransporterMalfunctionException("uppss... somebody just died. We're really sorry!");
		}
		
		System.out.println("beaming "+person+" from " + from + " to " +to);
	}
	
	public void shutdown() {
		System.out.println("shutting down transporter after beaming");
	}

}
