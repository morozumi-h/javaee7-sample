package sample.logic;

import javax.enterprise.context.Dependent;

@Dependent
public class HelloLogic {

	public String message(String name){
		return name + "さんこんにちは。";
	}
}
