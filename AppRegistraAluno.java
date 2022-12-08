package TesteIgualdade;
import java.io.*;
import java.util.*;

public class AppRegistraAluno {
	
public static void main(String[] args) throws IOException {
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
	RegistraAluno aluno = new RegistraAluno();
	RegistraProfessor professor = new RegistraProfessor();
	int contador=0;

	while(contador==0) {
		System.out.println("Bem-vindo ao sistema de cadastro da escola Santo Antonio!");
		System.out.println("Escolha as opcoes que deseja cadastrar");
		System.out.println(" ");
		System.out.println("Alunos: Digite 1");
		System.out.println("Professores: Digite 2");
		System.out.println("Funcionarios administrativos: Digite 3");
		System.out.println("Funcionarios da limpeza: Digite 4");
		System.out.println("Caso queira verificar o banco de dados dos cadastros dos alunos : Digite 5");
		System.out.println("Caso queira verificar o banco de dados dos professores cadastrados : Digite 6");
		System.out.println("Digite 7: Se quiser sair");
		
		int teclado = Integer.parseInt(bfr.readLine());
		
		switch(teclado) {
		case 1:
			aluno.cadastraAluno();
			break;
			
		case 2:{
			
			professor.cadastraProfessor();
			
			break;
			
		}
		case 5:{
			contador++;
			System.out.println("Lista de alunos:");
			aluno.mostraAluno();
			System.out.println("Digite 1 para voltar ao menu");
			int teclado2 = Integer.parseInt(bfr.readLine());
			if(teclado2 == 1) {
				contador=0;
			}
			break;
		}
		case 6:{
			contador++;
			professor.mostraProfessores();
					
			}
			
			System.out.println("Digite 1 para voltar ao menu");
			
			int teclado2 = Integer.parseInt(bfr.readLine());
			if(teclado2 == 1) {
				contador=0;
			}
			
			break;
			
		case 7:{
			contador++;
			break;
		}
		
		}
			
				
		}	
	}
}

