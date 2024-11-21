/*
 * User API
 * API documentation for user management.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.UserDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UserApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createUser
     * @param userDto User object to be created (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> UserDto created successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createUserCall(UserDto userDto, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = userDto;

        // create path and map variables
        String localVarPath = "/api/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createUserValidateBeforeCall(UserDto userDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userDto' is set
        if (userDto == null) {
            throw new ApiException("Missing the required parameter 'userDto' when calling createUser(Async)");
        }

        return createUserCall(userDto, _callback);

    }

    /**
     * Create a new user
     * Creates a new user with the provided information.
     * @param userDto User object to be created (required)
     * @return UserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> UserDto created successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation error </td><td>  -  </td></tr>
     </table>
     */
    public UserDto createUser(UserDto userDto) throws ApiException {
        ApiResponse<UserDto> localVarResp = createUserWithHttpInfo(userDto);
        return localVarResp.getData();
    }

    /**
     * Create a new user
     * Creates a new user with the provided information.
     * @param userDto User object to be created (required)
     * @return ApiResponse&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> UserDto created successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserDto> createUserWithHttpInfo(UserDto userDto) throws ApiException {
        okhttp3.Call localVarCall = createUserValidateBeforeCall(userDto, null);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new user (asynchronously)
     * Creates a new user with the provided information.
     * @param userDto User object to be created (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> UserDto created successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Validation error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createUserAsync(UserDto userDto, final ApiCallback<UserDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = createUserValidateBeforeCall(userDto, _callback);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUser
     * @param id ID of the user to delete (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User deleted successfully </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserCall(Object id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteUserValidateBeforeCall(Object id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUser(Async)");
        }

        return deleteUserCall(id, _callback);

    }

    /**
     * Delete user by ID
     * Deletes a user by their unique ID.
     * @param id ID of the user to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User deleted successfully </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public void deleteUser(Object id) throws ApiException {
        deleteUserWithHttpInfo(id);
    }

    /**
     * Delete user by ID
     * Deletes a user by their unique ID.
     * @param id ID of the user to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User deleted successfully </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteUserWithHttpInfo(Object id) throws ApiException {
        okhttp3.Call localVarCall = deleteUserValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete user by ID (asynchronously)
     * Deletes a user by their unique ID.
     * @param id ID of the user to delete (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User deleted successfully </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserAsync(Object id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteUserValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllUsers
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of users </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllUsersCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllUsersValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getAllUsersCall(_callback);

    }

    /**
     * Get all users
     * Retrieves a list of all users.
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of users </td><td>  -  </td></tr>
     </table>
     */
    public Object getAllUsers() throws ApiException {
        ApiResponse<Object> localVarResp = getAllUsersWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get all users
     * Retrieves a list of all users.
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of users </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getAllUsersWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAllUsersValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all users (asynchronously)
     * Retrieves a list of all users.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of users </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllUsersAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllUsersValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserById
     * @param id ID of the user to retrieve (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User found </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserByIdCall(Object id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserByIdValidateBeforeCall(Object id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUserById(Async)");
        }

        return getUserByIdCall(id, _callback);

    }

    /**
     * Get user by ID
     * Retrieves a user by their unique ID.
     * @param id ID of the user to retrieve (required)
     * @return UserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User found </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public UserDto getUserById(Object id) throws ApiException {
        ApiResponse<UserDto> localVarResp = getUserByIdWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get user by ID
     * Retrieves a user by their unique ID.
     * @param id ID of the user to retrieve (required)
     * @return ApiResponse&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User found </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserDto> getUserByIdWithHttpInfo(Object id) throws ApiException {
        okhttp3.Call localVarCall = getUserByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get user by ID (asynchronously)
     * Retrieves a user by their unique ID.
     * @param id ID of the user to retrieve (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User found </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserByIdAsync(Object id, final ApiCallback<UserDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateUser
     * @param id ID of the user to update (required)
     * @param userDto Updated user details (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User updated successfully </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUserCall(Object id, UserDto userDto, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = userDto;

        // create path and map variables
        String localVarPath = "/api/users/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateUserValidateBeforeCall(Object id, UserDto userDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateUser(Async)");
        }

        // verify the required parameter 'userDto' is set
        if (userDto == null) {
            throw new ApiException("Missing the required parameter 'userDto' when calling updateUser(Async)");
        }

        return updateUserCall(id, userDto, _callback);

    }

    /**
     * Update user by ID
     * Updates an existing user with the provided information.
     * @param id ID of the user to update (required)
     * @param userDto Updated user details (required)
     * @return UserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User updated successfully </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public UserDto updateUser(Object id, UserDto userDto) throws ApiException {
        ApiResponse<UserDto> localVarResp = updateUserWithHttpInfo(id, userDto);
        return localVarResp.getData();
    }

    /**
     * Update user by ID
     * Updates an existing user with the provided information.
     * @param id ID of the user to update (required)
     * @param userDto Updated user details (required)
     * @return ApiResponse&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User updated successfully </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserDto> updateUserWithHttpInfo(Object id, UserDto userDto) throws ApiException {
        okhttp3.Call localVarCall = updateUserValidateBeforeCall(id, userDto, null);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update user by ID (asynchronously)
     * Updates an existing user with the provided information.
     * @param id ID of the user to update (required)
     * @param userDto Updated user details (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User updated successfully </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUserAsync(Object id, UserDto userDto, final ApiCallback<UserDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateUserValidateBeforeCall(id, userDto, _callback);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}