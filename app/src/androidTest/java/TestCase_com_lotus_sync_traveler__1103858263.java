import android.database.DatabaseUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_lotus_sync_traveler__1103858263 {
   public static void testCase() throws Exception {
      String var0 = "android";
      int var1 = DatabaseUtils.getSqlStatementType(var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
