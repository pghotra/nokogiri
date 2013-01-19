/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package nokogiri.internals.org.apache.xml.security.c14n;

import nokogiri.internals.org.apache.xml.security.c14n.helper.C14nHelper;

/**
 * Class CanonicalizationException
 *
 * @author Christian Geuer-Pollmann
 */
public class CanonicalizationException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor CanonicalizationException
     *
     */
    public CanonicalizationException() {
        super();
    }

    /**
     * Constructor CanonicalizationException
     *
     * @param message
     */
    public CanonicalizationException(String message) {
        super(message);
    }
    
    /**
     * Constructor CanonicalizationException
     *
     * @param message
     * @param rootCause
     */
    public CanonicalizationException(Exception rootCause) {
        super(rootCause);
    }

    /**
     * Constructor CanonicalizationException
     *
     * @param msgID
     * @param exArgs
     */
    public CanonicalizationException(String message, Object... exArgs) {     
        super(C14nHelper.getErrorMessage(message, exArgs));
    }
    
    /**
     * Constructor CanonicalizationException
     *
     * @param message
     * @param rootCause
     */
    public CanonicalizationException(String message, Exception rootCause) {
        super(message, rootCause);
    }

    /**
     * Constructor CanonicalizationException
     *
     * @param msgID
     * @param exArgs
     * @param originalException
     */
    public CanonicalizationException(String message, Exception rootCause, Object... exArgs) {
        super(C14nHelper.getErrorMessage(message, exArgs), rootCause);
    }
    
    
}
