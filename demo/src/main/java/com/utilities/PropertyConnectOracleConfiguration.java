package com.utilities;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.sql.*;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties("oracle")
public class PropertyConnectOracleConfiguration {
	 @NotNull
	    private String username;
	    @NotNull
	    private String password;
	    @NotNull
	    private String url;
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public void setUrl(String url) {
	        this.url = url;
	    }
	    
	    @Bean
	    DataSource dataSource() throws SQLException {
	    	//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-02RCN7L:1522/XE","system","55555"); 
	    	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@dbcondev2.aycap.bayad.co.th:1588/aycapd"," ibb_app_uat5"," ibb_app_uat5_11g");
	    	url
	    	 OracleDataSource  = new DataSource();
	        dataSource.setUser(username);
	        dataSource.setPassword(password);
	        dataSource.setURL(url);
	        dataSource.setImplicitCachingEnabled(true);
	        dataSource.setFastConnectionFailoverEnabled(true);
	        return dataSource;
	    }
}
