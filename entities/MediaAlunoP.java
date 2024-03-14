package entities;

public class MediaAlunoP {
	
    public String aluno;
    public Double n1;
    public Double n2;
    
    public Double media(){
        return (n1+n2)/2;
    }
 
    
    public String aprovacao(){
        if(media() >= 6 && media() <= 10){
            return "Aprovado! Parabéns " + aluno + ".";
        }
        else if(media() < 6 && media() >= 0){
            return "Reprovado!! Estude mais e boa sorte." + "\nFaltaram " + (6 - this.media()) + " pontos para ser aprovado.";
        }
        else {
        	return "Dados invalidos!! ";
        }
    }
    
   public String toString() {
	   return "Aluno: " + aluno + ", sua media foi: " + media() + " . " + aprovacao();
   }
	
}
