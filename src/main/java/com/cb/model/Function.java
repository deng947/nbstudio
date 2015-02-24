package com.cb.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * This class is used to represent available roles in the database.
 *
 * @author cb
 * 
 */
@Entity
@Table(name = "TAB_FUNCTION")
@NamedQueries({
        @NamedQuery(
                name = "findFunctionByName",
                query = "select f from Function f where f.name = :name "
        )
})
public class Function extends BaseObject implements Serializable{
    private static final long serialVersionUID = 3690197650654049848L;
    private Long id;
    private String functionName;
    private String functionCode;
    private String functionUrl;
    private String description;

    /**
     * Default constructor - creates a new instance with no values set.
     */
    public Function() {
    }

     

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }



	public String getFunctionName() {
		return functionName;
	}



	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}



	public String getFunctionCode() {
		return functionCode;
	}



	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}



	public String getFunctionUrl() {
		return functionUrl;
	}



	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public void setId(Long id) {
		this.id = id;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
    
     

    
}
