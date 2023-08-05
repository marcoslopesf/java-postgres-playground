package com.example;

class Cliente {
    double renda;
    char sexo;
    int anoNascimento;

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >= 0) {
            this.renda = renda;
            
        }
        else System.out.println("Renda nao pode ser negativa");;
    }


}
public class AppClasses {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRenda(-1000);
        cliente.sexo = 'f';
        cliente.anoNascimento = 1992;
        System.out.println("Renda " + cliente.renda);        
        System.out.println("sexo "+ cliente.sexo);
        System.out.println("Ano de NAscimento "+ cliente.anoNascimento);

        System.out.println();
        Cliente cliente2 = new Cliente();
        cliente.setRenda(20000); 
        cliente.sexo = 'M';
        cliente.anoNascimento = 1998;
        System.out.println("Renda " + cliente.renda);        
        System.out.println("sexo "+ cliente.sexo);
        System.out.println("Ano de NAscimento "+ cliente.anoNascimento);


    }
}
