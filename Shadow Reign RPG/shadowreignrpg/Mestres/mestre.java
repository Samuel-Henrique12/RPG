package shadowreignrpg.mestres;
class Mestre {
    String nomeMestre;
    int vidaMestre;
    int ataqueMestre;
    int defesaMestre;

    public Mestre (String nomeMestre, int vidaMestre, int ataqueMestre, int defesaMestre) {
        this.nomeMestre = nomeMestre;
        this.vidaMestre = vidaMestre;
        this.ataqueMestre = ataqueMestre;
        this.defesaMestre = defesaMestre;
    }

    public String getNome() {return nomeMestre;}
    public int getVida() {return vidaMestre;}
    public int getAtaque() {return ataqueMestre;}
    public int getDefesa() {return defesaMestre;}
}
