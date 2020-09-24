/*
 * Copyright 2015-2020 OpenCB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opencb.opencga.core.models.clinical;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.opencb.biodata.models.clinical.ClinicalComment;
import org.opencb.commons.datastore.core.ObjectMap;
import org.opencb.opencga.core.models.common.CustomStatusParams;
import org.opencb.opencga.core.models.common.Enums;
import org.opencb.opencga.core.models.file.FileReferenceParam;

import java.util.List;
import java.util.Map;

import static org.opencb.opencga.core.common.JacksonUtils.getUpdateObjectMapper;

public class ClinicalUpdateParams {

    private String id;
    private String description;
    private ClinicalAnalysis.Type type;

    private DisorderReferenceParam disorder;

    private List<FileReferenceParam> files;

    private Boolean locked;
//    private ProbandParam proband;
//    private FamilyParam family
    private ClinicalAnalystParam analyst;
    private ClinicalAnalysisInternal internal;

    private ClinicalAnalysisQcUpdateParams qualityControl;

    private ClinicalConsent consent;

    private String dueDate;
    private List<ClinicalComment> comments;
    private List<Alert> alerts;
    private Enums.Priority priority;
    private List<String> flags;

    private Map<String, Object> attributes;
    private CustomStatusParams status;

    public ClinicalUpdateParams() {
    }

    public ClinicalUpdateParams(String id, String description, ClinicalAnalysis.Type type, DisorderReferenceParam disorder,
                                List<FileReferenceParam> files, Boolean locked,  ClinicalAnalystParam analyst,
                                ClinicalAnalysisInternal internal, ClinicalAnalysisQcUpdateParams qualityControl, ClinicalConsent consent,
                                String dueDate, List<ClinicalComment> comments, List<Alert> alerts, Enums.Priority priority,
                                List<String> flags, Map<String, Object> attributes, CustomStatusParams status) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.disorder = disorder;
        this.files = files;
        this.locked = locked;
        this.analyst = analyst;
        this.internal = internal;
        this.qualityControl = qualityControl;
        this.consent = consent;
        this.dueDate = dueDate;
        this.comments = comments;
        this.alerts = alerts;
        this.priority = priority;
        this.flags = flags;
        this.attributes = attributes;
        this.status = status;
    }

    @JsonIgnore
    public ObjectMap getUpdateMap() throws JsonProcessingException {
        return new ObjectMap(getUpdateObjectMapper().writeValueAsString(this));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClinicalUpdateParams{");
        sb.append("id='").append(id).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", type=").append(type);
        sb.append(", disorder=").append(disorder);
        sb.append(", files=").append(files);
        sb.append(", locked=").append(locked);
        sb.append(", analyst=").append(analyst);
        sb.append(", internal=").append(internal);
        sb.append(", qualityControl=").append(qualityControl);
        sb.append(", consent=").append(consent);
        sb.append(", dueDate='").append(dueDate).append('\'');
        sb.append(", comments=").append(comments);
        sb.append(", alerts=").append(alerts);
        sb.append(", priority=").append(priority);
        sb.append(", flags=").append(flags);
        sb.append(", attributes=").append(attributes);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }

    public static class SampleParams {
        private String id;

        public SampleParams() {
        }

        public String getId() {
            return id;
        }

        public SampleParams setId(String id) {
            this.id = id;
            return this;
        }
    }

    public String getId() {
        return id;
    }

    public ClinicalUpdateParams setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ClinicalUpdateParams setDescription(String description) {
        this.description = description;
        return this;
    }

    public ClinicalAnalysis.Type getType() {
        return type;
    }

    public ClinicalUpdateParams setType(ClinicalAnalysis.Type type) {
        this.type = type;
        return this;
    }

    public DisorderReferenceParam getDisorder() {
        return disorder;
    }

    public ClinicalUpdateParams setDisorder(DisorderReferenceParam disorder) {
        this.disorder = disorder;
        return this;
    }

    public List<FileReferenceParam> getFiles() {
        return files;
    }

    public ClinicalUpdateParams setFiles(List<FileReferenceParam> files) {
        this.files = files;
        return this;
    }

    public Boolean getLocked() {
        return locked;
    }

    public ClinicalUpdateParams setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    public ClinicalAnalystParam getAnalyst() {
        return analyst;
    }

    public ClinicalUpdateParams setAnalyst(ClinicalAnalystParam analyst) {
        this.analyst = analyst;
        return this;
    }

    public ClinicalAnalysisQcUpdateParams getQualityControl() {
        return qualityControl;
    }

    public ClinicalUpdateParams setQualityControl(ClinicalAnalysisQcUpdateParams qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }

    public ClinicalConsent getConsent() {
        return consent;
    }

    public ClinicalUpdateParams setConsent(ClinicalConsent consent) {
        this.consent = consent;
        return this;
    }

    public String getDueDate() {
        return dueDate;
    }

    public ClinicalUpdateParams setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public List<ClinicalComment> getComments() {
        return comments;
    }

    public ClinicalUpdateParams setComments(List<ClinicalComment> comments) {
        this.comments = comments;
        return this;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public ClinicalUpdateParams setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
        return this;
    }

    public Enums.Priority getPriority() {
        return priority;
    }

    public ClinicalUpdateParams setPriority(Enums.Priority priority) {
        this.priority = priority;
        return this;
    }

    public List<String> getFlags() {
        return flags;
    }

    public ClinicalUpdateParams setFlags(List<String> flags) {
        this.flags = flags;
        return this;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public ClinicalUpdateParams setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ClinicalAnalysisInternal getInternal() {
        return internal;
    }

    public ClinicalUpdateParams setInternal(ClinicalAnalysisInternal internal) {
        this.internal = internal;
        return this;
    }

    public CustomStatusParams getStatus() {
        return status;
    }

    public ClinicalUpdateParams setStatus(CustomStatusParams status) {
        this.status = status;
        return this;
    }
}
