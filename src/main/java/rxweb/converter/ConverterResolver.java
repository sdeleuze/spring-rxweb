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

package rxweb.converter;

import reactor.io.buffer.Buffer;
import rxweb.http.MediaType;
import rxweb.http.Request;
import rxweb.mapping.Condition;
import rxweb.server.ServerHandler;

/**
 * @author Sebastien Deleuze
 */
public interface ConverterResolver {

	void addConverter(Converter converter);

	Converter resolveReader(Class<?> clazz, MediaType mediaType);

	Converter resolveWriter(Class<?> clazz, MediaType mediaType);

}