# Collection
(*collection()*)

### Available Operations

* [createCommerceCollection](#createcommercecollection) - Create a collection
* [getCommerceCollection](#getcommercecollection) - Retrieve a collection
* [listCommerceCollections](#listcommercecollections) - List all collections
* [patchCommerceCollection](#patchcommercecollection) - Update a collection
* [removeCommerceCollection](#removecommercecollection) - Remove a collection
* [updateCommerceCollection](#updatecommercecollection) - Update a collection

## createCommerceCollection

Create a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionResponse;
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

            CreateCommerceCollectionRequest req = CreateCommerceCollectionRequest.builder()
                .connectionId("<value>")
                .build();

            CreateCommerceCollectionResponse res = sdk.collection().createCommerceCollection()
                .request(req)
                .call();

            if (res.commerceCollection().isPresent()) {
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateCommerceCollectionRequest](../../models/operations/CreateCommerceCollectionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[CreateCommerceCollectionResponse](../../models/operations/CreateCommerceCollectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getCommerceCollection

Retrieve a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.GetCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.GetCommerceCollectionResponse;
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

            GetCommerceCollectionRequest req = GetCommerceCollectionRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            GetCommerceCollectionResponse res = sdk.collection().getCommerceCollection()
                .request(req)
                .call();

            if (res.commerceCollection().isPresent()) {
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

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetCommerceCollectionRequest](../../models/operations/GetCommerceCollectionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |


### Response

**[GetCommerceCollectionResponse](../../models/operations/GetCommerceCollectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## listCommerceCollections

List all collections

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.ListCommerceCollectionsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCommerceCollectionsResponse;
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

            ListCommerceCollectionsRequest req = ListCommerceCollectionsRequest.builder()
                .connectionId("<value>")
                .build();

            ListCommerceCollectionsResponse res = sdk.collection().listCommerceCollections()
                .request(req)
                .call();

            if (res.commerceCollections().isPresent()) {
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListCommerceCollectionsRequest](../../models/operations/ListCommerceCollectionsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |


### Response

**[ListCommerceCollectionsResponse](../../models/operations/ListCommerceCollectionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## patchCommerceCollection

Update a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionResponse;
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

            PatchCommerceCollectionRequest req = PatchCommerceCollectionRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            PatchCommerceCollectionResponse res = sdk.collection().patchCommerceCollection()
                .request(req)
                .call();

            if (res.commerceCollection().isPresent()) {
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchCommerceCollectionRequest](../../models/operations/PatchCommerceCollectionRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |


### Response

**[PatchCommerceCollectionResponse](../../models/operations/PatchCommerceCollectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## removeCommerceCollection

Remove a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceCollectionResponse;
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

            RemoveCommerceCollectionRequest req = RemoveCommerceCollectionRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            RemoveCommerceCollectionResponse res = sdk.collection().removeCommerceCollection()
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveCommerceCollectionRequest](../../models/operations/RemoveCommerceCollectionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[RemoveCommerceCollectionResponse](../../models/operations/RemoveCommerceCollectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## updateCommerceCollection

Update a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionResponse;
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

            UpdateCommerceCollectionRequest req = UpdateCommerceCollectionRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            UpdateCommerceCollectionResponse res = sdk.collection().updateCommerceCollection()
                .request(req)
                .call();

            if (res.commerceCollection().isPresent()) {
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateCommerceCollectionRequest](../../models/operations/UpdateCommerceCollectionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[UpdateCommerceCollectionResponse](../../models/operations/UpdateCommerceCollectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
