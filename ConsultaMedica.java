package Aula3.Exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsultaMedica {
    private ArrayList<Paciente> listaPaciente = new ArrayList<>();

    public void adicionarPaciente(Paciente paciente) {
        listaPaciente.add(paciente);
    }

    public void alterarPaciente(String nome, String sobrenome, LocalDate novaDataNascimento) {
        for (Paciente paciente : listaPaciente) {
            if (paciente.getNome().equals(nome) && paciente.getSobrenome().equals(sobrenome)) {
                paciente.setDataNascimento(novaDataNascimento);
                break;
            }
        }
    }

    public void realizarAtendimento(String nome, String sobrenome, Atendimento consulta) {
        for (Paciente paciente : listaPaciente) {
            if (paciente.getNome().equals(nome) && paciente.getSobrenome().equals(sobrenome)) {
                paciente.adicionarConsulta(consulta);
                break;
            }
        }
    }

    public void listarPacientes() {
        for (Paciente paciente : listaPaciente) {
            if (paciente.isAtivo()) {
                System.out.println(paciente);
            }
        }
    }

    public boolean mostrarPaciente(String nome, String sobrenome) {
        for (Paciente paciente : listaPaciente) {
            if (paciente.getNome().equals(nome) && paciente.getSobrenome().equals(sobrenome)) {
                System.out.println(paciente);
                int count = 0;
                for (Atendimento consulta : paciente.getConsultas()) {
                    System.out.println(consulta);
                    count++;
                    if (count % 5 == 0) {
                        System.out.println("Pressione Enter para continuar...");
                        new Scanner(System.in).nextLine();
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void apagarPaciente(String nome, String sobrenome) {
        listaPaciente.removeIf(paciente -> paciente.getNome().equals(nome) && paciente.getSobrenome().equals(sobrenome));
    }

    public static void main(String[] args) {
        ConsultaMedica consultaMedica = new ConsultaMedica();
        Scanner ler = new Scanner(System.in);
        int i = 0;
        while (i != 1) {
            System.out.println("Digite 1 para adicionar um paciente");
            System.out.println("Digite 2 para alterar um paciente");
            System.out.println("Digite 3 para realizar um atendimento");
            System.out.println("Digite 4 para listar os pacientes");
            System.out.println("Digite 5 para mostrar um paciente");
            System.out.println("Digite 6 para apagar um paciente");
            System.out.println("Digite 7 para sair");
            String op = ler.next();
            try {
                switch (op) {
                    case "1":
                        System.out.println("Digite o nome do paciente");
                        String nome = ler.next();
                        System.out.println("Digite o sobrenome do paciente");
                        String sobrenome = ler.next();
                        System.out.println("Digite a data de nascimento do paciente (yyyy-MM-dd)");
                        LocalDate dataNascimento = LocalDate.parse(ler.next());
                        Paciente paciente = new Paciente(nome, sobrenome, dataNascimento);
                        consultaMedica.adicionarPaciente(paciente);
                        break;
                    case "2":
                        System.out.println("Digite o nome do paciente");
                        nome = ler.next();
                        System.out.println("Digite o sobrenome do paciente");
                        sobrenome = ler.next();
                        System.out.println("Digite a nova data de nascimento do paciente (yyyy-MM-dd)");
                        dataNascimento = LocalDate.parse(ler.next());
                        consultaMedica.alterarPaciente(nome, sobrenome, dataNascimento);
                        break;
                    case "3":
                        System.out.println("Digite o nome do paciente");
                        nome = ler.next();
                        System.out.println("Digite o sobrenome do paciente");
                        sobrenome = ler.next();
                        Atendimento consulta = new Atendimento();
                        System.out.println("Digite a descrição da consulta");
                        consulta.setDescricao(ler.next());
                        consultaMedica.realizarAtendimento(nome, sobrenome, consulta);
                        break;
                    case "4":
                        consultaMedica.listarPacientes();
                        break;
                    case "5":
                        System.out.println("Digite o nome do paciente");
                        nome = ler.next();
                        System.out.println("Digite o sobrenome do paciente");
                        sobrenome = ler.next();
                        if (!consultaMedica.mostrarPaciente(nome, sobrenome)) {
                            System.out.println("Paciente não encontrado.");
                        }
                        break;
                    case "6":
                        System.out.println("Digite o nome do paciente");
                        nome = ler.next();
                        System.out.println("Digite o sobrenome do paciente");
                        sobrenome = ler.next();
                        consultaMedica.apagarPaciente(nome, sobrenome);
                        break;
                    case "7":
                        System.out.println("Saindo...");
                        i = 1;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Erro: Data inválida. Use o formato yyyy-MM-dd.");
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Tente novamente.");
                ler.next(); // Clear the invalid input
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}