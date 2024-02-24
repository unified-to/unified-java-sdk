# Martech
(*martech*)

### Available Operations

* [createMartechList](#createmartechlist) - Create a list
* [createMartechMember](#createmartechmember) - Create a member
* [getMartechList](#getmartechlist) - Retrieve a list
* [getMartechMember](#getmartechmember) - Retrieve a member
* [listMartechLists](#listmartechlists) - List all lists
* [listMartechMembers](#listmartechmembers) - List all members
* [patchMartechList](#patchmartechlist) - Update a list
* [patchMartechMember](#patchmartechmember) - Update a member
* [removeMartechList](#removemartechlist) - Remove a list
* [removeMartechMember](#removemartechmember) - Remove member
* [updateMartechList](#updatemartechlist) - Update a list
* [updateMartechMember](#updatemartechmember) - Update a member

## createMartechList

Create a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.CreateMartechListResponse;
import com.unifiedapi.unifiedto.models.operations.CreateMartechListSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateMartechListRequest req = new CreateMartechListRequest(
                "<value>"){{
                marketingList = new MarketingList(
){{
                    createdAt = "<value>";
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-16T01:36:06.349Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateMartechListResponse res = sdk.martech.createMartechList(req, new CreateMartechListSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingList != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateMartechListRequest](../../models/operations/CreateMartechListRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.CreateMartechListSecurity](../../models/operations/CreateMartechListSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateMartechListResponse](../../models/operations/CreateMartechListResponse.md)**


## createMartechMember

Create a member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.CreateMartechMemberResponse;
import com.unifiedapi.unifiedto.models.operations.CreateMartechMemberSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingEmail;
import com.unifiedapi.unifiedto.models.shared.MarketingEmailType;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateMartechMemberRequest req = new CreateMartechMemberRequest(
                "<value>"){{
                marketingMember = new MarketingMember(
){{
                    createdAt = OffsetDateTime.parse("2022-07-29T17:00:36.055Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail(
                        "<value>"){{
                            email = "Kimberly55@gmail.com";
                        }}),
                    }};
                    id = "<id>";
                    listIds = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-04-24T21:50:25.785Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateMartechMemberResponse res = sdk.martech.createMartechMember(req, new CreateMartechMemberSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingMember != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateMartechMemberRequest](../../models/operations/CreateMartechMemberRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.CreateMartechMemberSecurity](../../models/operations/CreateMartechMemberSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateMartechMemberResponse](../../models/operations/CreateMartechMemberResponse.md)**


## getMartechList

Retrieve a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechListResponse;
import com.unifiedapi.unifiedto.models.operations.GetMartechListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetMartechListRequest req = new GetMartechListRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetMartechListResponse res = sdk.martech.getMartechList(req, new GetMartechListSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingList != null) {
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
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetMartechListRequest](../../models/operations/GetMartechListRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetMartechListSecurity](../../models/operations/GetMartechListSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetMartechListResponse](../../models/operations/GetMartechListResponse.md)**


## getMartechMember

Retrieve a member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechMemberResponse;
import com.unifiedapi.unifiedto.models.operations.GetMartechMemberSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetMartechMemberRequest req = new GetMartechMemberRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetMartechMemberResponse res = sdk.martech.getMartechMember(req, new GetMartechMemberSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingMember != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetMartechMemberRequest](../../models/operations/GetMartechMemberRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetMartechMemberSecurity](../../models/operations/GetMartechMemberSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetMartechMemberResponse](../../models/operations/GetMartechMemberResponse.md)**


## listMartechLists

List all lists

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListMartechListsRequest;
import com.unifiedapi.unifiedto.models.operations.ListMartechListsResponse;
import com.unifiedapi.unifiedto.models.operations.ListMartechListsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListMartechListsRequest req = new ListMartechListsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 9665.22d;
                offset = 367.94d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-09-12T12:19:08.506Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListMartechListsResponse res = sdk.martech.listMartechLists(req, new ListMartechListsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingLists != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListMartechListsRequest](../../models/operations/ListMartechListsRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.ListMartechListsSecurity](../../models/operations/ListMartechListsSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListMartechListsResponse](../../models/operations/ListMartechListsResponse.md)**


## listMartechMembers

List all members

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListMartechMembersRequest;
import com.unifiedapi.unifiedto.models.operations.ListMartechMembersResponse;
import com.unifiedapi.unifiedto.models.operations.ListMartechMembersSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListMartechMembersRequest req = new ListMartechMembersRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 1432.99d;
                listId = "<value>";
                offset = 4150.29d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-02-09T12:30:23.054Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListMartechMembersResponse res = sdk.martech.listMartechMembers(req, new ListMartechMembersSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingMembers != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListMartechMembersRequest](../../models/operations/ListMartechMembersRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.ListMartechMembersSecurity](../../models/operations/ListMartechMembersSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListMartechMembersResponse](../../models/operations/ListMartechMembersResponse.md)**


## patchMartechList

Update a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.PatchMartechListResponse;
import com.unifiedapi.unifiedto.models.operations.PatchMartechListSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchMartechListRequest req = new PatchMartechListRequest(
                "<value>",
                "<value>"){{
                marketingList = new MarketingList(
){{
                    createdAt = "<value>";
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-08T11:05:46.244Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchMartechListResponse res = sdk.martech.patchMartechList(req, new PatchMartechListSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingList != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchMartechListRequest](../../models/operations/PatchMartechListRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchMartechListSecurity](../../models/operations/PatchMartechListSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchMartechListResponse](../../models/operations/PatchMartechListResponse.md)**


## patchMartechMember

Update a member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.PatchMartechMemberResponse;
import com.unifiedapi.unifiedto.models.operations.PatchMartechMemberSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingEmail;
import com.unifiedapi.unifiedto.models.shared.MarketingEmailType;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchMartechMemberRequest req = new PatchMartechMemberRequest(
                "<value>",
                "<value>"){{
                marketingMember = new MarketingMember(
){{
                    createdAt = OffsetDateTime.parse("2023-11-02T21:05:12.012Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail(
                        "<value>"){{
                            email = "Avis.Nikolaus70@hotmail.com";
                        }}),
                    }};
                    id = "<id>";
                    listIds = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-01-22T06:50:35.956Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchMartechMemberResponse res = sdk.martech.patchMartechMember(req, new PatchMartechMemberSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingMember != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchMartechMemberRequest](../../models/operations/PatchMartechMemberRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchMartechMemberSecurity](../../models/operations/PatchMartechMemberSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchMartechMemberResponse](../../models/operations/PatchMartechMemberResponse.md)**


## removeMartechList

Remove a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechListResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveMartechListRequest req = new RemoveMartechListRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveMartechListResponse res = sdk.martech.removeMartechList(req, new RemoveMartechListSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveMartechListRequest](../../models/operations/RemoveMartechListRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.RemoveMartechListSecurity](../../models/operations/RemoveMartechListSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveMartechListResponse](../../models/operations/RemoveMartechListResponse.md)**


## removeMartechMember

Remove member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberRequest req = new RemoveMartechMemberRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberResponse res = sdk.martech.removeMartechMember(req, new RemoveMartechMemberSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberRequest](../../models/operations/RemoveMartechMemberRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberSecurity](../../models/operations/RemoveMartechMemberSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberResponse](../../models/operations/RemoveMartechMemberResponse.md)**


## updateMartechList

Update a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechListResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechListSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateMartechListRequest req = new UpdateMartechListRequest(
                "<value>",
                "<value>"){{
                marketingList = new MarketingList(
){{
                    createdAt = "<value>";
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-09-02T03:22:31.192Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateMartechListResponse res = sdk.martech.updateMartechList(req, new UpdateMartechListSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingList != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateMartechListRequest](../../models/operations/UpdateMartechListRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.UpdateMartechListSecurity](../../models/operations/UpdateMartechListSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateMartechListResponse](../../models/operations/UpdateMartechListResponse.md)**


## updateMartechMember

Update a member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingEmail;
import com.unifiedapi.unifiedto.models.shared.MarketingEmailType;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberRequest req = new UpdateMartechMemberRequest(
                "<value>",
                "<value>"){{
                marketingMember = new MarketingMember(
){{
                    createdAt = OffsetDateTime.parse("2024-04-24T06:25:19.871Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail(
                        "<value>"){{
                            email = "Horacio55@gmail.com";
                        }}),
                    }};
                    id = "<id>";
                    listIds = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-06-16T19:01:37.959Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberResponse res = sdk.martech.updateMartechMember(req, new UpdateMartechMemberSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.marketingMember != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberRequest](../../models/operations/UpdateMartechMemberRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberSecurity](../../models/operations/UpdateMartechMemberSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberResponse](../../models/operations/UpdateMartechMemberResponse.md)**

