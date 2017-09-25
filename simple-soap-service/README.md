# Simple SOAP Service

This project demonstrates a simple working SOAP web service implemented in Java using the
JAX-WS and JAXB apis. The web service is published using JAX-WS annotations and the
marshalling/unmarshalling of XML to and from Java objects is done using JAXB annotations.

## Requirements

This project generates a war file that must be deployed into a servlet container like tomcat.
There must be a JAX-WS implementation present. The build is handled using maven and Java 8.

# Pieces

## Simple

The Simple class provides 2 web service methods:

* hello
* add

The `hello` method takes an empty request and returns a string. The `add` method takes 2
integers as parameters, adds them together, and then returns the result.

## AdditionRequest

A JAXB-compatible class used in the request of the `add` method.

## AdditionResponse

A JAXB-compatible class used as the response of the `add` method.

## sun-jaxws.xml

This file is only necessary if using *metro* as the JAX-WS implementation.

# References

## JAX-WS Implementations

Any of these can be used/installed into tomcat.

* *Metro*
* *Apache CXF*
* *Apache Axis2*

## See also

* List of JAX-WS implementations: https://en.wikipedia.org/wiki/Java_API_for_XML_Web_Services
* JAX-WS tutorial: http://docs.oracle.com/javaee/6/tutorial/doc/bnayl.html
* JAXB tutorial: https://docs.oracle.com/javase/tutorial/jaxb/intro/index.html
