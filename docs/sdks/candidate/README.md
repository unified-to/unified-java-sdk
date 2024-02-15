# Candidate
(*candidate*)

### Available Operations

* [createAtsCandidate](#createatscandidate) - Create a candidate
* [getAtsCandidate](#getatscandidate) - Retrieve a candidate
* [listAtsCandidates](#listatscandidates) - List all candidates
* [patchAtsCandidate](#patchatscandidate) - Update a candidate
* [removeAtsCandidate](#removeatscandidate) - Remove a candidate
* [updateAtsCandidate](#updateatscandidate) - Update a candidate

## createAtsCandidate

Create a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
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

            com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest req = new CreateAtsCandidateRequest(
                "<value>"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "South Hill";
                        country = "Denmark";
                        countryCode = "KM";
                        postalCode = "72991-5163";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "Pollich - Lubowitz";
                    createdAt = OffsetDateTime.parse("2022-03-06T00:47:39.352Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "<value>"){{
                            email = "Ransom.OReilly99@yahoo.com";
                        }}),
                    }};
                    externalId = "<value>";
                    id = "<id>";
                    imageUrl = "<value>";
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    origin = Origin.AGENCY;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    sources = new String[]{{
                        add("<value>"),
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2022-09-27T06:32:21.998Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse res = sdk.candidate.createAtsCandidate(req);

            if (res.atsCandidate != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateRequest](../../models/operations/CreateAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsCandidateResponse](../../models/operations/CreateAtsCandidateResponse.md)**


## getAtsCandidate

Retrieve a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest req = new GetAtsCandidateRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse res = sdk.candidate.getAtsCandidate(req);

            if (res.atsCandidate != null) {
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
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsCandidateRequest](../../models/operations/GetAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsCandidateResponse](../../models/operations/GetAtsCandidateResponse.md)**


## listAtsCandidates

List all candidates

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest req = new ListAtsCandidatesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 6384.09d;
                offset = 7452.94d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-03-18T00:58:25.541Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse res = sdk.candidate.listAtsCandidates(req);

            if (res.atsCandidates != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesRequest](../../models/operations/ListAtsCandidatesRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsCandidatesResponse](../../models/operations/ListAtsCandidatesResponse.md)**


## patchAtsCandidate

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
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

            com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest req = new PatchAtsCandidateRequest(
                "<value>",
                "<value>"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Fort Bridget";
                        country = "Sri Lanka";
                        countryCode = "GI";
                        postalCode = "46054";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "Donnelly - Bartell";
                    createdAt = OffsetDateTime.parse("2024-01-07T04:20:35.612Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "<value>"){{
                            email = "Elissa62@yahoo.com";
                        }}),
                    }};
                    externalId = "<value>";
                    id = "<id>";
                    imageUrl = "<value>";
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    origin = Origin.INTERNAL;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    sources = new String[]{{
                        add("<value>"),
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-09-22T18:26:07.211Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse res = sdk.candidate.patchAtsCandidate(req);

            if (res.atsCandidate != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateRequest](../../models/operations/PatchAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsCandidateResponse](../../models/operations/PatchAtsCandidateResponse.md)**


## removeAtsCandidate

Remove a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest req = new RemoveAtsCandidateRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse res = sdk.candidate.removeAtsCandidate(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateRequest](../../models/operations/RemoveAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsCandidateResponse](../../models/operations/RemoveAtsCandidateResponse.md)**


## updateAtsCandidate

Update a candidate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse;
import com.unifiedapi.unifiedto.models.shared.AtsCandidate;
import com.unifiedapi.unifiedto.models.shared.AtsEmail;
import com.unifiedapi.unifiedto.models.shared.AtsEmailType;
import com.unifiedapi.unifiedto.models.shared.AtsTelephone;
import com.unifiedapi.unifiedto.models.shared.AtsTelephoneType;
import com.unifiedapi.unifiedto.models.shared.Origin;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsCandidateAddress;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest req = new UpdateAtsCandidateRequest(
                "<value>",
                "<value>"){{
                atsCandidate = new AtsCandidate(
){{
                    address = new PropertyAtsCandidateAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Hintzborough";
                        country = "Afghanistan";
                        countryCode = "TF";
                        postalCode = "39423";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "O'Reilly Inc";
                    createdAt = OffsetDateTime.parse("2023-08-31T03:55:05.691Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.AtsEmail[]{{
                        add(new AtsEmail(
                        "<value>"){{
                            email = "Cary37@yahoo.com";
                        }}),
                    }};
                    externalId = "<value>";
                    id = "<id>";
                    imageUrl = "<value>";
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    origin = Origin.UNIVERSITY;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    sources = new String[]{{
                        add("<value>"),
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.AtsTelephone[]{{
                        add(new AtsTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-04-15T00:30:17.967Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse res = sdk.candidate.updateAtsCandidate(req);

            if (res.atsCandidate != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateRequest](../../models/operations/UpdateAtsCandidateRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsCandidateResponse](../../models/operations/UpdateAtsCandidateResponse.md)**

