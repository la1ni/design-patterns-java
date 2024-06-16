package Adapter;

import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();

        JarOperacoesContaCorrenteAdapter jarAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);

        ClienteJarOperacoesContaCorrenteAdapter client = new ClienteJarOperacoesContaCorrenteAdapter(jarAdapter);

        client.depositar(BigDecimal.valueOf(100.00));
        client.sacar(BigDecimal.valueOf(500.00));
        }
    }

