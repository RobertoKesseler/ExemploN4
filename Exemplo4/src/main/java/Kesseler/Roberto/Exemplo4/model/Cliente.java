package Kesseler.Roberto.Exemplo4.model;

/**
 * @author Roberto Kesseler
 * @Version 1.0
 * @Since 17/04/2020 - 15:00
 */
public class Cliente {

    private String nome;

    /**
     *
     * @param nome
     */
    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
