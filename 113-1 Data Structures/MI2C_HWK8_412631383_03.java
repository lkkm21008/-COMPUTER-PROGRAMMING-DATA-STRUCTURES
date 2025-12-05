/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
class URLInfo {
    String protocol, host, filename;
    URLInfo() { }
    URLInfo(String a, String b, String c) {
        protocol = a;
        host = b;
        filename = c;
    }

    void display(String msg) {
        System.out.print(msg);
        // DIY
        System.out.println("Protocol:"+protocol);
        System.out.println("Host:"+host);
        System.out.println("Filename:"+filename);
    }
}
public class MI2C_HWK8_412631383_03 {
        public static void main(String[] args) {
       URLInfo info = parsetURL("https://www.javasoft.com/public/java-lib.rar");
       info.display("URL Info=\n");
    }
public static URLInfo parsetURL(String url){
    int protocolEnd =url.indexOf("://");
    String protocol=url.substring(0, protocolEnd);
    
    int hostStart =protocolEnd+3;
    int hostEnd=url.indexOf("/",hostStart);
    String host=url.substring(hostStart,hostEnd);
    
    String filename=url.substring(hostEnd+1);
    
    return new URLInfo(protocol,host,filename);
                 }
}
