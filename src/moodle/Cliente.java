package moodle;
import java.util.ArrayList;
import moodle.Registro;
import java.time.LocalDate;
import moodle.Pessoa;
import moodle.Carro;



public class Cliente extends Pessoa {

    private ArrayList<Carro> carros;

    public Cliente(String nome, String cpf,String email, String telefone, LocalDate idade) {
        super(nome, cpf, email, telefone, idade);
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        this.carros.add(carro);
    }

    public void removerCarro(Carro carro) {
        carros.remove(carro);
    }
    public Carro buscarCarro(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                return carro;
            }
        }
        return null; // Retorna null se o carro não for encontrado
    }
    
    @Override
    public String toString(){
    return getNome() + " (CPF : " + getCpf()+ ") - " + carros.size() + " carro(s)";
    }
    public ArrayList<Carro> getCarros() {
        return carros;
    }
}
