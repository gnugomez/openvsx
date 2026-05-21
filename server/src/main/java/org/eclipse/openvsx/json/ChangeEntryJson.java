/********************************************************************************
 * Copyright (c) 2026 Eclipse Foundation and others
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/
package org.eclipse.openvsx.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ChangeEntry", description = "A single registry change entry")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeEntryJson {

    @Schema(description = "Namespace of the extension")
    private String namespace;

    @Schema(description = "Name of the extension")
    private String name;

    @Schema(description = "Version string")
    private String version;

    @Schema(description = "Target platform (e.g. universal, linux-x64)")
    private String targetPlatform;

    @Schema(description = "Current state of this extension version (active, inactive, deleted)")
    private String state;

    @Schema(description = "Timestamp of the version publication (ISO-8601 UTC)")
    private String timestamp;

    @Schema(description = "Timestamp of the last state change (ISO-8601 UTC)")
    private String lastUpdated;

    @Schema(description = "Full extension metadata")
    private ExtensionJson extension;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTargetPlatform() {
        return targetPlatform;
    }

    public void setTargetPlatform(String targetPlatform) {
        this.targetPlatform = targetPlatform;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ExtensionJson getExtension() {
        return extension;
    }

    public void setExtension(ExtensionJson extension) {
        this.extension = extension;
    }
}
