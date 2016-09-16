package com.lkcb.friendanswer.provider.utils;

import java.util.Map;

/**
 * 参数校验工具类
 * @author Builder34
 * @createDate 2016-06-30
 * */
public class ValidateParamsUtil {
	/**
	 * 检查必填参数是否缺失
	 * @param necessaryParams 必须的参数集合
	 * @param params 传入的参数集合
	 * @return 返回null说明校验通过，字符串不为空时为校验不通过并返回缺少的参数名
	 * */
	public static String checkMissParams(String[] necessaryParams , Map<String, ?> params){
		StringBuffer sb = new StringBuffer() ;
		sb.setLength(0) ;
		if(params == null ){
			if(necessaryParams.length>0){
				for (int i = 0; i < necessaryParams.length; i++) {
					sb.append(necessaryParams[i]).append(" ") ;
				}
				return "："+sb.toString() ;
			}
		}
		for(int j = 0 ; j < necessaryParams.length ; j++){
			if(!params.keySet().contains(necessaryParams[j])){
				if(sb.length() == 0){
					sb.append(necessaryParams[j]) ;
				}else{
					sb.append("，").append(necessaryParams[j]) ;
				}
			}
			
		}
		if(sb.length() == 0){
			return null ;
		}
		return "："+sb.toString() ;
	}

}
