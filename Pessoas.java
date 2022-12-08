package TesteIgualdade;

public abstract class Pessoas {
protected String nome;
protected String sexo;
protected int idade;
protected String end;


public void setNome(String nome) {
	this.nome = nome;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public void setEndereco(String end) {
	this.end = end;
}

public String getNome() {
	return nome;
	
}
public String getSexo() {
	return sexo;
}
public int getIdade() {
	return idade;
}
public String getEndereco() {
	return end;
}



}
