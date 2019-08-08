package fist_week.interface_enum;

public enum OrderFromSourceEnum implements EnumValue {

	// 现在（重构后）订单的来源只有 3 开单这一种
	PAY_RESERVE(1, "支付预约"),
	DIRECT_RESERVE(2, "直接预约"),
	BILL(3, "开单");

	private int value;

	private String name;


	OrderFromSourceEnum(Integer value, String name) {
		this.value = value;
		this.name = name;
	}


	/**
	 * 按照Value获得枚举值
	 */
	public static OrderFromSourceEnum valueOf(Integer value) {
		if (value != null) {
			for (OrderFromSourceEnum fsEnum : OrderFromSourceEnum.values()) {
				if (fsEnum.getValue() == value) {
					return fsEnum;
				}
			}
		}
		return null;
	}


	@Override
	public int getValue() {
		return value;
	}


	@Override
	public String getName() {
		return name;
	}


}