/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moodle;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Pessoa {

   
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;

    
    
    
   
    


       public Pessoa(String nome, String cpf, String email, String telefone, LocalDate dataNascimento){
           this.nome = nome;
           this.cpf = cpf;
           this.email = email;
           this.telefone = telefone;
           this.dataNascimento = dataNascimento;
       }
    public void atualizarCadastro(String nome,String cpf,String email,
                                  String telefone,LocalDate dataNascimento) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu novo email : ");
        this.email = sc.nextLine();
        System.out.println("Digite seu novo numero  de celular : ");
        this.telefone = sc.nextLine();
       
        
    }



    public boolean validaCpf(){

        if (cpf == null) {
            return false;
        }

        // Remove pontos, traços e qualquer caractere que não seja número
        cpf = cpf.replaceAll("\\D", "");

        // Precisa ter 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Rejeita CPFs com todos os dígitos iguais (ex: 111.111.111-11)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        int i;
        for (i = 0 ; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int resto = (soma * 10) % 11;
        int digito1 = (resto == 10) ? 0 : resto;

        if (digito1 != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        resto = (soma * 10) % 11;
        int digito2 = (resto == 10) ? 0 : resto;

        return digito2 == Character.getNumericValue(cpf.charAt(10));
    
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade(){
         return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
 
}