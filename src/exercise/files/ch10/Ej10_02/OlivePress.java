//package com.example.java;
package exercise.files.ch10.Ej10_02;

import exercise.files.ch10.Ej10_02.model.Olive;

import java.util.List;

public class OlivePress {

	public int getOil(List<Olive> olives) {

		int totalOil = 0;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

}
