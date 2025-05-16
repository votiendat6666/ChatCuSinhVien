package com.vtd.hibernatedemo;


import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


import com.vtd.pojo.alumni;
import com.vtd.pojo.comments;
import com.vtd.pojo.group_members;
import com.vtd.pojo.groups;
import com.vtd.pojo.lecturers;
import com.vtd.pojo.notifications;
import com.vtd.pojo.notification_targets;
import com.vtd.pojo.posts;
import com.vtd.pojo.reactions;
import com.vtd.pojo.survey_responses;
import com.vtd.pojo.survey_options;
import com.vtd.pojo.user;




/**
 *
 * @author admin
 */
public class HibernateUtils {
    private static final SessionFactory FACTORY;
    
    static {
        Configuration conf = new Configuration();
        Properties props = new Properties();
        props.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        props.setProperty(Environment.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
        props.setProperty(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost/chatcusinhviendb");
        props.setProperty(Environment.JAKARTA_JDBC_USER, "root");
        props.setProperty(Environment.JAKARTA_JDBC_PASSWORD, "123456");
        props.setProperty(Environment.SHOW_SQL, "true");
        
        conf.setProperties(props);
        
        conf.addAnnotatedClass(alumni.class);
        conf.addAnnotatedClass(comments.class);
        conf.addAnnotatedClass(group_members.class);
        conf.addAnnotatedClass(groups.class);
        conf.addAnnotatedClass(lecturers.class);
        conf.addAnnotatedClass(notification_targets.class);
        conf.addAnnotatedClass(notifications.class);
        conf.addAnnotatedClass(posts.class);
        conf.addAnnotatedClass(reactions.class);
        conf.addAnnotatedClass(survey_options.class);
        conf.addAnnotatedClass(survey_responses.class);
        conf.addAnnotatedClass(user.class);
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        
        FACTORY = conf.buildSessionFactory(serviceRegistry);
    }

    /**
     * @return the FACTORY
     */
    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
}
