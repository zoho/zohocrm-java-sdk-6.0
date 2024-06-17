package com.zoho.crm.api.usersterritories;

import com.zoho.crm.api.exception.SDKException;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.CommonAPIHandler;
import com.zoho.crm.api.util.Constants;

public class UsersTerritoriesOperations
{
	private Long user;

	/**
	 * Creates an instance of UsersTerritoriesOperations with the given parameters
	 * @param user A Long representing the user
	 */
	public UsersTerritoriesOperations(Long user)
	{
		 this.user = user;


	}

	/**
	 * The method to get territories of user
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getTerritoriesOfUser() throws SDKException
	{
		CommonAPIHandler handlerInstance = new CommonAPIHandler();

		String apiPath = new String();

		apiPath = apiPath.concat("/crm/v6/users/");

		apiPath = apiPath.concat( this.user.toString());

		apiPath = apiPath.concat("/territories");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to associate territories to user
	 * @param request An instance of BodyWrapper
	 * @return An instance of APIResponse<ActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<ActionHandler> associateTerritoriesToUser(BodyWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance = new CommonAPIHandler();

		String apiPath = new String();

		apiPath = apiPath.concat("/crm/v6/users/");

		apiPath = apiPath.concat( this.user.toString());

		apiPath = apiPath.concat("/territories");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_UPDATE);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		handlerInstance.setMandatoryChecker(true);

		return handlerInstance.apiCall(ActionHandler.class, "application/json");

	}

	/**
	 * The method to get territory of user
	 * @param territory A Long representing the territory
	 * @return An instance of APIResponse<ResponseHandler>
	 * @throws SDKException
	 */
	public APIResponse<ResponseHandler> getTerritoryOfUser(Long territory) throws SDKException
	{
		CommonAPIHandler handlerInstance = new CommonAPIHandler();

		String apiPath = new String();

		apiPath = apiPath.concat("/crm/v6/users/");

		apiPath = apiPath.concat( this.user.toString());

		apiPath = apiPath.concat("/territories/");

		apiPath = apiPath.concat(territory.toString());

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_READ);

		return handlerInstance.apiCall(ResponseHandler.class, "application/json");

	}

	/**
	 * The method to validate before transfer for all territories
	 * @return An instance of APIResponse<ValidationHandler>
	 * @throws SDKException
	 */
	public APIResponse<ValidationHandler> validateBeforeTransferForAllTerritories() throws SDKException
	{
		CommonAPIHandler handlerInstance = new CommonAPIHandler();

		String apiPath = new String();

		apiPath = apiPath.concat("/crm/v6/users/");

		apiPath = apiPath.concat( this.user.toString());

		apiPath = apiPath.concat("/territories/actions/validate_before_transfer");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_ACTION);

		return handlerInstance.apiCall(ValidationHandler.class, "application/json");

	}

	/**
	 * The method to validate before transfer
	 * @param territory A Long representing the territory
	 * @return An instance of APIResponse<ValidationHandler>
	 * @throws SDKException
	 */
	public APIResponse<ValidationHandler> validateBeforeTransfer(Long territory) throws SDKException
	{
		CommonAPIHandler handlerInstance = new CommonAPIHandler();

		String apiPath = new String();

		apiPath = apiPath.concat("/crm/v6/users/");

		apiPath = apiPath.concat( this.user.toString());

		apiPath = apiPath.concat("/territories/");

		apiPath = apiPath.concat(territory.toString());

		apiPath = apiPath.concat("/actions/validate_before_transfer");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_GET);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_ACTION);

		return handlerInstance.apiCall(ValidationHandler.class, "application/json");

	}

	/**
	 * The method to delink and transfer from all territories
	 * @param request An instance of TransferWrapper
	 * @return An instance of APIResponse<TransferActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<TransferActionHandler> delinkAndTransferFromAllTerritories(TransferWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance = new CommonAPIHandler();

		String apiPath = new String();

		apiPath = apiPath.concat("/crm/v6/users/");

		apiPath = apiPath.concat( this.user.toString());

		apiPath = apiPath.concat("/territories/actions/transfer_and_delink");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_ACTION);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		return handlerInstance.apiCall(TransferActionHandler.class, "application/json");

	}

	/**
	 * The method to delink and transfer from specific territory
	 * @param territory A Long representing the territory
	 * @param request An instance of TransferWrapper
	 * @return An instance of APIResponse<TransferActionHandler>
	 * @throws SDKException
	 */
	public APIResponse<TransferActionHandler> delinkAndTransferFromSpecificTerritory(Long territory, TransferWrapper request) throws SDKException
	{
		CommonAPIHandler handlerInstance = new CommonAPIHandler();

		String apiPath = new String();

		apiPath = apiPath.concat("/crm/v6/users/");

		apiPath = apiPath.concat( this.user.toString());

		apiPath = apiPath.concat("/territories/");

		apiPath = apiPath.concat(territory.toString());

		apiPath = apiPath.concat("/actions/transfer_and_delink");

		handlerInstance.setAPIPath(apiPath);

		handlerInstance.setHttpMethod(Constants.REQUEST_METHOD_PUT);

		handlerInstance.setCategoryMethod(Constants.REQUEST_CATEGORY_ACTION);

		handlerInstance.setContentType("application/json");

		handlerInstance.setRequest(request);

		return handlerInstance.apiCall(TransferActionHandler.class, "application/json");

	}
}