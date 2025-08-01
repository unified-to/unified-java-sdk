/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.utils;

import java.lang.reflect.Field;

class QueryParamsMetadata {

    // these parameters set via reflection

    String style = "form";
    boolean explode = true;
    String name;
    String serialization;
    boolean allowReserved;

    static QueryParamsMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        return Metadata.parse("queryParam", new QueryParamsMetadata(), field);
    }

    private QueryParamsMetadata() {
    }
}
