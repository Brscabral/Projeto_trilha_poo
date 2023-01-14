package TesteIgualdade;
import java.io.*;
import java.util.ArrayList;
public class RegistraProfessor extends Pessoas {
private String matricula;
private double salario;
private int id;
private static int cont;
static BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
static ArrayList<RegistraProfessor> listaProf = new ArrayList<RegistraProfessor>();
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}

public static void cadastraProfessor() throws IOException {
	
	RegistraProfessor professores = new RegistraProfessor();
	int contador = incrementaContador();
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
	professores.SetId(contador);
	listaProf.add(professores);
}

public static void excluiProf() throws NumberFormatException, IOException {
	int contador=0;
	while(contador == 0) {

			for(RegistraProfessor rp : listaProf) {
				System.out.println("=========Lista de funcionarios cadastrados=========");
				System.out.println("Nome do funcionario:"+ rp.getNome() + " Matricula: " + rp.getMatricula() + " ID: " + rp.getId() );
				System.out.print("\n");
				
			}
			System.out.println("Digite o id do funcionario que deseja remover da lista de cadastro");
			int id = Integer.parseInt(bfr.readLine());
			listaProf.remove(id);
			
			
		System.out.println("Digite 2, caso queira voltar ao menu");
		int teclado = Integer.parseInt(bfr.readLine());
		if(teclado == 2) {
			contador++;
		}
	}
	
}

public static void mostraProfessores(){
	
System.out.println("Lista de professores:");
	
	for(int i=0; i<listaProf.size();i++) {
		//System.out.println("Professor " + RegistraAluno.getContador()+ "Registrado com sucesso!");
		System.out.println("Nome do professor:"+ listaProf.get(i).getNome());
		System.out.println("Sexo do aluno:"+ listaProf.get(i).getSexo());
		System.out.println("Endereço do aluno: " + listaProf.get(i).getEndereco());
		System.out.println("Idade do aluno: " + listaProf.get(i).getIdade());
		System.out.println("Matricula: " + listaProf.get(i).getMatricula());
		System.out.println("Salario: " + listaProf.get(i).getSalario());
		System.out.println(" ");

}


	

}

public void mostraOpcao() throws IOException {
	int contador=0;
	while(contador == 0) {
		System.out.println("|Digite 1, caso queira cadastrar um professor        |");
		System.out.println("|Digite 2, caso visualizar os professores cadastrados|");		
		System.out.println("|Digite 3, caso queira Excluir um professor          |");
		System.out.println("|Digite 4, caso queira voltar ao menu                |");
		int tecladoProf = Integer.parseInt(bfr.readLine());
		if(tecladoProf==1) {
			RegistraProfessor.cadastraProfessor();
			System.out.println("Digite 2, caso queira voltar ao menu");
			int teclado = Integer.parseInt(bfr.readLine());
			if(teclado ==2) {
				contador++;
				break;
			}
		
		}
		if(tecladoProf == 2){
			RegistraProfessor.mostraProfessores();
			System.out.println("Digite 2, caso queira voltar ao menu");
			int teclado = Integer.parseInt(bfr.readLine());
			if(teclado == 2) {
				contador++;
			}
		}
		if(tecladoProf ==3) {
			RegistraProfessor.excluiProf();
			contador++;
		}
		if(tecladoProf ==4) {
			contador++;
			System.out.println("\n\n");
		}
	}
}
public int getId() {
	return id;
}
public void SetId(int contador) {
	this.id = contador;
}
public static int getCont() {
	return cont;
}
public static void setCont(int cont) {
	RegistraProfessor.cont = cont;
}
public static int incrementaContador() {
	return cont++;
}
}
	
