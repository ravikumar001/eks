package com.prageeth.samplespringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/docker/hello")
public class HelloResource {

    @GetMapping
    public String Hello(){
        return "<html>\n" +
                "    <title>Sample EKS WebSite</title>\n" +
                "    <body>\n" +
                "        <div align=\"center\" style = \"font-family:georgia,garamond,serif;font-size:24px;color:darkslateblue;\">\n" +
                "        <h1> \n" +
                "            <p >\n" +
                "                <br> Dockerized java-spring-boot Web App on EKS\n" +
                "             </p>\n" +
                "            </h1>\n" +
                "        <br> \n" +
                "        \n" +
                "            <img src=\"https://www.docker.com/sites/default/files/d8/2019-07/horizontal-logo-monochromatic-white.png\" width=\"40%\" />\n" +
                "            &emsp;&emsp;\n" +
                "            <img src=\"https://kubernetes.io/images/kubernetes-horizontal-color.png\" width=\"40%\"/>\n" +
                "            <br><br>\n" +
                "            Runnin on AWS - EKS \n" +
                "        </div>\n" +
                "    </body>\n" +
                "</html>";
    }

}
