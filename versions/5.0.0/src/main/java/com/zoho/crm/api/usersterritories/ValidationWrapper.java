package com.zoho.crm.api.usersterritories;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ValidationWrapper implements Model, ValidationHandler
{
	private List<ValidationGroup> validateBeforeTransfer;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of validateBeforeTransfer
	 * @return An instance of List<ValidationGroup>
	 */
	public List<ValidationGroup> getValidateBeforeTransfer()
	{
		return  this.validateBeforeTransfer;

	}

	/**
	 * The method to set the value to validateBeforeTransfer
	 * @param validateBeforeTransfer An instance of List<ValidationGroup>
	 */
	public void setValidateBeforeTransfer(List<ValidationGroup> validateBeforeTransfer)
	{
		 this.validateBeforeTransfer = validateBeforeTransfer;

		 this.keyModified.put("validate_before_transfer", 1);

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