# Lms

## Overview

### Available Operations

* [createLmsActivity](#createlmsactivity) - Create an activity
* [createLmsClass](#createlmsclass) - Create a class
* [createLmsCollection](#createlmscollection) - Create a collection
* [createLmsContent](#createlmscontent) - Create a content
* [createLmsCourse](#createlmscourse) - Create a course
* [createLmsInstructor](#createlmsinstructor) - Create an instructor
* [createLmsStudent](#createlmsstudent) - Create a student
* [getLmsActivity](#getlmsactivity) - Retrieve an activity
* [getLmsClass](#getlmsclass) - Retrieve a class
* [getLmsCollection](#getlmscollection) - Retrieve a collection
* [getLmsContent](#getlmscontent) - Retrieve a content
* [getLmsCourse](#getlmscourse) - Retrieve a course
* [getLmsInstructor](#getlmsinstructor) - Retrieve an instructor
* [getLmsStudent](#getlmsstudent) - Retrieve a student
* [listLmsActivities](#listlmsactivities) - List all activities
* [listLmsClasses](#listlmsclasses) - List all classes
* [listLmsCollections](#listlmscollections) - List all collections
* [listLmsContents](#listlmscontents) - List all contents
* [listLmsCourses](#listlmscourses) - List all courses
* [listLmsInstructors](#listlmsinstructors) - List all instructors
* [listLmsStudents](#listlmsstudents) - List all students
* [patchLmsActivity](#patchlmsactivity) - Update an activity
* [patchLmsClass](#patchlmsclass) - Update a class
* [patchLmsCollection](#patchlmscollection) - Update a collection
* [patchLmsContent](#patchlmscontent) - Update a content
* [patchLmsCourse](#patchlmscourse) - Update a course
* [patchLmsInstructor](#patchlmsinstructor) - Update an instructor
* [patchLmsStudent](#patchlmsstudent) - Update a student
* [removeLmsActivity](#removelmsactivity) - Remove an activity
* [removeLmsClass](#removelmsclass) - Remove a class
* [removeLmsCollection](#removelmscollection) - Remove a collection
* [removeLmsContent](#removelmscontent) - Remove a content
* [removeLmsCourse](#removelmscourse) - Remove a course
* [removeLmsInstructor](#removelmsinstructor) - Remove an instructor
* [removeLmsStudent](#removelmsstudent) - Remove a student
* [updateLmsActivity](#updatelmsactivity) - Update an activity
* [updateLmsClass](#updatelmsclass) - Update a class
* [updateLmsCollection](#updatelmscollection) - Update a collection
* [updateLmsContent](#updatelmscontent) - Update a content
* [updateLmsCourse](#updatelmscourse) - Update a course
* [updateLmsInstructor](#updatelmsinstructor) - Update an instructor
* [updateLmsStudent](#updatelmsstudent) - Update a student

## createLmsActivity

Creates a LmsActivity. Provide the unified LmsActivity fields in the request body; they are mapped to the provider's API. Returns the created LmsActivity.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsActivity" method="post" path="/lms/{connection_id}/activity" example="lms_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsActivityRequest req = CreateLmsActivityRequest.builder()
                .lmsActivity(LmsActivity.builder()
                    .assignedGrade("deserunt")
                    .completedAt(OffsetDateTime.parse("2023-12-24T17:45:39.240Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("c1942dd4-bbaa-465e-b809-8f9688cdaeb6")
                    .isCompleted(true)
                    .metadata(List.of())
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2021-04-28T07:07:55.473Z"))
                    .updatedAt(OffsetDateTime.parse("2022-02-07T16:48:57.204Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsActivityResponse res = sdk.lms().createLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateLmsActivityRequest](../../models/operations/CreateLmsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateLmsActivityResponse](../../models/operations/CreateLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsClass

Creates a LmsClass. Provide the unified LmsClass fields in the request body; they are mapped to the provider's API. Returns the created LmsClass.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsClass" method="post" path="/lms/{connection_id}/class" example="lms_class" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsClassRequest req = CreateLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-20T14:48:51.845Z"))
                    .description("Animus callide corpus.")
                    .id("b5ba14c4-5cbc-4f4a-b569-038e5b041307")
                    .instructors(List.of())
                    .languages(List.of(
                        "in"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Ceno earum culpa adhaero tabesco apostolus talis. Ultra accommodo deinde sono culpo arto cruciamentum triduana. Solvo uter adficio.")
                            .description("Defetiscor aetas.")
                            .languages(List.of(
                                "ko",
                                "lv"))
                            .name("suspendo")
                            .thumbnailUrl("https://picsum.photos/seed/coddeQdTZn/105/852")
                            .type(LmsMediaType.VIDEO)
                            .url("https://picsum.photos/seed/wl3tnt/2277/2170")
                            .build()))
                    .metadata(List.of())
                    .name("sperno")
                    .students(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-09-02T07:18:37.313Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsClassResponse res = sdk.lms().createLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateLmsClassRequest](../../models/operations/CreateLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateLmsClassResponse](../../models/operations/CreateLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsCollection

Creates a LmsCollection. Provide the unified LmsCollection fields in the request body; they are mapped to the provider's API. Returns the created LmsCollection.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCollection" method="post" path="/lms/{connection_id}/collection" example="lms_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCollectionRequest req = CreateLmsCollectionRequest.builder()
                .lmsCollection(LmsCollection.builder()
                    .createdAt(OffsetDateTime.parse("2019-08-19T14:40:29.227Z"))
                    .description("Defluo.")
                    .id("220c2e1f-750f-450f-b20d-3c515eb769cc")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Sollers adeo caste brevis denuo attonbitus. Amita ducimus capillus claudeo vulgaris temporibus arbustum solium. Degusto suppono commodo fuga surculus tripudio doloribus. Quaerat cauda civitas carcer alveus alienus sperno vetus. Adulescens conspergo appositus arguo. Fugiat cimentarius depono angustus somniculosus tubineus terra beatae sui.")
                            .description("Alias sit careo vesco tollo.")
                            .languages(List.of(
                                "eo"))
                            .name("aiunt")
                            .thumbnailUrl("https://picsum.photos/seed/Iy2MXlem/2398/73")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://picsum.photos/seed/5KfxRKbzo1/2699/3216")
                            .build()))
                    .metadata(List.of())
                    .name("spargo")
                    .updatedAt(OffsetDateTime.parse("2026-09-03T02:41:32.197Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCollectionResponse res = sdk.lms().createLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateLmsCollectionRequest](../../models/operations/CreateLmsCollectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateLmsCollectionResponse](../../models/operations/CreateLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsContent

Creates a LmsContent. Provide the unified LmsContent fields in the request body; they are mapped to the provider's API. Returns the created LmsContent.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsContent" method="post" path="/lms/{connection_id}/content" example="lms_content" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsContentRequest req = CreateLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .categories(List.of(
                        "tergum"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Adflicto despecto suppellex socius cresco.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .id("e8f21dbf-c5f0-4275-bb02-6c585efd9933")
                    .instructors(List.of())
                    .isActive(true)
                    .languages(List.of(
                        "campana",
                        "viriliter"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Vindico vorago.")
                            .language("es")
                            .name("aeger")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Sulum.")
                            .language("es")
                            .name("voluptate")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Cohors necessitatibus beatae copiose copiose cedo sub decens acer. Spiritus velum adulatio commodi textus beneficium termes comedo valde caste. Sodalitas bos timor abeo cur. Sperno decet acquiro tabgo canto terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum.")
                            .description("Incidunt tepidus commemoro voro ocer.")
                            .languages(List.of(
                                "ro",
                                "af"))
                            .name("antepono")
                            .thumbnailUrl("https://picsum.photos/seed/URbmlO66Wk/587/3603")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/4KFvVbCx83/2788/2850")
                            .build(),
                        LmsMedia.builder()
                            .content("Ago neque qui cursim tunc barba decens. Tutamen amplus tabella tabgo infit. Demo adversus capillus aro unus. Dedico aspicio alius vehemens terminatio varietas vomica voluptatibus apud. Defero decet impedit verbera pauci laboriosam molestiae urbanus mollitia. Vergo crux certus nulla.")
                            .description("Bene doloribus.")
                            .languages(List.of(
                                "ru",
                                "sw"))
                            .name("totidem")
                            .thumbnailUrl("https://picsum.photos/seed/qpRev/1286/3718")
                            .type(LmsMediaType.WEB)
                            .url("https://picsum.photos/seed/JOWrp5/254/2004")
                            .build(),
                        LmsMedia.builder()
                            .content("Laborum adiuvo labore officia demulceo. Abduco mollitia ventosus synagoga certus magni vado cilicium stella. Velut capitulus attero odio advenio similique acsi totam atavus aufero. Ventosus campana animi.")
                            .description("Trucido dens pecus aer stella.")
                            .languages(List.of(
                                "is",
                                "sk"))
                            .name("territo")
                            .thumbnailUrl("https://picsum.photos/seed/81EuDedaf/557/986")
                            .type(LmsMediaType.IMAGE)
                            .url("https://picsum.photos/seed/BtV2eDuVm7/3644/1033")
                            .build()))
                    .metadata(List.of())
                    .name("laboriosam")
                    .providerName("Mraz - Keeling")
                    .publishedAt(OffsetDateTime.parse("2022-09-14T10:28:14.348Z"))
                    .shortDescription("Videlicet pauci.")
                    .skills(List.of(
                        "soleo"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("clam")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "audio"))
                    .updatedAt(OffsetDateTime.parse("2022-10-15T20:56:00.252Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsContentResponse res = sdk.lms().createLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateLmsContentRequest](../../models/operations/CreateLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLmsContentResponse](../../models/operations/CreateLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsCourse

Creates a LmsCourse. Provide the unified LmsCourse fields in the request body; they are mapped to the provider's API. Returns the created LmsCourse.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsCourse" method="post" path="/lms/{connection_id}/course" example="lms_course" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsCourseRequest req = CreateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .categories(List.of(
                        "deripio",
                        "tergiversatio"))
                    .createdAt(OffsetDateTime.parse("2022-10-06T09:58:53.559Z"))
                    .currency("DZD")
                    .description("Aut.")
                    .durationMinutes(148d)
                    .id("865bf363-6679-49c5-87df-382224ccffbb")
                    .instructors(List.of())
                    .isActive(true)
                    .isPrivate(false)
                    .languages(List.of(
                        "capitulus",
                        "desparatus",
                        "earum"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Carbo dapifer adeptio. Ipsum utrimque quae architecto repellendus cum. Conitor anser abutor error adsuesco abeo caelestis.")
                            .description("Accommodo adipiscor campana aegrotatio.")
                            .languages(List.of(
                                "el",
                                "hr"))
                            .name("conduco")
                            .thumbnailUrl("https://picsum.photos/seed/yTatRhK/3873/3840")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/vcfQAbs/3357/2472")
                            .build()))
                    .metadata(List.of())
                    .name("vinco")
                    .priceAmount(84d)
                    .providerName("Roberts Group")
                    .publishedAt(OffsetDateTime.parse("2022-11-06T11:55:39.377Z"))
                    .skills(List.of(
                        "aveho",
                        "via"))
                    .students(List.of())
                    .timeEstimateMinutes(100d)
                    .updatedAt(OffsetDateTime.parse("2023-02-12T20:13:06.873Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsCourseResponse res = sdk.lms().createLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateLmsCourseRequest](../../models/operations/CreateLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateLmsCourseResponse](../../models/operations/CreateLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsInstructor

Creates a LmsInstructor. Provide the unified LmsInstructor fields in the request body; they are mapped to the provider's API. Returns the created LmsInstructor.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsInstructor" method="post" path="/lms/{connection_id}/instructor" example="lms_instructor" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsInstructorRequest req = CreateLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .createdAt(OffsetDateTime.parse("2021-10-12T16:38:54.979Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build()))
                    .firstName("Miranda")
                    .id("823cb325-1463-4240-8e35-82f4604f0d26")
                    .imageUrl("https://avatars.githubusercontent.com/u/96902788")
                    .lastName("Turcotte")
                    .metadata(List.of())
                    .name("Miranda Turcotte")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(752) 816-3330")
                            .type(LmsTelephoneType.WORK)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(415) 345-1798")
                            .type(LmsTelephoneType.HOME)
                            .build()))
                    .title("Customer Brand Planner")
                    .updatedAt(OffsetDateTime.parse("2025-08-20T11:49:38.178Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsInstructorResponse res = sdk.lms().createLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateLmsInstructorRequest](../../models/operations/CreateLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateLmsInstructorResponse](../../models/operations/CreateLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsStudent

Creates a LmsStudent. Provide the unified LmsStudent fields in the request body; they are mapped to the provider's API. Returns the created LmsStudent.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsStudent" method="post" path="/lms/{connection_id}/student" example="lms_student" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsStudentRequest req = CreateLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .address(PropertyLmsStudentAddress.builder()
                        .address1("4610 Smith Cove")
                        .city("Lake Milanchester")
                        .countryCode("US")
                        .postalCode("58634-4787")
                        .region("Iowa")
                        .regionCode("AZ")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-03-23T06:59:29.777Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build()))
                    .firstName("Lazaro")
                    .id("75ac6d4c-bac8-4f74-a350-40e8c031da7d")
                    .imageUrl("https://avatars.githubusercontent.com/u/3245424")
                    .lastName("Zulauf-Schowalter")
                    .metadata(List.of())
                    .name("Lazaro Zulauf-Schowalter")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(476) 500-2870")
                            .type(LmsTelephoneType.WORK)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(338) 436-9806")
                            .type(LmsTelephoneType.FAX)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(852) 940-8205")
                            .type(LmsTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-07-13T09:24:03.460Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsStudentResponse res = sdk.lms().createLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateLmsStudentRequest](../../models/operations/CreateLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateLmsStudentResponse](../../models/operations/CreateLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsActivity

Retrieves a single LmsActivity by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsActivity" method="get" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsActivityRequest req = GetLmsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsActivityResponse res = sdk.lms().getLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLmsActivityRequest](../../models/operations/GetLmsActivityRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLmsActivityResponse](../../models/operations/GetLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsClass

Retrieves a single LmsClass by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsClass" method="get" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsClassRequest req = GetLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsClassResponse res = sdk.lms().getLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetLmsClassRequest](../../models/operations/GetLmsClassRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetLmsClassResponse](../../models/operations/GetLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCollection

Retrieves a single LmsCollection by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsCollection" method="get" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsCollectionRequest req = GetLmsCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCollectionResponse res = sdk.lms().getLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetLmsCollectionRequest](../../models/operations/GetLmsCollectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetLmsCollectionResponse](../../models/operations/GetLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsContent

Retrieves a single LmsContent by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsContent" method="get" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsContentRequest req = GetLmsContentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsContentResponse res = sdk.lms().getLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLmsContentRequest](../../models/operations/GetLmsContentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLmsContentResponse](../../models/operations/GetLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsCourse

Retrieves a single LmsCourse by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsCourse" method="get" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsCourseRequest req = GetLmsCourseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsCourseResponse res = sdk.lms().getLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetLmsCourseRequest](../../models/operations/GetLmsCourseRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetLmsCourseResponse](../../models/operations/GetLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsInstructor

Retrieves a single LmsInstructor by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsInstructor" method="get" path="/lms/{connection_id}/instructor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsInstructorRequest req = GetLmsInstructorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsInstructorResponse res = sdk.lms().getLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetLmsInstructorRequest](../../models/operations/GetLmsInstructorRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetLmsInstructorResponse](../../models/operations/GetLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsStudent

Retrieves a single LmsStudent by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsStudent" method="get" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsStudentRequest req = GetLmsStudentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsStudentResponse res = sdk.lms().getLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLmsStudentRequest](../../models/operations/GetLmsStudentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLmsStudentResponse](../../models/operations/GetLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsActivities

Returns a list of LmsActivities. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsActivities" method="get" path="/lms/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsActivitiesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsActivitiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsActivitiesRequest req = ListLmsActivitiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsActivitiesResponse res = sdk.lms().listLmsActivities()
                .request(req)
                .call();

        if (res.lmsActivities().isPresent()) {
            System.out.println(res.lmsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListLmsActivitiesRequest](../../models/operations/ListLmsActivitiesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListLmsActivitiesResponse](../../models/operations/ListLmsActivitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsClasses

Returns a list of LmsClasses. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsClasses" method="get" path="/lms/{connection_id}/class" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsClassesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsClassesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsClassesRequest req = ListLmsClassesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsClassesResponse res = sdk.lms().listLmsClasses()
                .request(req)
                .call();

        if (res.lmsClasses().isPresent()) {
            System.out.println(res.lmsClasses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListLmsClassesRequest](../../models/operations/ListLmsClassesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListLmsClassesResponse](../../models/operations/ListLmsClassesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsCollections

Returns a list of LmsCollections. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsCollections" method="get" path="/lms/{connection_id}/collection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsCollectionsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsCollectionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsCollectionsRequest req = ListLmsCollectionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsCollectionsResponse res = sdk.lms().listLmsCollections()
                .request(req)
                .call();

        if (res.lmsCollections().isPresent()) {
            System.out.println(res.lmsCollections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListLmsCollectionsRequest](../../models/operations/ListLmsCollectionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListLmsCollectionsResponse](../../models/operations/ListLmsCollectionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsContents

Returns a list of LmsContents. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsContents" method="get" path="/lms/{connection_id}/content" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsContentsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsContentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsContentsRequest req = ListLmsContentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsContentsResponse res = sdk.lms().listLmsContents()
                .request(req)
                .call();

        if (res.lmsContents().isPresent()) {
            System.out.println(res.lmsContents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsContentsRequest](../../models/operations/ListLmsContentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsContentsResponse](../../models/operations/ListLmsContentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsCourses

Returns a list of LmsCourses. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsCourses" method="get" path="/lms/{connection_id}/course" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsCoursesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsCoursesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsCoursesRequest req = ListLmsCoursesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsCoursesResponse res = sdk.lms().listLmsCourses()
                .request(req)
                .call();

        if (res.lmsCourses().isPresent()) {
            System.out.println(res.lmsCourses().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListLmsCoursesRequest](../../models/operations/ListLmsCoursesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListLmsCoursesResponse](../../models/operations/ListLmsCoursesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsInstructors

Returns a list of LmsInstructors. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsInstructors" method="get" path="/lms/{connection_id}/instructor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsInstructorsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsInstructorsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsInstructorsRequest req = ListLmsInstructorsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsInstructorsResponse res = sdk.lms().listLmsInstructors()
                .request(req)
                .call();

        if (res.lmsInstructors().isPresent()) {
            System.out.println(res.lmsInstructors().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListLmsInstructorsRequest](../../models/operations/ListLmsInstructorsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListLmsInstructorsResponse](../../models/operations/ListLmsInstructorsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsStudents

Returns a list of LmsStudents. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsStudents" method="get" path="/lms/{connection_id}/student" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsStudentsRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsStudentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsStudentsRequest req = ListLmsStudentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsStudentsResponse res = sdk.lms().listLmsStudents()
                .request(req)
                .call();

        if (res.lmsStudents().isPresent()) {
            System.out.println(res.lmsStudents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListLmsStudentsRequest](../../models/operations/ListLmsStudentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListLmsStudentsResponse](../../models/operations/ListLmsStudentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsActivity

Updates the LmsActivity identified by `id`. Provide the unified LmsActivity fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsActivity" method="patch" path="/lms/{connection_id}/activity/{id}" example="lms_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsActivityRequest req = PatchLmsActivityRequest.builder()
                .lmsActivity(LmsActivity.builder()
                    .assignedGrade("deserunt")
                    .completedAt(OffsetDateTime.parse("2023-12-24T17:45:39.247Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("4ccaa3fe-57cf-4cff-b732-0d9bb4c2b6e6")
                    .isCompleted(true)
                    .metadata(List.of())
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2021-04-28T07:07:55.474Z"))
                    .updatedAt(OffsetDateTime.parse("2022-02-07T16:48:57.207Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsActivityResponse res = sdk.lms().patchLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchLmsActivityRequest](../../models/operations/PatchLmsActivityRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchLmsActivityResponse](../../models/operations/PatchLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsClass

Updates the LmsClass identified by `id`. Provide the unified LmsClass fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsClass" method="patch" path="/lms/{connection_id}/class/{id}" example="lms_class" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsClassRequest req = PatchLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-20T14:48:51.845Z"))
                    .description("Animus callide corpus.")
                    .id("bf51c2ff-e0aa-4a0a-a5a3-119d14292028")
                    .instructors(List.of())
                    .languages(List.of(
                        "in"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Ceno earum culpa adhaero tabesco apostolus talis. Ultra accommodo deinde sono culpo arto cruciamentum triduana. Solvo uter adficio.")
                            .description("Defetiscor aetas.")
                            .languages(List.of(
                                "ko",
                                "lv"))
                            .name("suspendo")
                            .thumbnailUrl("https://picsum.photos/seed/coddeQdTZn/105/852")
                            .type(LmsMediaType.VIDEO)
                            .url("https://picsum.photos/seed/wl3tnt/2277/2170")
                            .build()))
                    .metadata(List.of())
                    .name("sperno")
                    .students(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-09-02T07:18:37.328Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsClassResponse res = sdk.lms().patchLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchLmsClassRequest](../../models/operations/PatchLmsClassRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchLmsClassResponse](../../models/operations/PatchLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsCollection

Updates the LmsCollection identified by `id`. Provide the unified LmsCollection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCollection" method="patch" path="/lms/{connection_id}/collection/{id}" example="lms_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCollectionRequest req = PatchLmsCollectionRequest.builder()
                .lmsCollection(LmsCollection.builder()
                    .createdAt(OffsetDateTime.parse("2019-08-19T14:40:29.227Z"))
                    .description("Defluo.")
                    .id("4c120ff2-50da-4612-8b56-ef84236b3c5f")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Sollers adeo caste brevis denuo attonbitus. Amita ducimus capillus claudeo vulgaris temporibus arbustum solium. Degusto suppono commodo fuga surculus tripudio doloribus. Quaerat cauda civitas carcer alveus alienus sperno vetus. Adulescens conspergo appositus arguo. Fugiat cimentarius depono angustus somniculosus tubineus terra beatae sui.")
                            .description("Alias sit careo vesco tollo.")
                            .languages(List.of(
                                "eo"))
                            .name("aiunt")
                            .thumbnailUrl("https://picsum.photos/seed/Iy2MXlem/2398/73")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://picsum.photos/seed/5KfxRKbzo1/2699/3216")
                            .build()))
                    .metadata(List.of())
                    .name("spargo")
                    .updatedAt(OffsetDateTime.parse("2026-09-03T02:41:32.212Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCollectionResponse res = sdk.lms().patchLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchLmsCollectionRequest](../../models/operations/PatchLmsCollectionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchLmsCollectionResponse](../../models/operations/PatchLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsContent

Updates the LmsContent identified by `id`. Provide the unified LmsContent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsContent" method="patch" path="/lms/{connection_id}/content/{id}" example="lms_content" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsContentRequest req = PatchLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .categories(List.of(
                        "tergum"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Adflicto despecto suppellex socius cresco.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .id("829f6f15-1c55-428d-bbd3-b8b2743814ba")
                    .instructors(List.of())
                    .isActive(true)
                    .languages(List.of(
                        "campana",
                        "viriliter"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Vindico vorago.")
                            .language("es")
                            .name("aeger")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Sulum.")
                            .language("es")
                            .name("voluptate")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Cohors necessitatibus beatae copiose copiose cedo sub decens acer. Spiritus velum adulatio commodi textus beneficium termes comedo valde caste. Sodalitas bos timor abeo cur. Sperno decet acquiro tabgo canto terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum.")
                            .description("Incidunt tepidus commemoro voro ocer.")
                            .languages(List.of(
                                "ro",
                                "af"))
                            .name("antepono")
                            .thumbnailUrl("https://picsum.photos/seed/URbmlO66Wk/587/3603")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/4KFvVbCx83/2788/2850")
                            .build(),
                        LmsMedia.builder()
                            .content("Ago neque qui cursim tunc barba decens. Tutamen amplus tabella tabgo infit. Demo adversus capillus aro unus. Dedico aspicio alius vehemens terminatio varietas vomica voluptatibus apud. Defero decet impedit verbera pauci laboriosam molestiae urbanus mollitia. Vergo crux certus nulla.")
                            .description("Bene doloribus.")
                            .languages(List.of(
                                "ru",
                                "sw"))
                            .name("totidem")
                            .thumbnailUrl("https://picsum.photos/seed/qpRev/1286/3718")
                            .type(LmsMediaType.WEB)
                            .url("https://picsum.photos/seed/JOWrp5/254/2004")
                            .build(),
                        LmsMedia.builder()
                            .content("Laborum adiuvo labore officia demulceo. Abduco mollitia ventosus synagoga certus magni vado cilicium stella. Velut capitulus attero odio advenio similique acsi totam atavus aufero. Ventosus campana animi.")
                            .description("Trucido dens pecus aer stella.")
                            .languages(List.of(
                                "is",
                                "sk"))
                            .name("territo")
                            .thumbnailUrl("https://picsum.photos/seed/81EuDedaf/557/986")
                            .type(LmsMediaType.IMAGE)
                            .url("https://picsum.photos/seed/BtV2eDuVm7/3644/1033")
                            .build()))
                    .metadata(List.of())
                    .name("laboriosam")
                    .providerName("Mraz - Keeling")
                    .publishedAt(OffsetDateTime.parse("2022-09-14T10:28:14.357Z"))
                    .shortDescription("Videlicet pauci.")
                    .skills(List.of(
                        "soleo"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("clam")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "audio"))
                    .updatedAt(OffsetDateTime.parse("2022-10-15T20:56:00.261Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsContentResponse res = sdk.lms().patchLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchLmsContentRequest](../../models/operations/PatchLmsContentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchLmsContentResponse](../../models/operations/PatchLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsCourse

Updates the LmsCourse identified by `id`. Provide the unified LmsCourse fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsCourse" method="patch" path="/lms/{connection_id}/course/{id}" example="lms_course" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsCourseRequest req = PatchLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .categories(List.of(
                        "deripio",
                        "tergiversatio"))
                    .createdAt(OffsetDateTime.parse("2022-10-06T09:58:53.559Z"))
                    .currency("DZD")
                    .description("Aut.")
                    .durationMinutes(148d)
                    .id("c370ae35-ca9b-482f-9d4a-d04b3bbaa198")
                    .instructors(List.of())
                    .isActive(true)
                    .isPrivate(false)
                    .languages(List.of(
                        "capitulus",
                        "desparatus",
                        "earum"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Carbo dapifer adeptio. Ipsum utrimque quae architecto repellendus cum. Conitor anser abutor error adsuesco abeo caelestis.")
                            .description("Accommodo adipiscor campana aegrotatio.")
                            .languages(List.of(
                                "el",
                                "hr"))
                            .name("conduco")
                            .thumbnailUrl("https://picsum.photos/seed/yTatRhK/3873/3840")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/vcfQAbs/3357/2472")
                            .build()))
                    .metadata(List.of())
                    .name("vinco")
                    .priceAmount(84d)
                    .providerName("Roberts Group")
                    .publishedAt(OffsetDateTime.parse("2022-11-06T11:55:39.377Z"))
                    .skills(List.of(
                        "aveho",
                        "via"))
                    .students(List.of())
                    .timeEstimateMinutes(100d)
                    .updatedAt(OffsetDateTime.parse("2023-02-12T20:13:06.875Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsCourseResponse res = sdk.lms().patchLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchLmsCourseRequest](../../models/operations/PatchLmsCourseRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchLmsCourseResponse](../../models/operations/PatchLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsInstructor

Updates the LmsInstructor identified by `id`. Provide the unified LmsInstructor fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsInstructor" method="patch" path="/lms/{connection_id}/instructor/{id}" example="lms_instructor" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsInstructorRequest req = PatchLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .createdAt(OffsetDateTime.parse("2021-10-12T16:38:54.979Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build()))
                    .firstName("Miranda")
                    .id("75ec9b42-2935-4df0-85cf-665263ec1748")
                    .imageUrl("https://avatars.githubusercontent.com/u/96902788")
                    .lastName("Turcotte")
                    .metadata(List.of())
                    .name("Miranda Turcotte")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(752) 816-3330")
                            .type(LmsTelephoneType.WORK)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(415) 345-1798")
                            .type(LmsTelephoneType.HOME)
                            .build()))
                    .title("Customer Brand Planner")
                    .updatedAt(OffsetDateTime.parse("2025-08-20T11:49:38.188Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsInstructorResponse res = sdk.lms().patchLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchLmsInstructorRequest](../../models/operations/PatchLmsInstructorRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchLmsInstructorResponse](../../models/operations/PatchLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsStudent

Updates the LmsStudent identified by `id`. Provide the unified LmsStudent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsStudent" method="patch" path="/lms/{connection_id}/student/{id}" example="lms_student" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsStudentRequest req = PatchLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .address(PropertyLmsStudentAddress.builder()
                        .address1("4610 Smith Cove")
                        .city("Lake Milanchester")
                        .countryCode("US")
                        .postalCode("58634-4787")
                        .region("Iowa")
                        .regionCode("AZ")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-03-23T06:59:29.777Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build()))
                    .firstName("Lazaro")
                    .id("0a362794-336a-4b55-8a6f-a6ae45bf4cd2")
                    .imageUrl("https://avatars.githubusercontent.com/u/3245424")
                    .lastName("Zulauf-Schowalter")
                    .metadata(List.of())
                    .name("Lazaro Zulauf-Schowalter")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(476) 500-2870")
                            .type(LmsTelephoneType.WORK)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(338) 436-9806")
                            .type(LmsTelephoneType.FAX)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(852) 940-8205")
                            .type(LmsTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-07-13T09:24:03.468Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsStudentResponse res = sdk.lms().patchLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchLmsStudentRequest](../../models/operations/PatchLmsStudentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchLmsStudentResponse](../../models/operations/PatchLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsActivity

Deletes the LmsActivity identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsActivity" method="delete" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsActivityRequest req = RemoveLmsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsActivityResponse res = sdk.lms().removeLmsActivity()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveLmsActivityRequest](../../models/operations/RemoveLmsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveLmsActivityResponse](../../models/operations/RemoveLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsClass

Deletes the LmsClass identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsClass" method="delete" path="/lms/{connection_id}/class/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsClassRequest req = RemoveLmsClassRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsClassResponse res = sdk.lms().removeLmsClass()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveLmsClassRequest](../../models/operations/RemoveLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveLmsClassResponse](../../models/operations/RemoveLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsCollection

Deletes the LmsCollection identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsCollection" method="delete" path="/lms/{connection_id}/collection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsCollectionRequest req = RemoveLmsCollectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCollectionResponse res = sdk.lms().removeLmsCollection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveLmsCollectionRequest](../../models/operations/RemoveLmsCollectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveLmsCollectionResponse](../../models/operations/RemoveLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsContent

Deletes the LmsContent identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsContent" method="delete" path="/lms/{connection_id}/content/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsContentRequest req = RemoveLmsContentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsContentResponse res = sdk.lms().removeLmsContent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveLmsContentRequest](../../models/operations/RemoveLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveLmsContentResponse](../../models/operations/RemoveLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsCourse

Deletes the LmsCourse identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsCourse" method="delete" path="/lms/{connection_id}/course/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsCourseRequest req = RemoveLmsCourseRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsCourseResponse res = sdk.lms().removeLmsCourse()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveLmsCourseRequest](../../models/operations/RemoveLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveLmsCourseResponse](../../models/operations/RemoveLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsInstructor

Deletes the LmsInstructor identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsInstructor" method="delete" path="/lms/{connection_id}/instructor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsInstructorRequest req = RemoveLmsInstructorRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsInstructorResponse res = sdk.lms().removeLmsInstructor()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveLmsInstructorRequest](../../models/operations/RemoveLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveLmsInstructorResponse](../../models/operations/RemoveLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsStudent

Deletes the LmsStudent identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsStudent" method="delete" path="/lms/{connection_id}/student/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsStudentRequest req = RemoveLmsStudentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsStudentResponse res = sdk.lms().removeLmsStudent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveLmsStudentRequest](../../models/operations/RemoveLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveLmsStudentResponse](../../models/operations/RemoveLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsActivity

Updates the LmsActivity identified by `id`. Provide the unified LmsActivity fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsActivity" method="put" path="/lms/{connection_id}/activity/{id}" example="lms_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsActivityRequest req = UpdateLmsActivityRequest.builder()
                .lmsActivity(LmsActivity.builder()
                    .assignedGrade("deserunt")
                    .completedAt(OffsetDateTime.parse("2023-12-24T17:45:39.247Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("4ccaa3fe-57cf-4cff-b732-0d9bb4c2b6e6")
                    .isCompleted(true)
                    .metadata(List.of())
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2021-04-28T07:07:55.474Z"))
                    .updatedAt(OffsetDateTime.parse("2022-02-07T16:48:57.207Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsActivityResponse res = sdk.lms().updateLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateLmsActivityRequest](../../models/operations/UpdateLmsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateLmsActivityResponse](../../models/operations/UpdateLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsClass

Updates the LmsClass identified by `id`. Provide the unified LmsClass fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsClass" method="put" path="/lms/{connection_id}/class/{id}" example="lms_class" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsClassRequest req = UpdateLmsClassRequest.builder()
                .lmsClass(LmsClass.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-20T14:48:51.845Z"))
                    .description("Animus callide corpus.")
                    .id("bf51c2ff-e0aa-4a0a-a5a3-119d14292028")
                    .instructors(List.of())
                    .languages(List.of(
                        "in"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Ceno earum culpa adhaero tabesco apostolus talis. Ultra accommodo deinde sono culpo arto cruciamentum triduana. Solvo uter adficio.")
                            .description("Defetiscor aetas.")
                            .languages(List.of(
                                "ko",
                                "lv"))
                            .name("suspendo")
                            .thumbnailUrl("https://picsum.photos/seed/coddeQdTZn/105/852")
                            .type(LmsMediaType.VIDEO)
                            .url("https://picsum.photos/seed/wl3tnt/2277/2170")
                            .build()))
                    .metadata(List.of())
                    .name("sperno")
                    .students(List.of())
                    .updatedAt(OffsetDateTime.parse("2025-09-02T07:18:37.328Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsClassResponse res = sdk.lms().updateLmsClass()
                .request(req)
                .call();

        if (res.lmsClass().isPresent()) {
            System.out.println(res.lmsClass().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateLmsClassRequest](../../models/operations/UpdateLmsClassRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateLmsClassResponse](../../models/operations/UpdateLmsClassResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsCollection

Updates the LmsCollection identified by `id`. Provide the unified LmsCollection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCollection" method="put" path="/lms/{connection_id}/collection/{id}" example="lms_collection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollectionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCollectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCollectionRequest req = UpdateLmsCollectionRequest.builder()
                .lmsCollection(LmsCollection.builder()
                    .createdAt(OffsetDateTime.parse("2019-08-19T14:40:29.227Z"))
                    .description("Defluo.")
                    .id("4c120ff2-50da-4612-8b56-ef84236b3c5f")
                    .isActive(true)
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Sollers adeo caste brevis denuo attonbitus. Amita ducimus capillus claudeo vulgaris temporibus arbustum solium. Degusto suppono commodo fuga surculus tripudio doloribus. Quaerat cauda civitas carcer alveus alienus sperno vetus. Adulescens conspergo appositus arguo. Fugiat cimentarius depono angustus somniculosus tubineus terra beatae sui.")
                            .description("Alias sit careo vesco tollo.")
                            .languages(List.of(
                                "eo"))
                            .name("aiunt")
                            .thumbnailUrl("https://picsum.photos/seed/Iy2MXlem/2398/73")
                            .type(LmsMediaType.HEADSHOT)
                            .url("https://picsum.photos/seed/5KfxRKbzo1/2699/3216")
                            .build()))
                    .metadata(List.of())
                    .name("spargo")
                    .updatedAt(OffsetDateTime.parse("2026-09-03T02:41:32.212Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCollectionResponse res = sdk.lms().updateLmsCollection()
                .request(req)
                .call();

        if (res.lmsCollection().isPresent()) {
            System.out.println(res.lmsCollection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateLmsCollectionRequest](../../models/operations/UpdateLmsCollectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateLmsCollectionResponse](../../models/operations/UpdateLmsCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsContent

Updates the LmsContent identified by `id`. Provide the unified LmsContent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsContent" method="put" path="/lms/{connection_id}/content/{id}" example="lms_content" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsContentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsContentRequest req = UpdateLmsContentRequest.builder()
                .lmsContent(LmsContent.builder()
                    .categories(List.of(
                        "tergum"))
                    .createdAt(OffsetDateTime.parse("2020-10-22T22:30:50.963Z"))
                    .description("Adflicto despecto suppellex socius cresco.")
                    .difficulty("Beginner")
                    .durationMinutes(19d)
                    .id("829f6f15-1c55-428d-bbd3-b8b2743814ba")
                    .instructors(List.of())
                    .isActive(true)
                    .languages(List.of(
                        "campana",
                        "viriliter"))
                    .localizations(List.of(
                        LmsContentLocalization.builder()
                            .description("Vindico vorago.")
                            .language("es")
                            .name("aeger")
                            .build(),
                        LmsContentLocalization.builder()
                            .description("Sulum.")
                            .language("es")
                            .name("voluptate")
                            .build()))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Cohors necessitatibus beatae copiose copiose cedo sub decens acer. Spiritus velum adulatio commodi textus beneficium termes comedo valde caste. Sodalitas bos timor abeo cur. Sperno decet acquiro tabgo canto terminatio acidus tripudio teres. Compono demum aut aestivus ambitus pecus tergum verumtamen vestrum.")
                            .description("Incidunt tepidus commemoro voro ocer.")
                            .languages(List.of(
                                "ro",
                                "af"))
                            .name("antepono")
                            .thumbnailUrl("https://picsum.photos/seed/URbmlO66Wk/587/3603")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/4KFvVbCx83/2788/2850")
                            .build(),
                        LmsMedia.builder()
                            .content("Ago neque qui cursim tunc barba decens. Tutamen amplus tabella tabgo infit. Demo adversus capillus aro unus. Dedico aspicio alius vehemens terminatio varietas vomica voluptatibus apud. Defero decet impedit verbera pauci laboriosam molestiae urbanus mollitia. Vergo crux certus nulla.")
                            .description("Bene doloribus.")
                            .languages(List.of(
                                "ru",
                                "sw"))
                            .name("totidem")
                            .thumbnailUrl("https://picsum.photos/seed/qpRev/1286/3718")
                            .type(LmsMediaType.WEB)
                            .url("https://picsum.photos/seed/JOWrp5/254/2004")
                            .build(),
                        LmsMedia.builder()
                            .content("Laborum adiuvo labore officia demulceo. Abduco mollitia ventosus synagoga certus magni vado cilicium stella. Velut capitulus attero odio advenio similique acsi totam atavus aufero. Ventosus campana animi.")
                            .description("Trucido dens pecus aer stella.")
                            .languages(List.of(
                                "is",
                                "sk"))
                            .name("territo")
                            .thumbnailUrl("https://picsum.photos/seed/81EuDedaf/557/986")
                            .type(LmsMediaType.IMAGE)
                            .url("https://picsum.photos/seed/BtV2eDuVm7/3644/1033")
                            .build()))
                    .metadata(List.of())
                    .name("laboriosam")
                    .providerName("Mraz - Keeling")
                    .publishedAt(OffsetDateTime.parse("2022-09-14T10:28:14.357Z"))
                    .shortDescription("Videlicet pauci.")
                    .skills(List.of(
                        "soleo"))
                    .sortOrder(3d)
                    .subjects(List.of(
                        LmsSubject.builder()
                            .name("clam")
                            .rank(1d)
                            .build()))
                    .tags(List.of(
                        "audio"))
                    .updatedAt(OffsetDateTime.parse("2022-10-15T20:56:00.261Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsContentResponse res = sdk.lms().updateLmsContent()
                .request(req)
                .call();

        if (res.lmsContent().isPresent()) {
            System.out.println(res.lmsContent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateLmsContentRequest](../../models/operations/UpdateLmsContentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLmsContentResponse](../../models/operations/UpdateLmsContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsCourse

Updates the LmsCourse identified by `id`. Provide the unified LmsCourse fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsCourse" method="put" path="/lms/{connection_id}/course/{id}" example="lms_course" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourseRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsCourseResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsCourseRequest req = UpdateLmsCourseRequest.builder()
                .lmsCourse(LmsCourse.builder()
                    .categories(List.of(
                        "deripio",
                        "tergiversatio"))
                    .createdAt(OffsetDateTime.parse("2022-10-06T09:58:53.559Z"))
                    .currency("DZD")
                    .description("Aut.")
                    .durationMinutes(148d)
                    .id("c370ae35-ca9b-482f-9d4a-d04b3bbaa198")
                    .instructors(List.of())
                    .isActive(true)
                    .isPrivate(false)
                    .languages(List.of(
                        "capitulus",
                        "desparatus",
                        "earum"))
                    .media(List.of(
                        LmsMedia.builder()
                            .content("Carbo dapifer adeptio. Ipsum utrimque quae architecto repellendus cum. Conitor anser abutor error adsuesco abeo caelestis.")
                            .description("Accommodo adipiscor campana aegrotatio.")
                            .languages(List.of(
                                "el",
                                "hr"))
                            .name("conduco")
                            .thumbnailUrl("https://picsum.photos/seed/yTatRhK/3873/3840")
                            .type(LmsMediaType.OTHER)
                            .url("https://picsum.photos/seed/vcfQAbs/3357/2472")
                            .build()))
                    .metadata(List.of())
                    .name("vinco")
                    .priceAmount(84d)
                    .providerName("Roberts Group")
                    .publishedAt(OffsetDateTime.parse("2022-11-06T11:55:39.377Z"))
                    .skills(List.of(
                        "aveho",
                        "via"))
                    .students(List.of())
                    .timeEstimateMinutes(100d)
                    .updatedAt(OffsetDateTime.parse("2023-02-12T20:13:06.875Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsCourseResponse res = sdk.lms().updateLmsCourse()
                .request(req)
                .call();

        if (res.lmsCourse().isPresent()) {
            System.out.println(res.lmsCourse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateLmsCourseRequest](../../models/operations/UpdateLmsCourseRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateLmsCourseResponse](../../models/operations/UpdateLmsCourseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsInstructor

Updates the LmsInstructor identified by `id`. Provide the unified LmsInstructor fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsInstructor" method="put" path="/lms/{connection_id}/instructor/{id}" example="lms_instructor" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsInstructorRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsInstructorResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsInstructorRequest req = UpdateLmsInstructorRequest.builder()
                .lmsInstructor(LmsInstructor.builder()
                    .createdAt(OffsetDateTime.parse("2021-10-12T16:38:54.979Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build()))
                    .firstName("Miranda")
                    .id("75ec9b42-2935-4df0-85cf-665263ec1748")
                    .imageUrl("https://avatars.githubusercontent.com/u/96902788")
                    .lastName("Turcotte")
                    .metadata(List.of())
                    .name("Miranda Turcotte")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(752) 816-3330")
                            .type(LmsTelephoneType.WORK)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(415) 345-1798")
                            .type(LmsTelephoneType.HOME)
                            .build()))
                    .title("Customer Brand Planner")
                    .updatedAt(OffsetDateTime.parse("2025-08-20T11:49:38.188Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsInstructorResponse res = sdk.lms().updateLmsInstructor()
                .request(req)
                .call();

        if (res.lmsInstructor().isPresent()) {
            System.out.println(res.lmsInstructor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateLmsInstructorRequest](../../models/operations/UpdateLmsInstructorRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateLmsInstructorResponse](../../models/operations/UpdateLmsInstructorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsStudent

Updates the LmsStudent identified by `id`. Provide the unified LmsStudent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsStudent" method="put" path="/lms/{connection_id}/student/{id}" example="lms_student" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsStudentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsStudentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsStudentRequest req = UpdateLmsStudentRequest.builder()
                .lmsStudent(LmsStudent.builder()
                    .address(PropertyLmsStudentAddress.builder()
                        .address1("4610 Smith Cove")
                        .city("Lake Milanchester")
                        .countryCode("US")
                        .postalCode("58634-4787")
                        .region("Iowa")
                        .regionCode("AZ")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-03-23T06:59:29.777Z"))
                    .emails(List.of(
                        LmsEmail.builder()
                            .build()))
                    .firstName("Lazaro")
                    .id("0a362794-336a-4b55-8a6f-a6ae45bf4cd2")
                    .imageUrl("https://avatars.githubusercontent.com/u/3245424")
                    .lastName("Zulauf-Schowalter")
                    .metadata(List.of())
                    .name("Lazaro Zulauf-Schowalter")
                    .telephones(List.of(
                        LmsTelephone.builder()
                            .telephone("(476) 500-2870")
                            .type(LmsTelephoneType.WORK)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(338) 436-9806")
                            .type(LmsTelephoneType.FAX)
                            .build(),
                        LmsTelephone.builder()
                            .telephone("(852) 940-8205")
                            .type(LmsTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2022-07-13T09:24:03.468Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsStudentResponse res = sdk.lms().updateLmsStudent()
                .request(req)
                .call();

        if (res.lmsStudent().isPresent()) {
            System.out.println(res.lmsStudent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateLmsStudentRequest](../../models/operations/UpdateLmsStudentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateLmsStudentResponse](../../models/operations/UpdateLmsStudentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |