public class Elevador {
   private int andarAtual;
   public int N;
   
   public Elevador(int N){
    this.N = N;
    this.andarAtual = 0;
   }

   public int[] irPara(int andarDestino){
    if(andarDestino > this.andarAtual){
        return this.subir(andarDestino);
    }else {
        return this.descer(andarDestino);
    }
    }

    private int[] subir(int andarDestino){
        int[] andares = new int[andarDestino - this.andarAtual];

        for(int i = 0; i < andares.length; i++){
            this.andarAtual++;
            andares[i] = this.andarAtual;
        }

        return andares;
    }
    
    private int[] descer(int andarDestino){
        int[] andares = new int[this.andarAtual - andarDestino];

        for(int i = 0; i < andares.length; i++){
            this.andarAtual --;
            andares[i] = andarAtual;
        }
        return andares;
    }

    public String getAndarAtual(){
        return "Andar atual=" + this.andarAtual;
    }
}
