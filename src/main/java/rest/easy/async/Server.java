package rest.easy.async;


import io.undertow.Undertow;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

public class Server {


    public static void main(String[] args) {


        UndertowJaxrsServer jaxrsServer =
                new UndertowJaxrsServer().deploy(MyApplication.class);

        jaxrsServer.start(
                Undertow.builder()
                        .addHttpListener(8080, "localhost")
                        .setIoThreads(2)
                        .setWorkerThreads(2)
        );

    }
}
