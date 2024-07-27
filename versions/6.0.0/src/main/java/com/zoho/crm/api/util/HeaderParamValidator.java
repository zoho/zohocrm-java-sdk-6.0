package com.zoho.crm.api.util;

import com.zoho.crm.api.Initializer;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HeaderParamValidator<T>
{
	JSONObject jsonDetails = Initializer.jsonDetails;

	public String validate(String name, String className, T value) throws Exception
	{
		className = getClassName(className);
		if (jsonDetails.has(className))
		{
			JSONObject classObject = jsonDetails.getJSONObject(className);
			for (String key : classObject.keySet())
			{
				JSONObject memberDetail = classObject.getJSONObject(key);
				String keyName = memberDetail.getString(Constants.NAME);
				if (name.equalsIgnoreCase(keyName))
				{
					if (memberDetail.has(Constants.STRUCTURE_NAME))
					{
						if (value instanceof Collection)
						{
							JSONArray jsonArray = new JSONArray();
							ArrayList<?> requestObjects = (ArrayList<?>) value;
							if (!requestObjects.isEmpty())
							{
								for (Object requestObject : requestObjects)
								{
									jsonArray.put(new JSONConverter(null).formRequest(requestObject, memberDetail.getString(Constants.STRUCTURE_NAME), null, null));
								}
							}
							return jsonArray.toString();
						}
						return new JSONConverter(null).formRequest(value, memberDetail.getString(Constants.STRUCTURE_NAME), null, null).toString();
					}
					return parseData(value).toString();
				}
			}
		}
		return DataTypeConverter.postConvert(value, value.getClass().getName()).toString();
	}

	public Object parseData(Object value) throws Exception
	{
		if (value instanceof Map)
		{
			JSONObject jsonObject = new JSONObject();
			HashMap<?, ?> requestObject = (HashMap<?, ?>) value;
			if (!requestObject.isEmpty())
			{
				for (Object key : requestObject.keySet())
				{
					jsonObject.put((String) key, parseData(requestObject.get(key)));
				}
			}
			return jsonObject;
		}
		else if (value instanceof Collection)
		{
			JSONArray jsonArray = new JSONArray();
			ArrayList<?> requestObjects = (ArrayList<?>) value;
			if (!requestObjects.isEmpty())
			{
				for (Object requestObject : requestObjects)
				{
					jsonArray.put(parseData(requestObject));
				}
			}
			return jsonArray;
		}
		else if (value instanceof Choice)
		{
			return (((Choice<?>) value).getValue());
		}
		else
		{
			return DataTypeConverter.postConvert(value, value.getClass().getName()).toString();
		}
	}

	public String getClassName(String canonicalName)
	{
		if(canonicalName.contains("."))
		{
			return canonicalName.substring(0, canonicalName.lastIndexOf(".")).toLowerCase() + canonicalName.substring(canonicalName.lastIndexOf("."));
		}
		return canonicalName;
	}
}
