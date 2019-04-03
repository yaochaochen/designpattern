package jdk12;


import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Jdk12 {


    HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofMillis(500)).authenticator(new Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
           // return super.getPasswordAuthentication();
            return new PasswordAuthentication("admin", "123".toCharArray());
        }
        
    }).build();
    //可设置heard method cookie等信息
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create("localhost:7200/")).build();
    
    HttpResponse<String> response;

    {
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            response.statusCode();
            response.body();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
    

