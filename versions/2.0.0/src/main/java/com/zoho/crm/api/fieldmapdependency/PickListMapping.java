package com.zoho.crm.api.fieldmapdependency;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class PickListMapping implements Model
{
	private Long id;

	private String actualValue;

	private String displayValue;

	private List<PicklistMap> maps;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


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
	 * The method to get the value of actualValue
	 * @return A String representing the actualValue
	 */
	public String getActualValue()
	{
		return  this.actualValue;

	}

	/**
	 * The method to set the value to actualValue
	 * @param actualValue A String representing the actualValue
	 */
	public void setActualValue(String actualValue)
	{
		 this.actualValue = actualValue;

		 this.keyModified.put("actual_value", 1);

	}

	/**
	 * The method to get the value of displayValue
	 * @return A String representing the displayValue
	 */
	public String getDisplayValue()
	{
		return  this.displayValue;

	}

	/**
	 * The method to set the value to displayValue
	 * @param displayValue A String representing the displayValue
	 */
	public void setDisplayValue(String displayValue)
	{
		 this.displayValue = displayValue;

		 this.keyModified.put("display_value", 1);

	}

	/**
	 * The method to get the value of maps
	 * @return An instance of List<PicklistMap>
	 */
	public List<PicklistMap> getMaps()
	{
		return  this.maps;

	}

	/**
	 * The method to set the value to maps
	 * @param maps An instance of List<PicklistMap>
	 */
	public void setMaps(List<PicklistMap> maps)
	{
		 this.maps = maps;

		 this.keyModified.put("maps", 1);

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