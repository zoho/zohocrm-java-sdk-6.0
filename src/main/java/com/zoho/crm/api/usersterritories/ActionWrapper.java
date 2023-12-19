package com.zoho.crm.api.usersterritories;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ActionWrapper implements Model, ActionHandler
{
	private List<ActionResponse> transferAndDelink;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();

	private List<ActionResponse> territories;


	/**
	 * The method to get the value of transferAndDelink
	 * @return An instance of List<ActionResponse>
	 */
	public List<ActionResponse> getTransferAndDelink()
	{
		return  this.transferAndDelink;

	}

	/**
	 * The method to set the value to transferAndDelink
	 * @param transferAndDelink An instance of List<ActionResponse>
	 */
	public void setTransferAndDelink(List<ActionResponse> transferAndDelink)
	{
		 this.transferAndDelink = transferAndDelink;

		 this.keyModified.put("transfer_and_delink", 1);

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

	/**
	 * The method to get the value of territories
	 * @return An instance of List<ActionResponse>
	 */
	public List<ActionResponse> getTerritories()
	{
		return  this.territories;

	}

	/**
	 * The method to set the value to territories
	 * @param territories An instance of List<ActionResponse>
	 */
	public void setTerritories(List<ActionResponse> territories)
	{
		 this.territories = territories;

		 this.keyModified.put("territories", 1);

	}
}