
package projcarro;


public class Carro {
    private String fabricante;
    private String marca;
    private String modelo;
    private String tipo;
    private int anoFabricacao;
    private int potenciaCv;
    private double valorAvista;
    private double taxa;
    private double consumoMedioKmLitro;
    private double qtdDeCombustivel;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public double getValorAvista() {
        return valorAvista;
    }

    public void setValorAvista(double valorAvista) {
        this.valorAvista = valorAvista;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getConsumoMedioKmLitro() {
        return consumoMedioKmLitro;
    }

    public void setConsumoMedioKmLitro(double consumoMedioKmLitro) {
        this.consumoMedioKmLitro = consumoMedioKmLitro;
    }

    public double getQtdDeCombustivel() {
        return qtdDeCombustivel;
    }

    public void setQtdDeCombustivel(double qtdDeCombustivel) {
        this.qtdDeCombustivel = qtdDeCombustivel;
    }
    
    public double calcularDistanciaAPercorrer(){
       return this.qtdDeCombustivel*this.consumoMedioKmLitro; 
        
    }
    public double calcularConsumo(double distancia){
        return distancia/this.consumoMedioKmLitro;
    }
    public void abastecer(double valorLitro, double valorTotalAbastecido){
        this.qtdDeCombustivel += valorTotalAbastecido/valorLitro;
    }

    @Override
    public String toString() {
        return "\n"
               +"Fabricante: "+ fabricante + "\n"
               +"Marca: " + marca +"\n"
               +"Modelo: " + modelo +"\n "
               +"Tipo: "+ tipo+"\n"
               +"Ano Fabricação: "+anoFabricacao +"\n"
               +"Potencia Cv: " + potenciaCv + "\n"
               +"Valor a vista: " + valorAvista + "\n"
               +"Taxa: " + taxa + "\n"
               +"Consumo Medio Km Litro: " + consumoMedioKmLitro + "\n"
               +"Qtd De Combustivel: " + qtdDeCombustivel;
    }
    
}
