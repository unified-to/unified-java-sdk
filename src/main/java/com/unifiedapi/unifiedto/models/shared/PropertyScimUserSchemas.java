/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.unifiedapi.unifiedto.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum PropertyScimUserSchemas {
    URN_IETF_PARAMS_SCIM_SCHEMAS_CORE20_USER("urn:ietf:params:scim:schemas:core:2.0:User"),
    URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE20_USER("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User"),
    URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_LATTICE_ATTRIBUTES10_USER("urn:ietf:params:scim:schemas:extension:lattice:attributes:1.0:User"),
    URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_PEAKON20_USER("urn:ietf:params:scim:schemas:extension:peakon:2.0:User");

    @JsonValue
    private final String value;

    private PropertyScimUserSchemas(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PropertyScimUserSchemas> fromValue(String value) {
        for (PropertyScimUserSchemas o: PropertyScimUserSchemas.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
