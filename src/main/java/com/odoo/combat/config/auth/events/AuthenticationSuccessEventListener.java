package com.odoo.combat.config.auth.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationSuccessEventListener implements ApplicationListener<AuthenticationSuccessEvent> {

	private static final Logger logger = LoggerFactory.getLogger(AuthenticationSuccessEventListener.class);

	@Override
	public void onApplicationEvent(AuthenticationSuccessEvent event) {
		// Handle successful login event
		String username = event.getAuthentication().getName();

		logger.info("User logged in: ", username);
	}
}