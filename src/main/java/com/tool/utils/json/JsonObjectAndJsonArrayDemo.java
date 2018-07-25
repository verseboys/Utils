package com.tool.utils.json;



import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
 
public class JsonObjectAndJsonArrayDemo {
	public static void main(String[] args){
		//复杂的json数据
		String jsonStr = "{\"resultcode\":\"200\",\"reason\":\"成功的返回\",\"result\":{\"company\":\"顺丰\",\"com\":\"sf\","
				+ "\"no\":\"575677355677\",\"list\":[{\"datetime\":\"2013-06-25 10:44:05\",\"remark\":\"已收件\",\"zone\":\"台州市\"},"
				+ "{\"datetime\":\"2013-06-25 11:05:21\",\"remark\":\"快件在 台州 ,准备送往下一站 台州集散中心 \",\"zone\":\"台州市\"}],\"status\":1},"
				+ "\"error_code\":0}";
		JSONObject json = JSONObject.fromObject(jsonStr); //得到整个json串
		System.out.println("resultcode:"+json.getString("resultcode"));  //根据key得到value:200
		System.out.println("reason:"+json.getString("reason"));  //根据key得到value:成功的返回
		
		//当遇到result时，也是将它当成一个整体串
		System.out.println("company:"+JSONObject.fromObject(json.getString("result")).getString("company"));
		System.out.println("com:"+JSONObject.fromObject(json.getString("result")).getString("com"));
		System.out.println("no:"+JSONObject.fromObject(json.getString("result")).getString("no"));
		
		//当遇到再次嵌套时，此时的list是一个JSONArray，所以需要将其当作数组的形式处理，其实还是一个串
		//get(i)以下标为主，里面的东西，其实也是一个json的形式数据，你可以不看外面怎么嵌套，按道理只当成单单一个json串处理即可
		System.out.println("list(0).datetime:"+JSONObject.fromObject(JSONArray.fromObject(JSONObject.fromObject(json.getString("result")).getString("list")).get(0)).getString("datetime"));
		
		System.out.println("list(0).remark:"+JSONObject.fromObject(JSONArray.fromObject(JSONObject.fromObject(json.getString("result")).getString("list")).get(0)).getString("remark"));
		
		System.out.println("list(0).zone:"+JSONObject.fromObject(JSONArray.fromObject(JSONObject.fromObject(json.getString("result")).getString("list")).get(0)).getString("zone"));
		
		System.out.println("list(1).datetime:"+JSONObject.fromObject(JSONArray.fromObject(JSONObject.fromObject(json.getString("result")).getString("list")).get(1)).getString("datetime"));
		
		System.out.println("list(1).remark:"+JSONObject.fromObject(JSONArray.fromObject(JSONObject.fromObject(json.getString("result")).getString("list")).get(1)).getString("remark"));
		
		System.out.println("list(1).zone:"+JSONObject.fromObject(JSONArray.fromObject(JSONObject.fromObject(json.getString("result")).getString("list")).get(1)).getString("zone"));
		
		System.out.println("status:"+JSONObject.fromObject(json.getString("result")).getString("status"));
		
		System.out.println("reason:"+json.getString("error_code"));
	}
}

