/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuempresa;

/**
 *
 * @author SOUSA
 */
public class Funcionario {

    String nome;
    String nascimento;
    String sexo;
    int idade;

    @Override
    public String toString() {
        String texto = "\nNome: " + this.nome
                + "\nData de nascimento: " + this.nascimento
                + "\nSexo: " + this.sexo
                + "\nIdade: " + this.idade;

        return texto;
    }
}
