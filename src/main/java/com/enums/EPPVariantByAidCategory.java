package com.enums;

public enum EPPVariantByAidCategory {

	B0("EP4"), B1("EP3"), B2("EP2"), B3("EP2"), B4("EP1"), B5("EP1");

	private String code;

	private EPPVariantByAidCategory(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public static EPPVariantByAidCategory fromValue(String code) {
		for (EPPVariantByAidCategory e : EPPVariantByAidCategory.values()) {
			if (code.equals(e.getCode())) {
				return e;
			}
		}
		return null;
	}
	
	public static EPPVariantByAidCategory getEnum(String code) {
		for (EPPVariantByAidCategory e : EPPVariantByAidCategory.values()) {
			if (code.equals(e.getCode())) {
				return e;
			}
		}
		return null;
	}
}
