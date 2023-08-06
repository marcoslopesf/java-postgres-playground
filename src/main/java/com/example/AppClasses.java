package com.example;

public class AppClasses {
    public static void main(String[] args) { 
        Cliente cliente = new Cliente();
        cliente.setRenda(-1000);
        cliente.setSexo('r');
        cliente.anoNascimento = 1992;
        System.out.println("Renda " + cliente.renda);        
        System.out.println("sexo "+ cliente.sexo);
        System.out.println("Ano de NAscimento "+ cliente.anoNascimento);
        System.out.println("especial "+ cliente.isEspecial());
        System.out.println();

        Cliente cliente2 = new Cliente(-2000, 'F');
        System.out.println("Renda " + cliente2.renda);        
        System.out.println("sexo "+ cliente2.sexo);
        System.out.println("Ano de NAscimento "+ cliente2.anoNascimento);
        System.out.println("especial "+ cliente2.isEspecial());

    }
}
