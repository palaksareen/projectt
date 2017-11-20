package uk.co.o2.onlinehelp.grafana;


import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.graphite.GraphiteReporter;
import com.codahale.metrics.graphite.PickledGraphite;
import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;
import uk.co.o2.onlinehelp.util.DynamicProperties;

import javax.annotation.PostConstruct;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

@Component
@EnableMetrics
@Conditional(GrafanaCondition.class)
public class GrafanaReporter {

    @Autowired
    private OnlineHelpLogger logger;

    private PickledGraphite graphite;
    private GraphiteReporter graphiteReporter;
    private MetricRegistry metricRegistry = new MetricRegistry();

    private final String hostName = DynamicProperties.getProperty("kairos.db.hostname");
    private final int port = Integer.parseInt(DynamicProperties.getProperty("kairos.db.port"));
    private final String prefix = DynamicProperties.getProperty("kairos.db.prefix");
    private int period = Integer.parseInt(DynamicProperties.getProperty("kairos.db.period"));


    @Autowired
    public GrafanaReporter(MetricRegistry metricRegistry) {

        this.metricRegistry = metricRegistry;
        graphite = new PickledGraphite(new InetSocketAddress(hostName, port));
    }


    @PostConstruct
    public void sendStatsToGraphite() {

        logger.accessLog("Graphite Reporter initialising");
        graphiteReporter = GraphiteReporter.forRegistry(metricRegistry)
                .prefixedWith(prefix)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .filter(MetricFilter.ALL)
                .build(graphite);

        graphiteReporter.start(period, TimeUnit.MINUTES);
        graphiteReporter.report(metricRegistry.getGauges(), metricRegistry.getCounters(), metricRegistry.getHistograms(), metricRegistry.getMeters(), metricRegistry.getTimers());
        logger.accessLog("Graphite started");
    }

}