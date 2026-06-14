package com.mycloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyCloudApplication.class, args);
    }

    public void showHelp() {
        System.out.println("-p [PROT] 来指定端口");
        System.out.println("-i [IPAddress] 来指定IP");
        System.out.println("-h 来获得帮助");
    }
}