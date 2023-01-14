package TesteIgualdade;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;


public class RegistraAluno extends Pessoas {
private double notaMat;
private double notaPort;
private double notaGeo;
private double media;
private int idAluno;
private static int cont;

static BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

static ArrayList<RegistraAluno> lista = new ArrayList<RegistraAluno>();

public double getNotaMat() {
	return notaMat;
}
public double getNotaPort() {
	return notaPort;
}
public double getNotaGeo() {
	return notaGeo;
}

public void setNotaPort(double notaPort) {
	this.notaPort = notaPort;
}
public void setNotaGeo(double notaGeo) {
	this.notaGeo = notaGeo;
	
}
public void setNotaMat(double notaMat) {
	this.notaMat = notaMat;
}
public int getidAluno() {
	return idAluno;
}
public void SetId(int contador) {
	this.idAluno = contador;
}


public double getMedia() {
	media = (notaPort + notaGeo + notaMat)/3;
	
	return media;
}
public int getIdAluno() {
	return idAluno;
}
public void setIdAluno(int idAluno) {
	this.idAluno = idAluno;
}
public static int getCont() {
	return cont;
}
public static void setCont(int cont) {
	RegistraAluno.cont = cont;
}

public static int incrementaContador() {
	return cont++;
}
public static void cadastraAluno() throws IOException {

	RegistraAluno alunoCad = new RegistraAluno();
	int contador = incrementaContador();
	System.out.println("Digite seu nome:");
	String nome = bfr.readLine();
	
	System.out.println("Digite seu endereço:");
	String endereco = bfr.readLine();
	
	System.out.println("Digite sua idade:");
	int idade = Integer.parseInt(bfr.readLine());
	System.out.println("Digite seu sexo:");
	String sexo = bfr.readLine();
	
	System.out.println("Digite sua nota de portugues:");
	double notaPort = Integer.parseInt(bfr.readLine());
	
	System.out.println("Digite sua nota de geografia:");
	double notaGeo = Integer.parseInt(bfr.readLine());
	
	System.out.println("Digite sua nota de matematica:");
	double notaMat = Integer.parseInt(bfr.readLine());
	
	alunoCad.setNome(nome);
	alunoCad.setEndereco(endereco);
	alunoCad.setIdade(idade);
	alunoCad.setSexo(sexo);
	alunoCad.setNotaGeo(notaGeo);
	alunoCad.setNotaMat(notaMat);
	alunoCad.setNotaPort(notaPort);
	alunoCad.SetId(contador+1);
	lista.add(alunoCad);
}

public static void mostraAluno() {
	for(int i=0; i<lista.size();i++) {
		System.out.println("---Lista de alunos:---\n");
		System.out.println("Aluno " + RegistraAluno.getCont()+ " Registrado com sucesso!");
		System.out.println("Nome do aluno:"+ lista.get(i).getNome());
		System.out.println("Sexo do aluno:"+ lista.get(i).getSexo());
		System.out.println("Endereço do aluno: " + lista.get(i).getEndereco());
		System.out.println("Idade do aluno: " + lista.get(i).getIdade());
		System.out.println("Media do aluno: " + lista.get(i).getMedia());
		System.out.println("Id: " + lista.get(i).getidAluno());
		System.out.println(" ");
	}
}


public void mostraOpcao() throws IOException {
	int contador=0;
	while(contador == 0) {
		System.out.println("|Digite 1, caso queira cadastrar um aluno       |");
		System.out.println("|Digite 2, caso visualizar os alunos cadastrados|");		
		System.out.println("|Digite 3, caso queira voltar ao menu           |");
		int tecladoAluno = Integer.parseInt(bfr.readLine());
		if(tecladoAluno==1) {
			RegistraAluno.cadastraAluno();
			System.out.println("Digite 2, caso queira voltar ao menu");
			int teclado = Integer.parseInt(bfr.readLine());
			if(teclado ==2) {
				contador++;
				break;
			}
		
		}
		if(tecladoAluno == 2){
			RegistraAluno.mostraAluno();
			System.out.println("Digite 2, caso queira voltar ao menu");
			int teclado = Integer.parseInt(bfr.readLine());
			if(teclado == 2) {
				contador++;
			}
		}
		if(tecladoAluno ==3) {
			contador++;
			System.out.println("\n\n");
		}
	}
}

}
