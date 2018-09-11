package com.tool.utils.uuid.best;

import java.io.Serializable;
/**
 * a-z A-Z 0-9 从以上字母和数字集合中取数，然后生成appkey。appkey可以任意设置长度，但是要保证每次生成的和之前的没有重复。
 * time+随机数+随机字母
 * @author Administrator
 * @deprecated
 *
 */
public class UUIDHexGenerator extends AbstractUUIDGenerator {

    private String sep = "";

    protected String format(int intval) {
        String formatted = Integer.toHexString(intval);
        StringBuffer buf = new StringBuffer("00000000");
        buf.replace(8 - formatted.length(), 8, formatted);
        return buf.toString();
    }

    protected String format(short shortval) {
        String formatted = Integer.toHexString(shortval);
        StringBuffer buf = new StringBuffer("0000");
        buf.replace(4 - formatted.length(), 4, formatted);
        return buf.toString();
    }

    public Serializable generate() {
        return new StringBuffer(36).append(format(getIP())).append(sep).append(format(getJVM())).append(sep)
                .append(format(getHiTime())).append(sep).append(format(getLoTime())).append(sep)
                .append(format(getCount())).toString();
    }

    public static void main(String[] args) {
		UUIDHexGenerator g = new UUIDHexGenerator();
		Serializable generate = g.generate();
		System.out.println(generate);
	}
    
   
}
