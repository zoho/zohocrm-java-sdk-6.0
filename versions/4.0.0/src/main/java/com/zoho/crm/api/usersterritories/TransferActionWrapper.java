package com.zoho.crm.api.usersterritories;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class TransferActionWrapper implements Model, TransferActionHandler
{
	private List<TransferActionResponse> transferAndDelink;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of transferAndDelink
	 * @return An instance of List<TransferActionResponse>
	 */
	public List<TransferActionResponse> getTransferAndDelink()
	{
		return  this.transferAndDelink;

	}

	/**
	 * The method to set the value to transferAndDelink
	 * @param transferAndDelink An instance of List<TransferActionResponse>
	 */
	public void setTransferAndDelink(List<TransferActionResponse> transferAndDelink)
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
}