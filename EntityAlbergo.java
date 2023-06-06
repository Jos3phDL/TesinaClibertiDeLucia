package Entity;

import java.util.ArrayList;
import java.util.List;

public class EntityAlbergo{
	
	private String identificativoAlbergo;
	private String nomeAlbergo;
	private String indirizzoAlbergo;
	private int capAlbergo;
	private int telefonoAlbergo;
	private List<EntityCamera> camere;
	
	public EntityAlbergo(String id, String nome, String indirizzo, int cap, int telefono) {
		
		this.identificativoAlbergo = id;
		this.nomeAlbergo = nome;
		this.indirizzoAlbergo = indirizzo;
		this.capAlbergo = cap;
		this.telefonoAlbergo = telefono;
		this.camere = new ArrayList<>();
	}
	
	public String getIdentificativoAlbergo() {
		return identificativoAlbergo;
	}
	
	public void setIdentificativoAlbergo(String id) {
		this.identificativoAlbergo = id;
	}
	
	public String getNomeAlbergo() {
		return nomeAlbergo;
	}
	
	public void setNomeAlbergo(String nome) {
		this.nomeAlbergo = nome;
	}
	
	public String getIndirizzoAlbergo() {
		return indirizzoAlbergo;
	}
	
	public void setIndirizzoAlbergo(String indirizzo) {
		this.indirizzoAlbergo = indirizzo;
	}
	
	public int getCapAlbergo() {
		return capAlbergo;
	}
	
	public void setCapAlbergo(int cap) {
		this.capAlbergo = cap;
	}
	
	public int getTelefonoAlbergo() {
		return telefonoAlbergo;
	}
	
	public void setTelefonoAlbergo(int telefono) {
		this.telefonoAlbergo = telefono;
	}
	
	public List<EntityCamera> getCamere(){
		return camere;
	}
	
	public void addCamera(EntityCamera nuova) {
		camere.add(nuova);
	}
	
	public void removeCamera(EntityCamera vecchia) {
		camere.remove(vecchia);
	}
}