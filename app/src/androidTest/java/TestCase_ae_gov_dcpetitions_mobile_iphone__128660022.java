import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__128660022 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(SQLiteDatabase.class);
      ((SQLiteDatabase)var1).execSQL("DROP TABLE IF EXISTS hubapplication");
   }
}
