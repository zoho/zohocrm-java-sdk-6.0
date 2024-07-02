package samples.usersterritories;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zoho.api.authenticator.OAuthToken;
import com.zoho.api.authenticator.Token;

import com.zoho.crm.api.Initializer;
import com.zoho.crm.api.dc.USDataCenter;
import com.zoho.crm.api.dc.DataCenter.Environment;
import com.zoho.crm.api.usersterritories.APIException;
import com.zoho.crm.api.usersterritories.SuccessResponse;
import com.zoho.crm.api.usersterritories.TransferActionHandler;
import com.zoho.crm.api.usersterritories.TransferActionResponse;
import com.zoho.crm.api.usersterritories.TransferActionWrapper;
import com.zoho.crm.api.usersterritories.TransferAndDelink;
import com.zoho.crm.api.usersterritories.TransferToUser;
import com.zoho.crm.api.usersterritories.TransferWrapper;
import com.zoho.crm.api.usersterritories.UsersTerritoriesOperations;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.Model;

public class DelinkAndTransferFromAllTerritories
{
	public static void delinkAndTransferFromAllTerritories(Long userId) throws Exception
	{
		UsersTerritoriesOperations usersTerritoriesOperations = new UsersTerritoriesOperations(userId);
		TransferWrapper request = new TransferWrapper();
		List<TransferAndDelink> userTerritoryList = new ArrayList<TransferAndDelink>();
		TransferAndDelink territory = new TransferAndDelink();
		territory.setId(34770613051397l);
		TransferToUser transferToUser = new TransferToUser();
		transferToUser.setId(347706113767065l);
		territory.setTransferToUser(transferToUser);
		userTerritoryList.add(territory);
		request.setTransferAndDelink(userTerritoryList);
		APIResponse<TransferActionHandler> response = usersTerritoriesOperations.delinkAndTransferFromAllTerritories(request);
		if (response != null)
		{
			System.out.println("Status Code: " + response.getStatusCode());
			if (response.isExpected())
			{
				TransferActionHandler actionHandler = response.getObject();
				if (actionHandler instanceof TransferActionWrapper)
				{
					TransferActionWrapper responseWrapper = (TransferActionWrapper) actionHandler;
					List<TransferActionResponse> actionResponses = responseWrapper.getTransferAndDelink();
					for (TransferActionResponse actionResponse : actionResponses)
					{
						if (actionResponse instanceof SuccessResponse)
						{
							SuccessResponse successResponse = (SuccessResponse) actionResponse;
							System.out.println("Status: " + successResponse.getStatus().getValue());
							System.out.println("Code: " + successResponse.getCode().getValue());
							System.out.println("Details: ");
							for (Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							System.out.println("Message: " + successResponse.getMessage());
						}
						else if (actionResponse instanceof APIException)
						{
							APIException exception = (APIException) actionResponse;
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
				}
				else if (actionHandler instanceof APIException)
				{
					APIException exception = (APIException) actionHandler;
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
			Long userId = 4402480254001l;
			delinkAndTransferFromAllTerritories(userId);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
