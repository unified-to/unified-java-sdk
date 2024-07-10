# Link
(*link*)

### Available Operations

* [createPaymentLink](#createpaymentlink) - Create a link
* [getPaymentLink](#getpaymentlink) - Retrieve a link
* [listPaymentLinks](#listpaymentlinks) - List all links
* [patchPaymentLink](#patchpaymentlink) - Update a link
* [removePaymentLink](#removepaymentlink) - Remove a link
* [updatePaymentLink](#updatepaymentlink) - Update a link

## createPaymentLink

Create a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkResponse;
import com.unifiedapi.unifiedto.models.shared.PaymentLink;
import com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkRequest req = new CreatePaymentLinkRequest(
                "<value>"){{
                paymentLink = new PaymentLink(
){{
                    amount = 8711.36d;
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-05-14T04:54:56.527Z");
                    currency = "Aruban Guilder";
                    id = "<id>";
                    isActive = false;
                    lineitems = new com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem[]{{
                        add(new PaymentLinkLineitem(
                        8624.97d){{
                            totalAmount = 9418.68d;
                        }}),
                    }};
                    paymentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-07-14T18:03:00.242Z");
                    url = "http://baggy-shark.biz";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkResponse res = sdk.link.createPaymentLink(req);

            if (res.paymentLink != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkRequest](../../models/operations/CreatePaymentLinkRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreatePaymentLinkResponse](../../models/operations/CreatePaymentLinkResponse.md)**


## getPaymentLink

Retrieve a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetPaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.GetPaymentLinkResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetPaymentLinkRequest req = new GetPaymentLinkRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetPaymentLinkResponse res = sdk.link.getPaymentLink(req);

            if (res.paymentLink != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetPaymentLinkRequest](../../models/operations/GetPaymentLinkRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetPaymentLinkResponse](../../models/operations/GetPaymentLinkResponse.md)**


## listPaymentLinks

List all links

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListPaymentLinksRequest;
import com.unifiedapi.unifiedto.models.operations.ListPaymentLinksResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListPaymentLinksRequest req = new ListPaymentLinksRequest(
                "<value>"){{
                contactId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5840.47d;
                offset = 2505.87d;
                paymentId = "<value>";
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2024-12-19T04:38:46.756Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListPaymentLinksResponse res = sdk.link.listPaymentLinks(req);

            if (res.paymentLinks != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListPaymentLinksRequest](../../models/operations/ListPaymentLinksRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListPaymentLinksResponse](../../models/operations/ListPaymentLinksResponse.md)**


## patchPaymentLink

Update a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkResponse;
import com.unifiedapi.unifiedto.models.shared.PaymentLink;
import com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkRequest req = new PatchPaymentLinkRequest(
                "<value>",
                "<value>"){{
                paymentLink = new PaymentLink(
){{
                    amount = 2219.73d;
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-05-20T18:32:48.667Z");
                    currency = "UIC-Franc";
                    id = "<id>";
                    isActive = false;
                    lineitems = new com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem[]{{
                        add(new PaymentLinkLineitem(
                        4326.68d){{
                            totalAmount = 7215.99d;
                        }}),
                    }};
                    paymentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-07-20T09:13:52.888Z");
                    url = "http://accurate-costume.org";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkResponse res = sdk.link.patchPaymentLink(req);

            if (res.paymentLink != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkRequest](../../models/operations/PatchPaymentLinkRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchPaymentLinkResponse](../../models/operations/PatchPaymentLinkResponse.md)**


## removePaymentLink

Remove a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkRequest req = new RemovePaymentLinkRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkResponse res = sdk.link.removePaymentLink(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkRequest](../../models/operations/RemovePaymentLinkRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemovePaymentLinkResponse](../../models/operations/RemovePaymentLinkResponse.md)**


## updatePaymentLink

Update a link

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkRequest;
import com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkResponse;
import com.unifiedapi.unifiedto.models.shared.PaymentLink;
import com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkRequest req = new UpdatePaymentLinkRequest(
                "<value>",
                "<value>"){{
                paymentLink = new PaymentLink(
){{
                    amount = 6147.65d;
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-05-02T07:49:35.280Z");
                    currency = "Gibraltar Pound";
                    id = "<id>";
                    isActive = false;
                    lineitems = new com.unifiedapi.unifiedto.models.shared.PaymentLinkLineitem[]{{
                        add(new PaymentLinkLineitem(
                        9626.54d){{
                            totalAmount = 7053.64d;
                        }}),
                    }};
                    paymentId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-08-22T16:01:32.942Z");
                    url = "https://complex-glove.com";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkResponse res = sdk.link.updatePaymentLink(req);

            if (res.paymentLink != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkRequest](../../models/operations/UpdatePaymentLinkRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdatePaymentLinkResponse](../../models/operations/UpdatePaymentLinkResponse.md)**

