package by.htp.belavia.entity;

import java.util.GregorianCalendar;

public class Ticket {
	private GregorianCalendar departureDate;
	private GregorianCalendar departuretime;
	private String typeFlights;
	private double price;

	public Ticket(GregorianCalendar departureDate, GregorianCalendar departuretime, String typeFlights, double price) {
		this.departureDate = departureDate;
		this.departuretime = departuretime;
		this.typeFlights = typeFlights;
		this.price = price;
	}

	public Ticket() {
		super();

	}

	public GregorianCalendar getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(GregorianCalendar departureDate) {
		this.departureDate = departureDate;
	}

	public GregorianCalendar getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(GregorianCalendar departuretime) {
		this.departuretime = departuretime;
	}

	public String getTypeFlights() {
		return typeFlights;
	}

	public void setTypeFlights(String typeFlights) {
		this.typeFlights = typeFlights;
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
		result = prime * result + ((typeFlights == null) ? 0 : typeFlights.hashCode());
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
		if (typeFlights == null) {
			if (other.typeFlights != null)
				return false;
		} else if (!typeFlights.equals(other.typeFlights))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ticket [departureDate=" + departureDate + ", departuretime=" + departuretime + ", typeFlights="
				+ typeFlights + ", price=" + price + "]";
	}

}
