/**
 * Copyright (C) 2009-2012 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fusesource.restygwt.client;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.Response;

/**
 *
 * @author <a href="http://hiramchirino.com">Hiram Chirino</a>
 */
public class ResponseFormatException extends RuntimeException {

  private static final long serialVersionUID = 1819275788939805070L;
  private final Request request;
  private final Response response;

  public ResponseFormatException(String message, Throwable e, Request request, Response response) {
    super(message, e);
    this.request = request;
    this.response = response;
  }

  public ResponseFormatException(String message, Request request, Response response) {
    super(message);
    this.request = request;
    this.response = response;
  }

  public Request getRequest() {
    return request;
  }

  public Response getResponse() {
    return response;
  }
}
