/*
* The contents of this file are subject to the terms of the Common Development and
* Distribution License (the License). You may not use this file except in compliance with the
* License.
*
* You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
* specific language governing permission and limitations under the License.
*
* When distributing Covered Software, include this CDDL Header Notice in each file and include
* the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
* Header, with the fields enclosed by brackets [] replaced by your own identifying
* information: "Portions copyright [year] [name of copyright owner]".
*
* Copyright 2015 ForgeRock AS.
*/
package org.forgerock.openam.audit.model;

import org.forgerock.openam.audit.AuditConstants.EventOutcome;

import java.util.HashMap;
import java.util.Map;

/**
 * A class which represents an entries object in the Commons authentication schema (See Commons Audit Project
 * {@code events.json}). This ensures that the elements within the object are in line with those defined
 * in the schema.
 *
 * @since 13.0.0
 */
public class AuthenticationAuditEntry {

    private static final String MODULE_ID_KEY = "moduleId";
    private static final String RESULT_KEY = "result";
    private static final String INFO_KEY = "info";

    private Map<String, Object> entry = new HashMap<>();

    /**
     * Get the module id.
     *
     * @return The module id.
     */
    public String getModuleId() {
        return (String) this.entry.get(MODULE_ID_KEY);
    }

    /**
     * Get the result.
     *
     * @return The result.
     */
    public EventOutcome getResult() {
        return (EventOutcome) this.entry.get(RESULT_KEY);
    }

    /**
     * Get the info values.
     *
     * @return The {@code Map} of all info values.
     */
    public Map<String, String> getInfo() {
        return (Map<String, String>) this.entry.get(INFO_KEY);
    }

    /**
     * Set the module id.
     *
     * @param moduleId The module id.
     */
    public void setModuleId(String moduleId) {
        this.entry.put(MODULE_ID_KEY, moduleId);
    }

    /**
     * Set the result.
     *
     * @param result The result.
     */
    public void setResult(EventOutcome result) {
        this.entry.put(RESULT_KEY, result);
    }

    /**
     * Set the info values.
     *
     * @param info The {@code Map} for the info values.
     */
    public void setInfo(Map<String, String> info) {
        this.entry.put(INFO_KEY, info);
    }

    /**
     * Get this {@link AuthenticationAuditEntry} as a {@code Map}.
     *
     * @return The {@code Map} representation.
     */
    public Map<String, Object> toMap() {
        return this.entry;
    }
}
