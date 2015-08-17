/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.analytics.restapi.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * This class is used to represents the input bean required for performing aggregations over records fields.
 * groupByField is used to group the records. It should be a facet field created by the grouping fields.
 * fields attribute represents the record fields and the respective aggregate function.
 * aliases represents the output field names for aggregated values over the fields.
 */
@XmlRootElement(name = "Aggregates")
@XmlAccessorType(XmlAccessType.FIELD)
public class AggregateRequestBean {
    private String tableName;
    private String groupByField;
    private String query;
    @XmlElement(name = "aggregateFields", required = true)
    private List<AggregateFieldBean> fields;

    public AggregateRequestBean(String tableName, String groupByField, String query,
                                List<AggregateFieldBean> fields) {
        this.tableName = tableName;
        this.groupByField = groupByField;
        this.query = query;
        this.fields = fields;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getGroupByField() {
        return groupByField;
    }

    public void setGroupByField(String groupByField) {
        this.groupByField = groupByField;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<AggregateFieldBean> getFields() {
        return fields;
    }

    public void setFields(List<AggregateFieldBean> fields) {
        this.fields = fields;
    }
}

