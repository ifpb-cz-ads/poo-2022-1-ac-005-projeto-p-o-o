import java.util.List;

enum posicaojogadores {
    levantador,
    líbero,
    ponta-esquerda,
    ponta-direita
}

class jogadores {
    String name;
    posicaojogador posicao;
}

class equipe {
    String name;
    String flag;
    String crest; 
    Lista<joagadores> jogadores;
}
