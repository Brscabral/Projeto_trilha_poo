package TesteIgualdade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RegistraFuncionarioAdm extends Pessoas implements Funcionarios, Fadministrator {
	private double salario;
	private String horario;
	private int id;
	private static int cont;
	private String servico;
	private String turno;
	private static int TempoServ;
	private double gratificacao;
	private double gratificacao2;
	
	
	static BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<RegistraFuncionarioAdm> listaFunAdm = new ArrayList<RegistraFuncionarioAdm>();
	
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

	public void setId(int id) {
		this.id = id;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		RegistraFuncionarioAdm.cont = cont;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public static int getTempoServ() {
		return TempoServ;
	}

	public void setTempoServ(int tempoServ) {
		TempoServ = tempoServ;
	}
	public static int incrementaContador() {
		return cont++;
	}


	public static double gratificacaoMet(int tempo) {
		double grat = RegistraFuncionarioAdm.grat;
		double total = tempo*grat;
		return total;
	}
	
	public static double gratificacaoMet(String temposerv) {
		int tempo = Integer.parseInt(temposerv);
		double grat = RegistraFuncionarioAdm.grat;
		double grat2 = RegistraFuncionarioAdm.grat2;
		double total = tempo*(grat+grat2);
		return total;
	}
	public void setGratificacao(int tempoServ) {
		gratificacao = RegistraFuncionarioAdm.gratificacaoMet(tempoServ);
	}
	public double getGratificacao() {
		return gratificacao ;
	}
	
	public void setGratificacao2(String temposerv) {
		gratificacao2 = RegistraFuncionarioAdm.gratificacaoMet(temposerv);
	}
	public double getGratificacao2() {
		return gratificacao2;
	}

	@Override
	public void servico(String servico) {
	String tipoDeServico = servico;
	System.out.println(tipoDeServico);
		
	}

	@Override
	public void turno(String turno) {
		String Turno = turno;
		System.out.println("Turno: "+ Turno);
		
	}

	@Override
	public void setor(String setor) {
		String Setor = setor;
		System.out.println("Setor: " + Setor);
		
	}


	@Override
	public void tempoServ(int tempo) {
		int TempoServ = tempo;
		System.out.println("Seu tempo de servico: " + TempoServ);
		
	}

	
	public static void cadastraFunAdm() throws IOException {
		RegistraFuncionarioAdm funcionario = new RegistraFuncionarioAdm();
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
		
		System.out.println("Digite seu tempo de servico");
		int tempServ = Integer.parseInt(bfr.readLine());
		String tempServString= Integer.toString(tempServ);
		if(tempServ<=10) {
		Integer.toString(tempServ);
		}
		
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
		funcionario.setId(contador+1);
		funcionario.setServico(servico);
		funcionario.setTurno(turno);
		funcionario.setGratificacao(tempServ);
		funcionario.setGratificacao2(tempServString);
		funcionario.gratificacaoMet(tempServ);
		listaFunAdm.add(funcionario);
		
	}
	

	public static void MostraFuncionario() {
		System.out.println("Lista de funcionarios terceirizados: \n");
		
		for(RegistraFuncionarioAdm rfa : listaFunAdm) {
			System.out.println("Funcionario registrado com sucesso!");
			System.out.println("Nome do funcionario:"+ rfa.getNome());
			System.out.println("Sexo do funcionario:"+ rfa.getSexo());
			System.out.println("Endereço do funcionario: " + rfa.getEndereco());
			System.out.println("Idade do funcionario: " + rfa.getIdade());
			System.out.println("Id: " + rfa.getId());
			System.out.println("Salario: " + rfa.getSalario());
			System.out.println("Servico do funcionario: " + rfa.getNome() + " " + rfa.getServico() );
			System.out.println("Gratificação do funcionario: " + rfa.getNome() + " " + rfa.getGratificacao()+"%" + " + " + rfa.getGratificacao2()+"%");
	}
	}
	public void mostraOpcao() throws IOException {
		int contador=0;
		while(contador == 0) {
			System.out.println("|Digite 1, caso queira cadastrar um Funcionario administrativos       |");
			System.out.println("|Digite 2, caso visualizar os Funcionarios administrativos cadastrados|");		
			System.out.println("|Digite 3, caso queira voltar ao menu                                 |");
			int tecladoFun = Integer.parseInt(bfr.readLine());
			if(tecladoFun==1) {
				RegistraFuncionarioAdm.cadastraFunAdm();
				System.out.println("Digite 2, caso queira voltar ao menu");
				int teclado = Integer.parseInt(bfr.readLine());
				if(teclado ==2) {
					contador++;
					break;
				}
			
			}
			if(tecladoFun == 2){
				RegistraFuncionarioAdm.MostraFuncionario();
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
