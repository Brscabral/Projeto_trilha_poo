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
	
	setNome(nome);
	setEndereco(endereco);
	setIdade(idade);
	setSexo(sexo);
	setNotaGeo(notaGeo);
	setNotaMat(notaMat);
	setNotaPort(notaPort);
}




}
