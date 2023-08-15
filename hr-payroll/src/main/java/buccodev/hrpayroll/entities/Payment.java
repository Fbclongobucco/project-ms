package buccodev.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncone;
	private Integer days;
	
	public Payment() {
	}

	public Payment(String name, Double dailyIncone, Integer days) {
		super();
		this.name = name;
		this.dailyIncone = dailyIncone;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncone() {
		return dailyIncone;
	}

	public void setDailyIncone(Double dailyIncone) {
		this.dailyIncone = dailyIncone;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days * dailyIncone;
	}
}
