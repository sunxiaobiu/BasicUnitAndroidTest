import android.database.sqlite.SQLiteDatabase;
import androidx.test.runner.AndroidJUnit4;
import java.util.Locale;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_enocta_eaep_app__6436939 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(SQLiteDatabase.class);
      Object var1 = null;
      ((SQLiteDatabase)var2).setLocale((Locale)var1);
   }
}
