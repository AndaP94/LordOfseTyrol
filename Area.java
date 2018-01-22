import java.util.ArrayList;
import java.util.Iterator;
public class Area {
	
	private String area;
	private ArrayList<Creature> creature;
	
	
	public Area(String area) {
		creature=new ArrayList<>();
		setArea(area);
		
	}
	public Area() {
		creature=new ArrayList<>();
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public void addCreatur(String name, String typ) {
		
		creature.add(new Creature(name, typ));
		
	}
	
	public void showAllCreatures() {
		
		for(int i = 0; i<creature.size(); i++) {
			
			Creature creaturename = creature.get(i);
				
			System.out.println("Kreatur " + (i+1)+ " "+ creaturename.getName()+ " " + creaturename.getTyp()+ "\n");
		}
		System.out.println("-------------------------------------------\n");
	}
	public ArrayList<Creature> getCreature() {
		return creature;
	}
	public void setCreature(ArrayList<Creature> creature) {
		this.creature = creature;
	}
	
	public String searchName(String name) {
		String name1 = null;
		for(int i=0; i<creature.size(); i++) {
			Creature creatures=creature.get(i);
		
			
		
		if(creatures.getName().equals(name)) {
			name1= creatures.getName();
			
		}
		
		}
		
		return name1;
	}
	
	public void removeCreature(String name) {
		
		for(int i=0; i<creature.size(); i++) {
			Creature creatures=creature.get(i);
		
			
		
		if(creatures.getName().equals(name)) {
			creature.remove(i);
			
		}
	}
		
	}

}
