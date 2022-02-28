/*
 *
 *  * Copyright 2020 New Relic Corporation. All rights reserved.
 *  * SPDX-License-Identifier: Apache-2.0
 *
 */

package reactor.core.scheduler;

import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

@Weave(originalName = "reactor.core.scheduler.WorkerTask")
final class WorkerTask_Instrumentation {

    @Trace(async = true, excludeFromTransactionTrace = true)
    public Void call() {
        return Weaver.callOriginal();
    }
}
