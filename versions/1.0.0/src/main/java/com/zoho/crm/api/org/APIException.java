package com.zoho.crm.api.org;

import com.zoho.crm.api.util.Choice;
import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APIException implements Model, ResponseHandler, ActionHandler
{
	private Choice<String> status;

	private String apiName;

	private String jsonPath;

	private List<Feature> features;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();

	private Choice<String> code;

	private Choice<String> message;

	private Map<String, Object> details;


	/**
	 * The method to get the value of status
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getStatus()
	{
		return  this.status;

	}

	/**
	 * The method to set the value to status
	 * @param status An instance of Choice<String>
	 */
	public void setStatus(Choice<String> status)
	{
		 this.status = status;

		 this.keyModified.put("status", 1);

	}

	/**
	 * The method to get the value of apiName
	 * @return A String representing the apiName
	 */
	public String getAPIName()
	{
		return  this.apiName;

	}

	/**
	 * The method to set the value to apiName
	 * @param apiName A String representing the apiName
	 */
	public void setAPIName(String apiName)
	{
		 this.apiName = apiName;

		 this.keyModified.put("api_name", 1);

	}

	/**
	 * The method to get the value of jsonPath
	 * @return A String representing the jsonPath
	 */
	public String getJsonPath()
	{
		return  this.jsonPath;

	}

	/**
	 * The method to set the value to jsonPath
	 * @param jsonPath A String representing the jsonPath
	 */
	public void setJsonPath(String jsonPath)
	{
		 this.jsonPath = jsonPath;

		 this.keyModified.put("json_path", 1);

	}

	/**
	 * The method to get the value of features
	 * @return An instance of List<Feature>
	 */
	public List<Feature> getFeatures()
	{
		return  this.features;

	}

	/**
	 * The method to set the value to features
	 * @param features An instance of List<Feature>
	 */
	public void setFeatures(List<Feature> features)
	{
		 this.features = features;

		 this.keyModified.put("features", 1);

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
	 * The method to get the value of code
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getCode()
	{
		return  this.code;

	}

	/**
	 * The method to set the value to code
	 * @param code An instance of Choice<String>
	 */
	public void setCode(Choice<String> code)
	{
		 this.code = code;

		 this.keyModified.put("code", 1);

	}

	/**
	 * The method to get the value of message
	 * @return An instance of Choice<String>
	 */
	public Choice<String> getMessage()
	{
		return  this.message;

	}

	/**
	 * The method to set the value to message
	 * @param message An instance of Choice<String>
	 */
	public void setMessage(Choice<String> message)
	{
		 this.message = message;

		 this.keyModified.put("message", 1);

	}

	/**
	 * The method to get the value of details
	 * @return An instance of Map<String,Object>
	 */
	public Map<String, Object> getDetails()
	{
		return  this.details;

	}

	/**
	 * The method to set the value to details
	 * @param details An instance of Map<String,Object>
	 */
	public void setDetails(Map<String, Object> details)
	{
		 this.details = details;

		 this.keyModified.put("details", 1);

	}
}