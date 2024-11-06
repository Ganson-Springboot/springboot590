package com.entity.view;

import com.entity.WenzhangfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文章分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 10:05:28
 */
@TableName("wenzhangfenlei")
public class WenzhangfenleiView  extends WenzhangfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhangfenleiView(){
	}
 
 	public WenzhangfenleiView(WenzhangfenleiEntity wenzhangfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhangfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
