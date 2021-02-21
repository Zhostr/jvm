package com.luban.ziya.jvm;

public class Test {

    public static Test test4 = new Test();

    static {
        System.out.println("here<?xml version=\"1.0\" encoding=\"UTF‐8\"?>\n" +
                "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" \n" +
                "\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema‐instance\" \n" +
                "\txsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven‐4.0.0.xsd\">\n" +
                "\n" +
                "\t<modelVersion>4.0.0</modelVersion>\n" +
                "\t<groupId>org.apache.tomcat</groupId>\n" +
                "\t<artifactId>apache‐tomcat‐8.5.42‐src</artifactId>\n" +
                "\t<name>Tomcat8.5</name>\n" +
                "\t<version>8.5</version>\n" +
                "\n" +
                "\t<build> \n" +
                "\t\t<finalName>Tomcat8.5</finalName> \n" +
                "\t\t<sourceDirectory>java</sourceDirectory> \n" +
                "\t\t<!‐‐ <testSourceDirectory>test</testSourceDirectory>‐‐> \n" +
                "\t\t<resources> \n" +
                "\t\t\t<resource> <directory>java</directory> </resource> \n" +
                "\t\t</resources> \n" +
                "\t\t<!‐‐ <testResources> \n" +
                "\t\t\t\t<testResource> \n" +
                "\t\t\t\t\t<directory>test</directory> \n" +
                "\t\t\t\t</testResource> \n" +
                "\t\t</testResources>‐‐>\n" +
                "\t\t<plugins> \n" +
                "\t\t\t<plugin> \n" +
                "\t\t\t\t<groupId>org.apache.maven.plugins</groupId>\n" +
                "\t\t\t\t<artifactId>maven‐compiler‐plugin</artifactId> \n" +
                "\t\t\t\t<version>2.3</version> \n" +
                "\t\t\t\t<configuration> \n" +
                "\t\t\t\t\t<encoding>UTF‐8</encoding> \n" +
                "\t\t\t\t\t<source>1.8</source> \n" +
                "\t\t\t\t\t<target>1.8</target> \n" +
                "\t\t\t\t</configuration> \n" +
                "\t\t\t</plugin> \n" +
                "\t\t</plugins> \n" +
                "\t</build>\n" +
                "\n" +
                "\t<dependencies> \n" +
                "\t\t<dependency> \n" +
                "\t\t\t<groupId>junit</groupId> \n" +
                "\t\t\t<artifactId>junit</artifactId> \n" +
                "\t\t\t<version>4.12</version> \n" +
                "\t\t\t<scope>test</scope> \n" +
                "\t\t</dependency> \n" +
                "\t\t<dependency> \n" +
                "\t\t\t<groupId>org.easymock</groupId>\n" +
                "\t\t\t<artifactId>easymock</artifactId> \n" +
                "\t\t\t<version>3.4</version> \n" +
                "\t\t</dependency> \n" +
                "\t\t<dependency> \n" +
                "\t\t\t<groupId>ant</groupId> \n" +
                "\t\t\t<artifactId>ant</artifactId> \n" +
                "\t\t\t<version>1.7.0</version> \n" +
                "\t\t</dependency> \n" +
                "\t\t<dependency> \n" +
                "\t\t\t<groupId>wsdl4j</groupId> \n" +
                "\t\t\t<artifactId>wsdl4j</artifactId> \n" +
                "\t\t\t<version>1.6.2</version> \n" +
                "\t\t</dependency>\n" +
                "\t\t<dependency> \n" +
                "\t\t\t<groupId>javax.xml</groupId> \n" +
                "\t\t\t<artifactId>jaxrpc</artifactId> \n" +
                "\t\t\t<version>1.1</version> \n" +
                "\t\t</dependency> \n" +
                "\t\t<dependency> \n" +
                "\t\t\t<groupId>org.eclipse.jdt.core.compiler</groupId> \n" +
                "\t\t\t<artifactId>ecj</artifactId> \n" +
                "\t\t\t<version>4.5.1</version> \n" +
                "\t\t</dependency> \n" +
                "\t</dependencies> \n" +
                "</project>");
    }

    public static void main(String[] args) {
        Test obj = new Test();

        System.out.println(obj.add(11, 22));
    }

    public int add(int x, int y) {
        int a = 10;
        int b = 20;

        return a + b + x + y;
    }
}