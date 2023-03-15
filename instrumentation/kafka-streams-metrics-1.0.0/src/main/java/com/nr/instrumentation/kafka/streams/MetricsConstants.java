package com.nr.instrumentation.kafka.streams;

import com.newrelic.api.agent.NewRelic;

public class MetricsConstants {

    public static final boolean KAFKA_METRICS_DEBUG = NewRelic.getAgent().getConfig().getValue("kafka.metrics.debug.enabled", false);

    public static final boolean METRICS_AS_EVENTS = NewRelic.getAgent().getConfig().getValue("kafka.metrics.as_events.enabled", false);

    public static final long REPORTING_INTERVAL_IN_SECONDS = NewRelic.getAgent().getConfig().getValue("kafka.metrics.interval", 30);

    public static final String METRIC_PREFIX = "Kafka/Streams/";

    public static final String METRICS_EVENT_TYPE = "KafkaStreamsMetrics";
}
