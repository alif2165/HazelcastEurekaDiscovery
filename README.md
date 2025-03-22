# HazelcastEurekaDiscovery
## Eureka Server 
It's a **service registry**, part of the Spring Cloud Netflix project, that helps in building and managing microservices architectures. It is primarily used for service discovery in microservices applications. Eureka is designed to allow services to register themselves at runtime, and for other services to discover them without having to hard-code their locations or IP addresses. It makes microservices dynamic and scalable, which is essential for cloud-based applications.

Add these properties in **application.properties**.
    
    server.port=8761
    spring.application.name=eureka-server
    eureka.instance.hostname=localhost

This will start the eureka server on localhost:8761

## Cache Service
Hazelcast is an open-source, distributed computing platform designed for building scalable, high-performance applications. It provides a variety of data structures and computing models that help in distributed caching, data management, and processing. Hazelcast is commonly used for distributed caching, in-memory data grids (IMDG), distributed computing, and as a key-value store. It's widely used in microservices architectures, especially where there’s a need for high-speed data processing and sharing across distributed systems.

