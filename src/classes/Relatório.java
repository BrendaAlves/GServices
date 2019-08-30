package classes;

public class Relatório {
    //Clientes X Serviços X Funcionarios - ll
    //Clientes X Produtos X Funcionarios
    //Clientes X Marca X Funcionarios
    //Serviços X Produtos X Fornecedor - 11
    //Funcionarios X Produtos X Fornecedor - ll
    //Marca X Produtos X Fornecedor
	
	private String cliente;
	private String servico;
	private String funcionario;
	private String fornecedor;
	private String produto;
	private String marca;
    
	//Dias pouco utilizados
	private String data;
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
