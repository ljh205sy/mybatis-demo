package tk.mybatis.simple.mapper;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import tk.mybatis.simple.model.SysUser;

public class SysUserMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@BeforeClass
	public static void init() {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException ignore) {
			ignore.printStackTrace();
		}
	}

	@Test
	public void testSelectAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			// 如果mapper中存在相同的selectAll，则需要加命名空间
			List<SysUser> countryList = sqlSession.selectList("tk.mybatis.simple.mapper.SysUserMapper.selectAll");
			printSysUserList(countryList);
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testSelectById() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			// 不加命名空间
			List<SysUser> countryList = sqlSession.selectList("selectById", new Integer(1001));
			printSysUserList(countryList);
		} finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectOneById() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
//			SysUser temp = new SysUser();
//			temp.setId(1001);
//			SysUser sysUser = sqlSession.selectOne("selectOneById", temp);
			SysUser sysUser = sqlSession.selectOne("selectOneById", 1001);
			System.out.println(sysUser);
		} finally {
			sqlSession.close();
		}
	}

	private void printSysUserList(List<SysUser> sysUserList) {
		for (SysUser sysUser : sysUserList) {
			System.out.print(sysUser);
		}
	}
}
