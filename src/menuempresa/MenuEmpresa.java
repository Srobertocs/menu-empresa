/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuempresa;

import javax.swing.JOptionPane;

/**
 *
 * @author SOUSA
 */
public class MenuEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        mostraopcoes();

    }

    public static int menu(int opcao) {

        String menu = " MENU EMPRESA"
                + "\n 1 - Cadastrar empresa "
                + "\n 2 - Cadastrar funcionario"
                + "\n 3 - Consultar funcionário"
                + "\n 4 - Exibir funcionário da empresa"
                + "\n 5 - Excluir o cadastro de funcionario"
                + "\n 6 - Sair";

        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        return opcao;

    }

    public static void mostraopcoes() {
        int opcao = 0;
        Empresa empresa = null;
        Funcionario funcionario = null;

        while (opcao != 6) {

            opcao = menu(opcao);

            switch (opcao) {
                case 1:

                    if (empresa == null) {
                        empresa = new Empresa();

                        empresa.nomefantasia = JOptionPane.showInputDialog("DADOS CADASTRAIS DA EMPRESA\nDigite o Nome da Empresa: ");
                        empresa.endereco = JOptionPane.showInputDialog("DADOS CADASTRAIS DA EMPRESA\nDigite o endereco: ");
                        empresa.cnpj = JOptionPane.showInputDialog("DADOS CADASTRAIS DA EMPRESA\nDigite o cnpj: ");
                        empresa.ramo = JOptionPane.showInputDialog("DADOS CADASTRAIS DA EMPRESA\nDigite o ramo de atuacao: ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Empresa ja cadastrada");
                    }

                    break;
                case 2:

                    if (empresa != null) {

                        funcionario = new Funcionario();

                        funcionario.nome = JOptionPane.showInputDialog("DADOS CADASTRAIS DO FUNCIONARIO\nDigite o nome: ");
                        funcionario.idade = Integer.parseInt(JOptionPane.showInputDialog("DADOS CADASTRAIS DO FUNCIONARIO\nDigite a idade: "));
                        funcionario.sexo = JOptionPane.showInputDialog("DADOS CADASTRAIS DO FUNCIONARIO\nDigite o sexo: ");
                        funcionario.nascimento = JOptionPane.showInputDialog("DADOS CADASTRAIS DO FUNCIONARIO\nDigite a data de nascimento: ");

                        empresa.cadastraFuncionario(funcionario);

                    } else {
                        JOptionPane.showMessageDialog(null, "A empresa não foi cadastrada");
                    }

                    break;
                case 3:

                    if (empresa != null) {
                        if (empresa.consultaFuncionario(JOptionPane.showInputDialog("Digite o nome do funcionario para a consulta:"))) {
                            JOptionPane.showMessageDialog(null, "Funcionario encontrado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "A empresa não foi cadastrada");
                    }

                    break;
                case 4:

                    if (empresa != null) {
                        JOptionPane.showMessageDialog(null, empresa.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "A empresa não foi cadastrada");
                    }
                    break;

                case 5:

                    if (empresa != null) {
                        if (empresa.exluirFuncionario(
                                JOptionPane.showInputDialog("Digite o nome do funcionario para a consulta:"))) {
                            JOptionPane.showMessageDialog(null, "Funcionario Excluido");
                        } else {
                            JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "A empresa não foi cadastrada");
                    }
                    break;

                case 6:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcao não existe");
            }
        }

    }
}
