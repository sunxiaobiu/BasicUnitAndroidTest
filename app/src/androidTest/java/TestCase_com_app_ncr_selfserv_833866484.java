import android.database.sqlite.SQLiteQueryBuilder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_ncr_selfserv_833866484 {
   @Test
   public void testCase() throws Exception {
      SQLiteQueryBuilder var2 = new SQLiteQueryBuilder();
      String var1 = "android";
      var2.appendWhereEscapeString(var1);
   }
}
