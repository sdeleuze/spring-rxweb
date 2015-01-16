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

package rxweb.rx.rxjava;

import java.nio.ByteBuffer;

import org.reactivestreams.Publisher;
import rx.Observable;
import rxweb.converter.ConverterResolver;
import rxweb.http.Request;
import rxweb.server.ServerRequestHeaders;

/**
 * @author Sebastien Deleuze
 */
public interface RxJavaServerRequest extends Request, Publisher<ByteBuffer> {

	ServerRequestHeaders getHeaders();

	/** Return a single buffered raw content **/
	Observable<ByteBuffer> getContent();

	/** Return a single (the content is buffered) POJO using converters **/
	<T> Observable<T> getContent(Class<T> clazz);

	/** Return a stream of raw content chunks **/
	Observable<ByteBuffer> getContentStream();

	/** Return a stream of POJO contents using converters (1 chunk = 1 POJO) **/
	<T> Observable<T> getContentStream(Class<T> clazz);

	void setConverterResolver(ConverterResolver converterResolver);


}
