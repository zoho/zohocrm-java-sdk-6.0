package com.zoho.crm.api.usersterritories;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class BulkValidation implements Model, ValidationGroup
{
	private Boolean alert;

	private Boolean assignment;

	private Boolean criteria;

	private String name;

	private Long id;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of alert
	 * @return A Boolean representing the alert
	 */
	public Boolean getAlert()
	{
		return  this.alert;

	}

	/**
	 * The method to set the value to alert
	 * @param alert A Boolean representing the alert
	 */
	public void setAlert(Boolean alert)
	{
		 this.alert = alert;

		 this.keyModified.put("alert", 1);

	}

	/**
	 * The method to get the value of assignment
	 * @return A Boolean representing the assignment
	 */
	public Boolean getAssignment()
	{
		return  this.assignment;

	}

	/**
	 * The method to set the value to assignment
	 * @param assignment A Boolean representing the assignment
	 */
	public void setAssignment(Boolean assignment)
	{
		 this.assignment = assignment;

		 this.keyModified.put("assignment", 1);

	}

	/**
	 * The method to get the value of criteria
	 * @return A Boolean representing the criteria
	 */
	public Boolean getCriteria()
	{
		return  this.criteria;

	}

	/**
	 * The method to set the value to criteria
	 * @param criteria A Boolean representing the criteria
	 */
	public void setCriteria(Boolean criteria)
	{
		 this.criteria = criteria;

		 this.keyModified.put("criteria", 1);

	}

	/**
	 * The method to get the value of name
	 * @return A String representing the name
	 */
	public String getName()
	{
		return  this.name;

	}

	/**
	 * The method to set the value to name
	 * @param name A String representing the name
	 */
	public void setName(String name)
	{
		 this.name = name;

		 this.keyModified.put("name", 1);

	}

	/**
	 * The method to get the value of id
	 * @return A Long representing the id
	 */
	public Long getId()
	{
		return  this.id;

	}

	/**
	 * The method to set the value to id
	 * @param id A Long representing the id
	 */
	public void setId(Long id)
	{
		 this.id = id;

		 this.keyModified.put("id", 1);

	}

	/**
	 * The method to check if the user has modified the given key
	 * @param key A String representing the key
	 * @return An Integer representing the modification
	 */
	public Integer isKeyModified(String key)
	{
		if((( this.keyModified.containsKey(key))))
		{
			return  this.keyModified.get(key);

		}
		return null;

	}

	/**
	 * The method to mark the given key as modified
	 * @param key A String representing the key
	 * @param modification An Integer representing the modification
	 */
	public void setKeyModified(String key, Integer modification)
	{
		 this.keyModified.put(key, modification);

	}
}