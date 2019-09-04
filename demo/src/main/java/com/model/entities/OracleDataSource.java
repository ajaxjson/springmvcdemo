package com.model.entities;

import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Bean;

public class OracleDataSource {
	 
	@NotNull
	    private String username;
	    @NotNull
	    private String password;
	    @NotNull
	    private String url;
	    private boolean cache;
	    private boolean fastconnect;
	    public boolean isFastconnect() {
			return fastconnect;
		}
		public void setFastconnect(boolean fastconnect) {
			this.fastconnect = fastconnect;
		}
		public boolean isCache() {
			return cache;
		}
		public void setCache(boolean cache) {
			this.cache = cache;
		}
		
	    
	    public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	   
		public void setImplicitCachingEnabled(boolean cache) {
			// TODO Auto-generated method stub
			this.cache = cache;
			
		}
		public void setFastConnectionFailoverEnabled(boolean fastconnect) {
			// TODO Auto-generated method stub
			this.fastconnect = fastconnect;
		}
		
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
}
