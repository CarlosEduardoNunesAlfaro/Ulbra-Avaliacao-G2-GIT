package projrevendaarraylist;

import java.util.ArrayList;

public class Revenda {

    private ArrayList<Carro> listaDeCarros;

    public Revenda() {
        this.listaDeCarros = new ArrayList<Carro>();
    }

    public ArrayList<Carro> getListaDeCarros() {
        return listaDeCarros;
    }

    public void setListaDeCarros(ArrayList<Carro> listaDeCarros) {
        this.listaDeCarros = listaDeCarros;
    }

    @Override
    public String toString() {
        String resposta = " ";
        for (int i = 0; i < this.listaDeCarros.size(); i++) {
            resposta += "\n" +  this.listaDeCarros.get(i) + "\n" + "::::::::::::::::::::::::::::";
        }
        return resposta;

    }
}