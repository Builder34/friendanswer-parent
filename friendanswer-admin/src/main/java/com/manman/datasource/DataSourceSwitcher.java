package com.manman.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by Builder34 on 2017/3/29.
 */
public class DataSourceSwitcher extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceSwitcherToken.getToken();
    }
}
