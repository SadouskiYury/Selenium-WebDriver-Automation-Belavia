package by.htp.belavia.entity;

import java.util.GregorianCalendar;

public class Ticket {
	private GregorianCalendar departureDate;
	private String departuretime;
	private double price;

	public Ticket() {
		super();

	}

	public Ticket(GregorianCalendar departureDate, String departuretime, double price) {
		this.departureDate = departureDate;
		this.departuretime = departuretime;
		this.price = price;
	}

	public GregorianCalendar getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(GregorianCalendar departureDate) {
		this.departureDate = departureDate;
	}

	public String getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((departuretime == null) ? 0 : departuretime.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (departureDate == null) {
			if (other.departureDate != null)
				return false;
		} else if (!departureDate.equals(other.departureDate))
			return false;
		if (departuretime == null) {
			if (other.departuretime != null)
				return false;
		} else if (!departuretime.equals(other.departuretime))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ticket [departureDate=" + departureDate + ", departuretime=" + departuretime + ", price=" + price + "]";
	}

}