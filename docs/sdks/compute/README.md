# Compute

## Overview

### Available Operations

* [createComputeDeployment](#createcomputedeployment) - Create a deployment
* [createComputeDomain](#createcomputedomain) - Create a domain
* [createComputeEnvvar](#createcomputeenvvar) - Create an envvar
* [createComputeInstance](#createcomputeinstance) - Create an instance
* [createComputeKey](#createcomputekey) - Create a key
* [createComputeService](#createcomputeservice) - Create a service
* [createComputeSnapshot](#createcomputesnapshot) - Create a snapshot
* [createComputeTemplate](#createcomputetemplate) - Create a template
* [createComputeVolume](#createcomputevolume) - Create a volume
* [getComputeDeployment](#getcomputedeployment) - Retrieve a deployment
* [getComputeDomain](#getcomputedomain) - Retrieve a domain
* [getComputeEnvvar](#getcomputeenvvar) - Retrieve an envvar
* [getComputeGputype](#getcomputegputype) - Retrieve a gputype
* [getComputeInstance](#getcomputeinstance) - Retrieve an instance
* [getComputeKey](#getcomputekey) - Retrieve a key
* [getComputeRegion](#getcomputeregion) - Retrieve a region
* [getComputeService](#getcomputeservice) - Retrieve a service
* [getComputeSnapshot](#getcomputesnapshot) - Retrieve a snapshot
* [getComputeTemplate](#getcomputetemplate) - Retrieve a template
* [getComputeVolume](#getcomputevolume) - Retrieve a volume
* [listComputeDeployments](#listcomputedeployments) - List all deployments
* [listComputeDomains](#listcomputedomains) - List all domains
* [listComputeEnvvars](#listcomputeenvvars) - List all envvars
* [listComputeGputypes](#listcomputegputypes) - List all gputypes
* [listComputeInstances](#listcomputeinstances) - List all instances
* [listComputeKeys](#listcomputekeys) - List all keys
* [listComputeRegions](#listcomputeregions) - List all regions
* [listComputeServices](#listcomputeservices) - List all services
* [listComputeSnapshots](#listcomputesnapshots) - List all snapshots
* [listComputeTemplates](#listcomputetemplates) - List all templates
* [listComputeUsages](#listcomputeusages) - List all usages
* [listComputeVolumes](#listcomputevolumes) - List all volumes
* [patchComputeDeployment](#patchcomputedeployment) - Update a deployment
* [patchComputeDomain](#patchcomputedomain) - Update a domain
* [patchComputeEnvvar](#patchcomputeenvvar) - Update an envvar
* [patchComputeInstance](#patchcomputeinstance) - Update an instance
* [patchComputeKey](#patchcomputekey) - Update a key
* [patchComputeService](#patchcomputeservice) - Update a service
* [patchComputeTemplate](#patchcomputetemplate) - Update a template
* [patchComputeVolume](#patchcomputevolume) - Update a volume
* [removeComputeDeployment](#removecomputedeployment) - Remove a deployment
* [removeComputeDomain](#removecomputedomain) - Remove a domain
* [removeComputeEnvvar](#removecomputeenvvar) - Remove an envvar
* [removeComputeInstance](#removecomputeinstance) - Remove an instance
* [removeComputeKey](#removecomputekey) - Remove a key
* [removeComputeService](#removecomputeservice) - Remove a service
* [removeComputeSnapshot](#removecomputesnapshot) - Remove a snapshot
* [removeComputeTemplate](#removecomputetemplate) - Remove a template
* [removeComputeVolume](#removecomputevolume) - Remove a volume
* [updateComputeDeployment](#updatecomputedeployment) - Update a deployment
* [updateComputeDomain](#updatecomputedomain) - Update a domain
* [updateComputeEnvvar](#updatecomputeenvvar) - Update an envvar
* [updateComputeInstance](#updatecomputeinstance) - Update an instance
* [updateComputeKey](#updatecomputekey) - Update a key
* [updateComputeService](#updatecomputeservice) - Update a service
* [updateComputeTemplate](#updatecomputetemplate) - Update a template
* [updateComputeVolume](#updatecomputevolume) - Update a volume

## createComputeDeployment

Create a deployment

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeDeployment" method="post" path="/compute/{connection_id}/deployment" example="compute_deployment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeDeploymentRequest req = CreateComputeDeploymentRequest.builder()
                .computeDeployment(ComputeDeployment.builder()
                    .branch("develop")
                    .commitIdentifier("fadfe54eefd8fea670bea6d58b4b15d406c4b02b")
                    .commitMessage("copy primary pixel")
                    .createdAt(OffsetDateTime.parse("2022-06-07T03:52:04.613Z"))
                    .environment(Environment.PREVIEW)
                    .finishedAt(OffsetDateTime.parse("2025-08-23T11:25:59.888Z"))
                    .id("aa05b469-b86a-469f-9bf6-058b29b3b398")
                    .metadata(List.of())
                    .startedAt(OffsetDateTime.parse("2025-04-04T21:31:52.815Z"))
                    .status(ComputeDeploymentStatus.LIVE)
                    .trigger(Trigger.API)
                    .updatedAt(OffsetDateTime.parse("2026-02-21T15:27:47.197Z"))
                    .url("https://comfortable-petal.name")
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeDeploymentResponse res = sdk.compute().createComputeDeployment()
                .request(req)
                .call();

        if (res.computeDeployment().isPresent()) {
            System.out.println(res.computeDeployment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateComputeDeploymentRequest](../../models/operations/CreateComputeDeploymentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateComputeDeploymentResponse](../../models/operations/CreateComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createComputeDomain

Create a domain

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeDomain" method="post" path="/compute/{connection_id}/domain" example="compute_domain" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeDomainRequest req = CreateComputeDomainRequest.builder()
                .computeDomain(ComputeDomain.builder()
                    .createdAt(OffsetDateTime.parse("2019-11-22T16:38:26.009Z"))
                    .id("215001af-c1f2-47f8-9532-28bb1897a19d")
                    .isPrimary(false)
                    .name("mysterious-republican.usable-section.info")
                    .status(ComputeDomainStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-10-29T21:00:01.610Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeDomainResponse res = sdk.compute().createComputeDomain()
                .request(req)
                .call();

        if (res.computeDomain().isPresent()) {
            System.out.println(res.computeDomain().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateComputeDomainRequest](../../models/operations/CreateComputeDomainRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateComputeDomainResponse](../../models/operations/CreateComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createComputeEnvvar

Create an envvar

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeEnvvar" method="post" path="/compute/{connection_id}/envvar" example="compute_envvar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeEnvvarRequest req = CreateComputeEnvvarRequest.builder()
                .computeEnvvar(ComputeEnvvar.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-16T07:52:27.306Z"))
                    .environments(List.of(
                        PropertyComputeEnvvarEnvironments.PREVIEW))
                    .id("51a04ebd-e587-46a8-963e-144cff6bbbae")
                    .isSecret(true)
                    .name("AEGER_SUBSTANTIA")
                    .updatedAt(OffsetDateTime.parse("2025-06-27T08:35:15.119Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeEnvvarResponse res = sdk.compute().createComputeEnvvar()
                .request(req)
                .call();

        if (res.computeEnvvar().isPresent()) {
            System.out.println(res.computeEnvvar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateComputeEnvvarRequest](../../models/operations/CreateComputeEnvvarRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateComputeEnvvarResponse](../../models/operations/CreateComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createComputeInstance

Create an instance

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeInstance" method="post" path="/compute/{connection_id}/instance" example="compute_instance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeInstanceRequest req = CreateComputeInstanceRequest.builder()
                .computeInstance(ComputeInstance.builder()
                    .allowedActions(List.of(
                        PropertyComputeInstanceAllowedActions.TERMINATE))
                    .architecture(ComputeInstanceArchitecture.OTHER)
                    .cpuCount(8d)
                    .createdAt(OffsetDateTime.parse("2022-10-07T14:18:53.874Z"))
                    .currency("USD")
                    .diskMb(1024000d)
                    .endpoints(List.of(
                        ComputeEndpoint.builder()
                            .isAuthRequired(true)
                            .port(8080d)
                            .protocol(Protocol.HTTPS)
                            .url("https://serene-shark.biz/")
                            .build()))
                    .gpuCount(0d)
                    .hasInternetAccess(true)
                    .id("36018852-6b6a-41cf-91ec-242c2953f27f")
                    .image("ubuntu:24.04")
                    .market(Market.SPOT)
                    .memoryMb(2048d)
                    .metadata(List.of())
                    .name("digital-panel")
                    .onIdle(OnIdle.TERMINATE)
                    .priceAmount(24.90336107776966)
                    .priceUnit(PriceUnit.PER_INSTANCE_HOUR)
                    .projectIdentifier("g547KrivqY")
                    .ssh(PropertyComputeInstanceSsh.builder()
                        .host("116.42.165.89")
                        .port(22d)
                        .username("root")
                        .build())
                    .startedAt(OffsetDateTime.parse("2025-03-18T21:29:25.825Z"))
                    .status(ComputeInstanceStatus.ERROR)
                    .statusReason("Sponte quasi adversus alioqui reiciendis arca carmen canis.")
                    .type(ComputeInstanceType.BAREMETAL)
                    .updatedAt(OffsetDateTime.parse("2025-06-10T15:36:43.673Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeInstanceResponse res = sdk.compute().createComputeInstance()
                .request(req)
                .call();

        if (res.computeInstance().isPresent()) {
            System.out.println(res.computeInstance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateComputeInstanceRequest](../../models/operations/CreateComputeInstanceRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateComputeInstanceResponse](../../models/operations/CreateComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createComputeKey

Create a key

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeKey" method="post" path="/compute/{connection_id}/key" example="compute_key" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeKeyRequest req = CreateComputeKeyRequest.builder()
                .computeKey(ComputeKey.builder()
                    .createdAt(OffsetDateTime.parse("2023-08-19T14:31:46.492Z"))
                    .id("977174a8-c98f-485b-9ddc-93c9cf7b73fa")
                    .name("nienow-secret")
                    .type(ComputeKeyType.SECRET)
                    .updatedAt(OffsetDateTime.parse("2024-10-03T23:49:59.690Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeKeyResponse res = sdk.compute().createComputeKey()
                .request(req)
                .call();

        if (res.computeKey().isPresent()) {
            System.out.println(res.computeKey().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateComputeKeyRequest](../../models/operations/CreateComputeKeyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateComputeKeyResponse](../../models/operations/CreateComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createComputeService

Create a service

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeService" method="post" path="/compute/{connection_id}/service" example="compute_service" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeServiceRequest req = CreateComputeServiceRequest.builder()
                .computeService(ComputeService.builder()
                    .branch("main")
                    .buildCommand("npm run build")
                    .createdAt(OffsetDateTime.parse("2023-10-04T02:06:29.391Z"))
                    .id("0b87ae73-0f4d-4084-ae3b-73e6058c297b")
                    .instanceCount(6d)
                    .maxInstanceCount(6d)
                    .metadata(List.of())
                    .minInstanceCount(1d)
                    .name("tame-sideboard")
                    .projectIdentifier("4nyWICvPfi")
                    .repoUrl("https://github.com/Kimberly_Muller95/tame-sideboard")
                    .runtime("python")
                    .status(ComputeServiceStatus.SUSPENDED)
                    .type(ComputeServiceType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-03-31T13:57:34.731Z"))
                    .url("https://tame-sideboard.rotating-shoulder.biz")
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeServiceResponse res = sdk.compute().createComputeService()
                .request(req)
                .call();

        if (res.computeService().isPresent()) {
            System.out.println(res.computeService().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateComputeServiceRequest](../../models/operations/CreateComputeServiceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateComputeServiceResponse](../../models/operations/CreateComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createComputeSnapshot

Create a snapshot

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeSnapshot" method="post" path="/compute/{connection_id}/snapshot" example="compute_snapshot" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeSnapshotRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeSnapshotResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeSnapshotRequest req = CreateComputeSnapshotRequest.builder()
                .computeSnapshot(ComputeSnapshot.builder()
                    .createdAt(OffsetDateTime.parse("2021-09-24T14:40:06.110Z"))
                    .id("cfe742ef-29b6-4d85-a6c5-fe4156d6b3e0")
                    .metadata(List.of())
                    .name("snap-alius")
                    .sizeMb(169984d)
                    .status(ComputeSnapshotStatus.DELETING)
                    .type(ComputeSnapshotType.DISK)
                    .updatedAt(OffsetDateTime.parse("2026-03-23T11:31:05.572Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeSnapshotResponse res = sdk.compute().createComputeSnapshot()
                .request(req)
                .call();

        if (res.computeSnapshot().isPresent()) {
            System.out.println(res.computeSnapshot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateComputeSnapshotRequest](../../models/operations/CreateComputeSnapshotRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateComputeSnapshotResponse](../../models/operations/CreateComputeSnapshotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createComputeTemplate

Create a template

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeTemplate" method="post" path="/compute/{connection_id}/template" example="compute_template" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeTemplateRequest req = CreateComputeTemplateRequest.builder()
                .computeTemplate(ComputeTemplate.builder()
                    .cpuCount(4d)
                    .createdAt(OffsetDateTime.parse("2023-02-23T03:28:59.864Z"))
                    .diskMb(10240d)
                    .dockerfile("FROM ubuntu:24.04\nRUN apt-get update")
                    .gpuCount(2d)
                    .gpuModel(ComputeTemplateGpuModel.NVIDIA_GH200)
                    .id("5e7de3a8-c183-438e-bdb6-52be1da9ded0")
                    .image("perfumed-molasses/cohibeo:5.2")
                    .isPublic(false)
                    .lastUsedAt(OffsetDateTime.parse("2026-03-16T20:08:09.798Z"))
                    .memoryMb(8192d)
                    .metadata(List.of())
                    .name("multi-byte-card")
                    .ports(List.of(
                        8080d))
                    .status(ComputeTemplateStatus.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-02-08T06:48:04.397Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeTemplateResponse res = sdk.compute().createComputeTemplate()
                .request(req)
                .call();

        if (res.computeTemplate().isPresent()) {
            System.out.println(res.computeTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateComputeTemplateRequest](../../models/operations/CreateComputeTemplateRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateComputeTemplateResponse](../../models/operations/CreateComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createComputeVolume

Create a volume

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeVolume" method="post" path="/compute/{connection_id}/volume" example="compute_volume" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeVolumeRequest req = CreateComputeVolumeRequest.builder()
                .computeVolume(ComputeVolume.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-15T15:12:48.055Z"))
                    .id("fe8cc890-48cf-482a-acef-b1872e2b9939")
                    .instanceIds(List.of())
                    .metadata(List.of())
                    .name("vol-solum")
                    .sizeMb(1024000d)
                    .status(ComputeVolumeStatus.OTHER)
                    .type(ComputeVolumeType.HIGH_PERFORMANCE)
                    .updatedAt(OffsetDateTime.parse("2024-02-07T06:59:59.334Z"))
                    .usedMb(524986d)
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeVolumeResponse res = sdk.compute().createComputeVolume()
                .request(req)
                .call();

        if (res.computeVolume().isPresent()) {
            System.out.println(res.computeVolume().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateComputeVolumeRequest](../../models/operations/CreateComputeVolumeRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateComputeVolumeResponse](../../models/operations/CreateComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeDeployment

Retrieve a deployment

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeDeployment" method="get" path="/compute/{connection_id}/deployment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeDeploymentRequest req = GetComputeDeploymentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeDeploymentResponse res = sdk.compute().getComputeDeployment()
                .request(req)
                .call();

        if (res.computeDeployment().isPresent()) {
            System.out.println(res.computeDeployment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetComputeDeploymentRequest](../../models/operations/GetComputeDeploymentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetComputeDeploymentResponse](../../models/operations/GetComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeDomain

Retrieve a domain

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeDomain" method="get" path="/compute/{connection_id}/domain/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeDomainRequest req = GetComputeDomainRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeDomainResponse res = sdk.compute().getComputeDomain()
                .request(req)
                .call();

        if (res.computeDomain().isPresent()) {
            System.out.println(res.computeDomain().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetComputeDomainRequest](../../models/operations/GetComputeDomainRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetComputeDomainResponse](../../models/operations/GetComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeEnvvar

Retrieve an envvar

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeEnvvar" method="get" path="/compute/{connection_id}/envvar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeEnvvarRequest req = GetComputeEnvvarRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeEnvvarResponse res = sdk.compute().getComputeEnvvar()
                .request(req)
                .call();

        if (res.computeEnvvar().isPresent()) {
            System.out.println(res.computeEnvvar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetComputeEnvvarRequest](../../models/operations/GetComputeEnvvarRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetComputeEnvvarResponse](../../models/operations/GetComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeGputype

Retrieve a gputype

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeGputype" method="get" path="/compute/{connection_id}/gputype/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeGputypeRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeGputypeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeGputypeRequest req = GetComputeGputypeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeGputypeResponse res = sdk.compute().getComputeGputype()
                .request(req)
                .call();

        if (res.computeGputype().isPresent()) {
            System.out.println(res.computeGputype().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetComputeGputypeRequest](../../models/operations/GetComputeGputypeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetComputeGputypeResponse](../../models/operations/GetComputeGputypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeInstance

Retrieve an instance

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeInstance" method="get" path="/compute/{connection_id}/instance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeInstanceRequest req = GetComputeInstanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeInstanceResponse res = sdk.compute().getComputeInstance()
                .request(req)
                .call();

        if (res.computeInstance().isPresent()) {
            System.out.println(res.computeInstance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetComputeInstanceRequest](../../models/operations/GetComputeInstanceRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetComputeInstanceResponse](../../models/operations/GetComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeKey

Retrieve a key

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeKey" method="get" path="/compute/{connection_id}/key/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeKeyRequest req = GetComputeKeyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeKeyResponse res = sdk.compute().getComputeKey()
                .request(req)
                .call();

        if (res.computeKey().isPresent()) {
            System.out.println(res.computeKey().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetComputeKeyRequest](../../models/operations/GetComputeKeyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetComputeKeyResponse](../../models/operations/GetComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeRegion

Retrieve a region

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeRegion" method="get" path="/compute/{connection_id}/region/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeRegionRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeRegionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeRegionRequest req = GetComputeRegionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeRegionResponse res = sdk.compute().getComputeRegion()
                .request(req)
                .call();

        if (res.computeRegion().isPresent()) {
            System.out.println(res.computeRegion().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetComputeRegionRequest](../../models/operations/GetComputeRegionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetComputeRegionResponse](../../models/operations/GetComputeRegionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeService

Retrieve a service

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeService" method="get" path="/compute/{connection_id}/service/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeServiceRequest req = GetComputeServiceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeServiceResponse res = sdk.compute().getComputeService()
                .request(req)
                .call();

        if (res.computeService().isPresent()) {
            System.out.println(res.computeService().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetComputeServiceRequest](../../models/operations/GetComputeServiceRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetComputeServiceResponse](../../models/operations/GetComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeSnapshot

Retrieve a snapshot

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeSnapshot" method="get" path="/compute/{connection_id}/snapshot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeSnapshotRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeSnapshotResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeSnapshotRequest req = GetComputeSnapshotRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeSnapshotResponse res = sdk.compute().getComputeSnapshot()
                .request(req)
                .call();

        if (res.computeSnapshot().isPresent()) {
            System.out.println(res.computeSnapshot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetComputeSnapshotRequest](../../models/operations/GetComputeSnapshotRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetComputeSnapshotResponse](../../models/operations/GetComputeSnapshotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeTemplate

Retrieve a template

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeTemplate" method="get" path="/compute/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeTemplateRequest req = GetComputeTemplateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeTemplateResponse res = sdk.compute().getComputeTemplate()
                .request(req)
                .call();

        if (res.computeTemplate().isPresent()) {
            System.out.println(res.computeTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetComputeTemplateRequest](../../models/operations/GetComputeTemplateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetComputeTemplateResponse](../../models/operations/GetComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeVolume

Retrieve a volume

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeVolume" method="get" path="/compute/{connection_id}/volume/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeVolumeRequest req = GetComputeVolumeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeVolumeResponse res = sdk.compute().getComputeVolume()
                .request(req)
                .call();

        if (res.computeVolume().isPresent()) {
            System.out.println(res.computeVolume().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetComputeVolumeRequest](../../models/operations/GetComputeVolumeRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetComputeVolumeResponse](../../models/operations/GetComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeDeployments

List all deployments

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeDeployments" method="get" path="/compute/{connection_id}/deployment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeDeploymentsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeDeploymentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeDeploymentsRequest req = ListComputeDeploymentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeDeploymentsResponse res = sdk.compute().listComputeDeployments()
                .request(req)
                .call();

        if (res.computeDeployments().isPresent()) {
            System.out.println(res.computeDeployments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListComputeDeploymentsRequest](../../models/operations/ListComputeDeploymentsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListComputeDeploymentsResponse](../../models/operations/ListComputeDeploymentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeDomains

List all domains

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeDomains" method="get" path="/compute/{connection_id}/domain" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeDomainsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeDomainsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeDomainsRequest req = ListComputeDomainsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeDomainsResponse res = sdk.compute().listComputeDomains()
                .request(req)
                .call();

        if (res.computeDomains().isPresent()) {
            System.out.println(res.computeDomains().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListComputeDomainsRequest](../../models/operations/ListComputeDomainsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListComputeDomainsResponse](../../models/operations/ListComputeDomainsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeEnvvars

List all envvars

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeEnvvars" method="get" path="/compute/{connection_id}/envvar" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeEnvvarsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeEnvvarsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeEnvvarsRequest req = ListComputeEnvvarsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeEnvvarsResponse res = sdk.compute().listComputeEnvvars()
                .request(req)
                .call();

        if (res.computeEnvvars().isPresent()) {
            System.out.println(res.computeEnvvars().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListComputeEnvvarsRequest](../../models/operations/ListComputeEnvvarsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListComputeEnvvarsResponse](../../models/operations/ListComputeEnvvarsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeGputypes

List all gputypes

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeGputypes" method="get" path="/compute/{connection_id}/gputype" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeGputypesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeGputypesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeGputypesRequest req = ListComputeGputypesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeGputypesResponse res = sdk.compute().listComputeGputypes()
                .request(req)
                .call();

        if (res.computeGputypes().isPresent()) {
            System.out.println(res.computeGputypes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListComputeGputypesRequest](../../models/operations/ListComputeGputypesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListComputeGputypesResponse](../../models/operations/ListComputeGputypesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeInstances

List all instances

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeInstances" method="get" path="/compute/{connection_id}/instance" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeInstancesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeInstancesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeInstancesRequest req = ListComputeInstancesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeInstancesResponse res = sdk.compute().listComputeInstances()
                .request(req)
                .call();

        if (res.computeInstances().isPresent()) {
            System.out.println(res.computeInstances().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListComputeInstancesRequest](../../models/operations/ListComputeInstancesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListComputeInstancesResponse](../../models/operations/ListComputeInstancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeKeys

List all keys

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeKeys" method="get" path="/compute/{connection_id}/key" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeKeysRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeKeysResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeKeysRequest req = ListComputeKeysRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeKeysResponse res = sdk.compute().listComputeKeys()
                .request(req)
                .call();

        if (res.computeKeys().isPresent()) {
            System.out.println(res.computeKeys().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListComputeKeysRequest](../../models/operations/ListComputeKeysRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListComputeKeysResponse](../../models/operations/ListComputeKeysResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeRegions

List all regions

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeRegions" method="get" path="/compute/{connection_id}/region" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeRegionsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeRegionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeRegionsRequest req = ListComputeRegionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeRegionsResponse res = sdk.compute().listComputeRegions()
                .request(req)
                .call();

        if (res.computeRegions().isPresent()) {
            System.out.println(res.computeRegions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListComputeRegionsRequest](../../models/operations/ListComputeRegionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListComputeRegionsResponse](../../models/operations/ListComputeRegionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeServices

List all services

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeServices" method="get" path="/compute/{connection_id}/service" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeServicesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeServicesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeServicesRequest req = ListComputeServicesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeServicesResponse res = sdk.compute().listComputeServices()
                .request(req)
                .call();

        if (res.computeServices().isPresent()) {
            System.out.println(res.computeServices().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListComputeServicesRequest](../../models/operations/ListComputeServicesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListComputeServicesResponse](../../models/operations/ListComputeServicesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeSnapshots

List all snapshots

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeSnapshots" method="get" path="/compute/{connection_id}/snapshot" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeSnapshotsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeSnapshotsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeSnapshotsRequest req = ListComputeSnapshotsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeSnapshotsResponse res = sdk.compute().listComputeSnapshots()
                .request(req)
                .call();

        if (res.computeSnapshots().isPresent()) {
            System.out.println(res.computeSnapshots().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListComputeSnapshotsRequest](../../models/operations/ListComputeSnapshotsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListComputeSnapshotsResponse](../../models/operations/ListComputeSnapshotsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeTemplates

List all templates

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeTemplates" method="get" path="/compute/{connection_id}/template" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeTemplatesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeTemplatesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeTemplatesRequest req = ListComputeTemplatesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeTemplatesResponse res = sdk.compute().listComputeTemplates()
                .request(req)
                .call();

        if (res.computeTemplates().isPresent()) {
            System.out.println(res.computeTemplates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListComputeTemplatesRequest](../../models/operations/ListComputeTemplatesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListComputeTemplatesResponse](../../models/operations/ListComputeTemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeUsages

List all usages

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeUsages" method="get" path="/compute/{connection_id}/usage" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeUsagesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeUsagesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeUsagesRequest req = ListComputeUsagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeUsagesResponse res = sdk.compute().listComputeUsages()
                .request(req)
                .call();

        if (res.computeUsages().isPresent()) {
            System.out.println(res.computeUsages().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListComputeUsagesRequest](../../models/operations/ListComputeUsagesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListComputeUsagesResponse](../../models/operations/ListComputeUsagesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeVolumes

List all volumes

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeVolumes" method="get" path="/compute/{connection_id}/volume" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeVolumesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeVolumesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeVolumesRequest req = ListComputeVolumesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeVolumesResponse res = sdk.compute().listComputeVolumes()
                .request(req)
                .call();

        if (res.computeVolumes().isPresent()) {
            System.out.println(res.computeVolumes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListComputeVolumesRequest](../../models/operations/ListComputeVolumesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListComputeVolumesResponse](../../models/operations/ListComputeVolumesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeDeployment

Update a deployment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeDeployment" method="patch" path="/compute/{connection_id}/deployment/{id}" example="compute_deployment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeDeploymentRequest req = PatchComputeDeploymentRequest.builder()
                .computeDeployment(ComputeDeployment.builder()
                    .branch("develop")
                    .commitIdentifier("fadfe54eefd8fea670bea6d58b4b15d406c4b02b")
                    .commitMessage("copy primary pixel")
                    .createdAt(OffsetDateTime.parse("2022-06-07T03:52:04.613Z"))
                    .environment(Environment.PREVIEW)
                    .finishedAt(OffsetDateTime.parse("2025-08-23T11:25:59.903Z"))
                    .id("49a6acbd-ead6-44b0-b642-727ac4854b5e")
                    .metadata(List.of())
                    .startedAt(OffsetDateTime.parse("2025-04-04T21:31:52.828Z"))
                    .status(ComputeDeploymentStatus.LIVE)
                    .trigger(Trigger.API)
                    .updatedAt(OffsetDateTime.parse("2026-02-21T15:27:47.214Z"))
                    .url("https://comfortable-petal.name")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeDeploymentResponse res = sdk.compute().patchComputeDeployment()
                .request(req)
                .call();

        if (res.computeDeployment().isPresent()) {
            System.out.println(res.computeDeployment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchComputeDeploymentRequest](../../models/operations/PatchComputeDeploymentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchComputeDeploymentResponse](../../models/operations/PatchComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeDomain

Update a domain

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeDomain" method="patch" path="/compute/{connection_id}/domain/{id}" example="compute_domain" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeDomainRequest req = PatchComputeDomainRequest.builder()
                .computeDomain(ComputeDomain.builder()
                    .createdAt(OffsetDateTime.parse("2019-11-22T16:38:26.009Z"))
                    .id("f633f263-f36c-445a-923b-a01d8dc959da")
                    .isPrimary(false)
                    .name("mysterious-republican.usable-section.info")
                    .status(ComputeDomainStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-10-29T21:00:01.614Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeDomainResponse res = sdk.compute().patchComputeDomain()
                .request(req)
                .call();

        if (res.computeDomain().isPresent()) {
            System.out.println(res.computeDomain().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchComputeDomainRequest](../../models/operations/PatchComputeDomainRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchComputeDomainResponse](../../models/operations/PatchComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeEnvvar

Update an envvar

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeEnvvar" method="patch" path="/compute/{connection_id}/envvar/{id}" example="compute_envvar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeEnvvarRequest req = PatchComputeEnvvarRequest.builder()
                .computeEnvvar(ComputeEnvvar.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-16T07:52:27.306Z"))
                    .environments(List.of(
                        PropertyComputeEnvvarEnvironments.PREVIEW))
                    .id("d232e98a-2327-4db3-88ee-382dd475e36d")
                    .isSecret(true)
                    .name("AEGER_SUBSTANTIA")
                    .updatedAt(OffsetDateTime.parse("2025-06-27T08:35:15.126Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeEnvvarResponse res = sdk.compute().patchComputeEnvvar()
                .request(req)
                .call();

        if (res.computeEnvvar().isPresent()) {
            System.out.println(res.computeEnvvar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchComputeEnvvarRequest](../../models/operations/PatchComputeEnvvarRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchComputeEnvvarResponse](../../models/operations/PatchComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeInstance

Update an instance

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeInstance" method="patch" path="/compute/{connection_id}/instance/{id}" example="compute_instance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeInstanceRequest req = PatchComputeInstanceRequest.builder()
                .computeInstance(ComputeInstance.builder()
                    .allowedActions(List.of(
                        PropertyComputeInstanceAllowedActions.TERMINATE))
                    .architecture(ComputeInstanceArchitecture.OTHER)
                    .cpuCount(8d)
                    .createdAt(OffsetDateTime.parse("2022-10-07T14:18:53.874Z"))
                    .currency("USD")
                    .diskMb(1024000d)
                    .endpoints(List.of(
                        ComputeEndpoint.builder()
                            .isAuthRequired(true)
                            .port(8080d)
                            .protocol(Protocol.HTTPS)
                            .url("https://serene-shark.biz/")
                            .build()))
                    .gpuCount(0d)
                    .hasInternetAccess(true)
                    .id("6758e531-e0f5-403a-ade5-dfd720ab3b0f")
                    .image("ubuntu:24.04")
                    .market(Market.SPOT)
                    .memoryMb(2048d)
                    .metadata(List.of())
                    .name("digital-panel")
                    .onIdle(OnIdle.TERMINATE)
                    .priceAmount(24.90336107776966)
                    .priceUnit(PriceUnit.PER_INSTANCE_HOUR)
                    .projectIdentifier("g547KrivqY")
                    .ssh(PropertyComputeInstanceSsh.builder()
                        .host("116.42.165.89")
                        .port(22d)
                        .username("root")
                        .build())
                    .startedAt(OffsetDateTime.parse("2025-03-18T21:29:25.854Z"))
                    .status(ComputeInstanceStatus.ERROR)
                    .statusReason("Sponte quasi adversus alioqui reiciendis arca carmen canis.")
                    .type(ComputeInstanceType.BAREMETAL)
                    .updatedAt(OffsetDateTime.parse("2025-06-10T15:36:43.704Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeInstanceResponse res = sdk.compute().patchComputeInstance()
                .request(req)
                .call();

        if (res.computeInstance().isPresent()) {
            System.out.println(res.computeInstance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchComputeInstanceRequest](../../models/operations/PatchComputeInstanceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchComputeInstanceResponse](../../models/operations/PatchComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeKey

Update a key

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeKey" method="patch" path="/compute/{connection_id}/key/{id}" example="compute_key" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeKeyRequest req = PatchComputeKeyRequest.builder()
                .computeKey(ComputeKey.builder()
                    .createdAt(OffsetDateTime.parse("2023-08-19T14:31:46.492Z"))
                    .id("03ca34ff-e34f-47cf-8fcc-43ebd4e5433b")
                    .name("nienow-secret")
                    .type(ComputeKeyType.SECRET)
                    .updatedAt(OffsetDateTime.parse("2024-10-03T23:49:59.693Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeKeyResponse res = sdk.compute().patchComputeKey()
                .request(req)
                .call();

        if (res.computeKey().isPresent()) {
            System.out.println(res.computeKey().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchComputeKeyRequest](../../models/operations/PatchComputeKeyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchComputeKeyResponse](../../models/operations/PatchComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeService

Update a service

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeService" method="patch" path="/compute/{connection_id}/service/{id}" example="compute_service" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeServiceRequest req = PatchComputeServiceRequest.builder()
                .computeService(ComputeService.builder()
                    .branch("main")
                    .buildCommand("npm run build")
                    .createdAt(OffsetDateTime.parse("2023-10-04T02:06:29.391Z"))
                    .id("421700b1-a502-4223-b825-6c2bb0ac88ad")
                    .instanceCount(6d)
                    .maxInstanceCount(6d)
                    .metadata(List.of())
                    .minInstanceCount(1d)
                    .name("tame-sideboard")
                    .projectIdentifier("4nyWICvPfi")
                    .repoUrl("https://github.com/Kimberly_Muller95/tame-sideboard")
                    .runtime("python")
                    .status(ComputeServiceStatus.SUSPENDED)
                    .type(ComputeServiceType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-03-31T13:57:34.746Z"))
                    .url("https://tame-sideboard.rotating-shoulder.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeServiceResponse res = sdk.compute().patchComputeService()
                .request(req)
                .call();

        if (res.computeService().isPresent()) {
            System.out.println(res.computeService().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchComputeServiceRequest](../../models/operations/PatchComputeServiceRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchComputeServiceResponse](../../models/operations/PatchComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeTemplate

Update a template

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeTemplate" method="patch" path="/compute/{connection_id}/template/{id}" example="compute_template" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeTemplateRequest req = PatchComputeTemplateRequest.builder()
                .computeTemplate(ComputeTemplate.builder()
                    .cpuCount(4d)
                    .createdAt(OffsetDateTime.parse("2023-02-23T03:28:59.864Z"))
                    .diskMb(10240d)
                    .dockerfile("FROM ubuntu:24.04\nRUN apt-get update")
                    .gpuCount(2d)
                    .gpuModel(ComputeTemplateGpuModel.NVIDIA_GH200)
                    .id("6bad0f72-d145-4779-9c5d-3fdf25f1a2f6")
                    .image("perfumed-molasses/cohibeo:5.2")
                    .isPublic(false)
                    .lastUsedAt(OffsetDateTime.parse("2026-03-16T20:08:09.819Z"))
                    .memoryMb(8192d)
                    .metadata(List.of())
                    .name("multi-byte-card")
                    .ports(List.of(
                        8080d))
                    .status(ComputeTemplateStatus.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-02-08T06:48:04.410Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeTemplateResponse res = sdk.compute().patchComputeTemplate()
                .request(req)
                .call();

        if (res.computeTemplate().isPresent()) {
            System.out.println(res.computeTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchComputeTemplateRequest](../../models/operations/PatchComputeTemplateRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchComputeTemplateResponse](../../models/operations/PatchComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeVolume

Update a volume

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeVolume" method="patch" path="/compute/{connection_id}/volume/{id}" example="compute_volume" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeVolumeRequest req = PatchComputeVolumeRequest.builder()
                .computeVolume(ComputeVolume.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-15T15:12:48.055Z"))
                    .id("7dbb05f4-fdb3-434d-ad8b-3467984eb806")
                    .instanceIds(List.of())
                    .metadata(List.of())
                    .name("vol-solum")
                    .sizeMb(1024000d)
                    .status(ComputeVolumeStatus.OTHER)
                    .type(ComputeVolumeType.HIGH_PERFORMANCE)
                    .updatedAt(OffsetDateTime.parse("2024-02-07T06:59:59.339Z"))
                    .usedMb(524986d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeVolumeResponse res = sdk.compute().patchComputeVolume()
                .request(req)
                .call();

        if (res.computeVolume().isPresent()) {
            System.out.println(res.computeVolume().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchComputeVolumeRequest](../../models/operations/PatchComputeVolumeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchComputeVolumeResponse](../../models/operations/PatchComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeDeployment

Remove a deployment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeDeployment" method="delete" path="/compute/{connection_id}/deployment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeDeploymentRequest req = RemoveComputeDeploymentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeDeploymentResponse res = sdk.compute().removeComputeDeployment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveComputeDeploymentRequest](../../models/operations/RemoveComputeDeploymentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveComputeDeploymentResponse](../../models/operations/RemoveComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeDomain

Remove a domain

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeDomain" method="delete" path="/compute/{connection_id}/domain/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeDomainRequest req = RemoveComputeDomainRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeDomainResponse res = sdk.compute().removeComputeDomain()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveComputeDomainRequest](../../models/operations/RemoveComputeDomainRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveComputeDomainResponse](../../models/operations/RemoveComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeEnvvar

Remove an envvar

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeEnvvar" method="delete" path="/compute/{connection_id}/envvar/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeEnvvarRequest req = RemoveComputeEnvvarRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeEnvvarResponse res = sdk.compute().removeComputeEnvvar()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveComputeEnvvarRequest](../../models/operations/RemoveComputeEnvvarRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveComputeEnvvarResponse](../../models/operations/RemoveComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeInstance

Remove an instance

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeInstance" method="delete" path="/compute/{connection_id}/instance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeInstanceRequest req = RemoveComputeInstanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeInstanceResponse res = sdk.compute().removeComputeInstance()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveComputeInstanceRequest](../../models/operations/RemoveComputeInstanceRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveComputeInstanceResponse](../../models/operations/RemoveComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeKey

Remove a key

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeKey" method="delete" path="/compute/{connection_id}/key/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeKeyRequest req = RemoveComputeKeyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeKeyResponse res = sdk.compute().removeComputeKey()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveComputeKeyRequest](../../models/operations/RemoveComputeKeyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveComputeKeyResponse](../../models/operations/RemoveComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeService

Remove a service

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeService" method="delete" path="/compute/{connection_id}/service/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeServiceRequest req = RemoveComputeServiceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeServiceResponse res = sdk.compute().removeComputeService()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveComputeServiceRequest](../../models/operations/RemoveComputeServiceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveComputeServiceResponse](../../models/operations/RemoveComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeSnapshot

Remove a snapshot

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeSnapshot" method="delete" path="/compute/{connection_id}/snapshot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeSnapshotRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeSnapshotResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeSnapshotRequest req = RemoveComputeSnapshotRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeSnapshotResponse res = sdk.compute().removeComputeSnapshot()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveComputeSnapshotRequest](../../models/operations/RemoveComputeSnapshotRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveComputeSnapshotResponse](../../models/operations/RemoveComputeSnapshotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeTemplate

Remove a template

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeTemplate" method="delete" path="/compute/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeTemplateRequest req = RemoveComputeTemplateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeTemplateResponse res = sdk.compute().removeComputeTemplate()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveComputeTemplateRequest](../../models/operations/RemoveComputeTemplateRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveComputeTemplateResponse](../../models/operations/RemoveComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeVolume

Remove a volume

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeVolume" method="delete" path="/compute/{connection_id}/volume/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeVolumeRequest req = RemoveComputeVolumeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeVolumeResponse res = sdk.compute().removeComputeVolume()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveComputeVolumeRequest](../../models/operations/RemoveComputeVolumeRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveComputeVolumeResponse](../../models/operations/RemoveComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeDeployment

Update a deployment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeDeployment" method="put" path="/compute/{connection_id}/deployment/{id}" example="compute_deployment" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeDeploymentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeDeploymentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeDeploymentRequest req = UpdateComputeDeploymentRequest.builder()
                .computeDeployment(ComputeDeployment.builder()
                    .branch("develop")
                    .commitIdentifier("fadfe54eefd8fea670bea6d58b4b15d406c4b02b")
                    .commitMessage("copy primary pixel")
                    .createdAt(OffsetDateTime.parse("2022-06-07T03:52:04.613Z"))
                    .environment(Environment.PREVIEW)
                    .finishedAt(OffsetDateTime.parse("2025-08-23T11:25:59.903Z"))
                    .id("49a6acbd-ead6-44b0-b642-727ac4854b5e")
                    .metadata(List.of())
                    .startedAt(OffsetDateTime.parse("2025-04-04T21:31:52.828Z"))
                    .status(ComputeDeploymentStatus.LIVE)
                    .trigger(Trigger.API)
                    .updatedAt(OffsetDateTime.parse("2026-02-21T15:27:47.214Z"))
                    .url("https://comfortable-petal.name")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeDeploymentResponse res = sdk.compute().updateComputeDeployment()
                .request(req)
                .call();

        if (res.computeDeployment().isPresent()) {
            System.out.println(res.computeDeployment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateComputeDeploymentRequest](../../models/operations/UpdateComputeDeploymentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateComputeDeploymentResponse](../../models/operations/UpdateComputeDeploymentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeDomain

Update a domain

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeDomain" method="put" path="/compute/{connection_id}/domain/{id}" example="compute_domain" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeDomainRequest req = UpdateComputeDomainRequest.builder()
                .computeDomain(ComputeDomain.builder()
                    .createdAt(OffsetDateTime.parse("2019-11-22T16:38:26.009Z"))
                    .id("f633f263-f36c-445a-923b-a01d8dc959da")
                    .isPrimary(false)
                    .name("mysterious-republican.usable-section.info")
                    .status(ComputeDomainStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-10-29T21:00:01.614Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeDomainResponse res = sdk.compute().updateComputeDomain()
                .request(req)
                .call();

        if (res.computeDomain().isPresent()) {
            System.out.println(res.computeDomain().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateComputeDomainRequest](../../models/operations/UpdateComputeDomainRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateComputeDomainResponse](../../models/operations/UpdateComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeEnvvar

Update an envvar

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeEnvvar" method="put" path="/compute/{connection_id}/envvar/{id}" example="compute_envvar" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeEnvvarRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeEnvvarResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeEnvvarRequest req = UpdateComputeEnvvarRequest.builder()
                .computeEnvvar(ComputeEnvvar.builder()
                    .createdAt(OffsetDateTime.parse("2021-08-16T07:52:27.306Z"))
                    .environments(List.of(
                        PropertyComputeEnvvarEnvironments.PREVIEW))
                    .id("d232e98a-2327-4db3-88ee-382dd475e36d")
                    .isSecret(true)
                    .name("AEGER_SUBSTANTIA")
                    .updatedAt(OffsetDateTime.parse("2025-06-27T08:35:15.126Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeEnvvarResponse res = sdk.compute().updateComputeEnvvar()
                .request(req)
                .call();

        if (res.computeEnvvar().isPresent()) {
            System.out.println(res.computeEnvvar().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateComputeEnvvarRequest](../../models/operations/UpdateComputeEnvvarRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateComputeEnvvarResponse](../../models/operations/UpdateComputeEnvvarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeInstance

Update an instance

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeInstance" method="put" path="/compute/{connection_id}/instance/{id}" example="compute_instance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeInstanceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeInstanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeInstanceRequest req = UpdateComputeInstanceRequest.builder()
                .computeInstance(ComputeInstance.builder()
                    .allowedActions(List.of(
                        PropertyComputeInstanceAllowedActions.TERMINATE))
                    .architecture(ComputeInstanceArchitecture.OTHER)
                    .cpuCount(8d)
                    .createdAt(OffsetDateTime.parse("2022-10-07T14:18:53.874Z"))
                    .currency("USD")
                    .diskMb(1024000d)
                    .endpoints(List.of(
                        ComputeEndpoint.builder()
                            .isAuthRequired(true)
                            .port(8080d)
                            .protocol(Protocol.HTTPS)
                            .url("https://serene-shark.biz/")
                            .build()))
                    .gpuCount(0d)
                    .hasInternetAccess(true)
                    .id("6758e531-e0f5-403a-ade5-dfd720ab3b0f")
                    .image("ubuntu:24.04")
                    .market(Market.SPOT)
                    .memoryMb(2048d)
                    .metadata(List.of())
                    .name("digital-panel")
                    .onIdle(OnIdle.TERMINATE)
                    .priceAmount(24.90336107776966)
                    .priceUnit(PriceUnit.PER_INSTANCE_HOUR)
                    .projectIdentifier("g547KrivqY")
                    .ssh(PropertyComputeInstanceSsh.builder()
                        .host("116.42.165.89")
                        .port(22d)
                        .username("root")
                        .build())
                    .startedAt(OffsetDateTime.parse("2025-03-18T21:29:25.854Z"))
                    .status(ComputeInstanceStatus.ERROR)
                    .statusReason("Sponte quasi adversus alioqui reiciendis arca carmen canis.")
                    .type(ComputeInstanceType.BAREMETAL)
                    .updatedAt(OffsetDateTime.parse("2025-06-10T15:36:43.704Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeInstanceResponse res = sdk.compute().updateComputeInstance()
                .request(req)
                .call();

        if (res.computeInstance().isPresent()) {
            System.out.println(res.computeInstance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateComputeInstanceRequest](../../models/operations/UpdateComputeInstanceRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateComputeInstanceResponse](../../models/operations/UpdateComputeInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeKey

Update a key

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeKey" method="put" path="/compute/{connection_id}/key/{id}" example="compute_key" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeKeyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeKeyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeKeyRequest req = UpdateComputeKeyRequest.builder()
                .computeKey(ComputeKey.builder()
                    .createdAt(OffsetDateTime.parse("2023-08-19T14:31:46.492Z"))
                    .id("03ca34ff-e34f-47cf-8fcc-43ebd4e5433b")
                    .name("nienow-secret")
                    .type(ComputeKeyType.SECRET)
                    .updatedAt(OffsetDateTime.parse("2024-10-03T23:49:59.693Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeKeyResponse res = sdk.compute().updateComputeKey()
                .request(req)
                .call();

        if (res.computeKey().isPresent()) {
            System.out.println(res.computeKey().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateComputeKeyRequest](../../models/operations/UpdateComputeKeyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateComputeKeyResponse](../../models/operations/UpdateComputeKeyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeService

Update a service

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeService" method="put" path="/compute/{connection_id}/service/{id}" example="compute_service" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeServiceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeServiceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeServiceRequest req = UpdateComputeServiceRequest.builder()
                .computeService(ComputeService.builder()
                    .branch("main")
                    .buildCommand("npm run build")
                    .createdAt(OffsetDateTime.parse("2023-10-04T02:06:29.391Z"))
                    .id("421700b1-a502-4223-b825-6c2bb0ac88ad")
                    .instanceCount(6d)
                    .maxInstanceCount(6d)
                    .metadata(List.of())
                    .minInstanceCount(1d)
                    .name("tame-sideboard")
                    .projectIdentifier("4nyWICvPfi")
                    .repoUrl("https://github.com/Kimberly_Muller95/tame-sideboard")
                    .runtime("python")
                    .status(ComputeServiceStatus.SUSPENDED)
                    .type(ComputeServiceType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-03-31T13:57:34.746Z"))
                    .url("https://tame-sideboard.rotating-shoulder.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeServiceResponse res = sdk.compute().updateComputeService()
                .request(req)
                .call();

        if (res.computeService().isPresent()) {
            System.out.println(res.computeService().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateComputeServiceRequest](../../models/operations/UpdateComputeServiceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateComputeServiceResponse](../../models/operations/UpdateComputeServiceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeTemplate

Update a template

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeTemplate" method="put" path="/compute/{connection_id}/template/{id}" example="compute_template" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeTemplateRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeTemplateResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeTemplateRequest req = UpdateComputeTemplateRequest.builder()
                .computeTemplate(ComputeTemplate.builder()
                    .cpuCount(4d)
                    .createdAt(OffsetDateTime.parse("2023-02-23T03:28:59.864Z"))
                    .diskMb(10240d)
                    .dockerfile("FROM ubuntu:24.04\nRUN apt-get update")
                    .gpuCount(2d)
                    .gpuModel(ComputeTemplateGpuModel.NVIDIA_GH200)
                    .id("6bad0f72-d145-4779-9c5d-3fdf25f1a2f6")
                    .image("perfumed-molasses/cohibeo:5.2")
                    .isPublic(false)
                    .lastUsedAt(OffsetDateTime.parse("2026-03-16T20:08:09.819Z"))
                    .memoryMb(8192d)
                    .metadata(List.of())
                    .name("multi-byte-card")
                    .ports(List.of(
                        8080d))
                    .status(ComputeTemplateStatus.OTHER)
                    .updatedAt(OffsetDateTime.parse("2025-02-08T06:48:04.410Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeTemplateResponse res = sdk.compute().updateComputeTemplate()
                .request(req)
                .call();

        if (res.computeTemplate().isPresent()) {
            System.out.println(res.computeTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateComputeTemplateRequest](../../models/operations/UpdateComputeTemplateRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateComputeTemplateResponse](../../models/operations/UpdateComputeTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeVolume

Update a volume

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeVolume" method="put" path="/compute/{connection_id}/volume/{id}" example="compute_volume" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeVolumeRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeVolumeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeVolumeRequest req = UpdateComputeVolumeRequest.builder()
                .computeVolume(ComputeVolume.builder()
                    .createdAt(OffsetDateTime.parse("2022-11-15T15:12:48.055Z"))
                    .id("7dbb05f4-fdb3-434d-ad8b-3467984eb806")
                    .instanceIds(List.of())
                    .metadata(List.of())
                    .name("vol-solum")
                    .sizeMb(1024000d)
                    .status(ComputeVolumeStatus.OTHER)
                    .type(ComputeVolumeType.HIGH_PERFORMANCE)
                    .updatedAt(OffsetDateTime.parse("2024-02-07T06:59:59.339Z"))
                    .usedMb(524986d)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeVolumeResponse res = sdk.compute().updateComputeVolume()
                .request(req)
                .call();

        if (res.computeVolume().isPresent()) {
            System.out.println(res.computeVolume().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateComputeVolumeRequest](../../models/operations/UpdateComputeVolumeRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateComputeVolumeResponse](../../models/operations/UpdateComputeVolumeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |