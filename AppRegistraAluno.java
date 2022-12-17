package TesteIgualdade;
import java.io.*;
import java.util.*;

public class AppRegistraAluno {
	
public static void main(String[] args) throws IOException {
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
	RegistraAluno aluno = new RegistraAluno();
	RegistraProfessor professor = new RegistraProfessor();
	RegistraFuncionario funcionarioTerceirizado = new RegistraFuncionario();
	int contador=0;

	while(contador==0) {
		System.out.println("Bem-vindo ao sistema de cadastro da escola Santo Antonio!");
		System.out.println("Escolha as opcoes que deseja cadastrar");
		System.out.println(" ");
		System.out.println("Alunos: Digite 1");
		System.out.println("Professores: Digite 2");
		System.out.println("Funcionarios terceirizados: Digite 3");
		System.out.println("Funcionarios administrativos: Digite 4");
		System.out.println("Digite 8: Se quiser sair");
		
		int teclado = Integer.parseInt(bfr.readLine());
		
		switch(teclado) {
		case 1:{
			aluno.cadastraAluno();
			contador++;
			System.out.println("Digite 1, caso queira ver o banco de dados dos alunos");
			System.out.println("Digite 2, caso queira voltar ao menu");
			int tecladoAluno = Integer.parseInt(bfr.readLine());
			if(tecladoAluno==1) {
				System.out.println("Lista de alunos:");
				aluno.mostraAluno();
				System.out.println("Digite 2, caso queira voltar ao menu");
				tecladoAluno = Integer.parseInt(bfr.readLine());
				if(tecladoAluno ==2) {
					contador=0;
				}
				
			}
			if(tecladoAluno==2) {
				contador=0;
				tecladoAluno=0;
			}
			break;
			
		}
			
			
		case 2:{
			
			professor.cadastraProfessor();
			contador++;
			System.out.println("Digite 1, caso queira ver o banco de dados dos Professores");
			System.out.println("Digite 2, caso queira voltar ao menu");
			int tecladoProf = Integer.parseInt(bfr.readLine());
			if(tecladoProf == 1) {
				professor.mostraProfessores();
				System.out.println("Digite 2, caso queira voltar ao menu");
				tecladoProf = Integer.parseInt(bfr.readLine());
				if(tecladoProf ==2) {
					contador=0;
				}
			}
			if(tecladoProf==2) {
				contador=0;
				tecladoProf=0;
			}
			break;
			
		}
		case 3:{
			funcionarioTerceirizado.CadastraFuncionario();
			contador++;
			System.out.println("Digite 1, caso queira ver o banco de dados dos funcionarios terceirizados");
			System.out.println("Digite 2, caso queira voltar ao menu");
			int tecladoFuncionario = Integer.parseInt(bfr.readLine());
			if(tecladoFuncionario == 1) {
				funcionarioTerceirizado.MostraFuncionario();
				System.out.println("Digite 2, caso queira voltar ao menu");
				tecladoFuncionario = Integer.parseInt(bfr.readLine());
				if(tecladoFuncionario ==2) {
					contador=0;
				}
			}
			if(tecladoFuncionario==2) {
				contador=0;
				tecladoFuncionario=0;
			}
			break;
		}
		
		}
			
				
		}	
	}
}

