package com.daggerok.spring.streaming.fileserver.config.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "db")
public class DbProps {

  public String name;
  public String user;
  public String pass;

  @Data
  public static class Server {
    public String host;
    public Integer port;
  }
}
