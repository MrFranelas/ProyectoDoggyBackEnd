package doggy.backend.repository;

import java.util.ArrayList;
import java.util.List;

import doggy.backend.domain.Fountain;

public class FountainsRepository {
	
	private static FountainsRepository myInstance = null;

	private List<Fountain> fountains = new ArrayList<>();

	private FountainsRepository() {
		
	}
	
	public static FountainsRepository getInstance(){
		if(myInstance==null) {
			myInstance = new FountainsRepository();
		}
		return myInstance;
	}
	
	public List<Fountain> getListFountain(){
		return fountains;
	}
	
	public void addFountain(Fountain fountain) {
		fountains.add(fountain);
	}
	
}
