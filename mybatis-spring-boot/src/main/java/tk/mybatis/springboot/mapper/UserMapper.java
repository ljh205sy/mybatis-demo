package tk.mybatis.springboot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.springboot.model.User;

@Mapper
public interface UserMapper {

	public User selectById(Long id);

	public List<User> selectAll();
}
