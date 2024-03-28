class Projeto {

     private String nome;  
     private Date dtInicio, dtTermino;

     List<Contratacao> contratacoes;

     public Projeto(String nome, Date dtInicio, Date dtTermino){
         this.nome=nome;
         this.dtInicio=dtInicio;
         this.dtTermino=dtTermino;

         contratacoes=new ArrayList<>();
     }

     boolean adicionarContratacao(Contratacao c){
          if(c!=null){
              contratacoes.add(c);
              return true;
          }
          return false;
     }
}
