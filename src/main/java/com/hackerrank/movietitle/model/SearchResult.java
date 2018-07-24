package com.hackerrank.movietitle.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResult {

	private String page;
	private String per_page;
	private String total;
	private String total_pages;
	private List<Movietitle> data;
	public SearchResult() {
		
	}
	public SearchResult(String page, String per_page, String total, String total_pages, List<Movietitle> data) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPer_page() {
		return per_page;
	}
	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	public List<Movietitle> getData() {
		return data;
	}
	public void setData(List<Movietitle> data) {
		this.data = data;
	}
	/*public String toString() {
		return "SearchResult{" +
                "page=" + page +
                ", per_page='" + per_page +", total='" + total + ", total_pages='" + total_pages +", data='" + data +'\'' +
                '}';
	}*/
	
}