/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moodle;

import moodle.Cliente;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Carro {

    private String placa;
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    

    public Carro(String placa, String modelo,
                 String marca, String cor, int ano) {
        
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }
  

 

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
       
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public void editarDados() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Editando dados do carro...");
        ano = Integer.parseInt(System.console().readLine("Digite o novo ano do carro: "));
        this.ano = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite a nova cor do carro: ");
        this.cor = sc.nextLine();
        
        System.out.println("Digite o novo modelo do carro: ");
        this.modelo = sc.nextLine();
        
        System.out.println("Digite a nova marca do carro: ");
        this.marca = sc.nextLine();
        
        System.out.println("Dados do carro atualizados com sucesso!");
    }
}
