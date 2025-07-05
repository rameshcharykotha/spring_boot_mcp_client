# spring_boot_mcp_client

MCP Client implementation through Spring Boot.

## Project Overview

This project provides a client for interacting with an MCP (Multi-Cloud Platform) server. It is built using Spring Boot and uses Spring AI for OpenAI integration.

## Prerequisites

*   **Java Development Kit (JDK):** Version 21 or later.
*   **Build Tool:** Maven
*   **OpenAI API Key:** You need an OpenAI API key to use the AI features.

## Getting Started

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/java2practice/spring_boot_mcp_client.git
    cd spring_boot_mcp_client
    ```

2.  **Configure the application:**
    Open `src/main/resources/application.properties` and update the following properties:
    *   `spring.ai.openai.api-key`: Set your OpenAI API key.
    *   `spring.ai.mcp.client.sse.connections.author-mcp-server.url`: Update if your MCP server is not running on `http://localhost:8080`.

3.  **Build the project:**
    ```bash
    mvn clean install
    ```

4.  **Run the application:**
    ```bash
    java -jar target/mcp-client-0.0.1-SNAPSHOT.jar
    ```
    The application will start on the port specified by `server.port` (default is 8081).

## Configuration

The application can be configured through the `src/main/resources/application.properties` file. Key properties include:

*   `server.port`: Port on which the application runs.
*   `spring.application.name`: Name of the Spring application.
*   `spring.ai.openai.api-key`: Your OpenAI API key.
*   `spring.ai.openai.chat.options.model`: The OpenAI model to use (e.g., `gpt-4o-mini`).
*   `spring.ai.mcp.client.name`: Name of the MCP client.
*   `spring.ai.mcp.client.version`: Version of the MCP client.
*   `spring.ai.mcp.client.toolcallback.enabled`: Enable or disable tool callbacks for the MCP client.
*   `spring.ai.mcp.client.sse.connections.author-mcp-server.url`: URL of the MCP server.
