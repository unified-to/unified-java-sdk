/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum StorageFileType {
    FILE("FILE"),
    FOLDER("FOLDER");

    @JsonValue
    public final String value;

    private StorageFileType(String value) {
        this.value = value;
    }
}
