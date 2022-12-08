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

BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

ArrayList<RegistraAluno> lista = new ArrayList<RegistraAluno>();

private static int contador;

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

public static int getContador() {
	return contador;
}
public double getMedia() {
	media = (notaPort + notaGeo + notaMat)/3;
	
	return media;
}

public void cadastraAluno() throws IOException {

	RegistraAluno alunoCad = new RegistraAluno();
	
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
	
	lista.add(alunoCad);
}

public void mostraAluno() {
	for(int i=0; i<lista.size();i++) {
		System.out.println("Aluno " + RegistraAluno.getContador()+ "Registrado com sucesso!");
		System.out.println("Nome do aluno:"+ lista.get(i).getNome());
		System.out.println("Sexo do aluno:"+ lista.get(i).getSexo());
		System.out.println("Endereço do aluno: " + lista.get(i).getEndereco());
		System.out.println("Idade do aluno: " + lista.get(i).getIdade());
		System.out.println("Media do aluno: " + lista.get(i).getMedia());
		System.out.println(" ");
	}
}



}
