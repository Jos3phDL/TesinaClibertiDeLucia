package Entity;


import java.util.Date;

//qua si devono fare degli import per i database
//qua si devono fare degli import per le exception

public class EntityPrenotazione{
	
	private String codicePrenotazione;
	private Date dataArrivo;
	private Date dataPartenza;
	private int numeroStanza;
	private double prezzoComplessivo;
	private int idCliente;
	private boolean confermata;
	
	private EntityCamera camera;
	private EntityCliente cliente;
	
	public EntityPrenotazione(String codice, Date arrivo, Date partenza, int stanza, double costo, int id, EntityCamera room, EntityCliente guest){
		
		//super()
		this.codicePrenotazione = codice;
		this.dataArrivo = arrivo;
		this.dataPartenza = partenza;
		this.numeroStanza = stanza;
		this.prezzoComplessivo = costo;
		this.idCliente = id;
		this.camera = room;
		this.cliente = guest;
		this.confermata = false;
	}
	
	public String getCodicePrenotazione() {
		return codicePrenotazione;
	}
	
	public void setCodicePrenotazione(String codice) {
		this.codicePrenotazione = codice;
	}
	
	public Date getDataArrivo() {
		return dataArrivo;
	}
	
	public void setDataArrivo(Date arrivo) {
		this.dataArrivo = arrivo;
	}
	
	public Date getDataPartenza() {
		return dataPartenza;
	}
	
	public void setDataPartenza(Date partenza) {
		this.dataPartenza = partenza;
	}
	
	public int getNumeroStanza() {
		return numeroStanza;
	}
	
	public void setNumeroStanza(int stanza) {
		this.numeroStanza = stanza;
	}
	
	public double getPrezzoComplessivo() {
		return prezzoComplessivo;
	}
	
	public void setPrezzoComplessivo(double prezzo) {
		this.prezzoComplessivo = prezzo;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int id) {
		this.idCliente = id;
	}
	
	
	public EntityCamera getCamera() {
        return camera;
    }

    public void setCamera(EntityCamera camera) {
        this.camera = camera;
    }

    public EntityCliente getCliente() {
        return cliente;
    }

    public void setCliente(EntityCliente cliente) {
        this.cliente = cliente;
    }
	
	
    public boolean isConfermata() {
        return confermata;
    }

    public void confermaPrenotazione() {
        this.confermata = true;
    }
    
    public void inviaEmailConferma() {
        String destinatario = cliente.getEmail();
        String testo = "Gentile " + cliente.getNome() + ",\nLa sua prenotazione con codice " + codicePrenotazione + " è stata confermata.\nGrazie per aver scelto il nostro albergo.";
        System.out.println(testo);
        System.out.println("Email di conferma inviata a: " + destinatario);
    }
}