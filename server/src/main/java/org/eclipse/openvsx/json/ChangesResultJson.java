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
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Schema(name = "ChangesResult", description = "Paginated list of registry changes")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangesResultJson extends ResultJson {

    public static ChangesResultJson error(String message) {
        var result = new ChangesResultJson();
        result.setError(message);
        return result;
    }

    @Schema(description = "Number of skipped entries according to the changes request")
    @NotNull
    @Min(0)
    private int offset;

    @Schema(description = "Total number of changes matching the request")
    @NotNull
    @Min(0)
    private int totalSize;

    @Schema(description = "List of change entries, limited to the size specified in the request")
    @NotNull
    private List<ChangeEntryJson> changes;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public List<ChangeEntryJson> getChanges() {
        return changes;
    }

    public void setChanges(List<ChangeEntryJson> changes) {
        this.changes = changes;
    }
}
