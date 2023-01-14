package TesteIgualdade;
import java.io.*;
import java.util.*;

public class AppRegistraAluno {
	
public static void main(String[] args) throws IOException {
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
	RegistraAluno aluno = new RegistraAluno();
	RegistraProfessor professor = new RegistraProfessor();
	RegistraFuncionario funcionarioTerceirizado = new RegistraFuncionario();
	RegistraFuncionarioAdm funcionarioAdm = new RegistraFuncionarioAdm();
	int contador=0;

	while(contador==0) {
		System.out.println("|Bem-vindo ao sistema de cadastro da escola Santo Antonio!|");
		System.out.println("|Escolha as opcoes que deseja cadastrar ou vizualizar     |");
		System.out.println("|                                                         |");
		System.out.println("|Alunos: Digite 1                                         |");
		System.out.println("|Professores: Digite 2                                    |");
		System.out.println("|Funcionarios terceirizados: Digite 3                     |");
		System.out.println("|Funcionarios administrativos: Digite 4                   |");
		System.out.println("|Digite 8: Se quiser sair                                 |");
		
		int teclado = Integer.parseInt(bfr.readLine());
		
		switch(teclado) {
		case 1:{
			System.out.println("\n\n");
			aluno.mostraOpcao();
			contador=0;
			break;
		}
			
			
		case 2:{
			System.out.println("\n\n");
			professor.mostraOpcao();
			contador=0;
			break;
			
		}
		case 3:{
			System.out.println("\n\n");
			funcionarioTerceirizado.mostraOpcao();
			contador=0;
			break;
		}
		case 4:{
			System.out.println("\n\n");
			funcionarioAdm.mostraOpcao();
			contador=0;
			break;
			
		}
		
		}
			
				
		}	
	}
}

