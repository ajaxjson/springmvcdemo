package com.app.start;
//import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration;
//import org.springframework.boot.autoconfigure.web.embedded.TomcatWebServerFactoryCustomizer;
//import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
//import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
//import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootUploadApplication {
	private int maxUploadSizeInMb = 10 * 1024 * 1024; // 10 MB

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootUploadApplication.class, args);
    }

	public int getMaxUploadSizeInMb() {
		return maxUploadSizeInMb;
	}

	public void setMaxUploadSizeInMb(int maxUploadSizeInMb) {
		this.maxUploadSizeInMb = maxUploadSizeInMb;
	}

    //Tomcat large file upload connection reset
    //http://www.mkyong.com/spring/spring-file-upload-and-connection-reset-issue/
//    @Bean
//    public TomcatEmbeddedServletContainerFactory tomcatEmbedded() {
//
//        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
//
//        tomcat.addConnectorCustomizers((TomcatWebServerFactoryCustomizer) connector -> {
//            if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
//                //-1 means unlimited
//                ((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
//            }
//        });
//
//        return tomcat;
//
//    }
}
