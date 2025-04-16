package shadowreignrpg.personagem;
class Samurai extends Personagem {
    public Samurai (String nome) {
        super(nome);
        this.classe = "Samurai";
        this.vida = 150;
        this.ataque = 25;
        this.defesa = 15;
    }
}