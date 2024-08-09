# Martech
(*martech()*)

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
* [removeMartechMember](#removemartechmember) - Remove a member
* [updateMartechList](#updatemartechlist) - Update a list
* [updateMartechMember](#updatemartechmember) - Update a member

## createMartechList

Create a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.CreateMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.CreateMartechListResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            CreateMartechListRequest req = CreateMartechListRequest.builder()
                .connectionId("<value>")
                .build();

            CreateMartechListResponse res = sdk.martech().createMartechList()
                .request(req)
                .call();

            if (res.marketingList().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateMartechListRequest](../../models/operations/CreateMartechListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[CreateMartechListResponse](../../models/operations/CreateMartechListResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## createMartechMember

Create a member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.CreateMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.CreateMartechMemberResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            CreateMartechMemberRequest req = CreateMartechMemberRequest.builder()
                .connectionId("<value>")
                .build();

            CreateMartechMemberResponse res = sdk.martech().createMartechMember()
                .request(req)
                .call();

            if (res.marketingMember().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateMartechMemberRequest](../../models/operations/CreateMartechMemberRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[CreateMartechMemberResponse](../../models/operations/CreateMartechMemberResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getMartechList

Retrieve a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.GetMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechListResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetMartechListRequest req = GetMartechListRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            GetMartechListResponse res = sdk.martech().getMartechList()
                .request(req)
                .call();

            if (res.marketingList().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetMartechListRequest](../../models/operations/GetMartechListRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[GetMartechListResponse](../../models/operations/GetMartechListResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getMartechMember

Retrieve a member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.GetMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechMemberResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetMartechMemberRequest req = GetMartechMemberRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            GetMartechMemberResponse res = sdk.martech().getMartechMember()
                .request(req)
                .call();

            if (res.marketingMember().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetMartechMemberRequest](../../models/operations/GetMartechMemberRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |


### Response

**[GetMartechMemberResponse](../../models/operations/GetMartechMemberResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## listMartechLists

List all lists

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.ListMartechListsRequest;
import com.unifiedapi.unifiedto.models.operations.ListMartechListsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            ListMartechListsRequest req = ListMartechListsRequest.builder()
                .connectionId("<value>")
                .build();

            ListMartechListsResponse res = sdk.martech().listMartechLists()
                .request(req)
                .call();

            if (res.marketingLists().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListMartechListsRequest](../../models/operations/ListMartechListsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |


### Response

**[ListMartechListsResponse](../../models/operations/ListMartechListsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## listMartechMembers

List all members

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.ListMartechMembersRequest;
import com.unifiedapi.unifiedto.models.operations.ListMartechMembersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            ListMartechMembersRequest req = ListMartechMembersRequest.builder()
                .connectionId("<value>")
                .build();

            ListMartechMembersResponse res = sdk.martech().listMartechMembers()
                .request(req)
                .call();

            if (res.marketingMembers().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListMartechMembersRequest](../../models/operations/ListMartechMembersRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |


### Response

**[ListMartechMembersResponse](../../models/operations/ListMartechMembersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## patchMartechList

Update a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.PatchMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.PatchMartechListResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            PatchMartechListRequest req = PatchMartechListRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            PatchMartechListResponse res = sdk.martech().patchMartechList()
                .request(req)
                .call();

            if (res.marketingList().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchMartechListRequest](../../models/operations/PatchMartechListRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |


### Response

**[PatchMartechListResponse](../../models/operations/PatchMartechListResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## patchMartechMember

Update a member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.PatchMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.PatchMartechMemberResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            PatchMartechMemberRequest req = PatchMartechMemberRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            PatchMartechMemberResponse res = sdk.martech().patchMartechMember()
                .request(req)
                .call();

            if (res.marketingMember().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchMartechMemberRequest](../../models/operations/PatchMartechMemberRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |


### Response

**[PatchMartechMemberResponse](../../models/operations/PatchMartechMemberResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## removeMartechList

Remove a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechListResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            RemoveMartechListRequest req = RemoveMartechListRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            RemoveMartechListResponse res = sdk.martech().removeMartechList()
                .request(req)
                .call();

            // handle response
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveMartechListRequest](../../models/operations/RemoveMartechListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[RemoveMartechListResponse](../../models/operations/RemoveMartechListResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## removeMartechMember

Remove a member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            RemoveMartechMemberRequest req = RemoveMartechMemberRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            RemoveMartechMemberResponse res = sdk.martech().removeMartechMember()
                .request(req)
                .call();

            // handle response
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveMartechMemberRequest](../../models/operations/RemoveMartechMemberRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[RemoveMartechMemberResponse](../../models/operations/RemoveMartechMemberResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## updateMartechList

Update a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechListRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechListResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            UpdateMartechListRequest req = UpdateMartechListRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            UpdateMartechListResponse res = sdk.martech().updateMartechList()
                .request(req)
                .call();

            if (res.marketingList().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateMartechListRequest](../../models/operations/UpdateMartechListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[UpdateMartechListResponse](../../models/operations/UpdateMartechListResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## updateMartechMember

Update a member

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            UpdateMartechMemberRequest req = UpdateMartechMemberRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            UpdateMartechMemberResponse res = sdk.martech().updateMartechMember()
                .request(req)
                .call();

            if (res.marketingMember().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateMartechMemberRequest](../../models/operations/UpdateMartechMemberRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[UpdateMartechMemberResponse](../../models/operations/UpdateMartechMemberResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
