package Entity;

import java.util.ArrayList;
import java.util.List;

public class EntityCatenaAlberghiera{
	
	private String codiceCatena;
	private String nomeCatena;
	private List<EntityAlbergo> alberghi;
	
	public EntityCatenaAlberghiera(String codice, String nome) {
		
		this.codiceCatena = codice;
		this.nomeCatena = nome;
		this.alberghi = new ArrayList<>();
	}
	
	public String getCodiceCatena() {
		return codiceCatena;
	}
	
	public void setCodiceCatena(String codice) {
		this.codiceCatena = codice;
	}
	
	public String getNomeCatena() {
		return nomeCatena;
	}
	
	public void setNomeCatena(String nome) {
		this.nomeCatena = nome;
	}
	
	public List<EntityAlbergo> getAlberghi(){
		return alberghi;
	}
	
	public void addAlbergo(EntityAlbergo nuovo) {
		alberghi.add(nuovo);
	}
	
	public void removeAlbergo(EntityAlbergo vecchio) {
		alberghi.remove(vecchio);
	}
}