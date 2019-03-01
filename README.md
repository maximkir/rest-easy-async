# rest-easy-async [![Build Status](https://www.travis-ci.org/maximkir/rest-easy-async.svg?branch=master)](https://www.travis-ci.org/maximkir/rest-easy-async)
An example of JAX-RS (RESTEasy) with asynchronous HTTP request processing


## Scope

Utilize asynchronous programming model in microservices world. 
A service receives a request, handles it in an asynchronous way (the requestor meanwhile blocked by OS socket read operation?).
The handled request involves another I/O operations (sending HTTP requests to additional services) which as well performed asynchronously.

## Technology Stack
- Undertow Server
- RESTEasy as JAX-RS implementation

## Patterns
- Asynchronous HTTP Request Processing

## Undertow Request Lifecycle

