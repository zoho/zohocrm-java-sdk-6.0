package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class FileDetails implements Model
{
	private String fileNameS;

	private String sizeS;

	private Long id;

	private String fileIdS;

	private String delete;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of fileNameS
	 * @return A String representing the fileNameS
	 */
	public String getFileNameS()
	{
		return  this.fileNameS;

	}

	/**
	 * The method to set the value to fileNameS
	 * @param fileNameS A String representing the fileNameS
	 */
	public void setFileNameS(String fileNameS)
	{
		 this.fileNameS = fileNameS;

		 this.keyModified.put("File_Name__s", 1);

	}

	/**
	 * The method to get the value of sizeS
	 * @return A String representing the sizeS
	 */
	public String getSizeS()
	{
		return  this.sizeS;

	}

	/**
	 * The method to set the value to sizeS
	 * @param sizeS A String representing the sizeS
	 */
	public void setSizeS(String sizeS)
	{
		 this.sizeS = sizeS;

		 this.keyModified.put("Size__s", 1);

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
	 * The method to get the value of fileIdS
	 * @return A String representing the fileIdS
	 */
	public String getFileIdS()
	{
		return  this.fileIdS;

	}

	/**
	 * The method to set the value to fileIdS
	 * @param fileIdS A String representing the fileIdS
	 */
	public void setFileIdS(String fileIdS)
	{
		 this.fileIdS = fileIdS;

		 this.keyModified.put("File_Id__s", 1);

	}

	/**
	 * The method to get the value of delete
	 * @return A String representing the delete
	 */
	public String getDelete()
	{
		return  this.delete;

	}

	/**
	 * The method to set the value to delete
	 * @param delete A String representing the delete
	 */
	public void setDelete(String delete)
	{
		 this.delete = delete;

		 this.keyModified.put("_delete", 1);

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