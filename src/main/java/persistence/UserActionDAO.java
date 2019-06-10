package persistence;

import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.sql.Time;

public interface UserActionDAO {

    public void recordAction(@Param("username") String username, @Param("action") String action, @Param("object") String object, @Param("date") String date);

    public String action(@Param("action") String action, @Param("object") String object);
}
