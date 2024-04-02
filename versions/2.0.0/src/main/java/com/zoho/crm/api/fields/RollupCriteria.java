package com.zoho.crm.api.fields;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class RollupCriteria implements Model
{
	private String comparator;

	private MinifiedField field;

	private Object value;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of comparator
	 * @return A String representing the comparator
	 */
	public String getComparator()
	{
		return  this.comparator;

	}

	/**
	 * The method to set the value to comparator
	 * @param comparator A String representing the comparator
	 */
	public void setComparator(String comparator)
	{
		 this.comparator = comparator;

		 this.keyModified.put("comparator", 1);

	}

	/**
	 * The method to get the value of field
	 * @return An instance of MinifiedField
	 */
	public MinifiedField getField()
	{
		return  this.field;

	}

	/**
	 * The method to set the value to field
	 * @param field An instance of MinifiedField
	 */
	public void setField(MinifiedField field)
	{
		 this.field = field;

		 this.keyModified.put("field", 1);

	}

	/**
	 * The method to get the value of value
	 * @return An instance of Object
	 */
	public Object getValue()
	{
		return  this.value;

	}

	/**
	 * The method to set the value to value
	 * @param value An instance of Object
	 */
	public void setValue(Object value)
	{
		 this.value = value;

		 this.keyModified.put("value", 1);

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