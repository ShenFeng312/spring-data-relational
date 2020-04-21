/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.jdbc.repository.query;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.lang.Nullable;

/**
 * Interface specifying a query execution strategy. Implementations encapsulate information how to actually execute the
 * query and how to process the result in order to get the desired return type.
 * 
 * @author Mark Paluch
 * @since 2.0
 */
@FunctionalInterface
interface JdbcQueryExecution<T> {

	/**
	 * Execute the given {@code query} and {@code parameter} and transforms the result into a {@code T}.
	 * 
	 * @param query the query to be executed. Must not be {@literal null}.
	 * @param parameter the parameters to be bound to the query. Must not be {@literal null}.
	 * @return the result of the query. Might be {@literal null}.
	 */
	@Nullable
	T execute(String query, SqlParameterSource parameter);
}
