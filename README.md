This is a simple springboot demo app that requires the client to send their certificate for 2 way authentication.
all the required certificates needed are in the certs directory. The app is running on VM where the hostname is 
spring.testserver.org. the VM was running Lubuntu. Lite Ubuntu.

The SSLClient side also contains the client certificate and the root and intermediate certs need to be imported 
into your truststore. cacerts.

https://medium.com/geekculture/authentication-using-certificates-7e2cfaacd18b
