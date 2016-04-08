# Spring-Security and AngularJS
[![Build Status](https://travis-ci.org/juliuskrah/spring-boot-security-angularjs.svg?branch=master)](https://travis-ci.org/juliuskrah/spring-boot-security-angularjs)

## About
This project focuses on the best ways to implement
an [AngularJs](https://angularjs.org/) application into a [Spring](http://projects.spring.io/spring-framework/) [Security](http://projects.spring.io/spring-security/)
application.
It focuses on concepts such as Cross Site Request Fogery ([CSRF](https://www.owasp.org/index.php/Cross-Site_Request_Forgery_%28CSRF%29_Prevention_Cheat_Sheet))
attacks, [Cookies](https://en.wikipedia.org/wiki/HTTP_cookie), [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS) as well as [Basic](https://en.wikipedia.org/wiki/Basic_access_authentication) and [Form](https://en.wikipedia.org/wiki/Form-based_authentication) [Authentication](https://en.wikipedia.org/wiki/Authentication). 
The use of [RESTful](http://www.drdobbs.com/web-development/restful-web-services-a-tutorial/240169069) services using [@RestController](http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html) is also present

The project consist of two subprojects: [api-gateway](https://github.com/juliuskrah/spring-boot-security-angularjs/tree/master/api_gateway) and [resource-server](https://github.com/juliuskrah/spring-boot-security-angularjs/tree/master/resource_server)

### Features
- CORS
- Application resource runs on port to emulate a distributed system
- Application runs a [Redis](http://redis.io/) server instance to share authentication information between servers
