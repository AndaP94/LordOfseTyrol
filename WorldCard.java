import java.util.ArrayList;
import java.util.Iterator;
public class WorldCard {
	
	private ArrayList<Area> worldarea;
	
	
	public WorldCard() {
		
		worldarea= new ArrayList<>();
		
	}
	
	public void addArea(String name) {
		
		worldarea.add(new Area(name));
	}
	
	public void addCreatureinArea(String name,  String typ) {
		
		boolean a=false;
		
		if(typ.equals("Ork")) {
			for(int i=0; i<worldarea.size(); i++) {
				Area area=worldarea.get(i);
				if(area.getArea().equals("Desert")) {
					area.addCreatur(name, typ);
				}
			}
			a=true;
		}
		
		if(typ.equals("Elfe")) {
			for(int i=0; i<worldarea.size(); i++) {
				Area area=worldarea.get(i);
				if(area.getArea().equals("Forest")) {
					area.addCreatur(name, typ);
				}
			}
			a=true;
		}
		
		if(typ.equals("Human")) {
			for(int i=0; i<worldarea.size(); i++) {
				Area area=worldarea.get(i);
				if(area.getArea().equals("Karibik")) {
					area.addCreatur(name, typ);
				}
			}
			a=true;
		}
		
		if(typ.equals("Dwarf")) {
			for(int i=0; i<worldarea.size(); i++) {
				Area area=worldarea.get(i);
				if(area.getArea().equals("Mountain")) {
					area.addCreatur(name, typ);
				}
			}
			a=true;
		}
		
			if(a==false) {
			for(int i=0; i<worldarea.size(); i++) {
				Area area=worldarea.get(i);
				if(area.getArea().equals("seTyrol"))
					area.addCreatur(name, typ);
				
			}
			
		}
	}
		
	
	
	public void showAllAreas() {
		
		for(int i=0; i<worldarea.size(); i++) {
			
			System.out.println("Area: " + (i+1)+ " " +  worldarea.get(i).getArea());
		}
	}
	
	
	
	public ArrayList<Area> getWorldarea() {
		return worldarea;
	}

	public void setWorldarea(ArrayList<Area> worldarea) {
		this.worldarea = worldarea;
	}

	public void searchAreaShowCreatures(String areas) {
		
		Iterator<Area> it =worldarea.iterator();
		
		while(it.hasNext()) {
			Area area=it.next();
			
		
			if(area.getArea().equals(areas)) {
				area.showAllCreatures();
			}
			
			
		}
	}
	
	public void showAllCreaturesInTheWorld() {
		
		Iterator<Area> it =worldarea.iterator();
		
		while(it.hasNext()) {
			Area area=it.next();
			
		
			System.out.println("Area: "+ area.getArea()+ "\n" );
			area.showAllCreatures();
			
			
			
		}
	}
	
	public String searchName(String name) {
		
		for(int i=0; i<worldarea.size(); i++) {
			
			Area area = worldarea.get(i);
			
			String solution=area.searchName(name);
			
			if(solution !=null) {
			
			System.out.println("Aria: " + area.getArea()+ " " + solution);
			return area.getArea();
			}
		}
		return "error"; 
	
	}
	
	public void goTO(String name, String typ,  String area) {
		
		String soltution = searchName(name);
		
		for(int i = 0; i<worldarea.size(); i++) {
			Area areas1= worldarea.get(i);
			if(areas1.getArea().equals(area)) {
				areas1.addCreatur(name, typ);
			}
			
		}
		
		
		for(int i=0; i<worldarea.size(); i++) {
			Area areas=worldarea.get(i);
			if(areas.getArea().equals(soltution))	{
					areas.removeCreature(name);
				}
				
			}
			
			
		
		
		
		
	}
	
	

	
	

}
