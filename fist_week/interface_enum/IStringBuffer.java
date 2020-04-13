package fist_week.interface_enum;

public interface IStringBuffer {
	void append(String str);//追加字符串
	void append(char c); //追加字符
	void insert(int pos,char b);//指定位置插入字符
	void insert(int pos,String b); //指定位置插入字符串
	void delete(int start); //从开始位置删除剩下的
	void delete(int start,int end); //从开始位置删除 结束位置-1
	void reverse(); //反转
	int length(); //返回长度
}

