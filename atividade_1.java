public class aluno
{
    private String nome;
    private String novoNome;
    private int id;
    private int novoId;
    private double media;
    protected double nota1, nota2;
    private String situacao;
    
    public aluno( String nome, int id, double nota1, double nota2){
        this.nome = nome;
        this.id = id;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        calculaMedia();
    }
    
    public void alteraNome(String novoNome){
        nome = novoNome;
        System.out.println("novoNome");
    }
    
    public void alteraId( int novoId){
        id = novoId;
        System.out.println("novoId");
    }
    
    private void calculaMedia() {
        media = (nota1+nota2)/2;
         System.out.println(media);
         situacao();
    }
    public void situacao(){
        if (media > 7) {
            this.situacao = "true";
        } else { 
            this.situacao = "false";
        }
    }
    }
