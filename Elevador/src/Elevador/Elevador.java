package Elevador;

public class Elevador {
    private int cargaAtual;
    private final int cargaMaxima = 200; 
    private boolean sinalAlerta;
    private int id;

    public Elevador() {
        this.cargaAtual = 0;
    }

    public void Elevador() {
		// TODO Auto-generated constructor stub
	}

	public int getCargaAtual() {
        return cargaAtual;
    }

    public boolean entrarPessoa(int peso) {
    	Calculadora calc = new Calculadora();
    	cargaAtual = calc.somar(cargaAtual, peso);
    	return cargaAtual
    }

    public boolean sairPessoa(int peso) {
        cargaAtual -= peso;
        if (cargaAtual < 0) {
            cargaAtual = 0;
        }
        return true; // Pessoa saiu do elevador
    }

    public boolean avaliarPeso(int peso) {
        return cargaAtual + peso > cargaMaxima;
    }
}