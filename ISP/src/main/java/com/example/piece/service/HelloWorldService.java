/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piece.service;

/**
 *
 * @author Thomas
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

	@Value("${name:Hi}")
	private String name;

	public String getHelloMessage() {
		return "He " + this.name;
	}

}