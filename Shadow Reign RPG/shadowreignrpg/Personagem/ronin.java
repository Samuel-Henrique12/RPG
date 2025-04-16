package shadowreignrpg.personagem;
class Ronin extends Personagem {
    public Ronin (String nome) {
        super(nome);
        this.classe = "Ronin";
        this.vida = 110;
        this.ataque = 20;
        this.defesa = 45;
    }
}