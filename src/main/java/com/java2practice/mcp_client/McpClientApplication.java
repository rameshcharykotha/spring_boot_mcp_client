package com.java2practice.mcp_client;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpClientApplication.class, args);
	}

	@Bean(name = "chatClientWithTools")
	ChatClient chatClientWithTools(ChatClient.Builder chatClientBuilder, ToolCallbackProvider tools) {
		return chatClientBuilder.defaultTools(tools).build();
	}
	@Bean(name = "chatClientWithoutToolsSupport")
	ChatClient chatClientWithoutToolsSupport(ChatClient.Builder chatClientBuilder) {
		return chatClientBuilder.build();
	}

}
