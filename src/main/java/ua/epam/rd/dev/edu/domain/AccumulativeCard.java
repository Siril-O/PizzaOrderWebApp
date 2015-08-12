package ua.epam.rd.dev.edu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccumulativeCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(mappedBy = "accumulativeCard")
	private Customer customer;

	@Column(name="summ")
	private Double totalSumm;

	// private Address address;

	public AccumulativeCard() {
		super();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AccumulativeCard [id=" + id + "]";
	}

	/**
	 * @return the totalSumm
	 */
	public Double getTotalSumm() {
		return totalSumm;
	}

	/**
	 * @param totalSumm
	 *            the totalSumm to set
	 */
	public void setTotalSumm(Double totalSumm) {
		this.totalSumm = totalSumm;
	}

}
