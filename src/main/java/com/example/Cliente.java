package com.example;

    public class Cliente {
    public double renda;
    public char sexo;
    public int anoNascimento;
    private boolean especial;

    public Cliente(){
    System.out.println("criando um cliente usando o contrutor sem parametro"); 
    double aleatorio = Math.random();  
    if (aleatorio > 0.5) {
        especial = true;
        
    }
}
    public Cliente(double renda, char sexo){
        this();
        System.out.println("criando um cliente usando o contrutor com parametro"); 
        setRenda(renda);
        this.sexo = sexo;

            
        }
    


     


 public boolean isEspecial() {
    return especial;
}
public void setEspecial(boolean especial) {
    this.especial = especial;
}
   public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >= 0) {
            this.renda = renda;
            
        }
        else System.out.println("Renda nao pode ser negativa");;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
            
        } else {
            System.out.println("Invalido");
        }
        
    }

}