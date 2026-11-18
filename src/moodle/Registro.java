/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moodle;
import java.time.LocalDateTime;
import java.time.Duration;
import moodle.Funcionario;
import moodle.Carro;

/**
 *
 * @author usuario
 */
import java.time.LocalDateTime;

public class Registro {

    private Cliente cliente;
    private Carro carro;

    private LocalDateTime entrada;
    private LocalDateTime saida;

    private double valorPago;

    public Registro(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
    }

    public void registrarEntrada(LocalDateTime entrada) {
    this.entrada = entrada;
    }

    public void registrarSaida() {
    this.saida = LocalDateTime.now();
    calcularValor();
    }

    public double calcularValor() {
    long minutos = Duration.between(entrada, saida).toMinutes();

    if (minutos <= 15) {          // tolerância
        valorPago = 0;
    } else {
        long horas = (long) Math.ceil(minutos / 60.0);   // dica: 60.0, não 60
        valorPago = horas * 5;   // preço da hora
    }
    return valorPago;
}

    public void realizarPagamento() {}
}
