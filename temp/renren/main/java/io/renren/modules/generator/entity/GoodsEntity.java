package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品管理
 * 
 * @author TickTock
 * @email sj@gmail.com
 * @date 2023-01-31 11:45:25
 */
@Data
@TableName("tb_goods")
public class GoodsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品ID
	 */
	@TableId
	private Long goodsId;
	/**
	 * 商品名
	 */
	private String name;
	/**
	 * 介绍
	 */
	private String intro;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 数量
	 */
	private Integer num;

}
