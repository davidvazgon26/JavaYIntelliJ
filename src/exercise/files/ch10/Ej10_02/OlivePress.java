//package com.example.java;
package exercise.files.ch10.Ej10_02;

import exercise.files.ch10.Ej10_02.model.Olive;

import java.util.List;

public class OlivePress implements Press{   //implement Press implementa la interface

	private  int currentOil;
	public int getOil(List<Olive> olives) {

		int totalOil = 0;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

	@Override
	public void setOil(int oil) {
		currentOil = oil;
	}

}
