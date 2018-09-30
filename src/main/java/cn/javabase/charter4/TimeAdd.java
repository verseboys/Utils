package cn.javabase.charter4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
* 编写一个函数，要求输入年月日时分秒，输出该年月日时分秒的下一秒。
*  如输入2004年12月31日23时59分59秒，则输出2005年1月1日0时0分0秒。
* 
* @author ZLJ
*
*/
public class TimeAdd {
  public static void main(String[] args) {
    // 创建对象
    Calendar c = Calendar.getInstance();
    // 2004年12月31日23时59分59秒 第一个月是0,最后一个月是11
    c.set(2004, 12 - 1, 31, 23, 59, 59);

    Date beforetime = c.getTime();
    String before = formatdemo(beforetime);
    System.out.println("修改前的时间是:" + before);
    // 添加1秒
    c.add(Calendar.SECOND, 1);
    Date aftertime = c.getTime();
    String after = formatdemo(aftertime);
    System.out.println("修改后的时间是:" + after);

  }

  // 格式化日期
  public static String formatdemo(Date date) {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");// 创建日期格式化类对象
    String format = sdf.format(date);
    return format;

  }
} 
