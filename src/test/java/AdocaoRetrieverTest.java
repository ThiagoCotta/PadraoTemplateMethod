import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdocaoRetrieverTest {

    @Test
    void deveRetonarAprovado() {
        AdocaoRetriever adocao = new AdocaoRetriever();

        Familia familia = new Familia();

        Pessoa pessoa1 = new Pessoa("João", 2000.0);
        Pessoa pessoa2 = new Pessoa("Maria", 2500.0);
        Pessoa pessoa3 = new Pessoa("Pedro", 3000.0);

        familia.adicionarPessoa(pessoa1);
        familia.adicionarPessoa(pessoa2);
        familia.adicionarPessoa(pessoa3);

        adocao.setFamilia(familia);
        assertEquals("Aprovado", adocao.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        AdocaoRetriever adocao = new AdocaoRetriever();

        Familia familia = new Familia();

        Pessoa pessoa1 = new Pessoa("Mariana", 1000.0);
        Pessoa pessoa2 = new Pessoa("Lucia", 700.0);
        Pessoa pessoa3 = new Pessoa("Jorge", 1250.0);

        familia.adicionarPessoa(pessoa1);
        familia.adicionarPessoa(pessoa2);
        familia.adicionarPessoa(pessoa3);

        adocao.setFamilia(familia);
        assertEquals("Reprovado", adocao.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AdocaoRetriever adocao = new AdocaoRetriever();

        Familia familia = new Familia();
        Pessoa pessoa1 = new Pessoa("Mariana", 1000.0);
        familia.adicionarPessoa(pessoa1);

        adocao.setFamilia(familia);
        adocao.setNomeResponsavel("Mariana");
        assertEquals("Adocao{ responsavel ='Mariana', resultado =Reprovado}", adocao.getInfo());
    }
}