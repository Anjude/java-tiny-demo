package xyz.anjude.encrypt.service.impl;

import xyz.anjude.encrypt.entity.User;
import xyz.anjude.encrypt.mapper.UserMapper;
import xyz.anjude.encrypt.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author anjude
 * @since 2021-08-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
