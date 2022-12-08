package TesteIgualdade;
import java.io.*;
import java.util.ArrayList;
public class RegistraProfessor extends Pessoas {
private String matricula;
private double salario;

BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
ArrayList<RegistraProfessor> listaProf = new ArrayList<RegistraProfessor>();
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
}

public void mostraProfessores(){
	
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
	

}
}
	
