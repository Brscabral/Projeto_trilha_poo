package TesteIgualdade;
import java.io.*;
import java.util.*;

public class RegistraFuncionario extends Pessoas implements Funcionarios {
static BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
static ArrayList<RegistraFuncionario> listaFun = new ArrayList<RegistraFuncionario>();

	private double salario;
	private String horario;
	private int id;
	private static int cont;
	private String servico;
	private String turno;


	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
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

	public void setServico(String servico) {
		this.servico = servico;
		servico(servico);
	}

	public void setTurno(String turno) {
		this.turno = turno;
		turno(turno);
		
	}
	@Override
	public void servico(String servico) {
		String tipoDeServico = servico;
		System.out.println("Servico: " + tipoDeServico);
		
	}
	@Override
	public void turno(String turno) {
		String Turno = turno;
		System.out.println("Turno: "+ Turno);
		
	}
	
	public static void CadastraFuncionario() throws IOException {
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
		
		System.out.println("Digite o turno ao qual você foi escalado");
		String turno = bfr.readLine();
		
		System.out.println("Digite seu horario de inicio:");
		String horario = bfr.readLine();
		
		System.out.println("Digite seu serviço:");
		String servico = bfr.readLine();
		
		funcionario.setNome(nomeFun);
		funcionario.setEndereco(enderecoFun);
		funcionario.setIdade(idadeFun);
		funcionario.setSexo(sexoFun);
		funcionario.setSalario(salarioFun);
		funcionario.setHorario(horario);
		funcionario.SetId(contador+1);
		funcionario.setServico(servico);
		funcionario.setTurno(turno);
		listaFun.add(funcionario);
		
	}

	public static void MostraFuncionario() {
		System.out.println("Lista de funcionarios terceirizados: \n");
		
		for(int i=0; i<listaFun.size();i++) {
			System.out.println("Funcionario registrado com sucesso!");
			System.out.println("Nome do funcionario:"+ listaFun.get(i).getNome());
			System.out.println("Sexo do funcionario:"+ listaFun.get(i).getSexo());
			System.out.println("Endereço do funcionario: " + listaFun.get(i).getEndereco());
			System.out.println("Idade do funcionario: " + listaFun.get(i).getIdade());
			System.out.println("Id: " + listaFun.get(i).getId());
			System.out.println("Salario: " + listaFun.get(i).getSalario());
			System.out.println("Horario: " + listaFun.get(i).getHorario());
			System.out.println(listaFun.get(i).servico);
			System.out.println(listaFun.get(i).turno);
	}
	}
	
	public void mostraOpcao() throws IOException {
		int contador=0;
		while(contador == 0) {
			System.out.println("|Digite 1, caso queira cadastrar um Funcionario terceirizado        |");
			System.out.println("|Digite 2, caso visualizar os Funcionarios terceirizados cadastrados|");		
			System.out.println("|Digite 3, caso queira voltar ao menu                               |");
			int tecladoFun = Integer.parseInt(bfr.readLine());
			if(tecladoFun==1) {
				RegistraFuncionario.CadastraFuncionario();
				System.out.println("Digite 2, caso queira voltar ao menu");
				int teclado = Integer.parseInt(bfr.readLine());
				if(teclado ==2) {
					contador++;
					break;
				}
			
			}
			if(tecladoFun == 2){
				RegistraFuncionario.MostraFuncionario();
				System.out.println("Digite 2, caso queira voltar ao menu");
				int teclado = Integer.parseInt(bfr.readLine());
				if(teclado == 2) {
					contador++;
				}
			}
			if(tecladoFun ==3) {
				contador++;
				System.out.println("\n\n");
			}
		}
	}
}
