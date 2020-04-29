package thrid_week;

import java.io.Serializable;

public class Hero implements Serializable {
	private static final long serialVersionUID = -9165743917088765577L;
	//表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号

	public String name;
	public float hp;
	public Hero(String name,int hp){
		this.name=name;
		this.hp=hp;
	}

}
