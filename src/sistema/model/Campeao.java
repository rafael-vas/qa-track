package sistema.model;

public abstract class Campeao {
    private String nome;
    private int nivel;
    private int vida;
    private int mana;
    private int danoAtaque;
    private Item[] itens;
    private int totalItens;

    public Campeao(String nome) {
        this(nome, 1, 100, 50, 15, 6);
    }

    public Campeao(String nome, int nivel, int vida, int mana, int danoAtaque, int capacidadeItens) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
        this.danoAtaque = danoAtaque;
        this.itens = new Item[capacidadeItens];
        this.totalItens = 0;
    }
}