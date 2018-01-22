/**
 * 
 * @author Andreas Pichler, Marian Montibeller
 * @version 1.0
 * This class creates a creatures with a name and the typ 
 *
 */
public class Creature {
	
	private String name;
	private String typ;
	
	public Creature(String name,String typ) {
		setName(name);
		setTyp(typ);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}
	

}
