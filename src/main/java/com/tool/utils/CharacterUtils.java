package com.tool.utils;

import java.util.Random;
public class CharacterUtils {
//����1��lengthΪ������λ��
  public static String getRandomString(int length){
    //����һ���ַ�����A-Z��a-z��0-9����62λ��
    String str="zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
    //��Random���������
        Random random=new Random();  
        StringBuffer sb=new StringBuffer();
        //����Ϊ����ѭ������
        for(int i=0; i<length; ++i){
          //����0-61������
          int number=random.nextInt(62);
          //������������ͨ��length�γ��ص�sb��
          sb.append(str.charAt(number));
        }
        //�����ص��ַ�ת�����ַ���
        return sb.toString();
  }
  /**
   * �ڶ��ַ���
   */
  public static String getRandomString2(int length){
    //���������
    Random random=new Random();
    StringBuffer sb=new StringBuffer();
    //ѭ��length��
    for(int i=0; i<length; i++){
      //����0-2�������������a-z��A-Z��0-9���ֿ���
      int number=random.nextInt(3);
      long result=0;
      switch(number){
      //���number������������0��
      case 0:
        //����A-Z��ASCII��
        result=Math.round(Math.random()*25+65);
        //��ASCII��ת�����ַ�
        sb.append(String.valueOf((char)result));
        break;
        case 1:
          //����a-z��ASCII��
        result=Math.round(Math.random()*25+97);
          sb.append(String.valueOf((char)result));
        break;
        case 2:
          //����0-9������
                   sb.append(String.valueOf
                          (new Random().nextInt(10)));
        break; 
      }
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    System.out.println(CharacterUtils.getRandomString(12));
      
  }
    
}
