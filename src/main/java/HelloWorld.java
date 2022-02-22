/**
 * Project name(项目名称)：Spring后置处理器
 * Package(包名): PACKAGE_NAME
 * Class(类名): HelloWorld
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 20:01
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class HelloWorld
{
    private String message;

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void getMessage()
    {
        System.out.println("Message : " + message);
    }

    public void init()
    {
        System.out.println("Bean 正在初始化");
    }

    public void destroy()
    {
        System.out.println("Bean 将要被销毁");
    }
}
