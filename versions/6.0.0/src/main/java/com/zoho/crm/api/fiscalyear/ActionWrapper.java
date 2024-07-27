package com.zoho.crm.api.fiscalyear;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class ActionWrapper implements Model, ActionHandler
{
	private ActionResponse fiscalYear;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of fiscalYear
	 * @return An instance of ActionResponse
	 */
	public ActionResponse getFiscalYear()
	{
		return  this.fiscalYear;

	}

	/**
	 * The method to set the value to fiscalYear
	 * @param fiscalYear An instance of ActionResponse
	 */
	public void setFiscalYear(ActionResponse fiscalYear)
	{
		 this.fiscalYear = fiscalYear;

		 this.keyModified.put("fiscal_year", 1);

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