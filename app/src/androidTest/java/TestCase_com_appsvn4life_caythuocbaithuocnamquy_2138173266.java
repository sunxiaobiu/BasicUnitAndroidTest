import android.app.Activity;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appsvn4life_caythuocbaithuocnamquy_2138173266 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      String var1 = "android";
      var3.openOrCreateDatabase(var1, 0, (CursorFactory)null);
   }
}
