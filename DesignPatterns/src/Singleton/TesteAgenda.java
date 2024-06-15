package Singleton;

public class TesteAgenda {

    // as duas chamadas do método alterarão a mesma instância do objeto, não permitindo que a cada nova chamada uma agenda nova seja criada
    public static void main(String[] args) {
        reservar("Sexta");
        reservar("Segunda");

    }

    public static void reservar(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupar(dia);
        System.out.println(agenda.getDias());
    }
}
