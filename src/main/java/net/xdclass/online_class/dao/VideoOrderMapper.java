package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {
    /**
     * 查询出全部订单
     * @return
     */
    List<VideoOrder> queryVideoOrderList();

    /**
     * 查询实现懒加载
     * @return
     */
    List<VideoOrder> queryVideoOrderListLazy();

    /**
     * 查询客户对应的所有订单
     * @return
     */
    List<User> queryUserOrder();

}
