/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuempresa;

/**
 *
 * @author SOUSA
 */
public class Empresa {

    Funcionario empregado[] = new Funcionario[20];
    String endereco;
    String nomefantasia;
    String cnpj;
    String ramo;

    public void cadastraFuncionario(Funcionario funcionario) {

        for (int i = 0; i < 20; i++) {
            if (this.empregado[i] == null) {
                this.empregado[i] = funcionario;
                break;
            }
        }
    }

    public boolean consultaFuncionario(String nomefuncionario) {

        for (int i = 0; i < 10; i++) {
            if (this.empregado[i] != null) {
                if (this.empregado[i].nome.equals(nomefuncionario)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean exluirFuncionario(String nomefuncionario) {

        for (int i = 0; i < 20; i++) {
            if (this.empregado[i] != null) {
                if (this.empregado[i].nome.equals(nomefuncionario)) {
                    this.empregado[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String texto = "Dados da Empresa\n"
                + "\nNome Fantasia: " + this.nomefantasia
                + "\nEndereco: " + this.endereco
                + "\nCNPJ: " + this.cnpj
                + "\nRamo de atuacao: " + this.ramo
                + "\n\nLista de Funcionarios:";

        for (int i = 0; i < 10; i++) {
            if (this.empregado[i] != null) {
                texto += "\n" + this.empregado[i].toString();
            }
        }
        return texto;
    }
}
