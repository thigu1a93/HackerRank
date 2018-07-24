package com.hackerrank.movietitle.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movietitle {
	@JsonProperty("Poster")
	private String Poster;
	  @JsonProperty("Title")
	private String Title;
	  @JsonProperty("Type")
	private String Type;
	  @JsonProperty("Year")
	private String Year;
	  @JsonProperty("imdbID")
	private String imdbID;
	public Movietitle() {
		
	}
	public Movietitle(String poster, String title, String type, String year, String imdbID) {
		super();
		this.Poster = poster;
		this.Title = title;
		this.Type = type;
		this.Year = year;
		this.imdbID = imdbID;
	}
	public String getPoster() {
		return Poster;
	}
	public void setPoster(String poster) {
		this.Poster = poster;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		this.Type = type;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		this.Year = year;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	
	/*public String toString() {
		return "Movietitle{" +
                "Poster=" + getPoster() +
                ", Title='" + Title +", Type='" + Type + ", Year='" + Year +", imdbDB='" + imdbID +'\'' +
                '}';
	}*/
	
	
	
}
