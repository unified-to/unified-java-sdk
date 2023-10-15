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
                    active = false;
                    address = new PropertyCrmUserAddress(){{
                        address1 = "Incredible Virginia";
                        address2 = "Dakota";
                        city = "Atascocita";
                        country = "Brazil";
                        countryCode = "JP";
                        postalCode = "31377-1960";
                        region = "red";
                        regionCode = "male";
                    }};
                    createdAt = OffsetDateTime.parse("2023-02-24T09:43:14.454Z");
                    currency = "Silver";
                    department = "AI North";
                    division = "Latin Will the";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "Central Director";
                    languageLocale = "Personal compelling similique";
                    name = "pink Toms";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Clifton"){{
                            telephone = "cyan";
                        }}),
                    }};
                    timezone = "Asia/Dhaka";
                    title = "violet";
                    updatedAt = OffsetDateTime.parse("2023-12-25T13:02:25.837Z");
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
                order = "Southeast orange tesla";
                query = "San";
                sort = "Centralized Neptunium";
                updatedGte = OffsetDateTime.parse("2023-10-13T06:25:33.606Z");
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
                    active = false;
                    address = new PropertyCrmUserAddress(){{
                        address1 = "around overburden Factors";
                        address2 = "Samir";
                        city = "Lake Glennaboro";
                        country = "Bahamas";
                        countryCode = "AU";
                        postalCode = "38358-1281";
                        region = "Bike";
                        regionCode = "blue";
                    }};
                    createdAt = OffsetDateTime.parse("2021-01-31T22:26:45.960Z");
                    currency = "Fiji Dollar";
                    department = "sticky pink card";
                    division = "synergize Cotton apud";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "male Land fumbling";
                    languageLocale = "bypassing microchip GB";
                    name = "Cambridgeshire sit Account";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Engineer"){{
                            telephone = "though";
                        }}),
                    }};
                    timezone = "Europe/Brussels";
                    title = "Agender Bicycle";
                    updatedAt = OffsetDateTime.parse("2023-09-30T00:47:17.388Z");
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
                    active = false;
                    address = new PropertyCrmUserAddress(){{
                        address1 = "Carlo Beryllium";
                        address2 = "Southwest throughout Wooden";
                        city = "North Richland Hills";
                        country = "Namibia";
                        countryCode = "EG";
                        postalCode = "00841";
                        region = "lazy";
                        regionCode = "Hat";
                    }};
                    createdAt = OffsetDateTime.parse("2023-10-16T17:08:05.884Z");
                    currency = "Tanzanian Shilling";
                    department = "invoice";
                    division = "Ethiopian";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "female less";
                    languageLocale = "perspiciatis Creative 1080p";
                    name = "Road Movies regulation";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Granite"){{
                            telephone = "Northeast Avon";
                        }}),
                    }};
                    timezone = "Asia/Singapore";
                    title = "hmph connecting Movies";
                    updatedAt = OffsetDateTime.parse("2021-02-07T04:55:02.364Z");
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

