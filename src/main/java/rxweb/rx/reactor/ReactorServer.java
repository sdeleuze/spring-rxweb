/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package rxweb.rx.reactor;

import reactor.rx.Promise;

/**
 * @author Sebastien Deleuze
 */
public interface ReactorServer {

	/** Complete when the server is started **/
	Promise<Boolean> start();

	/** Complete when the server is stopped **/
	Promise<Boolean> stop();

	void setHost(String host);

	void setPort(int port);

	void get(final String path, final ReactorServerHandler handler);

	void post(final String path, final ReactorServerHandler handler);

	void put(final String path, final ReactorServerHandler handler);

	void delete(final String path, final ReactorServerHandler handler);

}