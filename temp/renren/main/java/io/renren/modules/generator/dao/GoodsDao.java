package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.GoodsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品管理
 * 
 * @author TickTock
 * @email sj@gmail.com
 * @date 2023-01-31 11:45:25
 */
@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity> {
	
}
