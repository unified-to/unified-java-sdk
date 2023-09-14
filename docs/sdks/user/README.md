# user

### Available Operations

* [deleteCrmConnectionIdUserId](#deletecrmconnectioniduserid) - Remove a user
* [deleteUnifiedUser](#deleteunifieduser) - Delete your user object
* [getCrmConnectionIdUser](#getcrmconnectioniduser) - List all users
* [getCrmConnectionIdUserId](#getcrmconnectioniduserid) - Retrieve a user
* [getUnifiedUser](#getunifieduser) - Retrieve your user object
* [getUnifiedUserToken](#getunifiedusertoken) - Retrieve your user token
* [patchCrmConnectionIdUserId](#patchcrmconnectioniduserid) - Update a user
* [patchUnifiedUser](#patchunifieduser) - Updates your user object
* [postCrmConnectionIdUser](#postcrmconnectioniduser) - Create a user
* [putCrmConnectionIdUserId](#putcrmconnectioniduserid) - Update a user
* [putUnifiedUser](#putunifieduser) - Updates your user object

## deleteCrmConnectionIdUserId

Remove a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdUserIdRequest req = new DeleteCrmConnectionIdUserIdRequest("cum", "in");            

            DeleteCrmConnectionIdUserIdResponse res = sdk.user.deleteCrmConnectionIdUserId(req, new DeleteCrmConnectionIdUserIdSecurity("repellendus") {{
                jwt = "";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdRequest](../../models/operations/DeleteCrmConnectionIdUserIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdSecurity](../../models/operations/DeleteCrmConnectionIdUserIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdResponse](../../models/operations/DeleteCrmConnectionIdUserIdResponse.md)**


## deleteUnifiedUser

Delete your user object

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteUnifiedUserResponse res = sdk.user.deleteUnifiedUser(new DeleteUnifiedUserSecurity("incidunt") {{
                jwt = "";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserSecurity](../../models/operations/DeleteUnifiedUserSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserResponse](../../models/operations/DeleteUnifiedUserResponse.md)**


## getCrmConnectionIdUser

List all users

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdUserRequest req = new GetCrmConnectionIdUserRequest("aperiam") {{
                limit = 8739.01d;
                offset = 3575.89d;
                order = "laborum";
                query = "quae";
                sort = "quae";
                updatedGte = OffsetDateTime.parse("2020-12-28T03:12:21.205Z");
            }};            

            GetCrmConnectionIdUserResponse res = sdk.user.getCrmConnectionIdUser(req, new GetCrmConnectionIdUserSecurity("modi") {{
                jwt = "";
            }});

            if (res.crmUsers != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserRequest](../../models/operations/GetCrmConnectionIdUserRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserSecurity](../../models/operations/GetCrmConnectionIdUserSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserResponse](../../models/operations/GetCrmConnectionIdUserResponse.md)**


## getCrmConnectionIdUserId

Retrieve a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdUserIdRequest req = new GetCrmConnectionIdUserIdRequest("nesciunt", "autem");            

            GetCrmConnectionIdUserIdResponse res = sdk.user.getCrmConnectionIdUserId(req, new GetCrmConnectionIdUserIdSecurity("repudiandae") {{
                jwt = "";
            }});

            if (res.crmUser != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdRequest](../../models/operations/GetCrmConnectionIdUserIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdSecurity](../../models/operations/GetCrmConnectionIdUserIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdResponse](../../models/operations/GetCrmConnectionIdUserIdResponse.md)**


## getUnifiedUser

Retrieve your user object

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedUserResponse res = sdk.user.getUnifiedUser(new GetUnifiedUserSecurity("commodi") {{
                jwt = "";
            }});

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetUnifiedUserSecurity](../../models/operations/GetUnifiedUserSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedUserResponse](../../models/operations/GetUnifiedUserResponse.md)**


## getUnifiedUserToken

Retrieve your user token

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenResponse;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedUserTokenResponse res = sdk.user.getUnifiedUserToken(new GetUnifiedUserTokenSecurity("sed") {{
                jwt = "";
            }});

            if (res.getUnifiedUserToken200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenSecurity](../../models/operations/GetUnifiedUserTokenSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenResponse](../../models/operations/GetUnifiedUserTokenResponse.md)**


## patchCrmConnectionIdUserId

Update a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdUserIdRequest req = new PatchCrmConnectionIdUserIdRequest("exercitationem", "natus") {{
                crmUser = new CrmUser() {{
                    active = false;
                    address = new PropertyCrmUserAddress() {{
                        address1 = "explicabo";
                        address2 = "velit";
                        city = "Fort Liam";
                        country = "Ghana";
                        countryCode = "SG";
                        postalCode = "81241-6474";
                        region = "quas";
                        regionCode = "nemo";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-04-20T20:49:59.548Z");
                    currency = "nulla";
                    department = "tempore";
                    division = "magnam";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Eusebio11@hotmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "3febdf67-6b72-406d-ab75-0052a5647edc";
                    imageUrl = "tempora";
                    languageLocale = "sequi";
                    name = "Bert Stamm";
                    raw = new PropertyCrmUserRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("explicabo") {{
                            telephone = "aliquam";
                            type = CrmTelephoneType.HOME;
                        }}),
                    }};
                    timezone = "eaque";
                    title = "Dr.";
                    updatedAt = OffsetDateTime.parse("2022-12-07T23:21:45.478Z");
                }};;
            }};            

            PatchCrmConnectionIdUserIdResponse res = sdk.user.patchCrmConnectionIdUserId(req, new PatchCrmConnectionIdUserIdSecurity("eos") {{
                jwt = "";
            }});

            if (res.crmUser != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdRequest](../../models/operations/PatchCrmConnectionIdUserIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdSecurity](../../models/operations/PatchCrmConnectionIdUserIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdResponse](../../models/operations/PatchCrmConnectionIdUserIdResponse.md)**


## patchUnifiedUser

Only the name field is updated.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyUserMeta;
import com.unifiedapi.unifiedto.models.shared.User;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            com.unifiedapi.unifiedto.models.shared.User req = new User("eius", "voluptatem",                 new String[]{{
                                add("temporibus"),
                            }}) {{
                createdAt = OffsetDateTime.parse("2022-09-21T03:55:20.085Z");
                email = "Jayde.OConner59@yahoo.com";
                environment = "neque";
                id = "b94c3b9d-2488-4d79-9aa4-2fc405669f69";
                meta = new PropertyUserMeta();;
                updatedAt = OffsetDateTime.parse("2022-11-17T20:11:39.177Z");
            }};            

            PatchUnifiedUserResponse res = sdk.user.patchUnifiedUser(req, new PatchUnifiedUserSecurity("doloremque") {{
                jwt = "";
            }});

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.shared.User](../../models/shared/User.md)                                                 | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserSecurity](../../models/operations/PatchUnifiedUserSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserResponse](../../models/operations/PatchUnifiedUserResponse.md)**


## postCrmConnectionIdUser

Create a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserResponse;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdUserRequest req = new PostCrmConnectionIdUserRequest("voluptas") {{
                crmUser = new CrmUser() {{
                    active = false;
                    address = new PropertyCrmUserAddress() {{
                        address1 = "pariatur";
                        address2 = "fugit";
                        city = "East Eduardostead";
                        country = "France";
                        countryCode = "GQ";
                        postalCode = "50684";
                        region = "quo";
                        regionCode = "ipsum";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-10-25T12:21:13.083Z");
                    currency = "harum";
                    department = "magnam";
                    division = "illo";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Elias39@yahoo.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "e00310d0-23dc-4901-b5af-d2a6c44846ae";
                    imageUrl = "molestias";
                    languageLocale = "assumenda";
                    name = "Tracy Dare";
                    raw = new PropertyCrmUserRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("provident") {{
                            telephone = "nobis";
                            type = CrmTelephoneType.OTHER;
                        }}),
                    }};
                    timezone = "ea";
                    title = "Mr.";
                    updatedAt = OffsetDateTime.parse("2022-01-24T07:32:04.181Z");
                }};;
            }};            

            PostCrmConnectionIdUserResponse res = sdk.user.postCrmConnectionIdUser(req, new PostCrmConnectionIdUserSecurity("quos") {{
                jwt = "";
            }});

            if (res.crmUser != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserRequest](../../models/operations/PostCrmConnectionIdUserRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserSecurity](../../models/operations/PostCrmConnectionIdUserSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserResponse](../../models/operations/PostCrmConnectionIdUserResponse.md)**


## putCrmConnectionIdUserId

Update a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdUserIdRequest req = new PutCrmConnectionIdUserIdRequest("excepturi", "eum") {{
                crmUser = new CrmUser() {{
                    active = false;
                    address = new PropertyCrmUserAddress() {{
                        address1 = "rerum";
                        address2 = "a";
                        city = "North Talia";
                        country = "Ethiopia";
                        countryCode = "IE";
                        postalCode = "18271";
                        region = "aliquam";
                        regionCode = "consectetur";
                    }};;
                    createdAt = OffsetDateTime.parse("2021-11-06T21:05:09.188Z");
                    currency = "quae";
                    department = "quam";
                    division = "dignissimos";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Madelynn56@yahoo.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "247725e6-2190-49e9-9044-a5de59ac7706";
                    imageUrl = "ea";
                    languageLocale = "odio";
                    name = "Miss Adrienne Wintheiser";
                    raw = new PropertyCrmUserRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("consectetur") {{
                            telephone = "quis";
                            type = CrmTelephoneType.FAX;
                        }}),
                    }};
                    timezone = "qui";
                    title = "Ms.";
                    updatedAt = OffsetDateTime.parse("2022-09-07T14:23:57.015Z");
                }};;
            }};            

            PutCrmConnectionIdUserIdResponse res = sdk.user.putCrmConnectionIdUserId(req, new PutCrmConnectionIdUserIdSecurity("explicabo") {{
                jwt = "";
            }});

            if (res.crmUser != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdRequest](../../models/operations/PutCrmConnectionIdUserIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdSecurity](../../models/operations/PutCrmConnectionIdUserIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdResponse](../../models/operations/PutCrmConnectionIdUserIdResponse.md)**


## putUnifiedUser

Only the name field is updated.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedUserSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyUserMeta;
import com.unifiedapi.unifiedto.models.shared.User;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            com.unifiedapi.unifiedto.models.shared.User req = new User("ipsam", "beatae",                 new String[]{{
                                add("repudiandae"),
                            }}) {{
                createdAt = OffsetDateTime.parse("2022-08-06T08:21:34.426Z");
                email = "Naomi38@hotmail.com";
                environment = "deleniti";
                id = "97d99a2d-3356-470e-93ee-6cf59f358aae";
                meta = new PropertyUserMeta();;
                updatedAt = OffsetDateTime.parse("2021-06-03T20:58:52.600Z");
            }};            

            PutUnifiedUserResponse res = sdk.user.putUnifiedUser(req, new PutUnifiedUserSecurity("officia") {{
                jwt = "";
            }});

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.shared.User](../../models/shared/User.md)                                             | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PutUnifiedUserSecurity](../../models/operations/PutUnifiedUserSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUnifiedUserResponse](../../models/operations/PutUnifiedUserResponse.md)**

