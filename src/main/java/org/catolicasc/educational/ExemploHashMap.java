package org.catolicasc.educational;

import java.util.HashMap;

public class ExemploHashMap {
    public void testeHashMap() {
        // Criação do HashMap
        HashMap<Integer, String> meses = new HashMap<>();

        // Adicionando os meses ao HashMap
        meses.put(1, "Janeiro");
        meses.put(2, "Fevereiro");
        meses.put(3, "Março");
        meses.put(4, "Abril");
        meses.put(5, "Maio");
        meses.put(6, "Junho");
        meses.put(7, "Julho");
        meses.put(8, "Agosto");
        meses.put(9, "Setembro");
        meses.put(10, "Outubro");
        meses.put(11, "Novembro");
        meses.put(12, "Dezembro");

        // Acessando os valores do HashMap
        String mes = meses.get(3);
        System.out.println("O mês correspondente ao número 3 é: " + mes);

        // Verificando se uma chave existe no HashMap
        boolean existeChave = meses.containsKey(9);
        System.out.println("Existe a chave 9? " + existeChave);

        // Verificando se um valor existe no HashMap
        boolean existeValor = meses.containsValue("Agosto");
        System.out.println("Existe o valor 'Agosto'? " + existeValor);

        // Removendo um elemento do HashMap
        meses.remove(4);

        // Iterando sobre as chaves do HashMap
        System.out.println("Chaves do HashMap:");
        for (Integer chave : meses.keySet()) {
            System.out.println(chave);
        }

        // Iterando sobre os valores do HashMap
        System.out.println("Valores do HashMap:");
        for (String valor : meses.values()) {
            System.out.println(valor);
        }
    }
}