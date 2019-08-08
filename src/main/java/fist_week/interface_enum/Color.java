package fist_week.interface_enum;

//实现类
public enum Color implements Behaviour{
	RED(1,"红色"), GREEN(2,"绿色"), BLANK(3,"白色"), YELLOW(4,"黄色");
	// 成员变量
	private String name;
	private int index;
	// 构造方法  外部无法调用枚举类型的构造方法 也无法实例化
	Color( int index,String name) {
		this.name = name;
		this.index = index;
	}
	//获取所有颜色值
	public static void  get_colors(){
		for (Color value : Color.values()) {
			System.out.println(value);}
	}
	/**
	 按照index获得枚举值
	 **/
	public static Color getColor(Integer index) {
		if (index != null) {
			for (Color value : Color.values()) {
				if (value.getIndex() == index) {
					return value;
				}
			}
		}
		return null;
	}


	public String getName() {
		return this.name;
	}

	public int getIndex() {
		return index;
	}

	public void print() {
		System.out.println(this.index+":"+this.name);
	}
}