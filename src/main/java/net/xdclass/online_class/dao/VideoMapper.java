package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.Video;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface VideoMapper {


    /**
     * 根据视频id查找视频对象
     * @param videoId
     * @return
     */
    Video selectById(@Param("video_id") int videoId);

    /**
     * 查询所有video数据
     * @return
     */
    List<Video> selectlistVideo();
    
    /**
     * 根据评分和标题进行模糊查询
     * 
     */
    List<Video>selectByPointAndTitleLike(@Param("point") Double point,@Param("title") String title);
    
    /**
     * 添加数据Video
     * 
     */
    public int add(Video video);
    
    
    /**
     * 实现批量插入
     * 
     */
    public int addBatch(List<Video> listVideo);

    /**
     * 更新视频
     * @param video
     * @return
     */
    public int updateVideo(Video video);

    /**
     * 选择性更新
     * @param video
     * @return
     */
    public  int updateVideoSelective(Video video);

    /**
     * 根据时间和价格进行删除
     * @param map
     * @return
     */
    public int deleteByCreateTimeAndPrice(Map<String,Object> map);

    public Video selectBaseFiledByIdWithResultMap(@Param("video_id") int id);
}
