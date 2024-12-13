package com.bdqn.service.impl;

import com.bdqn.dao.RoomTypeMapper;
import com.bdqn.entity.RoomType;
import com.bdqn.service.RoomTypeService;
import com.bdqn.vo.RoomTypeVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class RoomTypeServiceImpl implements RoomTypeService {

    @Resource
    private RoomTypeMapper roomTypeMapper;

    /**
     * 查询房型列表
     *
     * @param roomTypeVo
     * @return
     */
    public List<RoomType> findRoomTypeList(RoomTypeVo roomTypeVo) {
        return roomTypeMapper.findRoomTypeList(roomTypeVo);
    }

    public int addRoomType(RoomType roomType) {
        setRoomTypeFields(roomType);
        return roomTypeMapper.addRoomType(roomType);
    }

    /**
     * 更新房型信息
     *
     * @param roomType 房型对象
     * @return 影响的行数
     */
    public int updateRoomType(RoomType roomType) {
        setRoomTypeFields(roomType);
        return roomTypeMapper.updateRoomType(roomType);
    }

    private void setRoomTypeFields(RoomType roomType) {
        // 可用房间数默认是全部的房间数量
        roomType.setAvailableNum(roomType.getRoomnum());
        roomType.setLivednum(0); // 已入住房间数量
    }
}
