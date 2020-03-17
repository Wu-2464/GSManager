package cn.bdqn.gsmanager.demo.service.impl;


import cn.bdqn.gsmanager.demo.entity.Person;
import cn.bdqn.gsmanager.demo.mapper.PersonMapper;
import cn.bdqn.gsmanager.demo.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wubing
 * @since 2019-12-06
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
