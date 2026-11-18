/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamento;
import moodle.Carro;
import moodle.Cliente;
import moodle.Pessoa;
import moodle.Registro;
import java.time.LocalDateTime;

import java.time.LocalDate;
/**
 *
 * @author usuario
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bem Vindo!.\nAo Sistema de controle de estacionamento: ");
    
    Cliente cliente = new Cliente(
        "João da Silva",
        "123.456.789-00",
        "joao.silva@email.com",
        "(11) 98765-4321",
        LocalDate.of(2010, 11, 10)

    );
     Cliente c = new Cliente(
        "Cleber machado",
        "123.456.721-00",
        "clebinho199@email.com",
        "(11) 98765-4213",
        LocalDate.of(2000, 1, 12)

    );
    
    Carro carro = new Carro(
        "ABC-1234",
        "Civic",
        "Honda",
        "Preto",
        2022);

    Carro carro2 = new Carro(
        "DEF-5678",
        "Corolla",
        "Toyota",
        "Branco",
        2021);
    System.out.println(cliente.getNome());
    System.out.println(cliente.getCpf());
    System.out.println(cliente.getEmail());
    System.out.println(cliente.getTelefone());
    System.out.println(cliente.getIdade());
    System.out.println("");

    System.out.println(carro.getPlaca());
    System.out.println(carro.getModelo());
    System.out.println(carro.getMarca());
    System.out.println(carro.getCor());
    System.out.println(carro.getAno());
    System.out.println("---------------------------------------------------");
    System.out.println(carro2.getPlaca());
    System.out.println(carro2.getModelo());         
    System.out.println(carro2.getMarca());
    System.out.println(carro2.getCor());
    System.out.println(carro2.getAno());
    System.out.println("---------------------------------------------------");
    
   
    cliente.adicionarCarro(carro);
    System.out.print(cliente.toString());
    System.out.println("\n");
    System.out.println(c.toString());
    
    c.adicionarCarro(carro2);
    c.removerCarro(carro2);

    
    cliente.toString();
    c.toString();
    
    Registro r = new Registro(cliente, carro);
    r.registrarEntrada(LocalDateTime.now().minusMinutes(61));
    r.registrarSaida();
    System.out.println(r.calcularValor());   // esperado: 10.0
    }
    
}