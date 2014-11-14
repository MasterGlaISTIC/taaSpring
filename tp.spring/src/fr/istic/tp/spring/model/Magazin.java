package fr.istic.tp.spring.model;

import java.util.List;

public class Magazin implements IMagazin{

	private Integer ref_article;
	private Integer stock;
	private List<Article> articles;
	
	public Magazin() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Magazin(Integer ref_article, Integer stock) {
		super();
		this.ref_article = ref_article;
		this.stock = stock;
	}


	public List<Article> getArticles() {
		return articles;
	}


	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}


	public Integer getRef_article() {
		return ref_article;
	}
	public void setRef_article(Integer ref_article) {
		this.ref_article = ref_article;
	}
	

	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
	
}
