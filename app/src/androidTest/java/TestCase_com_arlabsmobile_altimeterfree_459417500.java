import android.content.Context;
import android.database.DatabaseUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arlabsmobile_altimeterfree_459417500 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      DatabaseUtils.createDbFromSqlStatements((Context)var0, "ConfigDB", 100, "CREATE TABLE APP_PROMOTION (_id INTEGER PRIMARY KEY AUTOINCREMENT, app_id INTEGER UNIQUE, package_name VARCHAR(64) NOT NULL, app_ver INTEGER NOT NULL, name_strid INTEGER NOT NULL, description_strid INTEGER, logo_url VARCHAR(128), promo_cnt INTEGER NOT NULL, promo_cnt_shown INTEGER NOT NULL DEFAULT -1, priority INTEGER NOT NULL  );\nCREATE TABLE STRINGS (_id INTEGER PRIMARY KEY AUTOINCREMENT, str_id INTEGER NOT NULL, lang_id VARCHAR(16) NOT NULL, str_value VARCHAR(128) NOT NULL, UNIQUE (str_id, lang_id) );\nCREATE INDEX str_id ON STRINGS (str_id);\nCREATE TABLE CONFIGS (_id INTEGER PRIMARY KEY AUTOINCREMENT, cfg_name VARCHAR(32) UNIQUE, value_i INTEGER, value_f REAL, value_s VARCHAR(128)  );\nCREATE UNIQUE INDEX cfg_name ON CONFIGS (cfg_name);");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
