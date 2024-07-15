package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua funcionario", "Complemento funcionario", "Bairro funcionario");

        System.out.println("-----");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Thompson");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(9000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);

        System.out.println(vendedor);
        System.out.println("-----");

        OperadorDeCaixa opc = new OperadorDeCaixa("Carlos Op Caixa", "789.654.321-00", 2000.0, endereco);
        System.out.println(opc);
        System.out.println("-----");

        Gerente gerente = new Gerente();
        gerente.setNome("Eduardo Silva");
        gerente.setDocumento("123.456.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);
    }
}