# UserApi

All URIs are relative to *http://localhost:8085*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UserApi.md#createUser) | **POST** /api/users | Create a new user |
| [**deleteUser**](UserApi.md#deleteUser) | **DELETE** /api/users/{id} | Delete user by ID |
| [**getAllUsers**](UserApi.md#getAllUsers) | **GET** /api/users | Get all users |
| [**getUserById**](UserApi.md#getUserById) | **GET** /api/users/{id} | Get user by ID |
| [**updateUser**](UserApi.md#updateUser) | **PUT** /api/users/{id} | Update user by ID |


<a id="createUser"></a>
# **createUser**
> UserDto createUser(userDto)

Create a new user

Creates a new user with the provided information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    UserApi apiInstance = new UserApi(defaultClient);
    UserDto userDto = new UserDto(); // UserDto | User object to be created
    try {
      UserDto result = apiInstance.createUser(userDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userDto** | [**UserDto**](UserDto.md)| User object to be created | |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | UserDto created successfully |  -  |
| **400** | Validation error |  -  |

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(id)

Delete user by ID

Deletes a user by their unique ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    UserApi apiInstance = new UserApi(defaultClient);
    Object id = null; // Object | ID of the user to delete
    try {
      apiInstance.deleteUser(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | [**Object**](.md)| ID of the user to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User deleted successfully |  -  |
| **404** | User not found |  -  |

<a id="getAllUsers"></a>
# **getAllUsers**
> Object getAllUsers()

Get all users

Retrieves a list of all users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      Object result = apiInstance.getAllUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getAllUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of users |  -  |

<a id="getUserById"></a>
# **getUserById**
> UserDto getUserById(id)

Get user by ID

Retrieves a user by their unique ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    UserApi apiInstance = new UserApi(defaultClient);
    Object id = null; // Object | ID of the user to retrieve
    try {
      UserDto result = apiInstance.getUserById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | [**Object**](.md)| ID of the user to retrieve | |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User found |  -  |
| **404** | User not found |  -  |

<a id="updateUser"></a>
# **updateUser**
> UserDto updateUser(id, userDto)

Update user by ID

Updates an existing user with the provided information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    UserApi apiInstance = new UserApi(defaultClient);
    Object id = null; // Object | ID of the user to update
    UserDto userDto = new UserDto(); // UserDto | Updated user details
    try {
      UserDto result = apiInstance.updateUser(id, userDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | [**Object**](.md)| ID of the user to update | |
| **userDto** | [**UserDto**](UserDto.md)| Updated user details | |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User updated successfully |  -  |
| **404** | User not found |  -  |

