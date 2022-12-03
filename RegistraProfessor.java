package TesteIgualdade;
import java.io.*;
public class RegistraProfessor extends Pessoas {
private String matricula;
private double salario;

BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

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

public void cadastraProfessor() throws IOException {
	
	
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
	
	setNome(nomeProf);
	setEndereco(enderecoProf);
	setMatricula(matricula);
	setSexo(sexoProf);
	setIdade(idadeProf);
	setSalario(salario);
}
	

}
