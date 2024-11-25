package com.dao;

import com.entity.GuomanzhizuiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuomanzhizuiCollectionView;

/**
 * 国漫之最收藏 Dao 接口
 *
 * @author 
 */
public interface GuomanzhizuiCollectionDao extends BaseMapper<GuomanzhizuiCollectionEntity> {

   List<GuomanzhizuiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
