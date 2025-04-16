package shadowreignrpg.inimigo;
class Inimigo {
    String nomeinimigo;
    int vida;
    int ataque;

    public Inimigo (String nomeinimigo, int vida, int ataque) {
        this.nomeinimigo = nomeinimigo;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNomeInimigo() {return nomeinimigo;}
    public int getVida() { return vida; }
    public void reduzirVida (int dano) {vida -= dano; }
    public int getAtaque() {return ataque; }
}