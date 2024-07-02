package samples.variablegroups;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.zoho.api.authenticator.OAuthToken;
import com.zoho.api.authenticator.Token;

import com.zoho.crm.api.Initializer;
import com.zoho.crm.api.dc.USDataCenter;
import com.zoho.crm.api.dc.DataCenter.Environment;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.Model;
import com.zoho.crm.api.variablegroups.APIException;
import com.zoho.crm.api.variablegroups.ResponseHandler;
import com.zoho.crm.api.variablegroups.ResponseWrapper;
import com.zoho.crm.api.variablegroups.VariableGroupsOperations;

public class GetVariableGroups
{
	public static void getVariableGroups() throws Exception
	{
		VariableGroupsOperations variableGroupsOperations = new VariableGroupsOperations();
		APIResponse<ResponseHandler> response = variableGroupsOperations.getVariableGroups();
		if (response != null)
		{
			System.out.println("Status Code: " + response.getStatusCode());
			if (Arrays.asList(204, 304).contains(response.getStatusCode()))
			{
				System.out.println(response.getStatusCode() == 204 ? "No Content" : "Not Modified");
				return;
			}
			if (response.isExpected())
			{
				ResponseHandler responseHandler = response.getObject();
				if (responseHandler instanceof ResponseWrapper)
				{
					ResponseWrapper responseWrapper = (ResponseWrapper) responseHandler;
					List<com.zoho.crm.api.variablegroups.VariableGroup> variableGroups = responseWrapper.getVariableGroups();
					for (com.zoho.crm.api.variablegroups.VariableGroup variableGroup : variableGroups)
					{
						System.out.println("VariableGroup DisplayLabel: " + variableGroup.getDisplayLabel());
						System.out.println("VariableGroup APIName: " + variableGroup.getAPIName());
						System.out.println("VariableGroup Name: " + variableGroup.getName());
						System.out.println("VariableGroup Description: " + variableGroup.getDescription());
						System.out.println("VariableGroup ID: " + variableGroup.getId());
					}
				}
				else if (responseHandler instanceof APIException)
				{
					APIException exception = (APIException) responseHandler;
					System.out.println("Status: " + exception.getStatus().getValue());
					System.out.println("Code: " + exception.getCode().getValue());
					System.out.println("Details: ");
					for (Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					System.out.println("Message: " + exception.getMessage());
				}
			}
			else
			{
				Model responseObject = response.getModel();
				Class<? extends Model> clas = responseObject.getClass();
				java.lang.reflect.Field[] fields = clas.getDeclaredFields();
				for (java.lang.reflect.Field field : fields)
				{
					field.setAccessible(true);
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}

	public static void main(String[] args)
	{
		try
		{
			Environment environment = USDataCenter.PRODUCTION;

			Token token = new OAuthToken.Builder().clientID("Client_Id").clientSecret("Client_Secret").refreshToken("Refresh_Token").redirectURL("Redirect_URL").build();
			new Initializer.Builder().environment(environment).token(token).initialize();
			getVariableGroups();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
