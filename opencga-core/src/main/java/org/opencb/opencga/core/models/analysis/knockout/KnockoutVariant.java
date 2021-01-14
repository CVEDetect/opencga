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

package org.opencb.opencga.core.models.analysis.knockout;

import org.opencb.biodata.models.variant.avro.PopulationFrequency;
import org.opencb.biodata.models.variant.avro.SequenceOntologyTerm;

import java.util.List;

public class KnockoutVariant {

    private String id;
    private String genotype;
    private String filter;
    private String qual;
    private KnockoutType knockoutType;
    private List<PopulationFrequency> populationFrequencies;
    private List<SequenceOntologyTerm> sequenceOntologyTerms;

    public enum KnockoutType {
        HOM_ALT,
        COMP_HET,
        HET_ALT,
        DELETION_OVERLAP
    }

    public KnockoutVariant() {
    }

    public KnockoutVariant(String id, String genotype, String filter, String qual, KnockoutType knockoutType,
                           List<SequenceOntologyTerm> sequenceOntologyTerms, List<PopulationFrequency> populationFrequencies) {
        this.id = id;
        this.genotype = genotype;
        this.filter = filter;
        this.qual = qual;
        this.knockoutType = knockoutType;
        this.populationFrequencies = populationFrequencies;
        this.sequenceOntologyTerms = sequenceOntologyTerms;
        this.populationFrequencies = populationFrequencies;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("KnockoutVariant{");
        sb.append("id='").append(id).append('\'');
        sb.append(", genotype='").append(genotype).append('\'');
        sb.append(", filter='").append(filter).append('\'');
        sb.append(", qual='").append(qual).append('\'');
        sb.append(", knockoutType=").append(knockoutType);
        sb.append(", populationFrequencies=").append(populationFrequencies);
        sb.append(", sequenceOntologyTerms=").append(sequenceOntologyTerms);
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public KnockoutVariant setId(String id) {
        this.id = id;
        return this;
    }

    public String getGenotype() {
        return genotype;
    }

    public KnockoutVariant setGenotype(String genotype) {
        this.genotype = genotype;
        return this;
    }

    public String getFilter() {
        return filter;
    }

    public KnockoutVariant setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    public String getQual() {
        return qual;
    }

    public KnockoutVariant setQual(String qual) {
        this.qual = qual;
        return this;
    }

    public KnockoutType getKnockoutType() {
        return knockoutType;
    }

    public KnockoutVariant setKnockoutType(KnockoutType knockoutType) {
        this.knockoutType = knockoutType;
        return this;
    }

    public List<SequenceOntologyTerm> getSequenceOntologyTerms() {
        return sequenceOntologyTerms;
    }

    public KnockoutVariant setSequenceOntologyTerms(List<SequenceOntologyTerm> sequenceOntologyTerms) {
        this.sequenceOntologyTerms = sequenceOntologyTerms;
        return this;
    }

    public List<PopulationFrequency> getPopulationFrequencies() {
        return populationFrequencies;
    }

    public KnockoutVariant setPopulationFrequencies(List<PopulationFrequency> populationFrequencies) {
        this.populationFrequencies = populationFrequencies;
        return this;
    }
}
