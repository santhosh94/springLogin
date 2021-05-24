package com.springboot.app;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class Project implements Serializable{

	//private Long usname;
	//private String psword;
    private String title;
    private String type;
    private String color;
    private String description;
    private Integer days;
    private Double price;
    private Boolean featured;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)        
    private LocalDateTime launchDate;
	
    
    private String usname;
    private String psword;

    public String getUsername() {
        return usname;
    }
    public void setUsername(String usname) {
        this.usname = usname ;
    }
    public String getPassword() {
        return psword;
    }
    public void setPassword(String psword) {
        this.psword = psword;
    }
}
