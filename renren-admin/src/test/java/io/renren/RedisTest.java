package io.renren;

import io.renren.common.utils.RedisUtils;
import io.renren.common.utils.RedisUtils2;
import io.renren.modules.sys.entity.SysUserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    RedisUtils2 redisUtils;
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {
        SysUserEntity user = new SysUserEntity();
        user.setEmail("123456@qq.com");
        redisUtils.set("user", user);
        // redisUtils.set("user", "user");
        String user2 = redisUtils.get("user");
        // System.out.println(ToStringBuilder.reflectionToString(redisUtils.get("user", SysUserEntity.class)));
        System.out.println("user = " + user2);
    }

    @Test
    public void name() {
       // redisTemplate.boundValueOps("lkm").set("lkm_value");
        /*valueOperations.set(key, toJson(value));
        if(expire != NOT_EXPIRE){
            redisTemplate.expire(key, expire, TimeUnit.SECONDS);
        }*/
        redisTemplate.expire("lkm", 600, TimeUnit.SECONDS);
        System.out.println(redisTemplate.boundValueOps("lkm").get());

    }
    @Test
    public void name2() {
        redisUtils.set("user", "www");
        String user = redisUtils.get("user");
        System.out.println("user = " + user);

    }
}
