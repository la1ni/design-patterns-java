package TemplateMethod;

public abstract class ReparoVeiculoService {
    public void reparaVeiculo() {
        entradaOficina();
        analisarDanos();
        if (veiculoParaReparo()) {
            notificarReparoParaSeguradora();
        } else {
            noificarPTParaSeguradora();
        }
    }
    protected abstract  boolean veiculoParaReparo();
    private void entradaOficina(){
        System.out.println("Entrando na oficina...");
    }

    private void analisarDanos(){
        System.out.println("Analisando danos...");
    }

    private void notificarReparoParaSeguradora(){
        System.out.println("O veículo está sendo reparado");
    }

    private void noificarPTParaSeguradora(){
        System.out.println("O veículo sofreu perda total. Não será possível reparar. ");
    }
}
