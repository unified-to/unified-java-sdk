# User
(*user*)

### Available Operations

* [createCrmUser](#createcrmuser) - Create a user
* [getCrmUser](#getcrmuser) - Retrieve a user
* [listCrmUsers](#listcrmusers) - List all users
* [patchCrmUser](#patchcrmuser) - Update a user
* [removeCrmUser](#removecrmuser) - Remove a user
* [updateCrmUser](#updatecrmuser) - Update a user

## createCrmUser

Create a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmUserResponse;
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
                .setSecurity(new Security("zero"){{
                    jwt = "";
                }})
                .build();

            CreateCrmUserRequest req = new CreateCrmUserRequest("male"){{
                crmUser = new CrmUser(){{
                    address = new PropertyCrmUserAddress(){{
                        address1 = "program";
                        address2 = "for";
                        city = "Port Valentinahaven";
                        country = "Armenia";
                        countryCode = "BR";
                        postalCode = "53137";
                        region = "Bicycle";
                        regionCode = "Senior";
                    }};
                    createdAt = OffsetDateTime.parse("2021-04-16T09:17:52.674Z");
                    currency = "Rial Omani";
                    department = "Ohio";
                    division = "male";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "Applications";
                    isActive = false;
                    languageLocale = "Avon";
                    name = "Orange";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("woman"){{
                            telephone = "female";
                        }}),
                    }};
                    timezone = "Asia/Kamchatka";
                    title = "jealously";
                    updatedAt = OffsetDateTime.parse("2023-12-04T11:50:25.111Z");
                }};
            }};            

            CreateCrmUserResponse res = sdk.user.createCrmUser(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmUserRequest](../../models/operations/CreateCrmUserRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmUserResponse](../../models/operations/CreateCrmUserResponse.md)**


## getCrmUser

Retrieve a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmUserResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("adipisci"){{
                    jwt = "";
                }})
                .build();

            GetCrmUserRequest req = new GetCrmUserRequest("connect", "Bacon"){{
                fields = new String[]{{
                    add("and"),
                }};
            }};            

            GetCrmUserResponse res = sdk.user.getCrmUser(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmUserRequest](../../models/operations/GetCrmUserRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmUserResponse](../../models/operations/GetCrmUserResponse.md)**


## listCrmUsers

List all users

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmUsersRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmUsersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("CFA"){{
                    jwt = "";
                }})
                .build();

            ListCrmUsersRequest req = new ListCrmUsersRequest("Costa"){{
                fields = new String[]{{
                    add("olive"),
                }};
                limit = 4392.99d;
                offset = 7999.12d;
                order = "before";
                query = "Forward";
                sort = "scale";
                updatedGte = OffsetDateTime.parse("2022-09-30T10:56:59.338Z");
            }};            

            ListCrmUsersResponse res = sdk.user.listCrmUsers(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmUsersRequest](../../models/operations/ListCrmUsersRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmUsersResponse](../../models/operations/ListCrmUsersResponse.md)**


## patchCrmUser

Update a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmUserResponse;
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
                .setSecurity(new Security("Demiflux"){{
                    jwt = "";
                }})
                .build();

            PatchCrmUserRequest req = new PatchCrmUserRequest("grey", "Pizza"){{
                crmUser = new CrmUser(){{
                    address = new PropertyCrmUserAddress(){{
                        address1 = "katal";
                        address2 = "Industrial";
                        city = "Lilyanshire";
                        country = "Bhutan";
                        countryCode = "CC";
                        postalCode = "89307";
                        region = "encryption";
                        regionCode = "Avon";
                    }};
                    createdAt = OffsetDateTime.parse("2023-07-13T05:11:09.038Z");
                    currency = "Iceland Krona";
                    department = "Cab";
                    division = "colorfully";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "Pizza";
                    isActive = false;
                    languageLocale = "Northeast";
                    name = "Bike";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("input"){{
                            telephone = "Sanford";
                        }}),
                    }};
                    timezone = "America/Juneau";
                    title = "Bike";
                    updatedAt = OffsetDateTime.parse("2022-01-23T14:50:07.697Z");
                }};
            }};            

            PatchCrmUserResponse res = sdk.user.patchCrmUser(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmUserRequest](../../models/operations/PatchCrmUserRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmUserResponse](../../models/operations/PatchCrmUserResponse.md)**


## removeCrmUser

Remove a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmUserResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("yellow"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmUserRequest req = new RemoveCrmUserRequest("Central", "paradigms");            

            RemoveCrmUserResponse res = sdk.user.removeCrmUser(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmUserRequest](../../models/operations/RemoveCrmUserRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmUserResponse](../../models/operations/RemoveCrmUserResponse.md)**


## updateCrmUser

Update a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmUserResponse;
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
                .setSecurity(new Security("benchmark"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmUserRequest req = new UpdateCrmUserRequest("Rustic", "Bedfordshire"){{
                crmUser = new CrmUser(){{
                    address = new PropertyCrmUserAddress(){{
                        address1 = "Savings";
                        address2 = "Corwin";
                        city = "Bruenfield";
                        country = "Virgin Islands, British";
                        countryCode = "SN";
                        postalCode = "29662";
                        region = "evolve";
                        regionCode = "Switzerland";
                    }};
                    createdAt = OffsetDateTime.parse("2022-06-17T09:31:08.726Z");
                    currency = "Belize Dollar";
                    department = "Southwest";
                    division = "Hat";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "Northwest";
                    isActive = false;
                    languageLocale = "expurgate";
                    name = "Ethiopian";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("models"){{
                            telephone = "quis";
                        }}),
                    }};
                    timezone = "America/Indiana/Indianapolis";
                    title = "less";
                    updatedAt = OffsetDateTime.parse("2023-03-27T14:28:54.417Z");
                }};
            }};            

            UpdateCrmUserResponse res = sdk.user.updateCrmUser(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmUserRequest](../../models/operations/UpdateCrmUserRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmUserResponse](../../models/operations/UpdateCrmUserResponse.md)**

