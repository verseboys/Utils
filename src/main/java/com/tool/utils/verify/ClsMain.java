package com.tool.utils.verify;

/**
 * 程序启动入口
 * <p>
 * 
 * @ClassName : ClsMain
 *            </p>
 *            <p>
 * @Description : TODO
 *              </p>
 *              <p>
 * @Author : HuaZai
 *         </p>
 *         <p>
 * @ContactInformation : 1461522031@qq.com/huazai6789@aliyun.com
 *                     </p>
 *                     <p>
 * @Date : 2017年12月20日 下午4:37:54
 *       </p>
 * 
 *       <p>
 * @Version : V1.0.0
 *          </p>
 *
 */
public class ClsMain {
 
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		MD5Utils md = new MD5Utils();
		String strMD5 = new String("12345");
 
		System.out.println("原始：" + strMD5);
		System.out.println("东东的：" + md.getStrrMD5(strMD5));
		System.out.println("MD5后：" + md.getStrMD5(strMD5));
		System.out.println("加密的：" + md.getconvertMD5(strMD5));
		System.out.println("解密的：" + md.getconvertMD5(md.getconvertMD5(strMD5)));
 
		System.out.println("\t\t=======================================");
		// 原文
		String plaintext = "huazai";
		// plaintext = "123456";
		System.out.println("原始：" + plaintext);
		System.out.println("普通MD5后：" + MD5Utils.getStrMD5(plaintext));
 
		// 获取加盐后的MD5值
		String ciphertext = MD5Utils.getSaltMD5(plaintext);
		System.out.println("加盐后MD5：" + ciphertext);
		System.out.println("是否是同一字符串:" + MD5Utils.getSaltverifyMD5(plaintext, ciphertext));
		/**
		 * 其中某次DingSai字符串的MD5值
		 */
		String[] tempSalt = { "810e1ee9ee5e28188658f431451a29c2d81048de6a108e8a",
				"66db82d9da2e35c95416471a147d12e46925d38e1185c043",
				"61a718e4c15d914504a41d95230087a51816632183732b5a" };
 
		for (String temp : tempSalt) {
			System.out.println("是否是同一字符串:" + MD5Utils.getSaltverifyMD5(plaintext, temp));
		}
	}
 


}
