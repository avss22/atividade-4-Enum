class Contratacao {

  private Date dataIni; 
  private Cargo cargo; 
  private Status status; 

  public Contratacao(Date dataIni, Cargo cargo) { 
      this.dataIni = dataIni; 
      this.cargo = cargo; 
      this.status = Status.PENDENTE; // Deve iniciar com status PENDENTE
  } 

  public void contratar() { 
      status = Status.CONTRATADO; 
  } 

  public void demitir() { 
      status = Status.DEMITIDO; 
  } 

} 
