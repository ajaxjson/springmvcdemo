package com.utilities;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.entities.OracleDataSource;

@Configuration
public class DataSourceConfig {
	 @Bean
	    DataSource dataSource() throws SQLException {
	        OracleDataSource dataSource = new OracleDataSource();
	        dataSource.setUsername(username);
	        dataSource.setPassword(password);
	     
			dataSource.setUrl(url);
	        dataSource.setImplicitCachingEnabled(true);
	        dataSource.setFastConnectionFailoverEnabled(true);
	        return (DataSource) dataSource;
	    }
     
//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("org.h2.Driver");
//        dataSourceBuilder.url("jdbc:h2:mem:test");
//        dataSourceBuilder.username("SA");
//        dataSourceBuilder.password("");
//        return dataSourceBuilder.build();
//    }
//    
//    @Bean
//    public DataSource getDataSource() { 
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create(); 
//        dataSourceBuilder.username("SA"); 
//        dataSourceBuilder.password(""); 
//        return dataSourceBuilder.build(); 
//    }
}
