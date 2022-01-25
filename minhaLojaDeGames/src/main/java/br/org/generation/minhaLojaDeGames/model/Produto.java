package br.org.generation.minhaLojaDeGames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo console é Obrigatório!")
	@Size(max = 100)
	private String console;

	@NotBlank(message = "O atributo nome é Obrigatório!")
	@Size(max = 100)
	private String nome;
	
	@NotBlank(message = "O atributo descrição é Obrigatório!")
	@Size(max = 1000)
	private String descricao;
	
	@NotBlank(message = "O atributo quantidade é Obrigatório!")
	private int quantidade;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotBlank(message = "O atributo preco é Obrigatório!")
	private BigDecimal preco;
	
	private String foto;
	
	@Column(name = "data_lancamento")
	@JsonFormat(pattern = "yyyy-mm-dd")
	private LocalDate data_lancamento;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDate getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(LocalDate data_lancamento) {
		this.data_lancamento = data_lancamento;
	}

}
