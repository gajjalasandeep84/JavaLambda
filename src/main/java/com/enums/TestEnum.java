package com.enums;

import java.util.Arrays;

public class TestEnum {
	public static void main(String args[]) {
		/*System.out.println(Arrays.stream(EPPVariantByAidCategory.values()).filter(p -> p.name().equals("B1"))
				.findFirst().orElse(null).getCode());*/

		for (EPPVariantByAidCategory e : EPPVariantByAidCategory.values()) {
			System.out.println(Arrays.stream(EPPVariantByAidCategory.values()).filter(p -> p.getCode().equals(e.getCode()))
					.findFirst().orElse(null).getCode());
		}
	}
}
