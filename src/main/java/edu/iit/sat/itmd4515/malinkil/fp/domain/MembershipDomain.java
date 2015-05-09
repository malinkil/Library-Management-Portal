package edu.iit.sat.itmd4515.malinkil.fp.domain;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mithun.alinkil
 */
@Entity
@Table(name="membership_table")
    
public class MembershipDomain implements Serializable {
    
    private static final long serialVersionUID=1l;
    
    @Id
    private int memberId;
    private String type;
    private int due;
    private double premium;
    private double fine;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}


    
    
    
}
