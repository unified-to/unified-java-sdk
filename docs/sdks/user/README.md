# User
(*user*)

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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("calculate"){{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdUserIdRequest req = new DeleteCrmConnectionIdUserIdRequest("Classical", "pink");            

            DeleteCrmConnectionIdUserIdResponse res = sdk.user.deleteCrmConnectionIdUserId(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdRequest](../../models/operations/DeleteCrmConnectionIdUserIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdResponse](../../models/operations/DeleteCrmConnectionIdUserIdResponse.md)**


## deleteUnifiedUser

Delete your user object

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Northeast"){{
                    jwt = "";
                }})
                .build();

            DeleteUnifiedUserResponse res = sdk.user.deleteUnifiedUser();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Strategist"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdUserRequest req = new GetCrmConnectionIdUserRequest("enchanting"){{
                limit = 1042.84d;
                offset = 220.21d;
                order = "visionary Tasty set";
                query = "Fitness";
                sort = "success servant";
                updatedGte = OffsetDateTime.parse("2023-02-23T05:53:04.259Z");
            }};            

            GetCrmConnectionIdUserResponse res = sdk.user.getCrmConnectionIdUser(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserRequest](../../models/operations/GetCrmConnectionIdUserRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("blanditiis"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdUserIdRequest req = new GetCrmConnectionIdUserIdRequest("quantifying", "Yemen");            

            GetCrmConnectionIdUserIdResponse res = sdk.user.getCrmConnectionIdUserId(req);

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdRequest](../../models/operations/GetCrmConnectionIdUserIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdResponse](../../models/operations/GetCrmConnectionIdUserIdResponse.md)**


## getUnifiedUser

Retrieve your user object

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Pizza"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedUserResponse res = sdk.user.getUnifiedUser();

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedUserResponse](../../models/operations/GetUnifiedUserResponse.md)**


## getUnifiedUserToken

Retrieve your user token

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedUserTokenResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("past"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedUserTokenResponse res = sdk.user.getUnifiedUserToken();

            if (res.getUnifiedUserToken200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


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
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Northwest"){{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdUserIdRequest req = new PatchCrmConnectionIdUserIdRequest("Blues", "violet"){{
                crmUser = new CrmUser(){{
                    active = false;
                    address = new PropertyCrmUserAddress(){{
                        address1 = "Loan Grocery";
                        address2 = "pish Supervisor North";
                        city = "Justiceshire";
                        country = "Israel";
                        countryCode = "JO";
                        postalCode = "37126";
                        region = "Interactions";
                        regionCode = "whiteboard";
                    }};
                    createdAt = OffsetDateTime.parse("2021-11-25T05:08:21.665Z");
                    currency = "Falkland Islands Pound";
                    department = "pascal Berkshire Europium";
                    division = "anti";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "Avon India";
                    languageLocale = "Zimbabwe";
                    name = "Royce matrix Electric";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("however"){{
                            telephone = "Nissan sedately Tricycle";
                        }}),
                    }};
                    timezone = "Pacific/Port_Moresby";
                    title = "Rutherfordium Mayotte";
                    updatedAt = OffsetDateTime.parse("2021-08-21T19:53:18.789Z");
                }};
            }};            

            PatchCrmConnectionIdUserIdResponse res = sdk.user.patchCrmConnectionIdUserId(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdRequest](../../models/operations/PatchCrmConnectionIdUserIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdResponse](../../models/operations/PatchCrmConnectionIdUserIdResponse.md)**


## patchUnifiedUser

Only the name field is updated.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyUserMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.User;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Liberian"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.User req = new User("female", "Bicycle", new String[]{{
    add("Trigender"),
}}){{
                createdAt = OffsetDateTime.parse("2023-06-03T03:54:11.725Z");
                email = "Vergie51@hotmail.com";
                environment = "blue";
                id = "<ID>";
                meta = new PropertyUserMeta();
                updatedAt = OffsetDateTime.parse("2023-08-20T03:50:35.548Z");
            }};            

            PatchUnifiedUserResponse res = sdk.user.patchUnifiedUser(req);

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

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [com.unifiedapi.unifiedto.models.shared.User](../../models/shared/User.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |


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
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Soul"){{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdUserRequest req = new PostCrmConnectionIdUserRequest("Abilene"){{
                crmUser = new CrmUser(){{
                    active = false;
                    address = new PropertyCrmUserAddress(){{
                        address1 = "brr port";
                        address2 = "Northeast like";
                        city = "Fort Guillermo";
                        country = "Cayman Islands";
                        countryCode = "BW";
                        postalCode = "34958";
                        region = "South";
                        regionCode = "morph an colossal";
                    }};
                    createdAt = OffsetDateTime.parse("2021-02-02T08:27:21.693Z");
                    currency = "Cayman Islands Dollar";
                    department = "um";
                    division = "West sievert generating";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "invoice";
                    languageLocale = "Division Accountability radian";
                    name = "bypass";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("microchip"){{
                            telephone = "Tandem Awesome Industrial";
                        }}),
                    }};
                    timezone = "America/Argentina/Buenos_Aires";
                    title = "lime ohm";
                    updatedAt = OffsetDateTime.parse("2021-04-20T06:44:18.792Z");
                }};
            }};            

            PostCrmConnectionIdUserResponse res = sdk.user.postCrmConnectionIdUser(req);

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserRequest](../../models/operations/PostCrmConnectionIdUserRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Small"){{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdUserIdRequest req = new PutCrmConnectionIdUserIdRequest("moratorium", "Oxygen"){{
                crmUser = new CrmUser(){{
                    active = false;
                    address = new PropertyCrmUserAddress(){{
                        address1 = "backing";
                        address2 = "Benin";
                        city = "Port Art";
                        country = "Djibouti";
                        countryCode = "IN";
                        postalCode = "07811";
                        region = "psst how overriding";
                        regionCode = "District Tricycle vaguely";
                    }};
                    createdAt = OffsetDateTime.parse("2023-10-20T20:13:29.023Z");
                    currency = "Netherlands Antillian Guilder";
                    department = "bluetooth Argon Designer";
                    division = "wimp Colombia majestically";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "romance";
                    languageLocale = "Concrete Intersex";
                    name = "synthesizing Transexual";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("chug"){{
                            telephone = "Awesome";
                        }}),
                    }};
                    timezone = "Pacific/Midway";
                    title = "Concrete Checking";
                    updatedAt = OffsetDateTime.parse("2021-03-23T16:02:29.084Z");
                }};
            }};            

            PutCrmConnectionIdUserIdResponse res = sdk.user.putCrmConnectionIdUserId(req);

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdRequest](../../models/operations/PutCrmConnectionIdUserIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdResponse](../../models/operations/PutCrmConnectionIdUserIdResponse.md)**


## putUnifiedUser

Only the name field is updated.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutUnifiedUserResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyUserMeta;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.User;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Hatchback"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.shared.User req = new User("thick", "Hilll", new String[]{{
    add("Lucia"),
}}){{
                createdAt = OffsetDateTime.parse("2023-01-18T08:06:46.269Z");
                email = "Alek.Rath@hotmail.com";
                environment = "interface";
                id = "<ID>";
                meta = new PropertyUserMeta();
                updatedAt = OffsetDateTime.parse("2023-03-20T13:22:47.259Z");
            }};            

            PutUnifiedUserResponse res = sdk.user.putUnifiedUser(req);

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

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [com.unifiedapi.unifiedto.models.shared.User](../../models/shared/User.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUnifiedUserResponse](../../models/operations/PutUnifiedUserResponse.md)**

