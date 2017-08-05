package cn.e3mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;

/**
* @author XYY
* @version 1.0
*
*
*/
@Service
public class TermServiceImpl implements TermService {
		@Autowired
		private TbItemMapper tbItemMapper;

	@Override
	public TbItem getItem(long id) {
		TbItem kItem = tbItemMapper.selectByPrimaryKey(id);
		return kItem;
	}

}
