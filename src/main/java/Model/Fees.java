/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class Fees {
        private String feesId;
	private String name;
	private String description;
        private Double amount;
        private String type;

	public Fees() {
	}

	public Fees(String feesId, String name, String description, Double amount, String type) {
		this.feesId = feesId;
		this.name = name;
		this.description = description;
                this.amount = amount;
                this.type = type;
	}

	public String getfeesId() {
		return feesId;
	}

	public void setfeesId(String feesId) {
		this.feesId = feesId;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}
        
        public Double getamount() {
		return amount;
	}

	public void setamount(Double amount) {
		this.amount = amount;
	}
        
        public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}
        
}
