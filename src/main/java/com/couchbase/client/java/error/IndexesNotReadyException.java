/*
 * Copyright (c) 2016 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.couchbase.client.java.error;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.couchbase.client.core.CouchbaseException;
import com.couchbase.client.core.annotations.InterfaceAudience;
import com.couchbase.client.core.annotations.InterfaceStability;
import com.couchbase.client.java.bucket.BucketManager;

/**
 * An exception used to denote that a particular set of secondary N1QL indexes are not in a "online" state.
 *
 * Mainly used internally for the purpose of {@link BucketManager#watchN1qlIndexes(List, long, TimeUnit)}
 * and related methods.
 *
 * @author Simon Baslé
 * @since 2.2
 */
@InterfaceStability.Experimental
@InterfaceAudience.Private
public class IndexesNotReadyException extends CouchbaseException {

    public IndexesNotReadyException() {
        super();
    }

    public IndexesNotReadyException(String message) {
        super(message);
    }
}