import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteProgram;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free_1022408978 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(SQLiteProgram.class);
      byte var1 = 1;
      Object var2 = null;
      DatabaseUtils.bindObjectToProgram((SQLiteProgram)var0, var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
