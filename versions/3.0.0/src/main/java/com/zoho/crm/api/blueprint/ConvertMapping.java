package com.zoho.crm.api.blueprint;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class ConvertMapping implements Model
{
	private ModuleMapping contacts;

	private ModuleMapping deals;

	private ModuleMapping accounts;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of contacts
	 * @return An instance of ModuleMapping
	 */
	public ModuleMapping getContacts()
	{
		return  this.contacts;

	}

	/**
	 * The method to set the value to contacts
	 * @param contacts An instance of ModuleMapping
	 */
	public void setContacts(ModuleMapping contacts)
	{
		 this.contacts = contacts;

		 this.keyModified.put("Contacts", 1);

	}

	/**
	 * The method to get the value of deals
	 * @return An instance of ModuleMapping
	 */
	public ModuleMapping getDeals()
	{
		return  this.deals;

	}

	/**
	 * The method to set the value to deals
	 * @param deals An instance of ModuleMapping
	 */
	public void setDeals(ModuleMapping deals)
	{
		 this.deals = deals;

		 this.keyModified.put("Deals", 1);

	}

	/**
	 * The method to get the value of accounts
	 * @return An instance of ModuleMapping
	 */
	public ModuleMapping getAccounts()
	{
		return  this.accounts;

	}

	/**
	 * The method to set the value to accounts
	 * @param accounts An instance of ModuleMapping
	 */
	public void setAccounts(ModuleMapping accounts)
	{
		 this.accounts = accounts;

		 this.keyModified.put("Accounts", 1);

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