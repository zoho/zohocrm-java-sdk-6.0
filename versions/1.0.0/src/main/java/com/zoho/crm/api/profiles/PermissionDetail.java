package com.zoho.crm.api.profiles;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class PermissionDetail implements Model
{
	private String id;

	private Boolean enabled;

	private String name;

	private String displayLabel;

	private Boolean customizable;

	private List<Long> parentPermissions;

	private String module;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of id
	 * @return A String representing the id
	 */
	public String getId()
	{
		return  this.id;

	}

	/**
	 * The method to set the value to id
	 * @param id A String representing the id
	 */
	public void setId(String id)
	{
		 this.id = id;

		 this.keyModified.put("id", 1);

	}

	/**
	 * The method to get the value of enabled
	 * @return A Boolean representing the enabled
	 */
	public Boolean getEnabled()
	{
		return  this.enabled;

	}

	/**
	 * The method to set the value to enabled
	 * @param enabled A Boolean representing the enabled
	 */
	public void setEnabled(Boolean enabled)
	{
		 this.enabled = enabled;

		 this.keyModified.put("enabled", 1);

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
	 * The method to get the value of displayLabel
	 * @return A String representing the displayLabel
	 */
	public String getDisplayLabel()
	{
		return  this.displayLabel;

	}

	/**
	 * The method to set the value to displayLabel
	 * @param displayLabel A String representing the displayLabel
	 */
	public void setDisplayLabel(String displayLabel)
	{
		 this.displayLabel = displayLabel;

		 this.keyModified.put("display_label", 1);

	}

	/**
	 * The method to get the value of customizable
	 * @return A Boolean representing the customizable
	 */
	public Boolean getCustomizable()
	{
		return  this.customizable;

	}

	/**
	 * The method to set the value to customizable
	 * @param customizable A Boolean representing the customizable
	 */
	public void setCustomizable(Boolean customizable)
	{
		 this.customizable = customizable;

		 this.keyModified.put("customizable", 1);

	}

	/**
	 * The method to get the value of parentPermissions
	 * @return An instance of List<Long>
	 */
	public List<Long> getParentPermissions()
	{
		return  this.parentPermissions;

	}

	/**
	 * The method to set the value to parentPermissions
	 * @param parentPermissions An instance of List<Long>
	 */
	public void setParentPermissions(List<Long> parentPermissions)
	{
		 this.parentPermissions = parentPermissions;

		 this.keyModified.put("parent_permissions", 1);

	}

	/**
	 * The method to get the value of module
	 * @return A String representing the module
	 */
	public String getModule()
	{
		return  this.module;

	}

	/**
	 * The method to set the value to module
	 * @param module A String representing the module
	 */
	public void setModule(String module)
	{
		 this.module = module;

		 this.keyModified.put("module", 1);

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