/*
 * Copyright 2004-2009 the original author or authorss.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.slim3.jdo;

/**
 * An implementation class for "greater equal" filter criterion.
 * 
 * @author higa
 * @since 3.0
 * 
 */
public class GeCriterion extends AbstractFilterCriterion {

    /**
     * Constructor.
     * 
     * @param propertyName
     *            the property name
     * @param parameter
     *            the parameter
     */
    public GeCriterion(String propertyName, Object parameter) {
        super(propertyName, parameter);
    }

    public String getQueryString(String parameterName) {
        return propertyName + " >= " + parameterName;
    }
}