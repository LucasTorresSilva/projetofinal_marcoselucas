package br.com.etechoracio.projeto.conf;

import java.util.HashMap;

import javax.faces.bean.ViewScoped;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {

	@Bean
	public CustomScopeConfigurer getScopeConfigurer() {
		final CustomScopeConfigurer scopeConfigurer = new CustomScopeConfigurer();
		final Map<String, Object> scopes = new HashMap()<>();
		scopes.put("view", this.getViewScoped());
		scopeConfigurer.setScopes(scopes);
		return scopeConfigurer;
	}

	public ViewScoped getViewScoped() {
		return new ViewScoped();
	}

}