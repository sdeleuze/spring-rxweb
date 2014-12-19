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

package rxweb;

import rx.Observable;
import rxweb.annotation.Mapping;

import org.springframework.stereotype.Controller;

/**
 * @author Sebastien Deleuze
 */
public class MvcServerTests {

	@Controller
	public static class SampleController {

		@Mapping("/")
		public Observable<User> getUsers() {
			return Observable.just(new User("Brian", "Clozel"), new User("Stéphane", "Nicoll"));
		}

	}

	public static class User {

		private String firstname;
		private String lastname;

		public User() {
		}

		public User(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
	}

}
