package shadowreignrpg.personagem;

class Personagem {
    protected String nome;
    protected String classe;
    protected int vidaMaxima;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected int xp;
    protected int level = 1;
    protected int xpParaProximoNivel = 50;
    protected int pontosDeMelhoria = 0;
    protected int pontos = 0;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
    
    public void ganharXp(int xpGanho) {
        xp += xpGanho;
        System.out.println("Voce ganhou " + xpGanho + " de XP!");

        while (xp >= xpParaProximoNivel) {
            subirNivel();
        }
    }

    public void reduzirVida(int dano) {
        int danoFinal = dano - defesa /4;
        if (danoFinal < 1) dano = 1;
        vida -= danoFinal;
        if (vida < 0) {
            vida = 0;
        }
        System.out.println("Recebeu " +danoFinal + " de dano!");
    }

    public void recuperarVida(int cura) {
        vida += cura;
        if(vida > vidaMaxima) {
            vida = vidaMaxima; 
        }
        System.out.println("Voce recuperou" +cura + "de vida");
    }

// Método de Level UP
    
    public void subirNivel() {
        xp -= xpParaProximoNivel;
        level++;
        xpParaProximoNivel += 50;

        System.out.println("Subiu para o nivel " +level + "!");

// Menu de Upgrade
    abrirMenuUpgrade(new Scanner(System.in));
    pontosDeMelhoria +=3;
    }

    public void abrirMenuUpgrade(Scanner entrada) {
        int pontos = 3;
        while (pontosDeMelhoria > 0) {
            System.out.println("Voce tem " + pontosDeMelhoria + "pontos");
            System.out.println("[1] Aumentar Ataque (+5)");
            System.out.println("[2] Aumentar Defesa (+5)");
            System.out.println("[3] Aumentar Vida (+5)");
            System.out.println("[4] Sair");
            System.out.println("Escolha:");
            int UpgradeStatus = entrada.nextInt();

            switch (UpgradeStatus) {
            case 1:
                ataque += 5;
                System.out.println("Ataque aumentado para: " +ataque);
                break;
            case 2:
                defesa += 5;
                System.out.println("Defesa aumentada para: " +defesa);
                break;
            case 3:
                vida += 5;
                System.out.println("Vida aumentada para: " +vida);
                break;
            case 4:
                System.out.println("Pontos Restantes; " +pontosDeMelhoria);
                System.out.println("Saindo do Menu...");
                return;
            default: 
                System.out.println("Opcao invalida, selecione a opcao [1], [2], [3] ou [4]");
                continue;
            }
            pontos --;
        }
    }

}