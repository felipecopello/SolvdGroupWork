package util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SqlSessionFactoryUtil {
	private static final Logger LOGGER = LogManager.getLogger(SqlSessionFactoryUtil.class);
	private static SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	private static Reader reader;

	static {
		try {
			Reader reader = Resources.getResourceAsReader("mybatis/config.xml");
			setReader(reader);
		} catch (IOException e) {
			LOGGER.info(e.getMessage());
		}
	}

	private static SqlSessionFactory INSTANCE = null;

	private SqlSessionFactoryUtil() {
	}

	public static SqlSessionFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = builder.build(reader);
		}
		return INSTANCE;
	}

	public static Reader getReader() {
		return reader;
	}

	public static void setReader(Reader reader) {
		SqlSessionFactoryUtil.reader = reader;
	}

}
