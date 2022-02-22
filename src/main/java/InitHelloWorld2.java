import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * Project name(项目名称)：Spring后置处理器
 * Package(包名): PACKAGE_NAME
 * Class(类名): InitHelloWorld2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 20:03
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class InitHelloWorld2 implements BeanPostProcessor, Ordered
{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("B Before : " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("B After : " + beanName);
        return bean;
    }

    @Override
    public int getOrder()
    {
        return 0;
    }

}
