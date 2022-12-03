package TesteIgualdade;
import java.io.*;
import java.util.*;

public class AppRegistraAluno {
	
public static void main(String[] args) throws IOException {
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
	RegistraAluno aluno = new RegistraAluno();
	ArrayList<RegistraAluno> lista = new ArrayList<RegistraAluno>();
	ArrayList<RegistraProfessor> listaProf = new ArrayList<RegistraProfessor>();
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
			RegistraAluno alunoCad = new RegistraAluno();
			alunoCad.cadastraAluno();
			lista.add(alunoCad);
			
			break;
		case 2:{
			RegistraProfessor professores = new RegistraProfessor();
			
			System.out.println("Digite seu nome:");
			String nomeProf = bfr.readLine();
			
			System.out.println("Digite seu endereço:");
			String enderecoProf = bfr.readLine();
			
			System.out.println("Digite sua idade:");
			int idadeProf = Integer.parseInt(bfr.readLine());
			
			System.out.println("Digite seu sexo:");
			String sexoProf = bfr.readLine();
			
			System.out.println("Digite sua matricula:");
			String matricula = bfr.readLine();
			
			System.out.println("Digite seu salario");
			double salario = Integer.parseInt(bfr.readLine());
			
			professores.setNome(nomeProf);
			professores.setEndereco(enderecoProf);
			professores.setMatricula(matricula);
			professores.setSexo(sexoProf);
			professores.setIdade(idadeProf);
			professores.setSalario(salario);
			
			listaProf.add(professores);
			break;
			
		}
		case 5:{
			contador++;
			System.out.println("Lista de alunos:");
			for(int i=0; i<lista.size();i++) {
				System.out.println("Aluno " + RegistraAluno.getContador()+ "Registrado com sucesso!");
				System.out.println("Nome do aluno:"+ lista.get(i).getNome());
				System.out.println("Sexo do aluno:"+ lista.get(i).getSexo());
				System.out.println("Endereço do aluno: " + lista.get(i).getEndereco());
				System.out.println("Idade do aluno: " + lista.get(i).getIdade());
				System.out.println("Media do aluno: " + lista.get(i).getMedia());
				System.out.println(" ");
			}
			
			System.out.println("Digite 1 para voltar ao menu");
			int teclado2 = Integer.parseInt(bfr.readLine());
			if(teclado2 == 1) {
				contador=0;
			}
			break;
		}
		case 6:{
			contador++;
			System.out.println("Lista de professores:");
			
			for(int i=0; i<listaProf.size();i++) {
				System.out.println("Professor " + RegistraAluno.getContador()+ "Registrado com sucesso!");
				System.out.println("Nome do professor:"+ listaProf.get(i).getNome());
				System.out.println("Sexo do aluno:"+ listaProf.get(i).getSexo());
				System.out.println("Endereço do aluno: " + listaProf.get(i).getEndereco());
				System.out.println("Idade do aluno: " + listaProf.get(i).getIdade());
				System.out.println("Matricula: " + listaProf.get(i).getMatricula());
				System.out.println("Salario: " + listaProf.get(i).getSalario());
				System.out.println(" ");
				
				
			}
			
			System.out.println("Digite 1 para voltar ao menu");
			
			int teclado2 = Integer.parseInt(bfr.readLine());
			if(teclado2 == 1) {
				contador=0;
			}
			
			break;
			
		}
			
		case 7:{
			contador++;
			break;
		}
			
			
		}
		
		
		
	}

	
	
	
	
	
	
	
}
}
