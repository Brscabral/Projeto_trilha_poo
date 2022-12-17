package TesteIgualdade;
import java.io.*;
import java.util.*;

public class RegistraFuncionario extends Pessoas implements Funcionarios {
BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
ArrayList<RegistraFuncionario> listaFun = new ArrayList<RegistraFuncionario>();

	private double salario;
	private int horario;
	private int id;
	private static int cont;


	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
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
		RegistraFuncionario.cont = cont;
	}
	public static int incrementaContador() {
		return cont++;
	}
	@Override
	public void servico(String servico) {
		String tipoDeServico = servico;
		System.out.println("Servico: " + servico);
		
	}
	@Override
	public void turno(String turno) {
		String Turno = turno;
		
		System.out.println("Turno: " + turno);
		
	}
	
	public void CadastraFuncionario() throws IOException {
		RegistraFuncionario funcionario = new RegistraFuncionario();
		int contador = incrementaContador();
		System.out.println("Digite seu nome:");
		String nomeFun = bfr.readLine();
		
		System.out.println("Digite seu endereço:");
		String enderecoFun = bfr.readLine();
		
		System.out.println("Digite sua idade:");
		int idadeFun = Integer.parseInt(bfr.readLine());
		
		System.out.println("Digite seu sexo:");
		String sexoFun = bfr.readLine();
		
		System.out.println("Digite seu salario");
		double salarioFun = Integer.parseInt(bfr.readLine());
		
		
		funcionario.setNome(nomeFun);
		funcionario.setEndereco(enderecoFun);
		funcionario.setIdade(idadeFun);
		funcionario.setSexo(sexoFun);
		funcionario.setSalario(salarioFun);
		funcionario.SetId(contador);
		listaFun.add(funcionario);
		
		
	}
	public int gerarId() {
	
		return horario;
		
	}
	public void MostraFuncionario() {
		System.out.println("Lista de funcionarios terceirizados:");
		
		for(int i=0; i<listaFun.size();i++) {
			System.out.println("Funcionario " + RegistraFuncionario.getCont()+ " Registrado com sucesso!");
			System.out.println("Nome do funcionario:"+ listaFun.get(i).getNome());
			System.out.println("Sexo do funcionario:"+ listaFun.get(i).getSexo());
			System.out.println("Endereço do funcionario: " + listaFun.get(i).getEndereco());
			System.out.println("Idade do funcionario: " + listaFun.get(i).getIdade());
			System.out.println("Id: " + listaFun.get(i).getId());
			System.out.println("Salario: " + listaFun.get(i).getSalario());
			System.out.println(" ");

	}
	}
	
}
