package br.net.bonassi.N64.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String alternativename;
	private int year;
	private String developer;
	private String publisher;
	private String genre;
	private double score;
	private String japan;
	private String usa;
	private String europe;
	private String brasil;
	private String DD64;
	private String rumblepak;
	private String expansionpak;
	private String transferpak;

	public Game() {

	}

	public Game(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlternativename() {
		return alternativename;
	}

	public void setAlternativename(String alternativename) {
		this.alternativename = alternativename;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getJapan() {
		return japan;
	}

	public void setJapan(String japan) {
		this.japan = japan;
	}

	public String getUsa() {
		return usa;
	}

	public void setUsa(String usa) {
		this.usa = usa;
	}

	public String getEurope() {
		return europe;
	}

	public void setEurope(String europe) {
		this.europe = europe;
	}

	public String getBrasil() {
		return brasil;
	}

	public void setBrasil(String brasil) {
		this.brasil = brasil;
	}

	public String getDD64() {
		return DD64;
	}

	public void setDD64(String dD64) {
		DD64 = dD64;
	}

	public String getRumblepak() {
		return rumblepak;
	}

	public void setRumblepak(String rumblepak) {
		this.rumblepak = rumblepak;
	}

	public String getExpansionpak() {
		return expansionpak;
	}

	public void setExpansionpak(String expansionpak) {
		this.expansionpak = expansionpak;
	}

	public String getTransferpak() {
		return transferpak;
	}

	public void setTransferpak(String transferpak) {
		this.transferpak = transferpak;
	}

}
