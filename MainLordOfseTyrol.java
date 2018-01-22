
public class MainLordOfseTyrol {

	public static void main(String[] args) {
		
		WorldCard card = new WorldCard();
		
		card.addArea("Mountain");
		card.addArea("Desert");
		card.addArea("Forest");
		card.addArea("Karibik");
		card.addArea("seTyrol");
		
		card.showAllAreas();
		
		System.out.println("---------------------------");
		
		
		
		
		card.addCreatureinArea("Anda", "Ork");
		card.addCreatureinArea("Marian", "Ork");
		card.addCreatureinArea("Eva", "Human");
		card.addCreatureinArea("Gimmli", "Dwarf");
		card.addCreatureinArea("Hois", "Elfe");
		card.addCreatureinArea("Lius", "Dwarf");
		card.addCreatureinArea("Ameli", "Human");
		card.addCreatureinArea("Ginga", "Ork");
		card.addCreatureinArea("Ringelblume", "Elfe");
		card.addCreatureinArea("Gollum", "Gollum");
		
		
		
	
		card.showAllCreaturesInTheWorld();		
		
		System.out.println("--------------------------------------------------");
		
		card.goTO("Anda", "Ork", "Karibik");
		
		
		
		
		
		
		
		
		
		System.out.println("--------------------------------------------------");
		
		card.showAllCreaturesInTheWorld();
		
		System.out.println("--------------------------------------------------");
		
		card.searchName("Anda");
		
		
		
		

	}
	
	

}
