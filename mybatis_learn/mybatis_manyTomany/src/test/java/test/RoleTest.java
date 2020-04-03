package test;

import com.bean.Role;
import com.bean.User;
import com.dao.IRoleDao;
import com.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class RoleTest {

    private InputStream in;
    private SqlSession sqlSession;
    private IRoleDao roleDao;

    @Before
    public void init() throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession();
        roleDao = sqlSession.getMapper(IRoleDao.class);
    }

    @After
    public void destory() throws Exception{
        sqlSession.close();
        in.close();
    }

    @Test
    public void test(){
        List<Role> l = roleDao.findAll();
        for (Role role : l){
            System.out.println(role);
            System.out.println(role.getUsers());
        }
    }
}
