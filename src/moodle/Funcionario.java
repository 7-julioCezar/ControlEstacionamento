/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moodle;


import moodle.Carro; 
import java.util.ArrayList;
import moodle.Cliente;
import java.time.LocalDate;


/**
 *
 * @author usuario
 */


public class Funcionario extends Pessoa {

    private String turno;

    public Funcionario(String nome, String cpf,String email, String telefone, LocalDate idade, String turno) {
        super(nome, cpf, email, telefone, idade);
        this.turno = turno;
    }

    public void cadastrarCliente() {

    }

    public void cadastrarCarro() {}

    public void editarCliente() {}

    public void editarCarro() {}

    public void registrarEntrada() {}

    public void registrarSaida() {}
}