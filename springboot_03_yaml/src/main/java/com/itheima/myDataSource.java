package com.itheima;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//1.定义数据模型封装压马路文件中的对应数据
//2.定义为spring管控的bean
// 3.指定法加载的数组

@Component
@ConfigurationProperties(prefix = "datasource")
public class myDataSource {


    private String driver;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "myDataSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
